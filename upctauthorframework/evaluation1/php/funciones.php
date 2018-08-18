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
		$porcentaje = $_POST["porcentaje"];
		$objDateTime = new DateTime('NOW');
		$objDateTime->format('Y-m-d H:i:s');
		$url = $_POST["url"];
		
		switch ($funcion) {
			/*case 0: //Entro a la unidad
				initUnit($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objDateTime);
				break;*/
			case 1: //Salgo de la unidad
				finUnit($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objDateTime,$url);
				break;
			/*case 2:	//Registro interacción
				$objetivo = $_POST["objetivo"];
				$descripcion = $_POST["descripcion"];
				$cadenaevento = $_POST["cadenaevento"];
				registraInteraccion($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime);
				break;*/
			/*case 3: //Supero objetivo
				$objetivo = $_POST["objetivo"];			
				$descripcion = $_POST["descripcion"];
				$cadenaevento = "";
				completarObjetivo($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime);
				break;*/
			/*case 4: //Recuperar estado de un objetivo
				$objetivo = $_POST["objetivo"];
				recuperaEstado($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objetivo);
				break;*/
			case 5: //Entro a la unidad
				keepAliveUnit($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objDateTime,$url);
				break;
			case 6: //Recuperar estado de un objetivo				
				recuperaNotaSQL($usr,$link,$url);
				break;
			case 7: //Supero objetivo		
				$descripcion = $_POST["descripcion"];
				$cadenaevento = "";
				$tipounit = $_POST["tipounit"];
				$points = $_POST["points"];
				$unidades = $_POST["unidades"];
				completarEvaluacion($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$tipounit,$points,$url,$unidades);
				break;
			case 8: //Supero objetivo		
				$descripcion = $_POST["descripcion"];
				$cadenaevento = $_POST["cadenaevento"];
				registraInteraccionEvaluacion($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$url);
				break;
			case 9: //Entro a la evaluacion				
				initEval($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objDateTime,$url);
				break;
			case 10: //Supero objetivo		
				$descripcion = $_POST["descripcion"];
				$cadenaevento = "";
				$tipounit = $_POST["tipounit"];
				$points = $_POST["points"];
				completarEvaluacionSQL($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$tipounit,$points,$url);
				break;
		}		
	}
	/*function initUnit($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objDateTime) {
		$sensorforma = new SensorUPCTforma('SensorUPCTforma');
		$sensorforma->currentUser($usr,$nombre,$apellidos,$email);
		$resultado = $sensorforma->newEventoSesion($link,$titulo,$session,$porcentaje,$objDateTime);
		echo $resultado;
	}*/
	function initEval($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objDateTime,$url) {
		$sensorforma = new SensorUPCTforma('SensorUPCTforma');
		$sensorforma->currentUser($usr,$nombre,$apellidos,$email);
		$resultado = $sensorforma->newEventoSesion($link,$titulo,$session,$porcentaje,$objDateTime,$url);		
		echo $resultado;
	}
	function keepAliveUnit($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objDateTime,$url) {
		$sensorforma = new SensorUPCTforma('SensorUPCTforma');
		$sensorforma->currentUser($usr,$nombre,$apellidos,$email);
		$resultado = $sensorforma->keepAliveEventoSesion($link,$titulo,$session,$porcentaje,$objDateTime,$url);
		echo $resultado;
	}
	function finUnit($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objDateTime,$url) {
		$sensorforma = new SensorUPCTforma('SensorUPCTforma');
		$sensorforma->currentUser($usr,$nombre,$apellidos,$email);
		$resultado = $sensorforma->newEventoSesionSalida($link,$titulo,$session,$porcentaje,$objDateTime,$url);	
		echo $resultado;
	}
	/*function registraInteraccion($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime){		
		$sensorforma = new SensorUPCTforma('SensorUPCTforma');
		$sensorforma->currentUser($usr,$nombre,$apellidos,$email);
		$resultado = $sensorforma->newEventoInteraccion($link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime);	
		echo $resultado;
	}*/
	function registraInteraccionEvaluacion($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$url){		
		$sensorforma = new SensorUPCTforma('SensorUPCTforma');
		$sensorforma->currentUser($usr,$nombre,$apellidos,$email);
		$resultado = $sensorforma->newEventoEvaluacion($link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$url);	
		echo $resultado;
	}
	/*function completarObjetivo($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime){
		session_id($session);
		session_start();	
		$resultado = 1;
		
		$gradetosend = $porcentaje / 100;
		$nota2 = $porcentaje; 	
		$debug_log = array();
		
		ob_start();	//Para no devolver los echo de LTIX
		$retval = LTIX::gradeSend($gradetosend, false, $debug_log);
		ob_end_clean(); //Finalizo el buffer interno
		
		error_log($retval);
		$_SESSION['debug_log'] = $debug_log;
		if ( $retval === true ) {
			$_SESSION['success'] = "Grade $gradetosend sent to server.";
		} else if ( is_string($retval) ) {
			$_SESSION['error'] = "Grade not sent: ".$retval;
			error_log("Grabado Incorrecto ". $retval);
			$resultado = 0;
			echo $resultado;
		} else {
			error_log("Error en la conexión con el Aula Virtual ". $retval.'/'.$usuario.'/'.$link);
			error_log($retval);
			$resultado = 0;
			echo $resultado;
		}
		if ($resultado == 1){
			$sensorforma = new SensorUPCTforma('SensorUPCTforma');
			$sensorforma->currentUser($usr,$nombre,$apellidos,$email);
			$resultado2 = $sensorforma->newEventoObjetivo($link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime);	
			echo $resultado2;
		}
	}*/
	function completarEvaluacion($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$tipounit,$points,$url,$unidades){
/*		$resultado = 1;		
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
		}*/
		$resultado = 1;
		if ($tipounit == "gamification"){
			$porgrade = round(((numberCompleteUnitSQL($usr,$link) * (100/$unidades))),2);
			if ($porgrade > 100){
				$porgrade = 100;
			}
			$gradetosend = (string)($porgrade / 100);
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
			$resultado2 = $sensorforma->newEventoEvaluacionCompleta($link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$url);

			if ($tipounit == "gamification"){
				$points = json_decode($points, true);	
				/*Puntos de los widgets*/
				//$intentos = recuperaIntentosSQL($objetivo,$usr,$link,$url);
				//$intentos = $intentos + 1;
				
				/*if (array_key_exists($tipo, $points)) {
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
				$resultado2 = $sensorforma->newEventoPoint($link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);*/
				
				//if ($porcentaje=="100"){
					/*Puntos de las unidades y de las evaluaciones*/
					if ($points["tipo"] == "unit"){
						$cadenaevento = $points["points"][0]["1"];
						$resultado2 = $sensorforma->newUnitPoint($link,$titulo,$session,$porcentaje,"evaluationPoint",$descripcion,$cadenaevento,$objDateTime,$url);
					}else{
						foreach ($points["points"] as $valor) {
							if (($porcentaje >= $valor["InitialScore"]) && ($porcentaje <= $valor["FinalScore"])){
								$cadenaevento = $valor["Points"];
								$resultado2 = $sensorforma->newUnitPoint($link,$titulo,$session,$porcentaje,"evaluationPoint",$descripcion,$cadenaevento,$objDateTime,$url);
								break;
							}
						}
					}
					
					/*Misiones de las unidades y de las evaluaciones*/
					if ($points["tipo"] == "unit"){
						foreach ($points["missions"] as $valor) {
							$cadenaevento = $valor["Next"];
							$resultado2 = $sensorforma->newUnitMissions($link,$titulo,$session,$porcentaje,"evaluationPoint",$descripcion,$cadenaevento,$objDateTime,$url);
						}
					}else{
						foreach ($points["missions"] as $valor) {
							if (($porcentaje >= $valor["InitialScore"]) && ($porcentaje <= $valor["FinalScore"])){
								$cadenaevento = $valor["Next"];							
								$resultado2 = $sensorforma->newUnitMissions($link,$titulo,$session,$porcentaje,"evaluationPoint",$descripcion,$cadenaevento,$objDateTime,$url);
							}
						}					
					}
					
					/*Badgets de las unidades y evaluaciones*/
					$cadenaevento = $points["badget"];
					$resultado2 = $sensorforma->newUnitBadget($link,$titulo,$session,$porcentaje,"evaluationPoint",$descripcion,$cadenaevento,$objDateTime,$url);
				//}
			}			
			echo $resultado2;
		}
	}
	function completarEvaluacionSQL($usr,$nombre,$apellidos,$email,$link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$tipounit,$points,$url){
		$res = "";
		$stmt = true;
		$conn = connectTSQL();
		$stmt = insertGradeSQL($conn,$usr,$link,$porcentaje,$url);

		if ($stmt == true){	
			if ($tipounit == "gamification"){
				$points = json_decode($points, true);	

				/*Puntos de las unidades y de las evaluaciones*/
				if ($points["tipo"] == "unit"){
					$cadenaevento = $points["points"][0]["1"];				
					$stmt = insertPointsSQL($conn, $usr,$link,$cadenaevento,"",$url,$nombre,$apellidos);
				}else{
					foreach ($points["points"] as $valor) {
						if (($porcentaje >= $valor["InitialScore"]) && ($porcentaje <= $valor["FinalScore"])){
							$cadenaevento = $valor["Points"];
							$stmt = insertPointsSQL($conn, $usr,$link,$cadenaevento,"",$url,$nombre,$apellidos);
							break;
						}
					}
				}

				if ($stmt == true){				
					/*Misiones de las unidades y de las evaluaciones*/
					if ($points["tipo"] == "unit"){
						foreach ($points["missions"] as $valor) {
							$cadenaevento = $valor["Next"];
							$res = $res . " ¡Desbloqueada misión <strong>" . $cadenaevento . "</strong>! <br>";
							$stmt = insertMissionsSQL($conn, $usr,$link,$cadenaevento,$url);
							if ($stmt == false){
								break;
							}
						}
					}else{
						foreach ($points["missions"] as $valor) {
							if (($porcentaje >= $valor["InitialScore"]) && ($porcentaje <= $valor["FinalScore"])){
								$cadenaevento = $valor["Next"];		
								$res = $res . " ¡Desbloqueada misión <strong>" . $cadenaevento . "</strong>! <br>";								
								$stmt = insertMissionsSQL($conn, $usr,$link,$cadenaevento,$url);
								if ($stmt == false){
									break;
								}
							}
						}					
					}
							
					if ($stmt == true){			
						/*Badgets de las unidades y evaluaciones*/
						$cadenaevento = $points["badget"];		
						$res = $res . " Has conseguido una: " . '<i class="fa fa-star" style="font-size:25px; color:#fcc105;" aria-hidden="true"></i>' . "<br>";							
						$stmt = insertBadgetSQL($conn, $usr,$link,$cadenaevento,$url);
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
			if ($tipounit == "gamification"){
				echo $res;			
			}else{
				echo 1;
			}

		}
	}
	function connectTSQL(){
		$serverName = "SERVER"; 
		$connectionInfo = array( "Database"=>"DATABASE", "UID"=>"UID", "PWD"=>"PASSWORD");
		$conn = sqlsrv_connect( $serverName, $connectionInfo);

		if( $conn ) {
			/* Iniciar la transacción. */
			if ( sqlsrv_begin_transaction( $conn ) === false ) {
				 die( print_r( sqlsrv_errors(), true ));
			}else{
				return $conn;			
			}
		}else{
			 die( print_r( sqlsrv_errors(), true));
		}	
	}
	function connectSQL(){
		$serverName = "SERVER"; 
		$connectionInfo = array( "Database"=>"DATABASE", "UID"=>"UID", "PWD"=>"PASSWORD");
		$conn = sqlsrv_connect( $serverName, $connectionInfo);

		if( $conn ) {
			return $conn;
		}else{
			 die( print_r( sqlsrv_errors(), true));
		}	
	}
	function insertGradeSQL($conn,$usr,$link,$porcentaje,$url){
		$sql = "INSERT INTO grade (usr, link, nota, url) VALUES (?, ?, ?, ?)";
		$params = array($usr, $link, $porcentaje, $url);

		$stmt = sqlsrv_query( $conn, $sql, $params);
		return $stmt;
	}
	
	function insertPointsSQL($conn,$usr,$link,$point,$objetivo,$url,$nombre,$apellidos){
		$sql = "INSERT INTO points (usr, link, point, objetivo, url, nombre, apellidos) VALUES (?, ?, ?, ?, ?, ?, ?)";
		$params = array($usr, $link, intval($point), $objetivo, $url, $nombre,$apellidos);

		$stmt = sqlsrv_query( $conn, $sql, $params);
		return $stmt;
	}
	function insertMissionsSQL($conn,$usr,$link,$next,$url){
		$sql = "INSERT INTO mission (usr, link, next, url) VALUES (?, ?, ?, ?)";
		$params = array($usr, $link, $next, $url);

		$stmt = sqlsrv_query( $conn, $sql, $params);
		return $stmt;
	}

	function insertBadgetSQL($conn,$usr,$link,$badget, $url){
		$sql = "INSERT INTO badget (usr, link, badget, url) VALUES (?, ?, ?, ?)";
		$params = array($usr, $link, $badget,$url);

		$stmt = sqlsrv_query( $conn, $sql, $params);
		return $stmt;
	}

	
	function numberCompleteUnitSQL($usr,$link){
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

	function recuperaNotaSQL($usr,$link,$url){
		$conn = connectSQL();

		$sql = "select nota from grade where (usr = ? and link = ? and url = ?)";
		$params = array($usr, $link, $url);
		$options =  array( "Scrollable" => SQLSRV_CURSOR_KEYSET );

		$stmt = sqlsrv_query( $conn, $sql, $params, $options);
		if( $stmt === false ) {
			 die( print_r( sqlsrv_errors(), true));
		}
		$row_count = sqlsrv_num_rows( $stmt );
		if ($row_count == 0){
			sqlsrv_close( $conn );	
			echo '"-1"';
		}else{
			$row = sqlsrv_fetch_array( $stmt, SQLSRV_FETCH_NUMERIC);
			echo $row[0];
			sqlsrv_free_stmt( $stmt);
			sqlsrv_close( $conn );	
		}
	}
?>