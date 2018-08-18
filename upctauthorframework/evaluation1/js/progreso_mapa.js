// $(document).ready(inicializarEvaluacion);
var nota;
$(window).on('beforeunload ',function() {	
	finUnidad();
});
//-----------------------------------------------------------------------------------------------------------

//---  VARIABLES Y FUNCIONES PARA GESTIONAR OBJETIVOS

//-----------------------------------------------------------------------------------------------------------
var sinConexionREST = 0;
var objetivos= new Array();		//IMPORTANTE: trabajamos con la matriz "definicionObjetivos" definida en cada SCO, archivo progreso_datos.js
var numeroObjetivos= 0;
var porcentajeunidad = 0;	
var objetivos_grabados;

var inicioTiempo;

function iniciarEvaluacion() {	
	if (sinConexionREST==0){
		$url2 = "./php/funciones.php?PHPSESSID=" + session_id;
		jQuery.post($url2, {funcion: 9, usuario: usd, nombre: displayname, apellidos: lastname, email : email, enlace: link, titulo: title, session:session_id,porcentaje:porcentajeunidad,url:identificador},function(res){
			if (res!=1){
				bloquearInteraccion("ERROR9: SESIÓN CADUCADA. DEBES ENTRAR NUEVAMENTE EN EL AULA VIRTUAL Y LANZAR LA UNIDAD.",2);		
			}
		});
	}
}
function finUnidad() {
	if (sinConexionREST==0){
		$url2 = "./php/funciones.php?PHPSESSID=" + session_id;
		jQuery.post($url2, {funcion: 1, usuario: usd, nombre: displayname, apellidos: lastname, email : email, enlace: link, titulo: title, session:session_id,porcentaje:porcentajeunidad,url:identificador},function(res){
			if (res!=1){
				bloquearInteraccion("ERROR3: SESIÓN CADUCADA. DEBES ENTRAR NUEVAMENTE EN EL AULA VIRTUAL Y LANZAR LA UNIDAD.",2);	
			}
		});
	}
}
function keepAlive(){
	if (sinConexionREST==0){
		$url2 = "./php/funciones.php?PHPSESSID=" + session_id;
		jQuery.post($url2, {funcion: 5, usuario: usd, nombre: displayname, apellidos: lastname, email : email, enlace: link, titulo: title, session:session_id,porcentaje:porcentajeunidad,url:identificador},function(res){
			if (res!=1){
				bloquearInteraccion("ERROR6: SESIÓN CADUCADA. DEBES ENTRAR NUEVAMENTE EN EL AULA VIRTUAL Y LANZAR LA UNIDAD.",2);		
			}
		});
	}
}
function bloquearInteraccion(texto,tipo){
	switch(tipo){
		case 1:
			$('#sharedModal').append(
				'<div class="cargando" style="height:100%; width:100%; position: absolute; z-index: 10000; background-color: rgba(0, 0, 0, 0.5); top: 0;">' +
				'<div class="text-center" style="position: absolute; top: 30%; left: 47%;"><i class="fa fa-spinner fa-spin fa-3x" aria-hidden="true"></i><p class="white" style="color:white;"><strong>' + texto + '</strong></p></div>' +
				'</div>'
			);
			break;
		case 2:
			$('#sharedModal').append(
				'<div class="cargando" style="height:100%; width:100%; position: absolute; z-index: 10000; background-color: rgba(0, 0, 0, 0.5); top: 0;">' +
				'<div class="text-center" style="position: absolute; top: 30%; left: 25%;"><i class="fa fa-exclamation-triangle fa-3x" aria-hidden="true"></i><p class="white" style="color:white;"><strong>' + texto + '</strong></p></div>' +
				'</div>'
			);
			break;
	}
	$('#sharedModal').modal('show');
}
function desBloquearInteraccion(){
	$('#sharedModal').modal('hide');
	$('#sharedModal').empty();
}

