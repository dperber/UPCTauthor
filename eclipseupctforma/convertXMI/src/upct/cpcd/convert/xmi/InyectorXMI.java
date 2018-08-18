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
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;


//import upctforma.model.upctforma;
import org.xtext.UpctformaStandaloneSetupGenerated;

import upctforma.UpctformaPackage;
//import jsonMM.JsonMMPackage;

//import um.dsdm.json.injector.JsonDSLStandaloneSetupGenerated;
//import jsonMM.Document;


public class InyectorXMI {

	/**
	 * Singleton reference.
	 */
	private static InyectorXMI instance;

	/**
	 * ResourceSet used to generate resource models.
	 */
	private ResourceSet resourceSet;

	/**
	 * Method used to get the ENoSQLSchemaIO instance.
	 * @return NoSQLSchemaIO instance.
	 */
	public static InyectorXMI getInstance()
	{
		if (instance == null)
			instance = new InyectorXMI();

		return instance;
	}

	/**
	 * Default private constructor. Initializes the ResourceSet and the factory.
	 */
	private InyectorXMI()
	{
		resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(UpctformaPackage.eNS_URI, UpctformaPackage.eINSTANCE);		// EDBSCHEMA metamodel
		Map<String, Object> options = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		options.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		options.put("ecore", new EcoreResourceFactoryImpl());
	}
	

	public void exportXMI() {
		String absoluteTargetFolderPath = "P:\\runtime-EclipseXtext\\upctforma";
		String absoluteTargetFolderPath2 = "P:\\eclipseupctforma\\org.eclipse.acceleo.module.upctforma\\model";
	    Injector injector = new UpctformaStandaloneSetupGenerated()
	       .createInjectorAndDoEMFRegistration();
		
	    XtextResourceSet resourceSet = injector
	            .getInstance(XtextResourceSet.class);
	    
	    resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	    
	    // .exist the extension of the model file
	    //String inputURI = "file:///" + absoluteTargetFolderPath + "\\unit1.upctforma";
	    String outputURI = "file:///" + absoluteTargetFolderPath2 + "\\unidad4.xmi";
	    //URI uri = URI.createURI(inputURI);
	    //Resource xtextResource = resourceSet.getResource(uri, true);

	    String inputURI2 = "file:///" + absoluteTargetFolderPath + "\\template.upctforma";
	    URI uri2 = URI.createURI(inputURI2);
	    Resource xtextResource2 = resourceSet.getResource(uri2, true);

	    //String inputURI3 = "file:///" + absoluteTargetFolderPath + "\\unit2.upctforma";
	    //URI uri3 = URI.createURI(inputURI3);
	    //Resource xtextResource3 = resourceSet.getResource(uri3, true);

	    //String inputURI4 = "file:///" + absoluteTargetFolderPath + "\\unit3.upctforma";
	    //URI uri4 = URI.createURI(inputURI4);
	    //Resource xtextResource4 = resourceSet.getResource(uri4, true);

	    String inputURI5 = "file:///" + absoluteTargetFolderPath + "\\unit4.upctforma";
	    URI uri5 = URI.createURI(inputURI5);
	    Resource xtextResource5 = resourceSet.getResource(uri5, true);

	    //EcoreUtil.resolveAll(xtextResource);
	    EcoreUtil.resolveAll(xtextResource2);
	    //EcoreUtil.resolveAll(xtextResource3);
	    //EcoreUtil.resolveAll(xtextResource4);
	    EcoreUtil.resolveAll(xtextResource5);

	    
	    Resource xmiResource = resourceSet
	            .createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(xtextResource5.getContents().get(0));
	    xmiResource.getContents().add(xtextResource2.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	//String absoluteTargetFolderPath = "E:\\DSDM\\DSDM-workspaces\\JSON-DSL-Xtext-DSDM\\um.dsdm.json.injector\\model";
	
}
