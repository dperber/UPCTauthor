<!DOCTYPE html>
<?php

$numero = count($_GET);
$tags = array_keys($_GET);// obtiene los nombres de las varibles
$valores = array_values($_GET);// obtiene los valores de las varibles

require_once "../config.php";
require_once "php/funciones.php";
use \Tsugi\Grades\GradeUtil;

use \Tsugi\Core\LTIX;
use \Tsugi\Util\LTI;
use \Tsugi\Util\Caliper;

$LTI = LTIX::requireData();
$p = $CFG->dbprefix;
?>
<html>
  <head>
   <meta charset="utf-8">
	<title>Gamification</title>
	<link rel="stylesheet" type="text/css" href="css/icomoon.css">
    <link rel="stylesheet" type="text/css" href="css/custom.css">
	 <link rel="stylesheet" type="text/css" href="css/base.css">
 <link rel="stylesheet" type="text/css" href="css/social.css">
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css" media="screen" charset="utf-8">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" media="screen" charset="utf-8">
    <script type="text/javascript" src="jquery/jquery-1.11.3.min.js"></script>
   <script src="https://code.jquery.com/ui/1.11.3/jquery-ui.min.js"></script>
   <script src="jquery-ui-touch-punch-master/jquery.ui.touch-punch.min.js"></script>
  </head>
  <body id="body">
	<section id="apdo1" class="section-divider textdividersub divider1" style="background:url('./images/cabecerat2.jpg');">
      <div class="container">
        <h1><?php echo $CONTEXT->title; ?></h1>
        <hr>
        <p></p>
      </div>
    </section>
	<section style="margin-top: 70px;margin-bottom: 70px;">
	<div class="container">
	<div class="row">

		<div class="col-md-3 center-block" style="margin-bottom: 25px;">	
				<?php
					if (isCompleteUnitSQL("https://scursos.upct.es/digital-content/autor/unidad1/index.php",$USER->id,$LINK->id)>0){
						echo '<input type="image" src="'.convertComplete("./images/unit1.png").'" width="250" alt="Demo Unit 1" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/unidad1/index.php\''.','.'\'Demo Unit 1\''.')">';
					}else{ 
						echo '<input type="image" src="./images/unit1.png" width="250" alt="Demo Unit 1" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/unidad1/index.php\''.','.'\'Demo Unit 1\''.')">';
					}
				?>
		</div>
		<div class="col-md-3 center-block" style="margin-bottom: 25px;">	
				<?php
					if (isCompleteUnitSQL("https://scursos.upct.es/digital-content/autor/evaluation1/index.php",$USER->id,$LINK->id)>0){
						echo '<input type="image" src="'.convertComplete("./images/evaluation1.png").'" width="250" alt="FinalUnit1" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/evaluation1/index.php\''.','.'\'FinalUnit1\''.')">';
					}else{ 
						if (isOpenUnitSQL("FinalUnit1",$USER->id,$LINK->id)==1){
							echo '<input type="image" src="./images/evaluation1.png" width="250" alt="FinalUnit1" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/evaluation1/index.php\''.','.'\'FinalUnit1\''.')">';
						}
						/*else{
							echo '<input type="image" style="opacity:0.5" src="./images/evaluation1.png" disabled width="250" alt="FinalUnit1" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/evaluation1/index.php\''.','.'\'FinalUnit1\''.')">';
						}*/
					}
				?>
		</div>
		<div class="col-md-3 center-block" style="margin-bottom: 25px;">	
				<?php
					if (isCompleteUnitSQL("https://scursos.upct.es/digital-content/autor/unidad2/index.php",$USER->id,$LINK->id)>0){
						echo '<input type="image" src="'.convertComplete("./images/unit2.png").'" width="250" alt="Demo Unit 2" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/unidad2/index.php\''.','.'\'Demo Unit 2\''.')">';
					}else{ 
						if (isOpenUnitSQL("Demo Unit 2",$USER->id,$LINK->id)==1){
							echo '<input type="image" src="./images/unit2.png" width="250" alt="Demo Unit 2" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/unidad2/index.php\''.','.'\'Demo Unit 2\''.')">';
						}
						/*else{
							echo '<input type="image" style="opacity:0.5" src="./images/unit2.png" disabled width="250" alt="Demo Unit 2" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/unidad2/index.php\''.','.'\'Demo Unit 2\''.')">';
						}*/
					}
				?>
		</div>
		<div class="col-md-3 center-block" style="margin-bottom: 25px;">	
				<?php
					if (isCompleteUnitSQL("https://scursos.upct.es/digital-content/autor/unidad3/index.php",$USER->id,$LINK->id)>0){
						echo '<input type="image" src="'.convertComplete("./images/unit3.png").'" width="250" alt="Demo Unit 3" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/unidad3/index.php\''.','.'\'Demo Unit 3\''.')">';
					}else{ 
						if (isOpenUnitSQL("Demo Unit 3",$USER->id,$LINK->id)==1){
							echo '<input type="image" src="./images/unit3.png" width="250" alt="Demo Unit 3" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/unidad3/index.php\''.','.'\'Demo Unit 3\''.')">';
						}
						/*else{
							echo '<input type="image" style="opacity:0.5" src="./images/unit3.png" disabled width="250" alt="Demo Unit 3" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/unidad3/index.php\''.','.'\'Demo Unit 3\''.')">';
						}*/
					}
				?>
		</div>
		<div class="col-md-3 center-block" style="margin-bottom: 25px;">	
				<?php
					if (isCompleteUnitSQL("https://scursos.upct.es/digital-content/autor/unidad4/index.php",$USER->id,$LINK->id)>0){
						echo '<input type="image" src="'.convertComplete("./images/unit4.png").'" width="250" alt="Demo Unit 4" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/unidad4/index.php\''.','.'\'Demo Unit 4\''.')">';
					}else{ 
						if (isOpenUnitSQL("Demo Unit 4",$USER->id,$LINK->id)==1){
							echo '<input type="image" src="./images/unit4.png" width="250" alt="Demo Unit 4" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/unidad4/index.php\''.','.'\'Demo Unit 4\''.')">';
						}
						/*else{
							echo '<input type="image" style="opacity:0.5" src="./images/unit4.png" disabled width="250" alt="Demo Unit 4" onclick="entrarMision('.'\'https://scursos.upct.es/digital-content/autor/unidad4/index.php\''.','.'\'Demo Unit 4\''.')">';
						}*/
					}
				?>
		</div>
	</div>	
	</div>
	</section>

	<p id="demo"></p>

	<script>
	var points,pointspre, pointsunit = "";
		var a = {
					"1" : 10,
		};
		var b = {
			"ImageTextOver" : a,
			"ImageTextRight" : a,
			"VerticalAccordion" : a,
			"HorizontalTabs" : a,
			"AnimationInOut" : a,
		};
			pointspre = Object.assign({}, pointspre, b);
		var a = {
					"1" : 100,
					"2" : 80,
					"3" : 60,
					"default" : 20,
		};
		var b = {
			"RectangleDragAndDrop" : a,
		};
			pointspre = Object.assign({}, pointspre, b);
		var a = {
					"1" : 50,
		};
		var b = {
			"ImageTextOver" : a,
		};
				pointsunit = Object.assign({}, pointsunit, {"Demo Unit 1" : b});


	var numerounidades = 1;
	var unit = "";
		var c = [
					{"1" : 100},
		];
		
		var numuni = 0;
				numuni = numuni + 1;
				numuni = numuni + 1;
		numerounidades = numerounidades + numuni;

		var f = [
				{"InitialScore" : 100.0, "FinalScore" : 100.0, "Points" : 'strong', "Next" : 'FinalUnit1'},
				{"InitialScore" : 100.0, "FinalScore" : 100.0, "Points" : 'strong', "Next" : 'Demo Unit 2'},
		];

		var e = "";
			e  = {"tipo" : "unit","badget": "badge1.jpg","points" : c,"missions" : f};
			unit = Object.assign({}, unit, {"Demo Unit 1" : e});
		var c = [
					{"InitialScore" : 40.0, "FinalScore" : 49.99, "Points" : 10},
					{"InitialScore" : 50.0, "FinalScore" : 59.99, "Points" : 50},
					{"InitialScore" : 60.0, "FinalScore" : 79.99, "Points" : 60},
					{"InitialScore" : 80.0, "FinalScore" : 99.99, "Points" : 80},
					{"InitialScore" : 100.0, "FinalScore" : 100.0, "Points" : 100},
		];
		
		var numuni = 0;
			numuni = 1;
		numerounidades = numerounidades + numuni;

		var f = [
				{"InitialScore" : 0.0, "FinalScore" : 65.0, "Points" : 'scores', "Next" : 'Demo Unit 3'},
				{"InitialScore" : 65.01, "FinalScore" : 100.0, "Points" : 'scores', "Next" : 'Demo Unit 4'},
		];

		var e = "";
			e  = {"tipo" : "evaluation","badget": "evaluation1.jpg","points" : c,"missions" : f};
			unit = Object.assign({}, unit, {"FinalUnit1" : e});
		var c = [
					{"1" : 100},
		];
		
		var numuni = 0;
		numerounidades = numerounidades + numuni;

		var f = [
		];

		var e = "";
			e  = {"tipo" : "unit","badget": "badge2.jpg","points" : c,"missions" : f};
			unit = Object.assign({}, unit, {"Demo Unit 2" : e});
		var c = [
					{"1" : 100},
		];
		
		var numuni = 0;
		numerounidades = numerounidades + numuni;

		var f = [
		];

		var e = "";
			e  = {"tipo" : "unit","badget": "badge3.jpg","points" : c,"missions" : f};
			unit = Object.assign({}, unit, {"Demo Unit 3" : e});
		var c = [
					{"1" : 100},
		];
		
		var numuni = 0;
		numerounidades = numerounidades + numuni;

		var f = [
		];

		var e = "";
			e  = {"tipo" : "unit","badget": "badge4.jpg","points" : c,"missions" : f};
			unit = Object.assign({}, unit, {"Demo Unit 4" : e});

		function entrarMision(url,unidad) {
			points = pointspre;
			if (pointsunit.hasOwnProperty(unidad)) {
				for (var clave in pointsunit[unidad]) {
					points[clave] = pointsunit[unidad][clave];
				}
			}
			if (unit.hasOwnProperty(unidad)) {
				for (var clave in unit[unidad]) {
					points[clave] = unit[unidad][clave];
				}
			}

			var url2 = url + "?PHPSESSID=" + '<?php echo session_id(); ?>';			
			var form = '';
            form += "<input type='hidden' name='unidades' value='"+ numerounidades +"'>";
            form += "<input type='hidden' name='identificador' value='"+ url +"'>";
            form += "<input type='hidden' name='points' value='"+ JSON.stringify(points) +"'>";
			$('<form action="'+url2+'" method="POST">'+form+'</form>').appendTo('body').submit();
		}
		function entrarRanking(link) {
			url = "ranking.php";
			var url2 = url + "?PHPSESSID=" + '<?php echo session_id(); ?>';			
			var form = '';
            form += "<input type='hidden' name='unidades' value='"+ numerounidades +"'>";
            form += "<input type='hidden' name='link' value='"+ link +"'>";
       		$('<form action="'+url2+'" method="POST">'+form+'</form>').appendTo('body').submit();
			
		}
	</script>
	<div class="social">
		<ul>
			<li><a onclick="entrarRanking(<?php echo $LINK->id; ?>)" target="_blank" ><i class="fa fa-trophy" style="font-size:48px;" aria-hidden="true"></i></a></li>
		</ul>
	</div>

	<footer id="footerwrap">
			<div class="container">
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
					<h6 style="color: #fff;">&copy; Polytechnic University of Cartagena - Pza. del Cronista Isidoro Valverde, Edif. La Milagrosa, C.P. 30202 Cartagena. Tlf: 868 07 11 98.</h6>
                    <h6 style="color: #fff;">&copy; Designed and Developed by <a href="http://cpcd.upct.es/" target="_blank">Center of Production of Digital Contents</a> of the Polytechnic University of Cartagena</h6>
						
					</div>
				</div>	
			</div>
	</footer>
	</body>
</html>

