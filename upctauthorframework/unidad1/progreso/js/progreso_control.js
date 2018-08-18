
function configurarElementosControl() {
	$('.control_objetivo_unico_click').click(function() {

		var id = $(this).attr("id");
		var desc = $(this).attr("data-desc");
		var tipo = $(this).attr("data-type");
		
		var longitud = id.length;
		setObjetivoCompleto("objetivo" + id,desc,tipo);

	});
	// capturo los eventos de los vídeos que pulso
$(document).ready(function(){	
	setTimeout(function(){
			// duración total del vídeo
			duration = playerInstance.getDuration();

			// evento al pulsar la línea temporal del vídeo, da la posición en la que estaba cuando se pulsa
			playerInstance.on('time', function (e) {
				duration = e.duration;
				position = e.position;
				var id = playerInstance.id;
				var caden = "." + id;
				var desc = "Vídeo " + $(caden).attr('data-name');
				var cadevento = '{ "video" : [ { "Type" : "Playing" , "Position" : "' + position + '" ,"Duration" : "' + duration + '" }]}';
				setObjetivoInteraccion("objetivo" + id,desc,cadevento);				
			});
			
			// evento al pulsar la línea temporal del vídeo, da la posición en la que estaba cuando se pulsa
			playerInstance.on('seek', function (e) {	
				position_old = e.position;
				offset = e.offset;
				duration = playerInstance.getDuration();
				var id = playerInstance.id;
				var caden = "." + id;
				var desc = "Vídeo " + $(caden).attr('data-name');
				var cadevento = '{ "video" : [ { "Type" : "Seek" , "Position" : "' + Math.trunc(position) + '" ,"Offset" : "' + Math.trunc(offset) + '" ,"Duration" : "' + duration + '" }]}';
				setObjetivoMediaSeek("objetivo" + id,desc,cadevento,Math.trunc(position),Math.trunc(offset));
			});		

			// evento al pulsar play
			playerInstance.on('play', function (e) {
				duration = playerInstance.getDuration();
				position = playerInstance.getPosition();
				state = playerInstance.getState();
				var id = playerInstance.id;
				var caden = "." + id;
				var desc = "Vídeo " + $(caden).attr('data-name');
				var cadevento = '{ "video" : [ { "Type" : "Play", "Position" : "' + position + '", "Duration" : "' + duration + '" }]}';
				setObjetivoInteraccion("objetivo" + id,desc,cadevento);

			});

			// evento al pulsar pause
			playerInstance.on('pause', function (e) {
				duration = playerInstance.getDuration();				
				position = playerInstance.getPosition();
				state = playerInstance.getState();
				var id = playerInstance.id;
				var caden = "." + id;
				var desc = "Vídeo " + $(caden).attr('data-name');
				var cadevento = '{ "video" : [ { "Type" : "Pause", "Position" : "' + position + '", "Duration" : "' + duration + '" }]}';
				setObjetivoInteraccion("objetivo" + id,desc,cadevento);
			});

			// evento al terminar el vídeo
			playerInstance.on('complete', function (e) {
				position = playerInstance.getPosition();
				state = playerInstance.getState();
				var id = playerInstance.id;
				var caden = "." + id;
				var desc = "Vídeo " + $(caden).attr('data-name');
				setObjetivoCompleto("objetivo" + id,desc,"Video");
			});		
		}, 1000);
	});
}