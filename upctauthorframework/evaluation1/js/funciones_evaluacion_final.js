//evento descargar ventana (diferente en IE y Chrome)
	var ua = window.navigator.userAgent;
	var msie = ua.indexOf("MSIE ");
		
//textos HTML de la cabecera
	var cabeceraTitulo=			"<header class='clearfix'><p><span class='tituloCurso'></span></p><p>Certificación</p></header>";

	var noHayPlataforma= 		"<br><h3 class='centered'>NO SE PUEDE REALIZAR EL EJERCICIO.</h3><hr>"+
								"<h4 class='centered'>No ha sido posible establecer comunicación con la plataforma de aprendizaje.<br>"+
								"Sin esta comunicación no se puede realizar seguimiento al alumno, y por lo tanto no se puede realizar el ejercicio.</h4><br>";
							
	var evaluacionSuperada=		"<br><h3 class='centered'>Has conseguido una puntuación de <span class='notaObtenida'></span> sobre 100.</h3><hr>";								
								
	var evaluacionNoSuperada=	"<br><h3 class='centered'>Has conseguido una puntuación de <span class='notaObtenida'></span> sobre 100.</h3><hr>";								
								
	var quedanIntentos=			"<br><h3 class='centered'>Evaluación 1</h3><hr>"+								
								"Dispones de un intento.<br>"+
								"Marca las respuestas que consideres correctas y una vez contestadas todas las respuestas pulsa el botón ENVIAR.</h4><br><br>";
	
	var noQuedanIntentos=		"<br><h3 class='centered'>No dispones de más intentos para superar la evaluación.</h3><hr>"+
								"<h4 class='centered'>Has realizado ya la evaluación y has obtenido una puntuación de <span class='notaObtenida'></span> sobre 10.</h4>";

//título del curso
	var tituloCurso= "";
	
//arrays que almacenan TODAS las preguntas
	var arrayPreguntas= new Array();
	var arrayNumPregunta= new Array();
	var arrayPreguntasAnteriores= new Array();
	var arrayEnunciados= new Array();
	var arrayRespuestas= new Array();
	var arrayRespuestasCorrectas= new Array();
	var arrayFeedbackCorrecto= new Array();
	var arrayFeedbackIncorrecto= new Array();

//preguntas elegidas
	var numeroPreguntas= 5;
	var aleatoriedad= true;
	var arrayPreguntasElegidas= new Array();
	