function inicializarEvaluacion() {
	bloquearInteraccion("Cargando Evaluación",1);
	$url2 = "./php/funciones.php?PHPSESSID=" + session_id;	
	$.ajax({
		async: false, 
		type: 'POST',
		url: $url2,
		data: {funcion: 6, usuario: usd, nombre: displayname, apellidos: lastname, email : email, enlace: link, titulo: title, session:session_id,porcentaje:porcentajeunidad,url:identificador},
		success: function(res){nota = res;},
		async:false
	});
	iniciarEvaluacion();
	desBloquearInteraccion();
}
function getObjetivoEstado(nombreObjetivo) {
	var estado= "";
	var objetivo= new Object();
	for (var i=0; i<objetivos.length; i++) {
		for (var j=0; j<objetivos[i].length; j++) {
			if (objetivos[i][j]._id == nombreObjetivo) {
				estado= objetivos[i][j]._porcentaje;
			}
		}
	}
	return(estado);
}		
function setEvaluacionCompleta(desc) {
	porcentajeunidad = desc;
	if (sinConexionREST==0){
		$url2 = "./php/funciones.php?PHPSESSID=" + session_id;
		$.ajax({
			async: false, 
			type: 'POST',
			url: $url2,
			data: {funcion: 10, usuario: usd, nombre: displayname, apellidos: lastname, email : email, enlace: link, titulo: title, session:session_id,porcentaje:porcentajeunidad,descripcion:"",tipounit:tipounit,points:points,url:identificador},
			success: function(res){
				if (res=="0"){
					bloquearInteraccion("ERROR10: SESIÓN CADUCADA. DEBES ENTRAR NUEVAMENTE EN EL AULA VIRTUAL Y LANZAR LA UNIDAD." + res ,2);
				}else{
					if (res!="1"){
						HTMLcontent= "";
						HTMLcontent+= "<div class='col-md-8'><p>Has acertado "+aciertos+" preguntas de un total de "+numeroPreguntas+". <strong>Nota:</strong> "+ porcentajeAciertos1 +"</p>";
						$("#resultadoEvaluacion").html(HTMLcontent);
						$("#resultadoEvaluacion").show();
						
						var cadentext = "Has acertado "+aciertos+" preguntas de un total de "+numeroPreguntas+". <strong>Nota:</strong> "+ porcentajeAciertos1 + "<br>";
						cadentext = cadentext + res;
						$("#bodymymodal").append(cadentext);
						$("#myModal").modal();
					}
					
				}
			}
		});
		$.ajax({
			async: true, 
			type: 'POST',
			url: $url2,
			data: {funcion: 7, usuario: usd, nombre: displayname, apellidos: lastname, email : email, enlace: link, titulo: title, session:session_id,porcentaje:porcentajeunidad,descripcion:"",tipounit:tipounit,points:points,url:identificador,unidades:unidades},
			success: function(res){
				if (res!=1){
					bloquearInteraccion("ERROR7: SESIÓN CADUCADA. DEBES ENTRAR NUEVAMENTE EN EL AULA VIRTUAL Y LANZAR LA UNIDAD." + res ,2);
				}else{
					HTMLcontent= "";
					HTMLcontent+= "<div class='col-md-8'><p>Has acertado "+aciertos+" preguntas de un total de "+numeroPreguntas+". <strong>Nota:</strong> "+ porcentajeAciertos1 +"</p>";
					$("#resultadoEvaluacion").html(HTMLcontent);
					$("#resultadoEvaluacion").show();
				}
			}
		});
	}
}
function setEvaluacionInteraccion(desc,cadevento) {	
	if (sinConexionREST==0){
		$url2 = "./php/funciones.php?PHPSESSID=" + session_id;
		$.ajax({
			type: 'POST',
			url: $url2,
			data: {funcion: 8, usuario: usd, nombre: displayname, apellidos: lastname, email : email, enlace: link, titulo: title, session:session_id,porcentaje:porcentajeunidad,descripcion:desc,cadenaevento:cadevento,url:identificador},
			success: function(res){
				if (res!=1){
					bloquearInteraccion("ERROR8: " + res + " SESIÓN CADUCADA. DEBES ENTRAR NUEVAMENTE EN EL AULA VIRTUAL Y LANZAR LA UNIDAD.",2);		
				}
			}
		});
	}
}
function getObjetivoCompleto(nombreObjetivo) {
	var completo= false;
	var estado= getObjetivoEstado(nombreObjetivo);
	if  (estado == 100) completo= true;
	return (completo);
}
function getApartadoPorcentaje(numeroApartado) {
	var numeroObjetivosCompletos= 0;
	for (var j=0; j<objetivos[numeroApartado-1].length; j++) {
		var estado= getObjetivoEstado(objetivos[numeroApartado-1][j]._id);
		if (estado == 100) numeroObjetivosCompletos++;
	}
	var porcentaje= parseInt((numeroObjetivosCompletos/objetivos[numeroApartado-1].length)*100);
	return (porcentaje);
}
function getUnidadPorcentaje() {	
	var numObjetivos = 0;		
	var numObjetivosSuperados = 0;
	for (var i=0; i<objetivos.length; i++) {
		for (var j=0; j<objetivos[i].length; j++) {
			var estado= getObjetivoEstado(objetivos[i][j]._id);
			if (estado == 100) numObjetivosSuperados++;
			numObjetivos++;
		}
	}
	var porcentaje= parseInt((numObjetivosSuperados/numObjetivos)*100);
	return (porcentaje);
}
	
