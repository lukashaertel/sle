package sle.fsml.runconfig;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

/**
 * This tabgroup specifies what tabs are needed to configure the launch; see the
 * manifest for the extension point
 * 
 * @author lukashaertel
 * 
 */
public class FSMLSimulationTabGroup extends AbstractLaunchConfigurationTabGroup {

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		// Initialize run configuration with the FSM simulation tab and the
		// commons tab
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new FSMLMainTab(), new CommonTab() };
		setTabs(tabs);
	}

}
