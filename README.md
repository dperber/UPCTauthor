# UPCTauthor

UPCTauthor is a authoring tool to create contents and evaluation units and for its gamification. An example of content created with UPCTauthor can be found in the URL http://cpcd.upct.es/autor/. A user manual is available at URL http://cpcd.upct.es/upctforma/. GitHub content:

- UPCTauthor framework (upctauthorframework)
- Eclipse project (eclipseupctforma)

## UPCTauthor framework
UPCTauthor framework contains the code for content units (unit1 folder), for evaluation units (evaluation1 folder) and for its gamification (upctauthorframework folder). Next, the automatically generated files to be replaced are indicated:

### Content units
For each content unit the "unit1" folder must be copied and added to the "upctauthorframework" folder. The following files are generated:

* General files: The files index.php, progreso_datos.js and progreso_obj.js are generated for each content unit. The index.php file must be copied to the "unit1" folder. The progreso_datos.js and progreso_obj.js files must be copied to the "unit1\progress\js" folder.

* HTML5 animations: The animation.css and animation.js files contain the HTML5 animations defined in the content models. The animation.js file must be copied to the "unit1\js" folder. The animation.css file must be copied to the "unit1\css" folder.

* Drag and drop activities: The file draganddrop.js is generated and must be copied to the "unit1\js" folder.

* Beamer presentation: The contentpdf.tex file in Beamer format for LaTex is generated. Some LaTex application such as TeXnicCenter is required to generate the PDF document.

### Evaluation units
For each evaluation unit, the "evaluation1" folder must be copied and added to the "upctauthorframework" folder.

The data.json file is generated and must be copied in the folder "evaluation1\data"

### Gamification units
The index.php file is generated and must be copied to the folder "upctauthorframework".

### General configuration
By default, the sending of events to the tracking component is disabled. It is necessary to modify the variable "sinConexionREST" to 0 to activate it. This variable is in the following files:

* Content units: "unit1\progreso\js\progreso_mapa.js" 
* Evaluation units: "evaluation1\progreso\js\progreso_mapa.js" 

In addition, it is necessary to define a tracking component (its URL) in the folowing files:

* Content units: "unit1\php\analytics\SensorUPCTforma.php"
* Evaluation units: "evaluation1\php\analytics\SensorUPCTforma.php".

A database (SQL Server has been used in this project) is necessary to define with the following tables:
* objetivos: Id (int), usr (int), link (int), objetivo (varchar(250)) and url (varchar(250))
* points:  Id (int), usr (int), link (int), point (int), objetivo (varchar(250)), url (varchar(250)), nombre (varchar(250)) and apellidos (varchar(250))
* attemp: Id (int), usr (int), link (int), objetivo (varchar(250)) and url (varchar(250))
* mission: Id (int), usr (int), link (int), next (varchar(250)) and url (varchar(250))
* badget: Id (int), usr (int), link (int), badget (varchar(250)) and url (varchar(250))

The configuration details of this database must be defined in the following files:

* Content units: "ranking.php" and "funciones.php" files of the folder "unit1/php".

* Evaluation units: File "funciones.php" of the folder "evaluation1/php".

* Gamification: File "ranking.php" of the forder "upctauthorframework" and file "funciones.php" of the folder "upctauthorframework/php" 

## Eclipse project
The Eclipse project allows to define content, evaluation and gamification models. Automatic code generation for the UPCTauthor framework is possible from these models.
