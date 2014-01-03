/*
 * generated by Xtext
 */
package sle.fsml.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import sle.fsml.ui.internal.FSMLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FSMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FSMLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return FSMLActivator.getInstance().getInjector(FSMLActivator.SLE_FSML_FSML);
	}
	
}