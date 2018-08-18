<html>
  <head>
   <meta charset="utf-8">
	<title>Gamification</title>
	<link rel="stylesheet" type="text/css" href="css/icomoon.css">
    <link rel="stylesheet" type="text/css" href="css/custom.css">
	 <link rel="stylesheet" type="text/css" href="css/base.css">
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
        <h1>Ranking</h1>
        <hr>
        <p></p>
      </div>
    </section>
	<section style="margin-top: 70px;margin-bottom: 70px;">
	<div class="container">
	<div class="row">

<?php

	montarRankingSQL($_POST["link"]);

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

	function montarRankingSQL($link){
		$conn = connectSQL();

		$sql = "select sum(point) as puntos,usr,nombre,apellidos from points where (link = ?) group by usr,nombre,apellidos";
		$params = array($link);
		$options =  array( "Scrollable" => SQLSRV_CURSOR_KEYSET );

		$stmt = sqlsrv_query( $conn, $sql, $params, $options);
		if( $stmt === false ) {
			 die( print_r( sqlsrv_errors(), true));
		}
		echo'<table class="table table-hover">'
		.'<thead>'
		.'<tr>'
		.'<th>Posición</th>'
		.'<th>Jugador</th>'
		.'<th>Puntos</th>'
		.'<th>Insignias</th>'
		.'</tr>'
		.'</thead>'
		.'<tbody>';

		$posicion = 1;
		while( $row = sqlsrv_fetch_array( $stmt, SQLSRV_FETCH_NUMERIC) ) {
			echo $row[0].", ".$row[1]."<br />";
			switch ($posicion){
				case 1:
					echo'<tr class="hover-success">'
					.'<td><span class="icon-crown" style="font-size:24px; color:gold;"></span></td>'
					.'<td>'.$row["nombre"].' '.$row["apellidos"].'.</td>'
					.'<td><strong class="purple"style="font-size:1.2em;">'.$row['puntos'].'</strong></td>'
					.'<td> Badget</td>'
					.'</tr>';
					break;
				case 2:
					echo'<tr class="hover-success">'
					.'<td><span class="icon-crown" style="font-size:24px; color:silver;"></span></td>'
					.'<td>'.$row["nombre"].' '.$row["apellidos"].'.</td>'
					.'<td><strong class="purple"style="font-size:1.2em;">'.$row['puntos'].'</strong></td>'
					.'<td> Badget</td>'
					.'</tr>';
					break;
				case 3:
					echo'<tr class="hover-success">'
					.'<td><span class="icon-crown" style="font-size:24px; color:#CD7F32;"></span></td>'
					.'<td>'.$row["nombre"].' '.$row["apellidos"].'.</td>'
					.'<td><strong class="purple"style="font-size:1.2em;">'.$row['puntos'].'</strong></td>'
					.'<td> Badget</td>'
					.'</tr>';
				default:
					echo'<tr class="hover-success">'
					.'<td><span style="font-size:1.4em;margin-left: 10px; color:#777">'.$posicion.'</span></td>'
					.'<td>'.$row["nombre"].' '.$row["apellidos"].'.</td>'
					.'<td><strong class="purple"style="font-size:1.2em;">'.$row['puntos'].'</strong></td>'
					.'<td> Badget</td>'
					.'</tr>';				
					break;
			}
			$posicion ++;
		}
		echo'</tbody>'
		.'</table>';
		sqlsrv_free_stmt( $stmt);
		sqlsrv_close( $conn );	
	}

	
	?>
	
	</div>	
	</div>
	</section>
		<footer id="footerwrap">
			<div class="container">
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
					<h6 style="color: #fff;">� Polytechnic University of Cartagena - Pza. del Cronista Isidoro Valverde, Edif. La Milagrosa, C.P. 30202 Cartagena. Tlf: 868 07 11 98.</h6>
                    <h6 style="color: #fff;">&copy; Designed and Developed by <a href="http://cpcd.upct.es/" target="_blank">Center of Production of Digital Contents</a> of the Polytechnic University of Cartagena</h6>
						
					</div>
				</div>	
			</div>
	</footer>
	</body>
</html>

