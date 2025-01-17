/*
 * generated by Xtext 2.12.0
 */
package org.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.upctformaevalua.ui.internal.UpctformaevaluaActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UpctformaevaluaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return UpctformaevaluaActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return UpctformaevaluaActivator.getInstance().getInjector(UpctformaevaluaActivator.ORG_XTEXT_UPCTFORMAEVALUA);
	}
	
}
