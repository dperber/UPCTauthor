<?php
    $servername = "IP";
    $username = "USER";
    $password ="PASSWORD";
    $dbname = "DATABASE";

    //Establecer conexión a la DB
    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Connection failed: ". $conn->connect_error);
    }

    $conn->set_charset("utf8");

    return $conn;
?>