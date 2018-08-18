$( document ).ready(function( $ ) {
		$(".pagination").rPage();


	  $("#tabbed-nav2").zozoTabs({
                position: "top-left",
                theme: "white",
                shadows: true,
                multiline: true,

                orientation: "vertical",
                size: "medium",
                animation: {
                    easing: "easeInOutExpo",
                    duration: 500,
                    effects: "slideV"
                }
            });

	});



	$('.modal-video').on('hidden.bs.modal', function () {
		var dplay = $('.modal-video').attr("data-src");
		var vid = document.getElementById(dplay);
		vid.pause();
	});
