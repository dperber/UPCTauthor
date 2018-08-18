//********************NAVBAR**************************//

! function($) {

	$body.scrollspy({
		target: '#navbar-main',
		offset: navHeight
	})

	$window.on('load', function() {
		$body.scrollspy('refresh')
	})

	$('#navbar-main [href=#]').click(function(e) {
		e.preventDefault()
	})

}

//Ocultar y animar header
var cbpAnimatedHeader = (function() {

	var docElem = document.documentElement,
		header = document.querySelector('.navbar'),
		didScroll = false,
		changeHeaderOn = 300;

	function init() {
		window.addEventListener('scroll', function(event) {
			if (!didScroll) {
				didScroll = true;
				setTimeout(scrollPage, 250);
			}
		}, false);
	}

	function scrollPage() {
		var sy = scrollY();

		if (sy >= changeHeaderOn) {
			/*classie.remove( header, 'navbar-fixed-top' )*/
			classie.add(header, 'navbar-fixed-scroll');
		} else {
			classie.remove(header, 'navbar-fixed-scroll');
			/*classie.add( header, 'navbar-fixed-top' );*/
		}
		didScroll = false;
	}

	function scrollY() {
		return window.pageYOffset || docElem.scrollTop;
	}

	init();

})();

$('.scold').click(function() {
	var ancla = $(this).attr("href");
	$('html, body').animate({
		scrollTop: $(ancla).offset().top
	}, 1000);
});

//********************END NAVBAR**************************//

$('.sctop').click(function(){
	var ancla= $(this).attr("href");
	$('html, body').animate({
		scrollTop: $(ancla).offset().top
	}, 1000);
});

function actualizaranclas() {
	$('[data-spy="scroll"]').each(function() {
		var $spy = $(this).scrollspy('refresh');
	});
};

$(function() {
	$('[data-toggle="popover"]').popover()
	$('[data-toggle="tooltip"]').tooltip()
});

$('.btnmostrar').each(function(){
	$(this).click(function(){
		var id = $(this).attr('id');
		var target = $(this).attr('data-target');
		$(target).css('display','none').removeClass('hidden').fadeIn(700);
		setObjetivoCompleto(id);
		$(this).removeClass('mano').unbind('click');
	});
});

$('.btnmostrar2').each(function(){
	$(this).click(function(){
		var id = $(this).attr('id');
		var target = $(this).attr('data-target');
		$(target).css('display','none').removeClass('hidden').fadeIn(700);
		marcarPuntoVisto(id);
		$(this).removeClass('mano').unbind('click');
	});
});

$(".pasarporencima").each(function(){
	$(this).mouseover(function(){
		var id = $(this).attr('id');
		marcarPuntoVisto(id);
	})
});

$(document).ready(function(){
	if($(".bibliografia")[0]){
		$('#b1').fadeIn(function(){
				$('#b2').fadeIn(function(){
						$('#b3').fadeIn(function(){
								$('#b4').fadeIn(function(){
										$('#b5').fadeIn(function(){
												$('#b6').fadeIn(function(){
														$('#b7').fadeIn(function(){
																$('#b8').fadeIn(function(){
																		$('#b9').fadeIn(function(){
																				$('#b10').fadeIn(function(){
																						$('#b11').fadeIn(function(){
																								$('#b12').fadeIn(function(){
																										$('#b13').fadeIn(function(){
																												$('#b14').fadeIn(function(){
																														$('#b15').fadeIn(function(){
																																setObjetivoCompleto('objetivo03_01');
																														});
																												});
																										});
																								});
																						});
																				});
																		});
																});
														});
												});
										});
								});
						});
				});
		});
	}
});

//***************************quiz1*******************

function allowDrop_1(ev) {
	ev.preventDefault();
}

function drag_1(ev) {
	ev.dataTransfer.setData("text", ev.target.id);
}

function drop1_1(ev) {
	ev.preventDefault();
	//alert($(ev.target).attr("id"));
	if ($("#div1_1").children().length == 0) {
		var data = ev.dataTransfer.getData("text");
		ev.target.appendChild(document.getElementById(data));
	}
}

function drop2_1(ev) {
	ev.preventDefault();
	if ($("#div2_1").children().length == 0) {
		var data = ev.dataTransfer.getData("text");
		ev.target.appendChild(document.getElementById(data));
	}
}
function drop3_1(ev) {
	ev.preventDefault();
	if ($("#div3_1").children().length == 0) {
		var data = ev.dataTransfer.getData("text");
		ev.target.appendChild(document.getElementById(data));
	}
}

function drop4_1(ev) {
	ev.preventDefault();
	if ($("#div4_1").children().length == 0) {
		var data = ev.dataTransfer.getData("text");
		ev.target.appendChild(document.getElementById(data));
	}
}

function drop5_1(ev) {
	ev.preventDefault();
	if ($("#div5_1").children().length == 0) {
		var data = ev.dataTransfer.getData("text");
		ev.target.appendChild(document.getElementById(data));
	}
}

