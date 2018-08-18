<?php
	$puntos = $_POST["link"];
	$unidades= $_POST["unidades"];
	$sessionid = $_GET["PHPSESSID"];
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
   
   <link href="css/fontello-embedded.css" rel="stylesheet">
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

	montarRankingSQL($puntos,$unidades);

	function connectSQL(){
		$serverName = "servername"; 
		$connectionInfo = array( "Database"=>"database", "UID"=>"uid", "PWD"=>"password");
		$conn = sqlsrv_connect( $serverName, $connectionInfo);

		if( $conn ) {
			return $conn;
		}else{
			 die( print_r( sqlsrv_errors(), true));
		}	
	}

	function getInsigniasConseguidas($conn,$link,$usr){
		$sql = "select * from badget where (usr = ? and link = ?)";
		$params = array($usr,$link);
		$options =  array( "Scrollable" => SQLSRV_CURSOR_KEYSET );

		$stmt = sqlsrv_query( $conn, $sql, $params, $options);
		if( $stmt === false ) {
			 die( print_r( sqlsrv_errors(), true));
		}
		$row_count = sqlsrv_num_rows( $stmt );
		return $row_count;
	}
	
	function getInsignias($link,$unidades,$usr,$conn){
			$conseguidas = getInsigniasConseguidas($conn,$link,$usr);
			$insignias = "";
			for ($i = 1; $i <= $unidades; $i++) {
				if ($conseguidas>0){
					echo '<i class="fa fa-star" style="font-size:25px; color:#fcc105;" aria-hidden="true"></i>';
					$conseguidas = $conseguidas -1;
				}else{
					echo '<i class="fa fa-star" style="font-size:25px; color:#fcc105; opacity:0.3;" aria-hidden="true"></i>';
				}
			}
	}
	
	function montarRankingSQL($link,$unidades){
		$conn = connectSQL();

		$sql = "select sum(point) as puntos,usr,nombre from points where (link = ?) group by usr,nombre order by puntos desc";
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
			switch ($posicion){
				case 1:
					echo'<tr class="hover-success">'
					.'<td><span class="icon-crown" style="font-size:24px; color:gold;"></span></td>'
					.'<td>'.$row[2].'</td>'
					.'<td><strong class="purple"style="font-size:1.2em;">'.$row[0].'</strong></td>'
					.'<td>'; 
					getInsignias($link,$unidades,$row[1],$conn); 
					echo '</td>'
					.'</tr>';
					break;
				case 2:
					echo'<tr class="hover-success">'
					.'<td><span class="icon-crown" style="font-size:24px; color:silver;"></span></td>'
					.'<td>'.$row[2].'</td>'
					.'<td><strong class="purple"style="font-size:1.2em;">'.$row[0].'</strong></td>'
					.'<td>';
					getInsignias($link,$unidades,$row[1],$conn); 
					echo '</td>'
					.'</tr>';
					break;
				case 3:
					echo'<tr class="hover-success">'
					.'<td><span class="icon-crown" style="font-size:24px; color:#CD7F32;"></span></td>'
					.'<td>'.$row[2].'</td>'
					.'<td><strong class="purple"style="font-size:1.2em;">'.$row[0].'</strong></td>'
					.'<td>';
					getInsignias($link,$unidades,$row[1],$conn); 
					echo '</td>'
					.'</tr>';
					break;
				default:
					echo'<tr class="hover-success">'
					.'<td><span style="font-size:1.4em;margin-left: 10px; color:#777">'.$posicion.'</span></td>'
					.'<td>'.$row[2].'</td>'
					.'<td><strong class="purple"style="font-size:1.2em;">'.$row[0].'</strong></td>'
					.'<td>';
					getInsignias($link,$unidades,$row[1],$conn); 
					echo '</td>'
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
	<script>
		function entrarGamification() {
			url = "index.php";
			var url2 = url + "?PHPSESSID=" + '<?php echo $sessionid; ?>';			
			var form = '';
			$('<form action="'+url2+'" method="POST">'+form+'</form>').appendTo('body').submit();			
		}
	</script>
	<div class="social">
		<ul>
			<li><a onclick="entrarGamification()" target="_blank" ><i class="fa fa-home" style="font-size:48px;" aria-hidden="true"></i></a></li>
		</ul>
	</div>
	</section>
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

