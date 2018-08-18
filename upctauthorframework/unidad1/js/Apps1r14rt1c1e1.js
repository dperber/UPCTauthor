var canvasapps1r14rt1c1e1;
var stageapps1r14rt1c1e1;
var cargadorapps1r14rt1c1e1;
var contenedorImagenesapps1r14rt1c1e1;
var fondoapps1r14rt1c1e1;
var imagenrcapps1r14rt1c1e1;
var imagenrcgapps1r14rt1c1e1;
var rutaPiezas1r14rt1c1e1;
var textoPiezasapps1r14rt1c1e1;
var enablePiezasapps1r14rt1c1e1;
var cambiadoapps1r14rt1c1e1;
var moverPiezasapps1r14rt1c1e1;
var piezasapps1r14rt1c1e1;

function initializeapps1r14rt1c1e1() {
	this.rutaPiezas1r14rt1c1e1 =  [ 
			"img/fondo.png"
,
			"img/bgirl.png"
,
			"img/bgrandfather.png"
,
			"img/baunt.png"
,
			"img/bmother.png"
,
			"img/bbaby.png"
,
			"img/bfather.png"
,
			"img/buncle.png"
,
			"img/bgrandmother.png"
,
			"img/bboy.png"
,
			"img/girl.png"
,
			"img/grandfather.png"
,
			"img/aunt.png"
,
			"img/mother.png"
,
			"img/baby.png"
,
			"img/father.png"
,
			"img/uncle.png"
,
			"img/grandmother.png"
,
			"img/boy.png"
];


	this.enablePiezasapps1r14rt1c1e1 = [0, 0, 0];
	
	this.moverPiezasapps1r14rt1c1e1 = [1, 0, 0, 0, 0];
	this.piezasapps1r14rt1c1e1 = [null, null, null, null, null];
	var self = this;
	this.canvasapps1r14rt1c1e1 = document.createElement("canvas");
	this.canvasapps1r14rt1c1e1.width = 800;
	this.canvasapps1r14rt1c1e1.height = 533;
	var contenedorapps1r14rt1c1e1 = document.getElementById("s1r14rt1c1e1");
	contenedorapps1r14rt1c1e1.appendChild(this.canvasapps1r14rt1c1e1);

	this.stageapps1r14rt1c1e1 = new createjs.Stage(this.canvasapps1r14rt1c1e1); //Base de Aplicaci�n
	this.stageapps1r14rt1c1e1.enableMouseOver(20);
	this.cargadorapps1r14rt1c1e1 = new Cargadors1r14rt1c1e1();

	this.cargadorapps1r14rt1c1e1.onComplete = function() {

		self.assetsCargadosapps1r14rt1c1e1();
	}
	this.cargadorapps1r14rt1c1e1.loadImagenes([
		this.rutaPiezas1r14rt1c1e1[0]
		,
		this.rutaPiezas1r14rt1c1e1[1]
		,
		this.rutaPiezas1r14rt1c1e1[2]
		,
		this.rutaPiezas1r14rt1c1e1[3]
		,
		this.rutaPiezas1r14rt1c1e1[4]
		,
		this.rutaPiezas1r14rt1c1e1[5]
		,
		this.rutaPiezas1r14rt1c1e1[6]
		,
		this.rutaPiezas1r14rt1c1e1[7]
		,
		this.rutaPiezas1r14rt1c1e1[8]
		,
		this.rutaPiezas1r14rt1c1e1[9]
		,
		this.rutaPiezas1r14rt1c1e1[10]
		,
		this.rutaPiezas1r14rt1c1e1[11]
		,
		this.rutaPiezas1r14rt1c1e1[12]
		,
		this.rutaPiezas1r14rt1c1e1[13]
		,
		this.rutaPiezas1r14rt1c1e1[14]
		,
		this.rutaPiezas1r14rt1c1e1[15]
		,
		this.rutaPiezas1r14rt1c1e1[16]
		,
		this.rutaPiezas1r14rt1c1e1[17]
		,
		this.rutaPiezas1r14rt1c1e1[18]
		]);

};

function assetsCargadosapps1r14rt1c1e1() {
	this.ejecutaAppapps1r14rt1c1e1();
}

function ejecutaAppapps1r14rt1c1e1() {

	var contenedorapps1r14rt1c1e1 = new ContenedorImageness1r14rt1c1e1();
	this.stageapps1r14rt1c1e1.addChild(contenedorapps1r14rt1c1e1);
	contenedorImagenesapps1r14rt1c1e1 = contenedorapps1r14rt1c1e1;
	contenedorImagenesapps1r14rt1c1e1.x = 0;
	contenedorImagenesapps1r14rt1c1e1.y = 0;

	var self = this;
	this.tickapps1r14rt1c1e1();
};

function tickapps1r14rt1c1e1(e) {
	this.stageapps1r14rt1c1e1.update();
};

var completo = [];
function Recargarapps1r14rt1c1e1(vid) {	
	this.enablePiezasapps1r14rt1c1e1[0] = vid + 1;
	this.rutaPiezas1r14rt1c1e1[vid] = this.rutaPiezas1r14rt1c1e1[vid+9];
	
	contenedorImagenesapps1r14rt1c1e1.deleteImagenCargar();
};
