package sle.fsml.visualisation.util;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.EMFCompare.Builder;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Function;

/**
 * Wrapper around ENF Compare. Override methods for custom matching behavior.
 * @author Johannes
 *
 */
public class EMFCompareWrapper
{
	private final EMFCompare emfCompare;

	public EMFCompareWrapper()
	{
		Function<EObject, String> idFunction = new Function<EObject, String>()
		{
			public String apply(EObject input)
			{
				return getEObjectIdentifier(input);
			}
		};

		IEObjectMatcher fallBackMatcher = DefaultMatchEngine.createDefaultEObjectMatcher(getUseIdentifiers());

		IEObjectMatcher customIDMatcher = new IdentifierEObjectMatcher(fallBackMatcher, idFunction);

		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());

		final IMatchEngine customMatchEngine = new DefaultMatchEngine(customIDMatcher, comparisonFactory);

		IMatchEngine.Factory engineFactory = new MatchEngineFactoryImpl()
		{
			public IMatchEngine getMatchEngine()
			{
				return customMatchEngine;
			}
		};

		IDiffProcessor diffProcessor = new DiffBuilder();

		IDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor)
		{

			@Override
			protected FeatureFilter createFeatureFilter()
			{
				return new FeatureFilter()
				{

					@Override
					protected boolean isIgnoredReference(Match match, EReference reference)
					{
						Boolean r = getIsIgnoredReference(match, reference);

						if (r == null) return super.isIgnoredReference(match, reference);

						return r;
					}

					@Override
					public boolean checkForOrderingChanges(EStructuralFeature feature)
					{
						Boolean r = getCheckForOrderingChanges(feature);

						if (r == null) return super.checkForOrderingChanges(feature);

						return r;
					}

					@Override
					protected boolean isIgnoredAttribute(EAttribute attribute)
					{
						Boolean r = getIsIgnoredAttribute(attribute);

						if (r == null) return super.isIgnoredAttribute(attribute);

						return r;
					}

				};
			}
		};

		IMatchEngine.Factory.Registry registry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();

		engineFactory.setRanking(20);

		registry.add(engineFactory);

		Builder builder = EMFCompare.builder();

		builder.setDiffEngine(diffEngine);
		builder.setMatchEngineFactoryRegistry(registry);

		// Create emfcompare instance
		emfCompare = builder.build();
	}

	protected String getEObjectIdentifier(EObject input)
	{
		return null;
	}

	protected UseIdentifiers getUseIdentifiers()
	{
		return UseIdentifiers.WHEN_AVAILABLE;
	}

	protected Boolean getIsIgnoredReference(Match match, EReference reference)
	{
		return null;
	}

	public Boolean getCheckForOrderingChanges(EStructuralFeature feature)
	{
		return null;
	}

	protected Boolean getIsIgnoredAttribute(EAttribute attribute)
	{
		return null;
	}
	
	public Comparison compare(Notifier left, Notifier right)
	{
		return emfCompare.compare(EMFCompare.createDefaultScope(left, right));
	}
	
	public void print(Comparison c)
	{
		EMFComparePrettyPrinter.printComparison(c, System.out);
	}
	
	public void mergeLeftToRight(Comparison c)
	{
		for (Diff d : c.getDifferences())
		{
			EMFCompareRCPPlugin.getDefault().getMergerRegistry().getHighestRankingMerger(d).copyLeftToRight(d, null);
		}
	}
	
	
}
