<?php
require_once "../../../config.php";
require_once 'analytics/SensorUPCTforma.php';

use \Tsugi\Util\LTI;
use \Tsugi\Core\Settings;
use \Tsugi\Core\LTIX;
use \Tsugi\UI\SettingsForm;

$LTI = LTIX::requireData();
$p = $CFG->dbprefix;

if (isset($_POST['funcion'])){
	$sensorforma = null;
	$funcion = $_POST['funcion'];
	$usr = $_POST["usuario"];
	$nombre = $_POST["nombre"];
	$apellidos = $_POST["apellidos"];
	$email = $_POST["email"];
	$link = $_POST["enlace"];
	$titulo = $_POST["titulo"];
	$session = $_POST["session"];
	$context = $_POST["context"];
	$porcentaje = $_POST["porcentaje"];
	$objDateTime = new DateTime('NOW');
	$objDateTime->format('Y-m-d H:i:s');
	$url = $_POST["url"];
	
	switch ($funcion) {
		case 0: //Entro a la unidad
			initUnit($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objDateTime,$url);
			break;
		case 1: //Salgo de la unidad
			finUnit($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objDateTime,$url);
			break;
		case 2:	//Registro interacción
			$objetivo = $_POST["objetivo"];
			$descripcion = $_POST["descripcion"];
			$cadenaevento = $_POST["cadenaevento"];
			registraInteraccion($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
			break;
		case 3: //Supero objetivo
			$objetivo = $_POST["objetivo"];			
			$descripcion = $_POST["descripcion"];
			$tipo = $_POST["tipo"];
			$tipounit = $_POST["tipounit"];
			$points = $_POST["points"];
			$unidades = $_POST["unidades"];
			$cadenaevento = "";
			completarObjetivo($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$tipo,$tipounit,$points,$url,$unidades);
			break;
		case 4: //Recuperar estado de un objetivo
			$objetivo = $_POST["objetivo"];
			//recuperaEstado($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objetivo);
			recuperaEstadoSQL($usr,$link,$context,$objetivo,$url);

			break;
		case 5: //Entro a la unidad
			keepAliveUnit($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objDateTime,$url);
			break;
		case 6:	//Registro interacción Movimientos para DragAndDrop
			$objetivo = $_POST["objetivo"];
			$descripcion = $_POST["descripcion"];
			$cadenaevento = $_POST["cadenaevento"];
			registraInteraccionMovimientos($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
			break;
		case 7: //Supero objetivo
			$objetivo = $_POST["objetivo"];			
			$descripcion = $_POST["descripcion"];
			$tipo = $_POST["tipo"];
			$tipounit = $_POST["tipounit"];
			$points = $_POST["points"];
			$cadenaevento = "";
			completarObjetivoSQL($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$tipo,$tipounit,$points,$url);
			break;
		case 8:	//Registro interacción
			$objetivo = $_POST["objetivo"];
			$descripcion = $_POST["descripcion"];
			$cadenaevento = $_POST["cadenaevento"];
			registraInteraccionSQL($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
			break;
		case 9:	//Registra MediaSeek
			$objetivo = $_POST["objetivo"];
			$descripcion = $_POST["descripcion"];
			$cadenaevento = $_POST["cadenaevento"];
			$position = $_POST["position"];
			$target = $_POST["target"];
			registraMediaSeek($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url,$position,$target);
			break;

	}
	
}

function initUnit($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objDateTime,$url) {
	$sensorforma = new SensorUPCTforma('SensorUPCTforma');
    $sensorforma->currentUser($usr,$nombre,$apellidos,$email);
    $resultado = $sensorforma->newEventoSesion($link,$titulo,$session,$context,$porcentaje,$objDateTime,$url);
	echo $resultado;
}
function keepAliveUnit($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objDateTime,$url) {
	$sensorforma = new SensorUPCTforma('SensorUPCTforma');
    $sensorforma->currentUser($usr,$nombre,$apellidos,$email);
    $resultado = $sensorforma->keepAliveEventoSesion($link,$titulo,$session,$context,$porcentaje,$objDateTime,$url);
	echo $resultado;
}
function finUnit($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objDateTime,$url) {
	$sensorforma = new SensorUPCTforma('SensorUPCTforma');
    $sensorforma->currentUser($usr,$nombre,$apellidos,$email);
    $resultado = $sensorforma->newEventoSesionSalida($link,$titulo,$session,$context,$porcentaje,$objDateTime,$url);	
	echo $resultado;
}
function registraMediaSeek($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url,$position,$target){		
	$sensorforma = new SensorUPCTforma('SensorUPCTforma');
    $sensorforma->currentUser($usr,$nombre,$apellidos,$email);
    $resultado = $sensorforma->newEventoMediaSeek($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url,$position,$target);	
	echo $resultado;
}
function registraInteraccion($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){		
	$sensorforma = new SensorUPCTforma('SensorUPCTforma');
    $sensorforma->currentUser($usr,$nombre,$apellidos,$email);
    $resultado = $sensorforma->newEventoInteraccion($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);	
	echo $resultado;
}
function registraInteraccionSQL($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){		
	insertAttempsSQL($usr,$link,$context,$objetivo,$url);
	echo 1;
}
function registraInteraccionMovimientos($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){		
	$sensorforma = new SensorUPCTforma('SensorUPCTforma');
    $sensorforma->currentUser($usr,$nombre,$apellidos,$email);
    $resultado = $sensorforma->newEventoInteraccionMovimiento($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);	
	echo $resultado;
}
function completarObjetivo($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$tipo,$tipounit,$points,$url,$unidades){
	$resultado = 1;
	if ($tipounit == "gamification"){
		if ($porcentaje=="100"){
			$porgrade = round(((numberCompleteUnitSQL($usr,$link) * (100/$unidades))),2);
			if ($porgrade > 100){
				$porgrade = 100;
			}
			$gradetosend = (string)($porgrade / 100);

			$gradetosend = str_replace(",",".",$gradetosend);
			$resultado = 0;	
			$debug_log = array();
			$retval = LTIX::gradeSend($gradetosend, false, $debug_log);
			if ( $retval === true ) {
				$resultado = 1;
				error_log("Correcto " . $retval);
			} else if ( is_string($retval) ) {
				error_log("Error " . $retval);
			} else {
				error_log("Error Indefinido");
			}		
		}
	}else{
		$gradetosend = (string)($porcentaje / 100);
		$nota2 = $porcentaje; 	

		$gradetosend = str_replace(",",".",$gradetosend);
		$resultado = 0;	
		$debug_log = array();
		$retval = LTIX::gradeSend($gradetosend, false, $debug_log);
		//$_SESSION['debug_log'] = $debug_log;
		if ( $retval === true ) {
			$resultado = 1;
			error_log("Correcto " . $retval);
			//$_SESSION['success'] = $scorestr;
		} else if ( is_string($retval) ) {
			error_log("Error " . $retval);
			//$_SESSION['error'] = "Grade not sent: ".$retval;
		} else {
			error_log("Error Indefinido");
		}		
	}
	
	if ($resultado == 1){
		$sensorforma = new SensorUPCTforma('SensorUPCTforma');
		$sensorforma->currentUser($usr,$nombre,$apellidos,$email);
		$resultado2 = $sensorforma->newEventoObjetivo($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
		/*Módulo de gamificación: Puntos de los widgets, puntos de las unidades, puntos de las evaluaciones, badgets unidades y evaluaciones y misiones de las unidades y evaluaciones*/
		if ($tipounit == "gamification"){
			$points = json_decode($points, true);	
			/*Puntos de los widgets*/
			$intentos = recuperaIntentosSQL($objetivo,$usr,$link,$url);
			//$intentos = recuperaIntentos($objetivo,$usr,$link);
			$intentos = $intentos + 1;
			
			//echo "Intentos " . $intentos;

			if (array_key_exists($tipo, $points)) {
				if (array_key_exists(strval($intentos), $points[$tipo])) {
					$puntos = $points[$tipo][$intentos];
				}else{
					if (array_key_exists("default", $points[$tipo])) {
						$puntos = $points[$tipo]["default"];
					}else{
						$puntos = 0;
					}
				}
			}else{
				$puntos = 0;
			}
			$cadenaevento = $puntos;
			$resultado2 = $sensorforma->newEventoPoint($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
			
			if ($porcentaje=="100"){
				/*Puntos de las unidades y de las evaluaciones*/
				if ($points["tipo"] == "unit"){
					$cadenaevento = $points["points"][0]["1"];
					$resultado2 = $sensorforma->newUnitPoint($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
				}else{
					foreach ($points["points"] as $valor) {
						if (($porcentaje >= $valor["InitialScore"]) && ($porcentaje <= $valor["FinalScore"])){
							$cadenaevento = $valor["points"];
							$resultado2 = $sensorforma->newUnitPoint($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
							break;
						}
					}
				}
				
				/*Misiones de las unidades y de las evaluaciones*/
				if ($points["tipo"] == "unit"){
					foreach ($points["missions"] as $valor) {
						$cadenaevento = $valor["Next"];
						$resultado2 = $sensorforma->newUnitMissions($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
					}
				}else{
					foreach ($points["missions"] as $valor) {
						if (($porcentaje >= $valor["InitialScore"]) && ($porcentaje <= $valor["FinalScore"])){
							$cadenaevento = $valor["Next"];							
							$resultado2 = $sensorforma->newUnitMissions($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
						}
					}					
				}
				
				/*Badgets de las unidades y evaluaciones*/
				$cadenaevento = $points["badget"];
				$resultado2 = $sensorforma->newUnitBadget($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
			}
		}		
		echo $resultado2;
	}
}
function completarObjetivoSQL($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$tipo,$tipounit,$points,$url){
	$res = "";
	$stmt = true;
	$conn = connectTSQL();
	$stmt = insertObjetiveSQL($conn,$usr,$link,$context,$objetivo,$url);
	$entrogam = 0;
	
	if ($stmt == true){	
		/*Módulo de gamificación: Puntos de los widgets, puntos de las unidades, puntos de las evaluaciones, badgets unidades y evaluaciones y misiones de las unidades y evaluaciones*/
		if ($tipounit == "gamification"){
			$points = json_decode($points, true);	
			/*Puntos de los widgets*/
			$intentos = recuperaIntentosTSQL($conn,$objetivo,$usr,$link,$context,$url);
			if ($intentos == -1){
				$stmt = false;
			}else{
				$intentos = $intentos + 1;
					
				if (array_key_exists($tipo, $points)) {
					if (array_key_exists(strval($intentos), $points[$tipo])) {
						$puntos = $points[$tipo][$intentos];
					}else{
						if (array_key_exists("default", $points[$tipo])) {
							$puntos = $points[$tipo]["default"];
						}else{
							$puntos = 0;
						}
					}
				}else{
					$puntos = 0;
				}
				$cadenaevento = $puntos;
				$stmt = insertPointsSQL($conn,$usr,$link,$context,$cadenaevento,$objetivo,$url,$nombre,$apellidos);
				
				if ($stmt == true){
					if ($porcentaje=="100"){
						$entrogam = 1;
						/*Puntos de las unidades y de las evaluaciones*/
						if ($points["tipo"] == "unit"){
							$cadenaevento = $points["points"][0]["1"];	
							//$res = $res . " ¡Has conseguido <strong>" . $cadenaevento . "</strong> puntos al finalizar la unidad! <br>";
							$stmt = insertPointsSQL($conn,$usr,$link,$context,$cadenaevento,$objetivo,$url,$nombre,$apellidos);
						}else{
							foreach ($points["points"] as $valor) {
								if (($porcentaje >= $valor["InitialScore"]) && ($porcentaje <= $valor["FinalScore"])){
									$cadenaevento = $valor["Points"];
									//$res = $res . " ¡Has conseguido <strong>" . $cadenaevento . "</strong> puntos al finalizar la unidad!  <br>";
									$stmt = insertPointsSQL($conn,$usr,$link,$context,$cadenaevento,$objetivo,$url,$nombre,$apellidos);
									break;
								}
							}
						}
						
						if ($stmt == true){		
							/*Misiones de las unidades y de las evaluaciones*/
							$entromision = 0;
							if ($points["tipo"] == "unit"){
								foreach ($points["missions"] as $valor) {
									$cadenaevento = $valor["Next"];
									$entromision = 1;
									$res = $res . " ¡Desbloqueada misión <strong>" . $cadenaevento . "</strong>! <br>";
									$stmt = insertMissionsSQL($conn,$usr,$link,$context,$cadenaevento,$url);
									if ($stmt == false){
										break;
									}
								}
							}else{
								foreach ($points["missions"] as $valor) {
									if (($porcentaje >= $valor["InitialScore"]) && ($porcentaje <= $valor["FinalScore"])){
										$cadenaevento = $valor["Next"];
										$entromision = 1;	
										$res = $res . " ¡Desbloqueada misión <strong>" . $cadenaevento . "</strong>! <br>";										
										$stmt = insertMissionsSQL($conn,$usr,$link,$context,$cadenaevento,$url);
										if ($stmt == false){
											break;
										}
									}
								}					
							}
							if ($entromision == 0){
								$cadenaevento = "Completed";
								$stmt = insertMissionsSQL($conn,$usr,$link,$context,$cadenaevento,$url);				
							}
							
							if ($stmt == true){			
								/*Badgets de las unidades y evaluaciones*/
								$cadenaevento = $points["badget"];
								$res = $res . " Has conseguido una: " . '<i class="fa fa-star" style="font-size:25px; color:#fcc105;" aria-hidden="true"></i>' . "<br>";								
								$stmt = insertBadgetSQL($conn,$usr,$link,$context,$cadenaevento,$url);
							}
						}
					}					
				}
			}
		}
	}
	
	if ($stmt == false){	
		sqlsrv_rollback( $conn );
		sqlsrv_close( $conn );
		echo 0;
	}else{
		sqlsrv_commit( $conn );
		sqlsrv_close( $conn );
		if ($entrogam == 1){
			echo $res;			
		}else{
			echo 1;
		}

	}
}

function connectSQL(){
	$serverName = "SERVER"; 
	$connectionInfo = array( "Database"=>"DATABASE", "UID"=>"UID", "PWD"=>"PWD");
	$conn = sqlsrv_connect( $serverName, $connectionInfo);

	if( $conn ) {
		return $conn;
	}else{
		 die( print_r( sqlsrv_errors(), true));
	}	
}

function connectTSQL(){
	$serverName = "SERVER"; 
	$connectionInfo = array( "Database"=>"DATABASE", "UID"=>"UID", "PWD"=>"PWD");
	$conn = sqlsrv_connect( $serverName, $connectionInfo);

	if( $conn ) {
		if ( sqlsrv_begin_transaction( $conn ) === false ) {
			 die( print_r( sqlsrv_errors(), true ));
		}else{
			return $conn;			
		}
	}else{
		 die( print_r( sqlsrv_errors(), true));
	}	
}

function insertObjetiveSQL($conn,$usr,$link,$context,$objetivo,$url){

	$sql = "INSERT INTO objetivos (usr, link, objetivo, url) VALUES (?, ?, ?, ?)";
	$params = array($usr, $link, $objetivo, $url);

	$stmt = sqlsrv_query( $conn, $sql, $params);
	return $stmt;		
}

function insertPointsSQL($conn,$usr,$link,$context,$point,$objetivo,$url,$nombre,$apellidos){
	$sql = "INSERT INTO points (usr, link, point, objetivo, url, nombre, apellidos) VALUES (?, ?, ?, ?, ?, ?, ?)";
	$params = array($usr, $link,intval($point), $objetivo, $url, $nombre, $apellidos);

	$stmt = sqlsrv_query( $conn, $sql, $params);
	return $stmt;
}

function insertAttempsSQL($usr,$link,$context,$objetivo,$url){
	$conn = connectSQL();

	$sql = "INSERT INTO attemp (usr, link, objetivo, url) VALUES (?, ?, ?, ?)";
	$params = array($usr, $link,$objetivo, $url);

	$stmt = sqlsrv_query( $conn, $sql, $params);
	if( $stmt === false ) {
		 die( print_r( sqlsrv_errors(), true));
	}

	// Close the connection.
	sqlsrv_close( $conn );	
}

function insertMissionsSQL($conn,$usr,$link,$context,$next,$url){
	$sql = "INSERT INTO mission (usr, link, next, url) VALUES (?, ?, ?, ?)";
	$params = array($usr, $link, $next, $url);

	$stmt = sqlsrv_query( $conn, $sql, $params);
	return $stmt;
}

function insertBadgetSQL($conn,$usr,$link,$context,$badget, $url){
	$sql = "INSERT INTO badget (usr, link, badget, url) VALUES (?, ?, ?, ?)";
	$params = array($usr, $link, $badget,$url);

	$stmt = sqlsrv_query( $conn, $sql, $params);
	return $stmt;
}
function recuperaIntentosTSQL($conn,$objetivo,$usr,$link, $context,$url){
	$sql = "select * from attemp where (usr = ? and link = ? and objetivo = ? and url = ?)";
	$params = array($usr, $link, $objetivo, $url);
	$options =  array( "Scrollable" => SQLSRV_CURSOR_KEYSET );

	$stmt = sqlsrv_query( $conn, $sql, $params, $options);
	if( $stmt === false ) {
		return -1;
	}
	$row_count = sqlsrv_num_rows( $stmt );
	return $row_count;		
}

function recuperaIntentosSQL($objetivo,$usr,$link,$context, $url){
	$conn = connectSQL();

	$sql = "select * from attemp where (usr = ? and link = ? and objetivo = ? and url = ?)";
	$params = array($usr, $link, $objetivo, $url);
	$options =  array( "Scrollable" => SQLSRV_CURSOR_KEYSET );

	$stmt = sqlsrv_query( $conn, $sql, $params, $options);
	if( $stmt === false ) {
		 die( print_r( sqlsrv_errors(), true));
	}
	$row_count = sqlsrv_num_rows( $stmt );

	sqlsrv_close( $conn );
	return $row_count;		
}

function numberCompleteUnitSQL($usr,$link,$context){
	$conn = connectSQL();

	$sql = "select distinct(url) from mission where (usr = ? and link = ?)";
	$params = array($usr, $link);
	$options =  array( "Scrollable" => SQLSRV_CURSOR_KEYSET );

	$stmt = sqlsrv_query( $conn, $sql, $params, $options);
	if( $stmt === false ) {
		 die( print_r( sqlsrv_errors(), true));
	}
	$row_count = sqlsrv_num_rows( $stmt );

	sqlsrv_close( $conn );
	return $row_count;		
}

function recuperaEstadoSQL($usr,$link,$context,$objetivo, $url){
	$conn = connectSQL();
	
	$sql = "select * from objetivos where (usr = ? and link = ? and objetivo = ? and url = ?)";
	$params = array($usr, $link, $objetivo, $url);
	$options =  array( "Scrollable" => SQLSRV_CURSOR_KEYSET );

	$stmt = sqlsrv_query( $conn, $sql, $params, $options);
	if( $stmt === false ) {
		 die( print_r( sqlsrv_errors(), true));
	}
	$row_count = sqlsrv_num_rows( $stmt );
	if ($row_count == 0){
		sqlsrv_close( $conn );	
		echo '0';
	}else{
		sqlsrv_close( $conn );	
		echo '100';
	}
}

?>