$('#CarouselWelcome').on('slid.bs.carousel', function() {
	if ($(this).find('.active').index() == 0) {
		$('#CarouselWelcome .left span').removeClass('mostrarl').addClass('ocultarl').parent().addClass('no-pointer');
		$('#CarouselWelcome .right span').removeClass('ocultarr').addClass('mostrarr').parent().removeClass('no-pointer');
	} else if ($(this).find('.active').index() == 1) {
		$('#CarouselWelcome .left span').removeClass('ocultarl').addClass('mostrarl').parent().removeClass('no-pointer');
		$('#CarouselWelcome .right span').removeClass('ocultarr').addClass('mostrarr').parent().removeClass('no-pointer');
	} else if ($(this).find('.active').index() == 2) {
		$('#CarouselWelcome .left span').removeClass('ocultarl').addClass('mostrarl').parent().removeClass('no-pointer');
		$('#CarouselWelcome .right span').removeClass('ocultarr').addClass('mostrarr').parent().removeClass('no-pointer');
	} else if ($(this).find('.active').index() == 3) {
		$('#CarouselWelcome .left span').removeClass('ocultarl').addClass('mostrarl').parent().removeClass('no-pointer');
		$('#CarouselWelcome .right span').removeClass('ocultarr').addClass('mostrarr').parent().removeClass('no-pointer');
	} else if ($(this).find('.active').index() == 4) {
		$('#CarouselWelcome .left span').removeClass('ocultarl').addClass('mostrarl').parent().removeClass('no-pointer');
		$('#CarouselWelcome .right span').removeClass('mostrarr').addClass('ocultarr').parent().addClass('no-pointer');
	}
});
