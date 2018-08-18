	$(document).ready(function() {
			initializeapps2r1rt1c1e1();	
	});

var canvasapps2r1rt1c1e1;
var stageapps2r1rt1c1e1;
var cargadorapps2r1rt1c1e1;
var contenedorImagenesapps2r1rt1c1e1;
var fondoapps2r1rt1c1e1;
var imagenrcapps2r1rt1c1e1;
var imagenrcgapps2r1rt1c1e1;
var rutaPiezas2r1rt1c1e1;
var textoPiezasapps2r1rt1c1e1;
var enablePiezasapps2r1rt1c1e1;
var cambiadoapps2r1rt1c1e1;
var moverPiezasapps2r1rt1c1e1;
var piezasapps2r1rt1c1e1;

function initializeapps2r1rt1c1e1() {
	this.rutaPiezas2r1rt1c1e1 =  [ 
			"img/fondo.png"
,
			"img/p1.png"
,
			"img/p2.png"
,
			"img/p11.png"
,
			"img/p21.png"
];


	this.enablePiezasapps2r1rt1c1e1 = [
				0,
					0
	];
	
	this.moverPiezasapps2r1rt1c1e1 = [1, 0, 0, 0, 0];
	this.piezasapps2r1rt1c1e1 = [null, null, null, null, null];
	var self = this;
	this.canvasapps2r1rt1c1e1 = document.createElement("canvas");
	this.canvasapps2r1rt1c1e1.width = 800;
	this.canvasapps2r1rt1c1e1.height = 533;
	var contenedorapps2r1rt1c1e1 = document.getElementById("s2r1rt1c1e1");
	contenedorapps2r1rt1c1e1.appendChild(this.canvasapps2r1rt1c1e1);

	this.stageapps2r1rt1c1e1 = new createjs.Stage(this.canvasapps2r1rt1c1e1); //Base de Aplicaci�n
	this.stageapps2r1rt1c1e1.enableMouseOver(20);
	this.cargadorapps2r1rt1c1e1 = new Cargadors2r1rt1c1e1();

	this.cargadorapps2r1rt1c1e1.onComplete = function() {

		self.assetsCargadosapps2r1rt1c1e1();
	}
	this.cargadorapps2r1rt1c1e1.loadImagenes([
		this.rutaPiezas2r1rt1c1e1[0]
		,
		this.rutaPiezas2r1rt1c1e1[1]
		,
		this.rutaPiezas2r1rt1c1e1[2]
		,
		this.rutaPiezas2r1rt1c1e1[3]
		,
		this.rutaPiezas2r1rt1c1e1[4]
		]);

};

function assetsCargadosapps2r1rt1c1e1() {
	this.ejecutaAppapps2r1rt1c1e1();
}

function ejecutaAppapps2r1rt1c1e1() {

	var contenedorapps2r1rt1c1e1 = new ContenedorImageness2r1rt1c1e1();
	this.stageapps2r1rt1c1e1.addChild(contenedorapps2r1rt1c1e1);
	contenedorImagenesapps2r1rt1c1e1 = contenedorapps2r1rt1c1e1;
	contenedorImagenesapps2r1rt1c1e1.x = 0;
	contenedorImagenesapps2r1rt1c1e1.y = 0;

	var self = this;
	this.tickapps2r1rt1c1e1();
};

function tickapps2r1rt1c1e1(e) {
	this.stageapps2r1rt1c1e1.update();
};

var completo = [];
function Recargarapps2r1rt1c1e1(vid) {	
	this.enablePiezasapps2r1rt1c1e1[0] = vid + 1;
	if (vid == 2.0){
		setObjetivoCompleto("objetivos2r1rt1c1e1","section2animation", "AnimationInOut");
	}
	this.rutaPiezas2r1rt1c1e1[vid] = this.rutaPiezas2r1rt1c1e1[vid+2];
	
	contenedorImagenesapps2r1rt1c1e1.deleteImagenCargar();
};


(function(scope){
	function Cargadors2r1rt1c1e1(){
		this.initialize();
	}
	
	//var variable = Cargadors2r1rt1c1e1.prototype;
	var cargadas  = Cargadors2r1rt1c1e1.prototype;
	var totales = Cargadors2r1rt1c1e1.prototype;
	var onComplete  = Cargadors2r1rt1c1e1.prototype;

	Cargadors2r1rt1c1e1.prototype.initialize = function(){
		//console.log("cargador generado");	
	};

	Cargadors2r1rt1c1e1.prototype.loadImagenes = function(lista){
		
		this.cargadas = 0;
		this.totales = lista.length;
		for (i=0;i<this.totales;i++){
			this.cargaImagen(lista[i]);
		}
	}

	Cargadors2r1rt1c1e1.prototype.cargaImagen = function(ruta){
		var self = this;
		var image = new Image();
		this[ruta] = image;
		
		image.onload = function(e){
			self.imagenCargada();
		}
		image.src = image.url = ruta;

	}

	Cargadors2r1rt1c1e1.prototype.imagenCargada = function(){
		this.cargadas ++;
		if (this.cargadas == this.totales){
			if (this.onComplete){
				this.onComplete();
			}else{
				//console.log("onComplete no definida");
			}

		}

	}
	scope.Cargadors2r1rt1c1e1 = Cargadors2r1rt1c1e1;
}(window));


