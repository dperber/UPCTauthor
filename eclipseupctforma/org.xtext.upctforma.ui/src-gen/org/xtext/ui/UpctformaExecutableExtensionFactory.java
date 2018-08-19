/*
 * generated by Xtext 2.12.0
 */
package org.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.upctforma.ui.internal.UpctformaActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UpctformaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return UpctformaActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return UpctformaActivator.getInstance().getInjector(UpctformaActivator.ORG_XTEXT_UPCTFORMA);
	}
	
}