function drop6_1(ev) {
	ev.preventDefault();
	if ($("#div6_1").children().length == 0) {
		var data = ev.dataTransfer.getData("text");
		ev.target.appendChild(document.getElementById(data));
	}
}

function drop11_1(ev) {
	ev.preventDefault();
	if ($("#div11_1").children().length == 0) {
		var data = ev.dataTransfer.getData("text");
		ev.target.appendChild(document.getElementById(data));
	}
}

function drop12_1(ev) {
	ev.preventDefault();
	if ($("#div12_1").children().length == 0) {
		var data = ev.dataTransfer.getData("text");
		ev.target.appendChild(document.getElementById(data));
	}
}
function drop13_1(ev) {
	ev.preventDefault();
	if ($("#div13_1").children().length == 0) {
		var data = ev.dataTransfer.getData("text");
		ev.target.appendChild(document.getElementById(data));
	}
}

function drop14_1(ev) {
	ev.preventDefault();
	if ($("#div14_1").children().length == 0) {
		var data = ev.dataTransfer.getData("text");
		ev.target.appendChild(document.getElementById(data));
	}
}

function drop15_1(ev) {
	ev.preventDefault();
	if ($("#div15_1").children().length == 0) {
		var data = ev.dataTransfer.getData("text");
		ev.target.appendChild(document.getElementById(data));
	}
}

function drop16_1(ev) {
	ev.preventDefault();
	if ($("#div16_1").children().length == 0) {
		var data = ev.dataTransfer.getData("text");
		ev.target.appendChild(document.getElementById(data));
	}
}

var intentosquiz1 = 0;
$('.boton_quiz1').click(function(ev) {
	ev.preventDefault();
	var resultado1 = 0;
	if (($("#div1_1").children().first()).attr("id") == "drag11_1") {
		if (($("#div2_1").children().first()).attr("id") == "drag12_1") {
			if (($("#div3_1").children().first()).attr("id") == "drag13_1") {
				if (($("#div4_1").children().first()).attr("id") == "drag14_1") {
					if (($("#div5_1").children().first()).attr("id") == "drag15_1") {
						if (($("#div6_1").children().first()).attr("id") == "drag16_1") {
							resultado1 = 1;
						}
					}
				}
			}
		}
	}
	if (resultado1 == 1) {
		$('#modal_txt02_correcto').modal('show');
		$("#solucion").removeClass('show').addClass('hidden');
		/*$("#mensaje").empty();
		$("#mensaje").prepend('<img id="correcto" class="img-responsive" src="assets/correcto.png" style="margin:auto">');*/
		setObjetivoCompleto("objetivo02_06");
		actualizaranclas();
	} else {
		intentosquiz1 = intentosquiz1 + 1;
		if ((intentosquiz1 == 3) && (resultado1 == 0)) {
			$("#div1_1").empty();
			$("#div2_1").empty();
			$("#div3_1").empty();
			$("#div4_1").empty();
			$("#div5_1").empty();
			$("#div6_1").empty();
			$("#div11_1").empty();
			$("#div12_1").empty();
			$("#div13_1").empty();
			$("#div14_1").empty();
			$("#div15_1").empty();
			$("#div16_1").empty();
			$("#div1_1").prepend('<img id="drag11_1" src="img/quiz1/drag1.png" class="img img-responsive" draggable="true" ondragstart="drag_1(event)">');
			$("#div2_1").prepend('<img id="drag12_1" src="img/quiz1/drag2.png" class="img img-responsive" draggable="true" ondragstart="drag_1(event)">');
			$("#div3_1").prepend('<img id="drag13_1" src="img/quiz1/drag3.png" class="img img-responsive" draggable="true" ondragstart="drag_1(event)">');
			$("#div4_1").prepend('<img id="drag14_1" src="img/quiz1/drag4.png" class="img img-responsive" draggable="true" ondragstart="drag_1(event)">');
			$("#div5_1").prepend('<img id="drag15_1" src="img/quiz1/drag5.png" class="img img-responsive" draggable="true" ondragstart="drag_1(event)">');
			$("#div6_1").prepend('<img id="drag16_1" src="img/quiz1/drag6.png" class="img img-responsive" draggable="true" ondragstart="drag_1(event)">');
			$('#modal_txt02_correcciontf').modal('show');
			// $("#correcto").removeClass('show').addClass('hidden');
			// $("#solucion").removeClass('hidden').addClass('show');
			/*$("#mensaje").empty();
			$("#mensaje").prepend('<img id="solucion" class="img-responsive" src="assets/solucion.png" style="margin:auto">');*/
			setObjetivoCompleto("objetivo02_06");
			actualizaranclas();
		} else {

			if (($("#div1_1").children().first()).attr("id") != "drag11_1") {
				$("#div1_1").empty();
				$("#div16_1").empty();
				$("#div16_1").prepend('<img id="drag11_1" src="img/quiz1/drag1.png" class="img img-responsive" draggable="true" ondragstart="drag_1(event)">');
			}
			if (($("#div2_1").children().first()).attr("id") != "drag12_1") {
				$("#div2_1").empty();
				$("#div14_1").empty();
				$("#div14_1").prepend('<img id="drag12_1" src="img/quiz1/drag2.png" class="img img-responsive" draggable="true" ondragstart="drag_1(event)">');
			}
			if (($("#div3_1").children().first()).attr("id") != "drag13_1") {
				$("#div3_1").empty();
				$("#div15_1").empty();
				$("#div15_1").prepend('<img id="drag13_1" src="img/quiz1/drag3.png" class="img img-responsive" draggable="true" ondragstart="drag_1(event)">');
			}
			if (($("#div4_1").children().first()).attr("id") != "drag14_1") {
				$("#div4_1").empty();
				$("#div13_1").empty();
				$("#div13_1").prepend('<img id="drag14_1" src="img/quiz1/drag4.png" class="img img-responsive" draggable="true" ondragstart="drag_1(event)">');
			}
			if (($("#div5_1").children().first()).attr("id") != "drag15_1") {
				$("#div5_1").empty();
				$("#div11_1").empty();
				$("#div11_1").prepend('<img id="drag15_1" src="img/quiz1/drag5.png" class="img img-responsive" draggable="true" ondragstart="drag_1(event)">');
			}
			if (($("#div6_1").children().first()).attr("id") != "drag16_1") {
				$("#div6_1").empty();
				$("#div12_1").empty();
				$("#div12_1").prepend('<img id="drag16_1" src="img/quiz1/drag6.png" class="img img-responsive" draggable="true" ondragstart="drag_1(event)">');
			}
			$('#modal_txt02_incorrecto').modal('show');
			//$("#solucion").removeClass('show').addClass('hidden');
			/*$("#mensaje").empty();
			$("#mensaje").prepend('<img id="incorrecto" class="img-responsive" src="assets/incorrecto.png" style="margin:auto">');*/
			actualizaranclas();
		}
	}
});
//************************fin quiz***********************


