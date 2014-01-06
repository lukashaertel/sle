package sle.fsml.visualisation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.infra.core.listenerservice.IPapyrusListener;
import org.eclipse.uml2.uml.State;

public class PapyrusListener implements IPapyrusListener
{

	public PapyrusListener()
	{
		
	}

	@Override
	public void notifyChanged(Notification arg0)
	{
		System.out.println("change");
		
		if (arg0 instanceof ENotificationImpl)
		{
			ENotificationImpl ni = (ENotificationImpl) arg0;

			if (ni.getEventType() == ENotificationImpl.ADD && ni.getFeature() instanceof EReference &&  ((EReference)ni.getFeature()).getName().equals("subvertex"))
			{
				State s = (State) ni.getNewValue();
				
				System.out.println(arg0);
			}
		}
	}

}
