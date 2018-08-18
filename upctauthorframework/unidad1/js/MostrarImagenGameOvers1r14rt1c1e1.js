(function(scope){
	//constructor de la clase
	function MostrarImagens1r14rt1c1e1(id,image, posX, posY){
		this.initialize(id,image, posX, posY);		
	}

	MostrarImagens1r14rt1c1e1.prototype = new createjs.Bitmap()
	MostrarImagens1r14rt1c1e1.prototype.Bitmap_init = MostrarImagens1r14rt1c1e1.prototype.initialize;

	var ancho = MostrarImagens1r14rt1c1e1.prototype;
	var id = MostrarImagens1r14rt1c1e1.prototype;
	var _evento = MostrarImagens1r14rt1c1e1.prototype;

	MostrarImagens1r14rt1c1e1.prototype.initialize = function (id,image, posX, posY){
		this.ancho = 6;
		var self = this;
		this.Bitmap_init(image);
		this.x = posX;
		this.y = posY;
		this.id = id;
		stageapps1r14rt1c1e1.addChild(this);

		//ejecuto el resto de valores
		this.snapToPixel = true;
		this.velocity = {x:0,y:-15};
		this.addEventListener("mousedown", function(e){			
			self.handleMouseDown(e);			
		});
		this.addEventListener("mouseover", function(e){			
			self.handleMouseOver(e);			
		});
		this.addEventListener("mouseout", function(e){			
			self.handleMouseOut(e);			
		});		

		tickapps1r14rt1c1e1();		
	}

	MostrarImagens1r14rt1c1e1.prototype.handleMouseDown = function (e){
		if ((this.id == 1)||(this.id == 2)||(this.id == 3)||(this.id == 4)||(this.id == 5)||(this.id == 6)||(this.id == 7)||(this.id == 8)||(this.id == 9)){
			Recargarapps1r14rt1c1e1(this.id);
		}
	}

	MostrarImagens1r14rt1c1e1.prototype.handleMouseOver = function (e){		
		if ((this.id == 1)||(this.id == 2)||(this.id == 3)||(this.id == 4)||(this.id == 5)||(this.id == 6)||(this.id == 7)||(this.id == 8)||(this.id == 9)){
			$("#s1r14rt1c1e1").addClass('mano');			
		}
	}
	MostrarImagens1r14rt1c1e1.prototype.handleMouseOut = function (e){
		$("#s1r14rt1c1e1").removeClass('mano');
	}

	//esto para poder acceder desde fuera del namespace
	scope.MostrarImagens1r14rt1c1e1 = MostrarImagens1r14rt1c1e1;

	//se asocia al namespace window que es tanto como usar _global

}(window));
