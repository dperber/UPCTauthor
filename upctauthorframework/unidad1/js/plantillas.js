$('#CarouselWelcome2').on('slid.bs.carousel', function() {
	if ($(this).find('.active').index() == 0) {
		$('#CarouselWelcome .left span').removeClass('mostrarl').addClass('ocultarl').parent().addClass('no-pointer');
		$('#CarouselWelcome .right span').removeClass('ocultarr').addClass('mostrarr').parent().removeClass('no-pointer');
	} else if ($(this).find('.active').index() == 1) {
		$('#CarouselWelcome .left span').removeClass('ocultarl').addClass('mostrarl').parent().removeClass('no-pointer');
		$('#CarouselWelcome .right span').removeClass('ocultarr').addClass('mostrarr').parent().removeClass('no-pointer');
	} else if ($(this).find('.active').index() == 2) {
		$('#CarouselWelcome .left span').removeClass('ocultarl').addClass('mostrarl').parent().removeClass('no-pointer');
		$('#CarouselWelcome .right span').removeClass('mostrarr').addClass('ocultarr').parent().addClass('no-pointer');
	}
});

$(document).ready(function($) {
	$(".pagination").rPage();

	/* jQuery activation and setting options for parent tabs with id selector*/
	$("#tabbed-nav").zozoTabs({
		rounded: false,
		multiline: true,
		//theme: "white", //tema original, modificado en css el color de la linea vertical a fucsia
		theme: "blue",
		size: "medium", //tamaño txt de la pestaña
		responsive: true,
		animation: {
			effects: "slideH", //efecto de transicion del contenido nivel 1
			easing: "easeInOutCirc",
			duration: 500
		},
		defaultTab: "tab1" //define la pestaña activa de nivel 1
	});

	/* jQuery activation and setting options for all nested tabs with class selector*/
	$(".nested-tabs").zozoTabs({
		position: "top-left",
		theme: "red",
		style: "underlined",
		rounded: false,
		shadows: false,
		defaultTab: "tab1", //define la pestaña activa de nivel 2
		animation: {
			easing: "easeInOutCirc",
			effects: "slideV", //efecto de transicion del contenido nivel 2
			duration: 350
		},
		size: "medium"
	});

});

$(document).ready(function($) {
	$(".pagination").rPage();

	$("#tabbed-nav2").zozoTabs({
		position: "top-left",
		// theme: "white", //tema original, modificado en css el color de la linea vertical a fucsia
		theme: "blue", //tema para las pestañas verticales plantilla 18
		shadows: true,
		multiline: true,

		orientation: "vertical", //podemos ponerlas tanto horizontal como verticales
		size: "medium", //tamaño txt de la pestaña
		animation: {
			easing: "easeInOutExpo",
			duration: 500,
			effects: "slideV" //efecto de transicion del contenido
		}
	});

});
