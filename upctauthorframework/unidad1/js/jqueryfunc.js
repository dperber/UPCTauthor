$( document ).ready(function( $ ) {
		$(".pagination").rPage();			
		
		
			
			
		
	});
	
	
	
	$('.modal-video').on('hidden.bs.modal', function () {
		var dplay = $('.modal-video').attr("data-src");
		var vid = document.getElementById(dplay); 
		vid.pause();	
	});
