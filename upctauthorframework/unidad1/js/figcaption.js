//figcaption fijo pulsando
$('.text').click(function(){
    $(this).children().css('opacity','1');
    $(this).children().css('transform','translateY(0px)');
    $(this).children().css('transition','transform 0.4s, opacity 0.1s');
    //setObjetivoCompleto(obj);
});	

$(document).on('click', '.events', function () {

    // identifico la imagen pulsada
    var id_div = $(this).attr('src');

    console.log(id_div);
    
    // jQuery.post("../events/seeked.php", {user: ip, unidad: unit, click: id_div, objective: objetive}); // registro usuario, pestaña pulsada y objetivo asociado a ella

});