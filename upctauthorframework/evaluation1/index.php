<!DOCTYPE html>
<?php
	$numero = count($_GET);
	$tags = array_keys($_GET);// obtiene los nombres de las varibles
	$valores = array_values($_GET);// obtiene los valores de las varibles

	require_once "../../config.php";

	use \Tsugi\Util\LTI;
	use \Tsugi\Core\Settings;
	use \Tsugi\Core\LTIX;
	use \Tsugi\UI\SettingsForm;

	$LTI = LTIX::requireData();
	$p = $CFG->dbprefix;
	if (isset($_POST["points"])){
		//$points = json_decode($_POST["points"], true);
		$points = $_POST["points"];
		$tipo = "gamification";
		$identificador = $_POST["identificador"];
		$unidades = $_POST["unidades"];
	}else{
		$points = "";
		$tipo = "normal";
		$uri_parts = explode('?', $_SERVER['REQUEST_URI'], 2);
		$identificador =  "https://". $_SERVER["HTTP_HOST"] . $uri_parts[0];
		$unidades = 0;
	}
?>

<html>
	<head>
		<meta charset="utf-8">
		<title>Evaluacion 1</title>

		<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css" />
		    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" media="screen" charset="utf-8">
		<link rel="stylesheet" type="text/css" href="css/base.css" >
		 <link rel="stylesheet" type="text/css" href="css/social.css">
		<link rel="stylesheet" type="text/css" href="css/main.css" >
		<link rel="stylesheet" type="text/css" href="css/icomoon.css">
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" >
		 <link rel="stylesheet" type="text/css" href="css/social.css">
	</head>

	<body data-spy="scroll" data-offset="0" data-target="#navbar-main" unload="javascript:finUnidad();" onLoad="setInterval('keepAlive()',600000);">	
		<script type="text/javascript">
			var link = '<?php echo $LINK->id; ?>';
			var title = '<?php echo $LINK->title; ?>';
			var usd = '<?php echo $USER->id; ?>';
			var displayname = '<?php echo $USER->displayname; ?>';
			var email = '<?php echo $USER->email; ?>';
			var firstname = '<?php echo $USER->firstname; ?>';
			var lastname = '<?php echo $USER->lastname; ?>';
			var session_id = '<?php echo session_id(); ?>';	
			var tipounit = '<?php echo $tipo; ?>';
			var points = '<?php echo $points; ?>';
			var unidades = '<?php echo $unidades; ?>';
			var identificador = '<?php echo $identificador; ?>';
		</script>
		<div id="navbar-main"> 
			<!-- Fixed navbar -->
			<div class="navbar navbar-inverse navbar-fixed-scroll" role="navigation"> 
				<!-- ==== HEADERWRAP ==== -->
				<div class="container">
					<div class="row">
						<div>
							<div class="col-xs-12 col-sm-3  centered titmov2">
								<img class="img-responsive" alt="" src="img/logoaero2.png">
							</div>
							<div class="col-xs-12 col-sm-5 centered">
								<div style="margin-top: 20px"></div>
								<h1  class="ctituloe1 ctitulomod titmov2">Servicio de Idiomas <br> Nivel A2</h1>										
							</div>
							<div class="col-xs-12 col-sm-4  centered titmov2">
								<div style="margin-top: 20px"></div>
								<img class="img-responsive" alt="" src="img/logoupct.png">
								</div>
							</div>
						</div>						
					</div>
				</div>						
			</div>
		</div>
		<!-- /headerwrap --> 

		<!-- ==== GREYWRAP ==== -->
		<div id="greywrap">
			<div class="container">
				<div class="row white">	
					<!-- TEXTO ENCABEZADO DE LAS PREGUNTAS -->
					<div id="encabezadoEvaluacion">
						<h3 class='centered'>No dispones de más intentos para superar la evaluación.</h3><hr>
						<h4 class='centered'>Has realizado ya la evaluación y has obtenido una puntuación de <span class='notaObtenida'><?php echo $nota;?></span> sobre 10.</h4>
					</div> 
					<!-- FIN TEXTO ENCABEZADO DE LAS PREGUNTAS -->

					<div id="resultado"></div>

					<div id="encabezadoEvaluacion"></div>			
					<div id="contenidoEvaluacion"></div>
					<div class="clearfix"></div>
				
					<div class="col-md-4">  
						<p><a href="#" id="botonEnviar" class="btn btn-primary" role="button">ENVIAR EVALUACIÓN</a></p>
					</div>	
			
				</div>
				<!-- row --> 
				<div class="row">
					<div class="col-md-12" id="resultadoEvaluacion"></div>	
				</div>
			<!-- container --> 
			</div>
		</div>

			 <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">UPCTforma</h4>
        </div>
        <div class="modal-body">
          <p id="bodymymodal"></p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
		<div class="modal fade" id="sharedModal" tabindex="-1" role="dialog" aria-labelledby="sharedModalLabel">
            <div class="modal-dialog" role="document">
               
            </div>
        </div>
	<script>
		function entrarRanking(link) {
			url = "../ranking.php";
			var url2 = url + "?PHPSESSID=" + '<?php echo session_id(); ?>';		
			var form = '';
			form += "<input type='hidden' name='unidades' value='"+ unidades +"'>";
            form += "<input type='hidden' name='link' value='"+ link +"'>";
			$('<form action="'+url2+'" method="POST">'+form+'</form>').appendTo('body').submit();
			
		}
	</script>
		
	<?php 
		if ($tipo=="gamification"){
			echo '<div class="social">';
			echo '<ul>';
			echo '<li><a onclick="entrarRanking( ' . $LINK->id . ')" target="_blank" ><i class="fa fa-trophy" style="font-size:48px;" aria-hidden="true"></i></a></li>';
			echo '</ul>';
			echo '</div>';
		}
	?>
		<div id="footerwrap">
			<div class="container"></div>
		</div>	

		<!-- Placed at the end of the document so the pages load faster --> 
		<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
		<script type="text/javascript" src="js/modernizr.custom.js"></script>
		<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/progreso_mapa.js"></script>
		<script type="text/javascript" src="js/funciones_evaluacion_final.js"></script>
		<script type="text/javascript">inicializar();</script>	
	</body>
</html>