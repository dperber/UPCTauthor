
var idents3r1rt1c1e1;
var ident2s3r1rt1c1e1;
$(function() {    
    $(".row").on("drag",function(e){
        idents3r1rt1c1e1 =e.target.id;
        ident2s3r1rt1c1e1 =e.target.src;
    });

    $( "#drag1" ).draggable(
        {revert: "invalid"}
    );
    $( ".drops3r1rt1c1e11" ).droppable({
        activeClass: "ui-state-hover",
        hoverClass: "ui-state-active",
        drop: function( event, ui ) {
            accion(this,idents3r1rt1c1e1,ident2s3r1rt1c1e1);
				var cadevento = '{ "draganddrop" : [';
				if (($("#drops3r1rt1c1e11").children().first()).attr("id") != "drag2") {
					cadevento = cadevento + '{ "Question" : "drag2" , "Response" :"' + ($("#drops3r1rt1c1e11").children().first()).attr("id") + '", "Solution" : "Incorrect"}';	
				}else{
					cadevento = cadevento + '{ "Question" : "drag2" , "Response" :"' + ($("#drops3r1rt1c1e11").children().first()).attr("id") + '", "Solution" : "Correct"}';	
				}
				cadevento = cadevento + ']}';
				setObjetivoInteraccionMovimiento("objetivos3r1rt1c1e1","section3draganddrop",cadevento);
        }
    });
    $( "#drag2" ).draggable(
        {revert: "invalid"}
    );
    $( ".drops3r1rt1c1e14" ).droppable({
        activeClass: "ui-state-hover",
        hoverClass: "ui-state-active",
        drop: function( event, ui ) {
            accion(this,idents3r1rt1c1e1,ident2s3r1rt1c1e1);
				var cadevento = '{ "draganddrop" : [';
				if (($("#drops3r1rt1c1e14").children().first()).attr("id") != "drag1") {
					cadevento = cadevento + '{ "Question" : "drag1" , "Response" :"' + ($("#drops3r1rt1c1e14").children().first()).attr("id") + '", "Solution" : "Incorrect"}';	
				}else{
					cadevento = cadevento + '{ "Question" : "drag1" , "Response" :"' + ($("#drops3r1rt1c1e14").children().first()).attr("id") + '", "Solution" : "Correct"}';	
				}
				cadevento = cadevento + ']}';
				setObjetivoInteraccionMovimiento("objetivos3r1rt1c1e1","section3draganddrop",cadevento);
        }
    });
    $( "#drag3" ).draggable(
        {revert: "invalid"}
    );
    $( ".drops3r1rt1c1e17" ).droppable({
        activeClass: "ui-state-hover",
        hoverClass: "ui-state-active",
        drop: function( event, ui ) {
            accion(this,idents3r1rt1c1e1,ident2s3r1rt1c1e1);
				var cadevento = '{ "draganddrop" : [';
				if (($("#drops3r1rt1c1e17").children().first()).attr("id") != "drag4") {
					cadevento = cadevento + '{ "Question" : "drag4" , "Response" :"' + ($("#drops3r1rt1c1e17").children().first()).attr("id") + '", "Solution" : "Incorrect"}';	
				}else{
					cadevento = cadevento + '{ "Question" : "drag4" , "Response" :"' + ($("#drops3r1rt1c1e17").children().first()).attr("id") + '", "Solution" : "Correct"}';	
				}
				cadevento = cadevento + ']}';
				setObjetivoInteraccionMovimiento("objetivos3r1rt1c1e1","section3draganddrop",cadevento);
        }
    });
    $( "#drag4" ).draggable(
        {revert: "invalid"}
    );
    $( ".drops3r1rt1c1e110" ).droppable({
        activeClass: "ui-state-hover",
        hoverClass: "ui-state-active",
        drop: function( event, ui ) {
            accion(this,idents3r1rt1c1e1,ident2s3r1rt1c1e1);
				var cadevento = '{ "draganddrop" : [';
				if (($("#drops3r1rt1c1e110").children().first()).attr("id") != "drag3") {
					cadevento = cadevento + '{ "Question" : "drag3" , "Response" :"' + ($("#drops3r1rt1c1e110").children().first()).attr("id") + '", "Solution" : "Incorrect"}';	
				}else{
					cadevento = cadevento + '{ "Question" : "drag3" , "Response" :"' + ($("#drops3r1rt1c1e110").children().first()).attr("id") + '", "Solution" : "Correct"}';	
				}
				cadevento = cadevento + ']}';
				setObjetivoInteraccionMovimiento("objetivos3r1rt1c1e1","section3draganddrop",cadevento);
        }
    });
});