//-----------------------------------------------------------------------------------------------------------

//---  VARIABLES Y FUNCIONES PARA DIBUJAR EL MAPA DE PROGRESOS

//-----------------------------------------------------------------------------------------------------------
var anchoBarra= 8;
var angulosActuales= new Array();
var estiloC = {	thickness: .08,	bgColor: "rgba(255,255,255,1)", fgColor: "rgba(51,51,51,1)", lineCap: 'butt'};
var Element = $("#progreso_mp");
var dentrocirculo = false;

function prepararMapa(){
	if ($("#estiloMapaPCSS").length <= 0) {
		$("body").append("<style id='estiloMapaPCSS'>.mapaWrapper > div { display:inline-block; position:absolute; margin:10px; } .mapaWrapper .mapaValue {  width:100%; line-height:1em; position:absolute; top:32%; text-align:center; left:0; display:block;}</style>");
	}
	var htmlmapa = "";
	htmlmapa += '<div class="mapaWrapper">';
	for (i=0; i<circulos.length; i++) {
		var ccirculo = "circulo"+i;
		var ttx = "texto_porcentaje"+(i+1);
		htmlmapa += '<div id="'+ccirculo+'" class="'+ccirculo+' circuloh" ><input type="text" /><span class="mapaValue"><div id='+ttx+' class="texto_porcentaje"></div><span></span></span></div>';
	}
	for (i=0; i<circulos.length; i++) {
		var tti = "texto_inf"+(i+1);
		htmlmapa += '<div id="'+tti+'" class="texto_titulo" style="top:'+titulos[i][0]+'px; left:'+titulos[i][1]+'px;"></div>';
	}
	htmlmapa += '</div>';
	Element.append(htmlmapa);

	var xi = 0;
	var yi = 0;
	var xf = 0;
	var yf = 0;
	for (i=0; i<circulos.length; i++) {
		var ccirculo = "circulo"+i;
		var position = Element.find("."+ccirculo).position();

		if (i==0){
			xi = circulos[i][1] + (circulos[i][2]/2) ;
			yi = circulos[i][0] + (circulos[i][2]/2);
		}else{
			xf = circulos[i][1] + (circulos[i][2]/2);
			yf = circulos[i][0] + (circulos[i][2]/2);
			Element.find(".mapaWrapper").line(xi, yi, xf, yf, {color:"white", stroke:10, zindex:0});
			xi = xf;
			yi = yf;
		}
	}
	for (i=0; i<circulos.length; i++) {
		var ccirculo = "circulo"+i;
		Element.find("."+ccirculo+" input").knob($.extend({width: (circulos[i][2]), height: (circulos[i][2]), displayInput: false, readOnly: true, max: 100, recolor: "#eeeeee"}, estiloC));
	}
	//Aplicar los estilos
	for (i=0; i<circulos.length; i++) {
		var ccirculo = "circulo"+i;
		Element.find("."+ccirculo).attr("style", 'z-index:1;top:'+circulos[i][0]+'px; left:'+circulos[i][1]+'px; width:'+circulos[i][2]+'px;');
		Element.find("."+ccirculo+" .mapaValue").attr("style", 'font-size:'+circulos[i][3]+'%; color: #000000');
	}
	Element.find(".mapaValue").each( function() {
		$(this).css("margin-top",Math.floor(0 - (parseInt($(this).height()) / 2)) + "px");
	});
	//Texto de los Circulos
	for (i=0; i<circulos.length; i++) {
		var ccirculo = "circulo"+i;
		Element.find("."+ccirculo+" input").knob($.extend({width: '100%', displayInput: false, readOnly: true, max: 100, skin: 'tron'}, estiloC));
		Element.find("."+ccirculo+" .mapaValue > div").html("0%");
	}
	// Texto de inferior de los C�rculos
	for (i=0; i<circulos.length; i++) {
		var tti = "texto_inf"+(i+1);
		Element.find("#"+tti).html(titulos[i][5]);
		//Element.find("."+ccirculo+" .mapaValue > span").attr("class", "texto_titulo");
	}
}
function dibujarFondoProgreso() {
	prepararMapa();
	//estructura que almecena los �ngulos actuales (empiezan todos en 0)
	for (i=0; i<circulos.length; i++) {
		angulosActuales.push(0);
	}//for
	$(".circuloh").click(irApartado);
	$(".circuloh").hover(circuloOver,circuloOut);
}//dibujarFondoProgreso
//actualizar porcentajes
function actualizarProgreso() {
	for (i=0; i<circulos.length; i++) {
		var anguloAnterior= angulosActuales[i];
		var anguloGirar= getApartadoPorcentaje(i+1)-anguloAnterior;
		if (anguloGirar > 0) {
			var ccirculo = "circulo"+i;
			Element.find("."+ccirculo+" input").val((anguloAnterior + anguloGirar)).trigger('change');
			Element.find("."+ccirculo+" .mapaValue > div").html(""+(anguloAnterior + anguloGirar)+"%");
			angulosActuales[i]= getApartadoPorcentaje(i+1);
		}
	}
	for (var i=0; i<objetivos.length; i++) {
		for (var j=0; j<objetivos[i].length; j++) {			
			if (getObjetivoCompleto(objetivos[i][j]._id)) {
				$("#"+objetivos[i][j]._id).addClass("visto");
			}
		}
	}
}
function irApartado() {
	var identificador= $(this).attr("id");
	var numeroApartado = parseInt($(this).attr("id").charAt(7));
	numeroApartado = numeroApartado +1;
	var ancla= "#apdo"+numeroApartado;
	$('html, body').animate({
		scrollTop: $(ancla).offset().top
	}, 1000);
}
function circuloOver() {
	if (dentrocirculo==false){
		dentrocirculo = true;
		var ccirculo = $(this).attr("id");
		Element.find("."+ccirculo+" input").val("#3BB4C1").trigger('mouseover');
		var numapartado = parseInt($(this).attr("id").charAt(7));
		numapartado = numapartado + 1;
		$("#texto_porcentaje"+numapartado).removeClass("texto_porcentaje");
		$("#texto_porcentaje"+numapartado).addClass("texto_porcentaje_over");
	}
}
function circuloOut() {
	if (dentrocirculo==true){
		var ccirculo = $(this).attr("id");
		Element.find("."+ccirculo+" input").val("#eeeeee").trigger('mouseover');
		dentrocirculo = false;
		var numapartado = parseInt($(this).attr("id").charAt(7));
		numapartado = numapartado + 1;
		$("#texto_porcentaje"+numapartado).removeClass("texto_porcentaje_over");
		$("#texto_porcentaje"+numapartado).addClass("texto_porcentaje");
	}
}
//funciones de dibujo
function dibujarLinea(lienzo,x1,y1,x2,y2) {
	var obj= jQuery(lienzo);
	jQuery(obj).svg();
	var svg= jQuery(obj).svg('get');
	var g= svg.group({stroke: '#ffffff'});
	svg.line(g,x1,y1,x2,y2,{strokeWidth: 10});
}//dibujarLinea
function dibujarCirculo(lienzo,x,y,r) {
	var obj= jQuery(lienzo);
	jQuery(obj).svg();
	var svg= jQuery(obj).svg('get');
	var g= svg.group();
	svg.circle(g,x,y,r,{fill: '#ffffff'});
}//dibujarLinea
function dibujarSector(lienzo,apartado,center_x,center_y,radius,anguloActual,drawPercent,startFromDegree) {
	var obj  = jQuery(lienzo);
	jQuery(obj).svg();
	var svg = jQuery(obj).svg('get');
	var g = svg.group({stroke: '#333'});
	var totalDegD = 360/100 * drawPercent;
	var i = startFromDegree;
	var atTo = i + totalDegD;
	var timer = 0;
	var stop = 0;
	var method = function() {
		//sector que indica el porcentaje
		for(s = 0; s < 4; s++) {
			if (stop == 1) return;
			var d= i;
			var a= d * Math.PI / 180;
			var x= center_x + radius * Math.cos(a);
			var y= center_y + radius * Math.sin(a);
			var iporcentaje= parseInt(i/360);
			iporcentaje= anguloActual+Math.ceil( ((i-startFromDegree)*100/360).toFixed(1) )
			svg.line(g, center_x, center_y, x, y, {strokeWidth: 3});
			$("#texto_porcentaje"+apartado).html(iporcentaje+"%");
			i = i + 1;
			if (i>=atTo) {
				window.clearInterval(timer);
				stop = 1;
				return;
			}//if
		}//for
	}//method
	timer = window.setInterval(method,20);
}//dibujarSector