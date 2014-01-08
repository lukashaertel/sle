package sle.fsml.visualisation.plugin;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import sle.fsml.visualisation.transformation.Transformation;

/**
 * Button plugin for executing the layout transformation.
 * @author Johannes
 *
 */
public class PapyrusLayoutPlugin extends AbstractHandler
{

	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		Collection<IResource> allPapyrusFiles = getAllPapyrusFiles(workspace.getRoot());

		for (IResource file : allPapyrusFiles)
		{
			Transformation.transformUmlToNotation(file);
		}

		return null;
	}

	private Collection<IResource> getAllPapyrusFiles(IWorkspaceRoot root)
	{
		final Collection<IResource> allPapyrusFiles = new LinkedList<>();
		try
		{
			root.accept(new IResourceVisitor()
			{
				@Override
				public boolean visit(IResource resource) throws CoreException
				{
					if (resource.getType() == IResource.FILE && resource.getFullPath().getFileExtension().equals("di")) allPapyrusFiles.add(resource);

					return true;
				}
			});
		}
		catch (CoreException e)
		{
			e.printStackTrace();
		}
		return allPapyrusFiles;
	}



}
