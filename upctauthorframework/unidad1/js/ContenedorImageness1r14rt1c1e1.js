(function(scope) {
	//constructor de la clase
	function ContenedorImageness1r14rt1c1e1() {
		this.initialize();
	}

	//si no se pone prototype en los m�todos, se convierten en est�ticos
	ContenedorImageness1r14rt1c1e1.prototype = new createjs.Container()
	ContenedorImageness1r14rt1c1e1.prototype.Container_init = ContenedorImageness1r14rt1c1e1.prototype.initialize;

	var filas = ContenedorImageness1r14rt1c1e1.prototype;
	var pasos = ContenedorImageness1r14rt1c1e1.prototype;
	var initY = ContenedorImageness1r14rt1c1e1.prototype;
	var cargado = ContenedorImageness1r14rt1c1e1.prototype;

	var vX = ContenedorImageness1r14rt1c1e1.prototype;
	var vY = ContenedorImageness1r14rt1c1e1.prototype;

	//implemento la nueva inicializaci�n del objeto
	ContenedorImageness1r14rt1c1e1.prototype.initialize = function() {
		this.Container_init();

		this.vX = 6;
		this.vY = 70;
		this.velocity = {
			x: 0,
			y: 0
		};
		this.init();
	}

	ContenedorImageness1r14rt1c1e1.prototype.init = function() {
		var self = this;
		this.cargado = false;

		//console.log("Inicializando Contenedor Imagenes");

		this.x = 0;
		this.y = 0;
		this.initY = 60;

		this.snapToPixel = true;

		this.cargarPiezas();
	}

	ContenedorImageness1r14rt1c1e1.prototype.cargarPiezas = function(e) {		
				var bmp1 = new MostrarImagens1r14rt1c1e1(0, cargadorapps1r14rt1c1e1[rutaPiezas1r14rt1c1e1[0]], 0, 0);
				this.addChild(bmp1);
				var bmp2 = new MostrarImagens1r14rt1c1e1(1, cargadorapps1r14rt1c1e1[rutaPiezas1r14rt1c1e1[1]], 0, 0);
				this.addChild(bmp2);
				var bmp3 = new MostrarImagens1r14rt1c1e1(2, cargadorapps1r14rt1c1e1[rutaPiezas1r14rt1c1e1[2]], 0, 0);
				this.addChild(bmp3);
				var bmp4 = new MostrarImagens1r14rt1c1e1(3, cargadorapps1r14rt1c1e1[rutaPiezas1r14rt1c1e1[3]], 0, 0);
				this.addChild(bmp4);
				var bmp5 = new MostrarImagens1r14rt1c1e1(4, cargadorapps1r14rt1c1e1[rutaPiezas1r14rt1c1e1[4]], 0, 0);
				this.addChild(bmp5);
				var bmp6 = new MostrarImagens1r14rt1c1e1(5, cargadorapps1r14rt1c1e1[rutaPiezas1r14rt1c1e1[5]], 0, 0);
				this.addChild(bmp6);
				var bmp7 = new MostrarImagens1r14rt1c1e1(6, cargadorapps1r14rt1c1e1[rutaPiezas1r14rt1c1e1[6]], 0, 0);
				this.addChild(bmp7);
				var bmp8 = new MostrarImagens1r14rt1c1e1(7, cargadorapps1r14rt1c1e1[rutaPiezas1r14rt1c1e1[7]], 0, 0);
				this.addChild(bmp8);
				var bmp9 = new MostrarImagens1r14rt1c1e1(8, cargadorapps1r14rt1c1e1[rutaPiezas1r14rt1c1e1[8]], 0, 0);
				this.addChild(bmp9);
				var bmp10 = new MostrarImagens1r14rt1c1e1(9, cargadorapps1r14rt1c1e1[rutaPiezas1r14rt1c1e1[9]], 0, 0);
				this.addChild(bmp10);
	};

	//este onTick lo llevan se llama para todos los objetos a�adidos al stage
	ContenedorImageness1r14rt1c1e1.prototype.onTick = function() {}

	ContenedorImageness1r14rt1c1e1.prototype.deleteImagenCargar = function() {
		this.removeAllChildren();
		this.cargarPiezas();
	}

	//esto para poder acceder desde fuera del namespace
	scope.ContenedorImageness1r14rt1c1e1 = ContenedorImageness1r14rt1c1e1;

	//se asocia al namespace window que es tanto como usar _global
}(window));