//respuestas del alumno
	var arrayRespuestasAlumno= new Array();
	var aciertos= 0;
	var porcentajeAciertos= 0.0;
	var notaBaremo= 50;

	inicializarEvaluacion();

	function inicializar() {
	//leer datos JSON
		$.getJSON("datos/datos.json",leerDatosJSON);			
	
	//programación de los botones
		$('#botonEnviar').click(btEnviarClick);
		
	//configurar la evaluación en función del la comunicación con plataforma, número de intentos y/o resultado obtenido
		configurar();
	}//inicializar

	function configurar() {		
		//ponemos el título del curso
		$("#headerwrap").html(cabeceraTitulo);
		$(".tituloCurso").html(tituloCurso);
			
		//ocultamos la capa de preguntas y la capa de resultados
		$('#contenidoEvaluacion').hide();
		$('#resultadoEvaluacion').hide();
	
		//ocultamos los botones	
		$('#botonEnviar').hide();
		$('#botonRepetir').hide();
			
		// Variable para probar todos los casos
		// var nota = "-1";
		//mostramos los elementos necesarios en función del estado de la evaluación
		if (nota === '"-2"') {
			//el alumno ha completado la evaluación
			$("#encabezadoEvaluacion").html("Se ha producido un error al cargar la evaluación.");			
		}else if (nota === '"-1"') {
			//el alumno dispone de 3 intentos
				$("#encabezadoEvaluacion").html(quedanIntentos);
				$('#contenidoEvaluacion').show();				
		} else{
			//el alumno ha completado la evaluación
			$("#encabezadoEvaluacion").html(evaluacionNoSuperada);			
		} 

		$('.notaObtenida').html(nota);
		$('.notaBaremo').html(notaBaremo);

	}//configurar

	var num_pregunta = []; 
	function leerDatosJSON(contenidoDelArchivo) {
	//datos generales de la evaluación
		numeroPreguntas= parseInt(contenidoDelArchivo.numeroPreguntasEvaluacion);
		aleatoriedad= (contenidoDelArchivo.aleatoriedad == "true");
		notaBaremo= parseInt(contenidoDelArchivo.notaBaremo);
		tituloCurso= contenidoDelArchivo.tituloCurso;
		$(".tituloCurso").html(tituloCurso);
	
		//datos de las preguntas
		$.each(contenidoDelArchivo.preguntas, function(i, pregunta) {
		//almacenamos el número de la pregunta seleccionada
			num_pregunta[i] = arrayNumPregunta.push(pregunta.numeroPregunta);
		//almacenamos el número de la pregunta, para luego hacer una selección aleatoria
			arrayPreguntas.push(i);	
		//almacenamos el enunciado de la pregunta
			arrayEnunciados.push(pregunta.enunciado);
		//almacenamos las respuestas posibles
			var arrayRespuestasPregunta= new Array();
			$.each(pregunta.respuestas, function(j, respuesta) {
				arrayRespuestasPregunta.push(respuesta);
			}); //each pregunta.respuestas
			arrayRespuestas.push(arrayRespuestasPregunta);	

			var respuesta1 = arrayRespuestas[i][0];
			var respuesta2 = arrayRespuestas[i][1];
			var respuesta3 = arrayRespuestas[i][2];
			var respuesta4 = arrayRespuestas[i][3];
		
		//almacenamos la posición de la respuesta CORRECTA
			arrayRespuestasCorrectas.push(parseInt(pregunta.respuestaCorrecta));

		//almacenamos el feedback para la respuesta CORRECTA
			arrayFeedbackCorrecto.push(pregunta.feedbackCorrecto);
			
		//almacenamos el feedback para la respuesta INCORRECTA
			arrayFeedbackIncorrecto.push(pregunta.feedbackIncorrecto);				
	}); //each contenidoDelArchivo.preguntas
	
	//mezclar preguntas
		mezclarPreguntas();

		for (i=0; i<numeroPreguntas; i++) {
			var cadevento = '{ "evaluacion" : [ {"Enunciado" : "' + arrayEnunciados[i] + '", "Respuestas" : "' + arrayRespuestas[i] + '", "Respuesta marcada" : "0", "Respuesta correcta" : "' + arrayRespuestasCorrectas[i] + '" }]}';
			setEvaluacionInteraccion("Preguntas asignadas",cadevento);
		}//for	
	}//leerDatosJSON

	function desordenarMatriz(_array) {
		for (i=0; i<_array.length; i++) {
			var posicionAleatoria= parseInt(Math.random()*_array.length);
			var elementoIntercambio= _array[posicionAleatoria];
			_array[posicionAleatoria]= _array[i];
			_array[i]= elementoIntercambio;
		}//for
		return(_array);
	}//desordenarMatriz

	function mezclarPreguntas() {
	//ponemos a 0 el número de aciertos
		aciertos= 0;
		
	//inicializamos la matriz de respuestas del alumno
		while (arrayRespuestasAlumno.length>0) {
			arrayRespuestasAlumno.pop();
		}//while
		for (i=0; i<numeroPreguntas; i++) {
			arrayRespuestasAlumno.push(0);
		}//for
	
	//si había preguntas anteriores las añadimos de nuevo a las preguntas seleccionables
		while (arrayPreguntasAnteriores.length>0) {
			arrayPreguntas.push(arrayPreguntasAnteriores.shift());
		}//while
		
	//ordenamos aleatoriamente la matriz
		//if (aleatoriedad) arrayPreguntas= desordenarMatriz(arrayPreguntas);
		
	//seleccionamos un número determinado de preguntas
		for (i=0; i<numeroPreguntas; i++) {
			arrayPreguntasElegidas.push(arrayPreguntas.shift());
		}//for
		
	//mostramos las preguntas y las posibles respuestas
		mostrarPreguntas();
	}//mezclarPreguntas

	function mostrarPreguntas() {
	//creamos un string HTMLcontent 
		HTMLcontent= "";
		var a=0;//control del separador cada 2 columnas
		
	//creamos las capas con las respuestas
		for (i=0; i<numeroPreguntas; i++) {
			HTMLcontent+=	  "<div class='col-md-6'><div class='list-group'>";
			HTMLcontent+= "<p class='list-group-item-heading' id='enunciado"+ (i+1) +"'>"+ (i+1) +". "+ arrayEnunciados[arrayPreguntasElegidas[i]] + "</p>";
			for (j=0; j<arrayRespuestas[arrayPreguntasElegidas[i]].length; j++) {
				HTMLcontent+= "<a href='#' class='list-group-item respuesta' id='respuesta"+ (i+1) +""+ (j+1) +"'>"+ arrayRespuestas[arrayPreguntasElegidas[i]][j] + "</a>";
			}//for
			HTMLcontent+= "</div>";
			HTMLcontent+= "<div class='feedbackCorrecto alert alert-success' role='alert' id='feedbackCorrecto"+ (i+1) +"'>"+ arrayFeedbackCorrecto[arrayPreguntasElegidas[i]] + "</div>";
			HTMLcontent+= "<div class='feedbackIncorrecto alert alert-danger' role='alert' id='feedbackIncorrecto"+ (i+1) +"'>"+ arrayFeedbackIncorrecto[arrayPreguntasElegidas[i]] + "</div>";
			HTMLcontent+= "</div></div>";
			a++;
			if (a==2) {
				HTMLcontent+= "<div class='clearfix'></div>";
				a=0;
			}//if
		}//for

	//actualizamos la div 'contenidoEvaluacion' con el string HTMLcontent
		$("#contenidoEvaluacion").html(HTMLcontent);
	
	//establecemos la interacción con el usuario
		$('body').on('click', 'a.list-group-item', respuestaClick)
	}//mostrarPreguntas

	function establecerInteraccion() {
	//establecemos los mouseOver/mouseOut/click de las respuestas y los botones
		$('.respuesta').mouseover(respuestaRollOver);
		$('.respuesta').mouseleave(respuestaRollOut);
	
		$('body').on('click', 'a.list-group-item', respuestaClick)
	}//establecerInteraccion

	function respuestaRollOver() {
		$(this).addClass("respuestaColorOver");
	}//respuestaRollOver

	function respuestaRollOut() {
		$(this).removeClass("respuestaColorOver");
	}//respuestaRollOut

	var $preguntaActual;
	var respuestaClick = function(event) {
		event.preventDefault();		

	//calculamos la respuesta elegida y la pregunta a la que pertenece
		var $respuestaActual= $(this);	
		$preguntaActual= $respuestaActual.parent();		

	//primero desmarcamos todas las respuestas de esta pregunta
		$('.respuesta',$preguntaActual).each(function(j) {
			$(this).removeClass("respuestaColorSelected");
		}); //final de leer cada etiqueta <respuesta>	
		
	//despues marcamos la respuesta seleccionada
		$(this).addClass("respuestaColorSelected");
		
	//almacenamos el valor de la respuesta seleccionada en la matriz de respuestas del alumno
		var idRespuesta= $(this).attr("id");
		var numPregunta= parseInt(idRespuesta.substring(9,idRespuesta.length-1));
		var numRespuesta= parseInt(idRespuesta.charAt(idRespuesta.length-1));
		arrayRespuestasAlumno[numPregunta-1]= numRespuesta;

		var cadevento = '{ "evaluacion" : [ {"Enunciado" : "' + arrayEnunciados[numPregunta - 1] + '", "Respuestas" : "' + arrayRespuestas[numPregunta - 1] + '", "Respuesta marcada" : "' + numRespuesta + '", "Respuesta correcta" : "' + arrayRespuestasCorrectas[numPregunta - 1] + '" }]}';		
		setEvaluacionInteraccion("Respuesta marcada",cadevento);		
	
	//si se han contestado ya todas las respuestas mostramos el botón de "enviar evaluación"
		var todasRespuestas= true;
		for (i=0; i<numeroPreguntas; i++) {
			if (arrayRespuestasAlumno[i] == 0) todasRespuestas= false;
		}//for
		//if (todasRespuestas) $('#botonEnviar').show();
		if (todasRespuestas) {
			$('#botonEnviar').show();
		}//if
	}//respuestaClick

	var desactivado = function(event) {
	event.preventDefault();
	}

	function mostrarFeedback() {
	//mostramos los feedback de las respuestas
		for (i=0; i<numeroPreguntas; i++) {
			if (arrayRespuestasAlumno[i] == arrayRespuestasCorrectas[arrayPreguntasElegidas[i]]) {
				$('#feedbackCorrecto'+(i+1)).show();
			} else {
				$('#feedbackIncorrecto'+(i+1)).show();
				$('#respuesta'+(i+1)+arrayRespuestasCorrectas[arrayPreguntasElegidas[i]]).css("border", "solid 2px #9FD98B");
			}//if-else
		}//for
	}//mostrarFeedback

	function btEnviarClick(event) {
	//anulamos los rollOver/rollOut/click de las respuestas
		 event.preventDefault();
		 
		$('body').off('click', 'a.list-group-item').on('click', 'a.list-group-item', desactivado);
		$('a.list-group-item').addClass("disabled");
		$('.respuesta').css('cursor','default');
		
	//desactivamos el boton enviar evaluacion
		$('#botonEnviar').hide();

	//calculamos el porcentaje de aciertos obtenido
		aciertos= 0;
		for (i=0; i<numeroPreguntas; i++) {
			if (arrayRespuestasAlumno[i] == arrayRespuestasCorrectas[arrayPreguntasElegidas[i]]) {
				aciertos++;
			}//if
		}//for
		porcentajeAciertos= (aciertos*100/numeroPreguntas).toFixed(2);
		porcentajeAciertos1= (aciertos*10/numeroPreguntas).toFixed(2);
		porcentajeAciertos2= (aciertos/numeroPreguntas).toFixed(3);

		HTMLcontent= "";
		HTMLcontent+= "<div class='col-md-8'><p>ESPERA HASTA QUE APAREZCA EL RESULTADO DE TU EVALUACIÓN</p>";			
		// HTMLcontent+= "<div class='col-md-8'><p>Has acertado "+aciertos+" preguntas de un total de "+numeroPreguntas+". <strong>Nota:</strong> "+ porcentajeAciertos1 +"</p>";			
		$("#resultadoEvaluacion").html(HTMLcontent);
		$("#resultadoEvaluacion").show();
			
		mostrarFeedback();
		setEvaluacionCompleta(porcentajeAciertos);
	}//btEnviarClick

	function btRepetirClick() {
		$("#contenidoEvaluacion").html("");
		$("#resultadoEvaluacion").html("");
	//elegimos las nuevas preguntas
		mezclarPreguntas();
		configurar();
	}//btRepetirClick