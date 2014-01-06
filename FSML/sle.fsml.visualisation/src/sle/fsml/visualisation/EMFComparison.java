package sle.fsml.visualisation;

import java.util.Collections;
import java.util.Comparator;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EMFComparison
{
	private static EMFCompare compareSingleton = null;

	public static EMFCompare getCompare()
	{
		if (compareSingleton == null)
		{
			IMatchEngine.Factory.Registry matchEngineRegistry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();
			IPostProcessor.Descriptor.Registry<String> postProcessorRegistry = EMFCompareRCPPlugin.getDefault().getPostProcessorRegistry();

			compareSingleton = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).setPostProcessorRegistry(postProcessorRegistry).build();
		}

		return compareSingleton;
	}

	public static Comparison getComparison(Notifier left, Notifier right)
	{
		return EMFComparison.getCompare().compare(EMFCompare.createDefaultScope(left, right));
	}

	public static boolean adaptAllDifferences(Notifier newModel, Notifier model)
	{
		Comparison comparison = EMFComparison.getCompare().compare(EMFCompare.createDefaultScope(newModel, model));

		for (Diff d : comparison.getDifferences())
		{
			EMFCompareRCPPlugin.getDefault().getMergerRegistry().getHighestRankingMerger(d).copyLeftToRight(d, null);
		}

		return comparison.getDifferences().size() > 0;
	}

	public static void adaptDifferences(Diff d)
	{
		EMFCompareRCPPlugin.getDefault().getMergerRegistry().getHighestRankingMerger(d).copyLeftToRight(d, null);
	}

	@Deprecated
	public static void adaptAllDifferencesInOrder(Notifier newModel, Notifier model)
	{
		Comparison comparison = EMFComparison.getCompare().compare(EMFCompare.createDefaultScope(newModel, model));
		EList<Diff> diffs = comparison.getDifferences();

		// TODO: XAXA im using the internet
		Collections.sort(diffs, new Comparator<Diff>()
		{
			@Override
			public int compare(Diff o1, Diff o2)
			{
				EList<Diff> o1req = o1.getRequires();
				EList<Diff> o2req = o2.getRequires();

				if (o1req.contains(o2))
				{
					return 1;
				}
				else if (o2req.contains(o1))
				{
					return -1;
				}
				else
				{
					EObject o1lm = o1.getMatch().getLeft();
					EObject o1rm = o1.getMatch().getRight();
					EObject o2lm = o2.getMatch().getLeft();
					EObject o2rm = o2.getMatch().getRight();

					if (EcoreUtil.isAncestor(o1lm, o2lm) && EcoreUtil.isAncestor(o1rm, o2rm))
					{
						return -1;
					}
					else if (EcoreUtil.isAncestor(o2lm, o1lm) && EcoreUtil.isAncestor(o2rm, o1rm))
					{
						return -1;
					}
					else
					{
						String o1uri = EcoreUtil.getURI(o1).toString();
						String o2uri = EcoreUtil.getURI(o2).toString();

						return o1uri.compareTo(o2uri);
					}
				}
			}
		});

		for (Diff d : diffs)
		{
			EMFCompareRCPPlugin.getDefault().getMergerRegistry().getHighestRankingMerger(d).copyLeftToRight(d, null);
		}
	}
}