(function(scope) {
	//constructor de la clase
	function ContenedorImageness2r1rt1c1e1() {
		this.initialize();
	}

	//si no se pone prototype en los m�todos, se convierten en est�ticos
	ContenedorImageness2r1rt1c1e1.prototype = new createjs.Container()
	ContenedorImageness2r1rt1c1e1.prototype.Container_init = ContenedorImageness2r1rt1c1e1.prototype.initialize;

	var filas = ContenedorImageness2r1rt1c1e1.prototype;
	var pasos = ContenedorImageness2r1rt1c1e1.prototype;
	var initY = ContenedorImageness2r1rt1c1e1.prototype;
	var cargado = ContenedorImageness2r1rt1c1e1.prototype;

	var vX = ContenedorImageness2r1rt1c1e1.prototype;
	var vY = ContenedorImageness2r1rt1c1e1.prototype;

	//implemento la nueva inicializaci�n del objeto
	ContenedorImageness2r1rt1c1e1.prototype.initialize = function() {
		this.Container_init();

		this.vX = 6;
		this.vY = 70;
		this.velocity = {
			x: 0,
			y: 0
		};
		this.init();
	}

	ContenedorImageness2r1rt1c1e1.prototype.init = function() {
		var self = this;
		this.cargado = false;

		//console.log("Inicializando Contenedor Imagenes");

		this.x = 0;
		this.y = 0;
		this.initY = 60;

		this.snapToPixel = true;

		this.cargarPiezas();
	}

	ContenedorImageness2r1rt1c1e1.prototype.cargarPiezas = function(e) {		
				var bmp1 = new MostrarImagens2r1rt1c1e1(0, cargadorapps2r1rt1c1e1[rutaPiezas2r1rt1c1e1[0]], 0, 0);
				this.addChild(bmp1);
				var bmp2 = new MostrarImagens2r1rt1c1e1(1, cargadorapps2r1rt1c1e1[rutaPiezas2r1rt1c1e1[1]], 0, 0);
				this.addChild(bmp2);
				var bmp3 = new MostrarImagens2r1rt1c1e1(2, cargadorapps2r1rt1c1e1[rutaPiezas2r1rt1c1e1[2]], 0, 0);
				this.addChild(bmp3);
	};

	//este onTick lo llevan se llama para todos los objetos a�adidos al stage
	ContenedorImageness2r1rt1c1e1.prototype.onTick = function() {}

	ContenedorImageness2r1rt1c1e1.prototype.deleteImagenCargar = function() {
		this.removeAllChildren();
		this.cargarPiezas();
	}

	//esto para poder acceder desde fuera del namespace
	scope.ContenedorImageness2r1rt1c1e1 = ContenedorImageness2r1rt1c1e1;

	//se asocia al namespace window que es tanto como usar _global
}(window));

(function(scope){
	//constructor de la clase
	function MostrarImagens2r1rt1c1e1(id,image, posX, posY){
		this.initialize(id,image, posX, posY);
	}

	MostrarImagens2r1rt1c1e1.prototype = new createjs.Bitmap()
	MostrarImagens2r1rt1c1e1.prototype.Bitmap_init = MostrarImagens2r1rt1c1e1.prototype.initialize;

	var ancho = MostrarImagens2r1rt1c1e1.prototype;
	var id = MostrarImagens2r1rt1c1e1.prototype;
	var _evento = MostrarImagens2r1rt1c1e1.prototype;

	MostrarImagens2r1rt1c1e1.prototype.initialize = function (id,image, posX, posY){
		this.ancho = 6;
		var self = this;
		this.Bitmap_init(image);
		this.x = posX;
		this.y = posY;
		this.id = id;
		stageapps2r1rt1c1e1.addChild(this);

		//ejecuto el resto de valores
		this.snapToPixel = true;
		this.velocity = {x:0,y:-15};
		this.addEventListener("mousedown", function(e){self.handleMouseDown(e);});

		this.addEventListener("mouseover", function(e){self.handleMouseOver(e);});
		this.addEventListener("mouseout", function(e){self.handleMouseOut(e);});

		tickapps2r1rt1c1e1();
	}

	MostrarImagens2r1rt1c1e1.prototype.handleMouseDown = function (e){
		if (
				(this.id == 1)||
				(this.id == 2)
					){
			Recargarapps2r1rt1c1e1(this.id);
		}
	}

	MostrarImagens2r1rt1c1e1.prototype.handleMouseOver = function (e){
		if (
				(this.id == 1)||
				(this.id == 2)
					){
			$("#s2r1rt1c1e1").addClass('mano');
		}
	}
	MostrarImagens2r1rt1c1e1.prototype.handleMouseOut = function (e){
		$("#s2r1rt1c1e1").removeClass('mano');
	}

	//esto para poder acceder desde fuera del namespace
	scope.MostrarImagens2r1rt1c1e1 = MostrarImagens2r1rt1c1e1;

	//se asocia al namespace window que es tanto como usar _global

}(window));
