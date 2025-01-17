/*
 * generated by Xtext 2.12.0
 */
package org.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.upctformagami.ui.internal.UpctformagamiActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UpctformagamiExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return UpctformagamiActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return UpctformagamiActivator.getInstance().getInjector(UpctformagamiActivator.ORG_XTEXT_UPCTFORMAGAMI);
	}
	
}
