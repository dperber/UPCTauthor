$(document).on('click', '.events', function () {

    // identifico la pestaña pulsada
    var id_div = $(this).attr('aria-controls');

    console.log(id_div);
    
    // jQuery.post("../events/seeked.php", {user: ip, unidad: unit, click: id_div, objective: objetive}); // registro usuario, pestaña pulsada y objetivo asociado a ella

});