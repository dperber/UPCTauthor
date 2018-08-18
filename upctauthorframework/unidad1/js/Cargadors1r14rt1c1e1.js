
(function(scope){
	function Cargadors1r14rt1c1e1(){
		this.initialize();
	}
	
	//var variable = Cargadors1r14rt1c1e1.prototype;
	var cargadas  = Cargadors1r14rt1c1e1.prototype;
	var totales = Cargadors1r14rt1c1e1.prototype;
	var onComplete  = Cargadors1r14rt1c1e1.prototype;

	Cargadors1r14rt1c1e1.prototype.initialize = function(){
		//console.log("cargador generado");	
	};

	Cargadors1r14rt1c1e1.prototype.loadImagenes = function(lista){
		
		this.cargadas = 0;
		this.totales = lista.length;
		for (i=0;i<this.totales;i++){
			this.cargaImagen(lista[i]);
		}
	}

	Cargadors1r14rt1c1e1.prototype.cargaImagen = function(ruta){
		var self = this;
		var image = new Image();
		this[ruta] = image;
		
		image.onload = function(e){
			self.imagenCargada();
		}
		image.src = image.url = ruta;

	}

	Cargadors1r14rt1c1e1.prototype.imagenCargada = function(){
		this.cargadas ++;
		if (this.cargadas == this.totales){
			if (this.onComplete){
				this.onComplete();
			}else{
				//console.log("onComplete no definida");
			}

		}

	}
	scope.Cargadors1r14rt1c1e1 = Cargadors1r14rt1c1e1;
}(window));

