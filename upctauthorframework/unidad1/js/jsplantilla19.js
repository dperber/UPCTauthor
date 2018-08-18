$( document ).ready(function( $ ) {
		$(".pagination").rPage();


	  /* jQuery activation and setting options for parent tabs with id selector*/
            $("#tabbed-nav").zozoTabs({
                rounded: false,
                multiline: true,
                theme: "white",
                size: "medium",
                responsive: true,
                animation: {
                    effects: "slideH",
                    easing: "easeInOutCirc",
                    duration: 500
                },
                defaultTab: "tab1"
            });

            /* jQuery activation and setting options for all nested tabs with class selector*/
            $(".nested-tabs").zozoTabs({
                position: "top-left",
                theme: "green",
                style: "underlined",
                rounded: false,
                shadows: false,
                defaultTab: "tab1",
                animation: {
                    easing: "easeInOutCirc",
                    effects: "slideV",
                    duration: 350
                },
                size: "medium"
            });

	});



	$('.modal-video').on('hidden.bs.modal', function () {
		var dplay = $('.modal-video').attr("data-src");
		var vid = document.getElementById(dplay);
		vid.pause();
	});