//***************************** True or False ********************************************
var solution = ['false','false','false','false','true','false','true','true','true','true','true','true','false'];
var res = [];
var victoria = 0;
var intentostf = 0;
var cont = 0;
$('.boton_tf').click(function(ev) {
	if(cont<=2){			
		if( solution[0] == $('input:radio[name=p1]:checked').val() ){res[0]=true;}else{res[0]=false;}
		if( solution[1] == $('input:radio[name=p2]:checked').val() ){res[1]=true;}else{res[1]=false;}
		if( solution[2] == $('input:radio[name=p3]:checked').val() ){res[2]=true;}else{res[2]=false;}
		if( solution[3] == $('input:radio[name=p4]:checked').val() ){res[3]=true;}else{res[3]=false;}
		if( solution[4] == $('input:radio[name=p5]:checked').val() ){res[4]=true;}else{res[4]=false;}
		if( solution[5] == $('input:radio[name=p6]:checked').val() ){res[5]=true;}else{res[5]=false;}
		if( solution[6] == $('input:radio[name=p7]:checked').val() ){res[6]=true;}else{res[6]=false;}
		if( solution[7] == $('input:radio[name=p8]:checked').val() ){res[7]=true;}else{res[7]=false;}
		if( solution[8] == $('input:radio[name=p9]:checked').val() ){res[8]=true;}else{res[8]=false;}
		if( solution[9] == $('input:radio[name=p10]:checked').val() ){res[9]=true;}else{res[9]=false;}
		if( solution[10] == $('input:radio[name=p11]:checked').val() ){res[10]=true;}else{res[10]=false;}
		if( solution[11] == $('input:radio[name=p12]:checked').val() ){res[11]=true;}else{res[11]=false;}
		if( solution[12] == $('input:radio[name=p13]:checked').val() ){res[12]=true;}else{res[12]=false;}
		
		if((res[0] == true) && (res[1] == true) && (res[2] == true) && (res[3] == true) && (res[4] == true) && (res[5] == true) && (res[6] == true) && (res[7] == true) && (res[8] == true) && (res[9] == true) && (res[10] == true) && (res[11] == true) && (res[12] == true)){
			victoria = 1;
		}
		if(victoria == 1){
			$('#modal_txt02_correcto').modal('show');
			setObjetivoCompleto("objetivo02_07");
		}else{
			intentostf = intentostf + 1;
			if ((intentostf == 3) && (victoria == 0)) {
				$('#modal_txt02_correcciontf').modal('show');
				 $("#p12").prop('checked', true);
				 $("#p22").prop('checked', true);
				 $("#p32").prop('checked', true);
				 $("#p42").prop('checked', true);
				 $("#p51").prop('checked', true);
				 $("#p62").prop('checked', true);
				 $("#p71").prop('checked', true);
				 $("#p81").prop('checked', true);
				 $("#p91").prop('checked', true);
				 $("#p101").prop('checked', true);
				 $("#p111").prop('checked', true);
				 $("#p121").prop('checked', true);
				 $("#p132").prop('checked', true);
				 setObjetivoCompleto("objetivo02_07");
			}else{
				$('#modal_txt02_incorrecto').modal('show');
			}
		}
		cont = cont + 1;
	}
});