//función para mostrar elementos ocultos
$('.btnmostrar').each(function () {
    var $this = $(this);
    $this.on("click", function () {
       var quien = $(this).attr("data-target");
       $(quien).removeClass('hidden').addClass('show')
    });
});

$(document).on('click', '.events', function () {

    // identifico la imagen pulsada
    var id_div = $(this).attr('src');

    console.log(id_div);
    
    // jQuery.post("../events/seeked.php", {user: ip, unidad: unit, click: id_div, objective: objetive}); // registro usuario, pestaña pulsada y objetivo asociado a ella

});