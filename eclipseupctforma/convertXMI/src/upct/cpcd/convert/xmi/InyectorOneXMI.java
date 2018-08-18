package upct.cpcd.convert.xmi;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;





//import upctforma.model.upctforma;
import org.xtext.UpctformaevaluaStandaloneSetupGenerated;

import upctformaevalua.UpctformaevaluaPackage;


public class InyectorOneXMI
{
	/**
	 * Singleton reference.
	 */
	private static InyectorOneXMI instance;

	/**
	 * ResourceSet used to generate resource models.
	 */
	private ResourceSet resourceSet;

	/**
	 * Method used to get the ENoSQLSchemaIO instance.
	 * @return NoSQLSchemaIO instance.
	 */
	public static InyectorOneXMI getInstance()
	{
		if (instance == null)
			instance = new InyectorOneXMI();

		return instance;
	}

	/**
	 * Default private constructor. Initializes the ResourceSet and the factory.
	 */
	private InyectorOneXMI()
	{
		resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(UpctformaevaluaPackage.eNS_URI, UpctformaevaluaPackage.eINSTANCE);		// EDBSCHEMA metamodel
		Map<String, Object> options = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		options.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		options.put("ecore", new EcoreResourceFactoryImpl());		
	}
	
	
	public void exportXMI() {
		String absoluteTargetFolderPath = "P:\\runtime-EclipseXtext\\upctforma";
		String absoluteTargetFolderPath2 = "P:\\eclipseupctforma\\org.eclipse.acceleo.module.upctevalua\\model";
	    Injector injector = new UpctformaevaluaStandaloneSetupGenerated()
	       .createInjectorAndDoEMFRegistration();
		
	    XtextResourceSet resourceSet = injector
	            .getInstance(XtextResourceSet.class);

	    // .exist the extension of the model file
	    String inputURI = "file:///" + absoluteTargetFolderPath + "\\evalua.upctformaevalua";
	    String outputURI = "file:///" + absoluteTargetFolderPath2 + "\\evalua.xmi";
	    URI uri = URI.createURI(inputURI);
	    Resource xtextResource = resourceSet.getResource(uri, true);

	    EcoreUtil.resolveAll(xtextResource);

	    Resource xmiResource = resourceSet
	            .createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}