$('.boton_quizs3r1rt1c1e1').click(function(ev) {
	ev.preventDefault();
    var resultados3r1rt1c1e1 = 0;
    
    // Si est�n colocadas correctamente marco resultado2 = 1
		if (($("#drops3r1rt1c1e11").children().first()).attr("id") == "drag2") {
		if (($("#drops3r1rt1c1e14").children().first()).attr("id") == "drag1") {
		if (($("#drops3r1rt1c1e17").children().first()).attr("id") == "drag4") {
		if (($("#drops3r1rt1c1e110").children().first()).attr("id") == "drag3") {
resultados3r1rt1c1e1 = 1;
    }
    }
    }
    }

	if (resultados3r1rt1c1e1 == 1) {

		setObjetivoCompleto("objetivos3r1rt1c1e1","section3draganddrop","RectangleDragAndDrop");
		$('.resultado').html('');
        $('.resultado').append('<h4>Correct</h4>');

		$("#drops3r1rt1c1e11").empty();
			$("#drops3r1rt1c1e11").prepend('<img src="img/drag2.png" id="drag2" class="img img-responsive ui-widget-content" style="position: relative; margin-top: 0px;">');
		$("#drops3r1rt1c1e14").empty();
			$("#drops3r1rt1c1e14").prepend('<img src="img/drag1.png" id="drag1" class="img img-responsive ui-widget-content" style="position: relative; margin-top: 0px;">');
		$("#drops3r1rt1c1e17").empty();
			$("#drops3r1rt1c1e17").prepend('<img src="img/drag4.png" id="drag4" class="img img-responsive ui-widget-content" style="position: relative; margin-top: 0px;">');
		$("#drops3r1rt1c1e110").empty();
			$("#drops3r1rt1c1e110").prepend('<img src="img/drag3.png" id="drag3" class="img img-responsive ui-widget-content" style="position: relative; margin-top: 0px;">');

    } 
    else {
var cadevento = '{ "draganddrop" : [';
			
			if (($("#drops3r1rt1c1e11").children().first()).attr("id") != "drag2") {
				cadevento = cadevento + '{ "Question" : "drag2" , "Response" :"' + ($("#drops3r1rt1c1e11").children().first()).attr("id") + '", "Solution" : "Incorrect"}';

				if (($("#drops3r1rt1c1e11").children().first()).attr("id") != undefined){
					$(primeraLibre()).prepend('<img src="img/'+($("#drops3r1rt1c1e11").children().first()).attr("id")+'.png" id="'+($("#drops3r1rt1c1e11").children().first()).attr("id")+'" class="img img-responsive ui-widget-content ui-draggable" style="position: relative; margin-top: 0px;">');
					$( "#"+($("#drops3r1rt1c1e11").children().first()).attr("id")+"" ).draggable({revert: "invalid"});
				}
				$("#drops3r1rt1c1e11").empty();
			}else{
				cadevento = cadevento + '{ "Question" : "drag2" , "Response" :"' + ($("#drops3r1rt1c1e11").children().first()).attr("id") + '", "Solution" : "Correct"}';

				$("#drops3r1rt1c1e11").empty();
				$("#drops3r1rt1c1e11").prepend('<img src="img/drag2.png" id="drag2" class="img img-responsive ui-widget-content" style="position: relative; margin-top: 0px;">');
			}
			 cadevento = cadevento + "," 
			if (($("#drops3r1rt1c1e14").children().first()).attr("id") != "drag1") {
				cadevento = cadevento + '{ "Question" : "drag1" , "Response" :"' + ($("#drops3r1rt1c1e14").children().first()).attr("id") + '", "Solution" : "Incorrect"}';

				if (($("#drops3r1rt1c1e14").children().first()).attr("id") != undefined){
					$(primeraLibre()).prepend('<img src="img/'+($("#drops3r1rt1c1e14").children().first()).attr("id")+'.png" id="'+($("#drops3r1rt1c1e14").children().first()).attr("id")+'" class="img img-responsive ui-widget-content ui-draggable" style="position: relative; margin-top: 0px;">');
					$( "#"+($("#drops3r1rt1c1e14").children().first()).attr("id")+"" ).draggable({revert: "invalid"});
				}
				$("#drops3r1rt1c1e14").empty();
			}else{
				cadevento = cadevento + '{ "Question" : "drag1" , "Response" :"' + ($("#drops3r1rt1c1e14").children().first()).attr("id") + '", "Solution" : "Correct"}';

				$("#drops3r1rt1c1e14").empty();
				$("#drops3r1rt1c1e14").prepend('<img src="img/drag1.png" id="drag1" class="img img-responsive ui-widget-content" style="position: relative; margin-top: 0px;">');
			}
			 cadevento = cadevento + "," 
			if (($("#drops3r1rt1c1e17").children().first()).attr("id") != "drag4") {
				cadevento = cadevento + '{ "Question" : "drag4" , "Response" :"' + ($("#drops3r1rt1c1e17").children().first()).attr("id") + '", "Solution" : "Incorrect"}';

				if (($("#drops3r1rt1c1e17").children().first()).attr("id") != undefined){
					$(primeraLibre()).prepend('<img src="img/'+($("#drops3r1rt1c1e17").children().first()).attr("id")+'.png" id="'+($("#drops3r1rt1c1e17").children().first()).attr("id")+'" class="img img-responsive ui-widget-content ui-draggable" style="position: relative; margin-top: 0px;">');
					$( "#"+($("#drops3r1rt1c1e17").children().first()).attr("id")+"" ).draggable({revert: "invalid"});
				}
				$("#drops3r1rt1c1e17").empty();
			}else{
				cadevento = cadevento + '{ "Question" : "drag4" , "Response" :"' + ($("#drops3r1rt1c1e17").children().first()).attr("id") + '", "Solution" : "Correct"}';

				$("#drops3r1rt1c1e17").empty();
				$("#drops3r1rt1c1e17").prepend('<img src="img/drag4.png" id="drag4" class="img img-responsive ui-widget-content" style="position: relative; margin-top: 0px;">');
			}
			 cadevento = cadevento + "," 
			if (($("#drops3r1rt1c1e110").children().first()).attr("id") != "drag3") {
				cadevento = cadevento + '{ "Question" : "drag3" , "Response" :"' + ($("#drops3r1rt1c1e110").children().first()).attr("id") + '", "Solution" : "Incorrect"}';

				if (($("#drops3r1rt1c1e110").children().first()).attr("id") != undefined){
					$(primeraLibre()).prepend('<img src="img/'+($("#drops3r1rt1c1e110").children().first()).attr("id")+'.png" id="'+($("#drops3r1rt1c1e110").children().first()).attr("id")+'" class="img img-responsive ui-widget-content ui-draggable" style="position: relative; margin-top: 0px;">');
					$( "#"+($("#drops3r1rt1c1e110").children().first()).attr("id")+"" ).draggable({revert: "invalid"});
				}
				$("#drops3r1rt1c1e110").empty();
			}else{
				cadevento = cadevento + '{ "Question" : "drag3" , "Response" :"' + ($("#drops3r1rt1c1e110").children().first()).attr("id") + '", "Solution" : "Correct"}';

				$("#drops3r1rt1c1e110").empty();
				$("#drops3r1rt1c1e110").prepend('<img src="img/drag3.png" id="drag3" class="img img-responsive ui-widget-content" style="position: relative; margin-top: 0px;">');
			}
cadevento = cadevento + ']}';


		setObjetivoInteraccion("objetivos3r1rt1c1e1","section3draganddrop",cadevento);

		$('.resultado').html('');
        $('.resultado').append('<h4>Incorrect</h4>');
	}
});

function accion (dropp,identidad,identidad2){
	if(($(dropp).children().first()).attr("id")== undefined){
		$("#"+identidad+"").remove();
		$( dropp ) .html( '<img src="'+identidad2+'" id="'+identidad+'" class="img img-responsive ui-widget-content ui-draggable" style="position: relative; margin-top: 0px;">' );
		$("#"+identidad+"").draggable(
			{revert: "invalid"}
		);
	}else{
		$("#"+identidad+"").draggable(
			{revert: "valid"}
		);
	}
}

function primeraLibre(cimg){
	if (!$.trim($("#drops3r1rt1c1e111").html()).length) {
			return "#drops3r1rt1c1e111";	
		}else{



	if (!$.trim($("#drops3r1rt1c1e144").html()).length) {
			return "#drops3r1rt1c1e144";	
		}else{



	if (!$.trim($("#drops3r1rt1c1e177").html()).length) {
			return "#drops3r1rt1c1e177";	
		}else{



	if (!$.trim($("#drops3r1rt1c1e11010").html()).length) {
			return "#drops3r1rt1c1e11010";	



}
}
}
}

}
