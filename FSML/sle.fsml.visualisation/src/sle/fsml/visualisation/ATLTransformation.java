package sle.fsml.visualisation;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolverFactory;
import org.eclipse.m2m.atl.emftvm.util.ExecEnvPool;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolverFactory;


/**
 * 
 * @author Johannes
 *
 */
public class ATLTransformation
{
	final ExecEnvPool pool = new ExecEnvPool();

	private boolean initialised = false;

	public String getModuleName()
	{
		return moduleName;
	}

	public void setModuleName(String moduleName)
	{
		if (initialised) throw new IllegalStateException("Component initialised");
		this.moduleName = moduleName;
	}

	/**
	 * example: "file:///E:/workspaces/KPM_N/kpm.transformations/WS2RS/" or:
	 * "platform:/plugin/fg.graphviewer/transformation/"
	 * 
	 * @return
	 */
	public String getModulePath()
	{
		return modulePath;
	}

	/**
	 * example: "file:///E:/workspaces/KPM_N/kpm.transformations/WS2RS/" or:
	 * "platform:/plugin/fg.graphviewer/transformation/"
	 * 
	 * @return
	 */
	public void setModulePath(String modulePath)
	{
		if (initialised) throw new IllegalStateException("Component initialised");
		this.modulePath = modulePath;
		
	}

	public EPackage getMetamodelPackageA()
	{
		return metamodelPackageA;
	}

	public void setMetamodelPackageA(EPackage metamodelPackageA)
	{
		if (initialised) throw new IllegalStateException("Component initialised");
		this.metamodelPackageA = metamodelPackageA;
	}

	public EPackage getMetamodelPackageB()
	{
		return metamodelPackageB;
	}

	public void setMetamodelPackageB(EPackage metamodelPackageB)
	{
		if (initialised) throw new IllegalStateException("Component initialised");
		this.metamodelPackageB = metamodelPackageB;
	}

	public String getMetamodelNameA()
	{
		return metamodelNameA;
	}

	public void setMetamodelNameA(String metamodelNameA)
	{
		if (initialised) throw new IllegalStateException("Component initialised");
		this.metamodelNameA = metamodelNameA;
	}

	public String getMetamodelNameB()
	{
		return metamodelNameB;
	}

	public void setMetamodelNameB(String metamodelNameB)
	{
		if (initialised) throw new IllegalStateException("Component initialised");
		this.metamodelNameB = metamodelNameB;
	}

	public String getModelNameA()
	{
		return modelNameA;
	}

	public void setModelNameA(String modelNameA)
	{
		if (initialised) throw new IllegalStateException("Component initialised");
		this.modelNameA = modelNameA;
	}

	public String getModelNameB()
	{
		return modelNameB;
	}

	public void setModelNameB(String modelNameB)
	{
		if (initialised) throw new IllegalStateException("Component initialised");
		this.modelNameB = modelNameB;
	}

	public Boolean getJitenable()
	{
		return jitenable;
	}

	public void setJitenable(Boolean jitenable)
	{
		if (initialised) throw new IllegalStateException("Component initialised");
		this.jitenable = jitenable;
	}
	
	public Resource getResourceB()
	{
		return resouceB;
	}

	public void setResourceB(Resource bRes)
	{
		this.resouceB = bRes;
	}

	public Resource getResourceA()
	{
		return resourceA;
	}

	public void setResourceA(Resource aRes)
	{
		this.resourceA = aRes;
	}

	private String moduleName;
	private String modulePath;

	private EPackage metamodelPackageA = null;
	private EPackage metamodelPackageB = null;

	private String metamodelNameA = null;
	private String metamodelNameB = null;

	private String modelNameA = null;
	private String modelNameB = null;

	private Boolean jitenable = true;

	public void initialize()
	{
		if (initialised) throw new IllegalStateException("Component initialised");
		initialised = true;

		// Initialize
		if (metamodelPackageA != null && metamodelNameA != null)
		{
			final Metamodel metamodelA = EmftvmFactory.eINSTANCE.createMetamodel();
			metamodelA.setResource(metamodelPackageA.eResource());
			pool.registerMetaModel(metamodelNameA, metamodelA);
		}

		if (metamodelPackageB != null && metamodelNameB != null)
		{
			final Metamodel metamodelB = EmftvmFactory.eINSTANCE.createMetamodel();
			metamodelB.setResource(metamodelPackageB.eResource());
			pool.registerMetaModel(metamodelNameB, metamodelB);
		}

		final ModuleResolverFactory mrf = new DefaultModuleResolverFactory(modulePath);
		pool.setModuleResolverFactory(mrf);
		pool.loadModule(moduleName);
	}

	private Resource resourceA;
	private Resource resouceB;
	
	public void transform()
	{
		if (!initialised) throw new IllegalStateException("not initialised");
		ExecEnv env = pool.getExecEnv();

		if (env.isJitDisabled() == jitenable)
		{
			env.setJitDisabled(!jitenable);
		}

		Model a = EmftvmFactory.eINSTANCE.createModel();
		a.setResource(resourceA);

		Model b = EmftvmFactory.eINSTANCE.createModel();
		b.setResource(resouceB);

		env.registerInputModel(modelNameA, a);
		env.registerOutputModel(modelNameB, b);
		
		try
		{
			env.run(null);
		}
		catch (Exception e)
		{
			System.err.println(e);
		}

		pool.returnExecEnv(env);
	}

	
}
