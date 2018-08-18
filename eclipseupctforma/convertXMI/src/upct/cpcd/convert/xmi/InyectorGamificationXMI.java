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
import org.xtext.UpctformagamiStandaloneSetupGenerated;

import upctformagami.UpctformagamiPackage;

import org.xtext.UpctformaStandaloneSetupGenerated;

import upctforma.UpctformaPackage;

import org.xtext.UpctformaevaluaStandaloneSetupGenerated;

import upctformaevalua.UpctformaevaluaPackage;

//import org.xtext.UpctformaevaluaStandaloneSetupGenerated;

//import upctformaevalua.UpctformaevaluaPackage;
//import jsonMM.JsonMMPackage;

//import um.dsdm.json.injector.JsonDSLStandaloneSetupGenerated;
//import jsonMM.Document;


public class InyectorGamificationXMI {

	/**
	 * Singleton reference.
	 */
	private static InyectorGamificationXMI instance;

	/**
	 * ResourceSet used to generate resource models.
	 */
	private ResourceSet resourceSet;

	/**
	 * Method used to get the ENoSQLSchemaIO instance.
	 * @return NoSQLSchemaIO instance.
	 */
	public static InyectorGamificationXMI getInstance()
	{
		if (instance == null)
			instance = new InyectorGamificationXMI();

		return instance;
	}

	/**
	 * Default private constructor. Initializes the ResourceSet and the factory.
	 */
	private InyectorGamificationXMI()
	{
		resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(UpctformagamiPackage.eNS_URI, UpctformagamiPackage.eINSTANCE);		// EDBSCHEMA metamodel
		resourceSet.getPackageRegistry().put(UpctformaPackage.eNS_URI, UpctformaPackage.eINSTANCE);		// EDBSCHEMA metamodel
		resourceSet.getPackageRegistry().put(UpctformaevaluaPackage.eNS_URI, UpctformagamiPackage.eINSTANCE);		// EDBSCHEMA metamodel

		Map<String, Object> options = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		options.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		options.put("ecore", new EcoreResourceFactoryImpl());
	}
	

	public void exportXMI() {
		String absoluteTargetFolderPath = "P:\\runtime-EclipseXtext\\upctforma";
		String absoluteTargetFolderPath2 = "P:\\eclipseupctforma\\org.eclipse.acceleo.module.upctgami\\model";
	    Injector injector = new UpctformagamiStandaloneSetupGenerated()
	       .createInjectorAndDoEMFRegistration();
		
	    XtextResourceSet resourceSet = injector
	            .getInstance(XtextResourceSet.class);

	    Injector injector2 = new UpctformaStandaloneSetupGenerated()
	       .createInjectorAndDoEMFRegistration();
	    XtextResourceSet resourceSet2 = injector2
	            .getInstance(XtextResourceSet.class);

	    Injector injector3 = new UpctformaevaluaStandaloneSetupGenerated()
	       .createInjectorAndDoEMFRegistration();
	    XtextResourceSet resourceSet3 = injector3
	            .getInstance(XtextResourceSet.class);

	    
	    // .exist the extension of the model file
	    String inputURI = "file:///" + absoluteTargetFolderPath + "\\gami.upctformagami";
	    String outputURI = "file:///" + absoluteTargetFolderPath2 + "\\gami.xmi";
	    URI uri = URI.createURI(inputURI);
	    Resource xtextResource = resourceSet.getResource(uri, true);

	    String inputURI2 = "file:///" + absoluteTargetFolderPath + "\\unit1.upctforma";
	    URI uri2 = URI.createURI(inputURI2);
	    Resource xtextResource2 = resourceSet.getResource(uri2, true);
	    
	    String inputURI3 = "file:///" + absoluteTargetFolderPath + "\\unit2.upctforma";
	    URI uri3 = URI.createURI(inputURI3);
	    Resource xtextResource3 = resourceSet.getResource(uri3, true);
	    
	    String inputURI4 = "file:///" + absoluteTargetFolderPath + "\\unit3.upctforma";
	    URI uri4 = URI.createURI(inputURI4);
	    Resource xtextResource4 = resourceSet.getResource(uri4, true);

	    String inputURI5 = "file:///" + absoluteTargetFolderPath + "\\unit4.upctforma";
	    URI uri5 = URI.createURI(inputURI5);
	    Resource xtextResource5 = resourceSet.getResource(uri5, true);

	    String inputURI6 = "file:///" + absoluteTargetFolderPath + "\\template.upctforma";
	    URI uri6 = URI.createURI(inputURI6);
	    Resource xtextResource6 = resourceSet.getResource(uri6, true);

	    String inputURI7 = "file:///" + absoluteTargetFolderPath + "\\evalua.upctformaevalua";
	    URI uri7 = URI.createURI(inputURI7);
	    Resource xtextResource7 = resourceSet.getResource(uri7, true);

	    EcoreUtil.resolveAll(xtextResource);
	    EcoreUtil.resolveAll(xtextResource2);
	    EcoreUtil.resolveAll(xtextResource3);
	    EcoreUtil.resolveAll(xtextResource4);
	    EcoreUtil.resolveAll(xtextResource5);
	    EcoreUtil.resolveAll(xtextResource6);
	    EcoreUtil.resolveAll(xtextResource7);
	    
	    Resource xmiResource = resourceSet
	            .createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    xmiResource.getContents().add(xtextResource2.getContents().get(0));
	    xmiResource.getContents().add(xtextResource3.getContents().get(0));
	    xmiResource.getContents().add(xtextResource4.getContents().get(0));
	    xmiResource.getContents().add(xtextResource5.getContents().get(0));
	    xmiResource.getContents().add(xtextResource6.getContents().get(0));
	    xmiResource.getContents().add(xtextResource7.getContents().get(0));

	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	//String absoluteTargetFolderPath = "E:\\DSDM\\DSDM-workspaces\\JSON-DSL-Xtext-DSDM\\um.dsdm.json.injector\\model";
	
}
