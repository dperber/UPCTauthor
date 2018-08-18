<?php
function connectSQL(){
	$serverName = "SERVER_NAME"; 
	$connectionInfo = array( "Database"=>"DATABASE_NAME", "UID"=>"UID", "PWD"=>"PWD");
	$conn = sqlsrv_connect( $serverName, $connectionInfo);

	if( $conn ) {
		return $conn;
	}else{
		 die( print_r( sqlsrv_errors(), true));
	}	
}
function isOpenUnitSQL($unit,$usr,$link){
	$conn = connectSQL();

	$sql = "select * from mission where (usr = ? and link = ? and next = ?)";
	$params = array($usr, $link, $unit);
	$options =  array( "Scrollable" => SQLSRV_CURSOR_KEYSET );

	$stmt = sqlsrv_query( $conn, $sql, $params, $options);
	if( $stmt === false ) {
		 die( print_r( sqlsrv_errors(), true));
	}
	$row_count = sqlsrv_num_rows( $stmt );

	sqlsrv_close( $conn );
	return $row_count;		
}

function isCompleteUnitSQL($url,$usr,$link){
	$conn = connectSQL();

	$sql = "select * from mission where (usr = ? and link = ? and url = ?)";
	$params = array($usr, $link, $url);
	$options =  array( "Scrollable" => SQLSRV_CURSOR_KEYSET );

	$stmt = sqlsrv_query( $conn, $sql, $params, $options);
	if( $stmt === false ) {
		 die( print_r( sqlsrv_errors(), true));
	}
	$row_count = sqlsrv_num_rows( $stmt );

	sqlsrv_close( $conn );
	return $row_count;		
}
function convertComplete($img){
	return str_replace(".png","complete.png",$img);
}
?>