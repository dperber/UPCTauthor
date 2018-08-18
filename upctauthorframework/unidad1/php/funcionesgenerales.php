<?php
$GLOBALS['mysqli'] = require './php/conectar.php';
function getVideo($id, $iddiv)
{
    $mysqli = $GLOBALS['mysqli'];
	$authenticated = false;
	$pCAS = null;

    $videoabuscar = base64_decode($id);
    $video = '';

    $sqlsen = sprintf("SELECT s.idprof as idprof, s.nombrevideo AS nombrevideo, s.nombreasig AS asignatura, s.url AS url, s.url_player_ext as urlext, s.thumb as thumb, s.passvideo as pass, s.idcarpeta as idcarpeta, p.nombre AS nombreprof FROM subidas s, profesor p WHERE p.id = s.idprof AND s.id = %d", $videoabuscar);
    $result = $mysqli->query($sqlsen);
    $row = $result->fetch_assoc();

    $urlapresentar = $row["url"];
    $nombrevideo = $row["nombrevideo"];
    $nombreprof = $row["nombreprof"];
    $thumb = $row["thumb"];
    $pass = $row["pass"];
    $idcarpeta = $row["idcarpeta"];
    $idprof = $row["idprof"];

   
    if (!$row["urlext"]) {
        $urlext = getUrlExtFromVimeo(str_replace('//player.vimeo.com/video/', '/videos/', $urlapresentar), $videoabuscar, $mysqli);
    } else {
        $urlext = $row['urlext'];
    }

    $screenpass = '';
    $playerhidden = '';
    if ($row["pass"]) {
        // Pantalla para que ponga la contraseña
        $screenpass = '<div class="screenpass fullwidth bgwhite">'
                        . '<div class="row">'
                            . '<div class="col-md-12 text-center">'
                                . '<h3>Este vídeo está protegido por contraseña</h3>'
                                . '<form class="form-inline" id="checkpass">'
                                    . '<div class="form-group">'
                                        .'<input class="form-control" type="password" name="pass" placeholder="Contraseña" value="">'
                                        .'<input class="form-control" type="hidden" name="idvideo" value="' . $videoabuscar . '">'
                                    . '</div>'
                                    . '<div class="checkbox">'
                                        . '<label>'
                                            . '&nbsp;<input id="unmask" type="checkbox"> Mostrar'
                                        . '</label>'
                                    . '</div>'
                                    . '&nbsp;<button class="btn btn-primary" type="submit">Enviar</button>'
                                . '</form>'
                                . '<div class="text-danger error-password"></div>'
                            . '</div>'
                        . '</div>'
                    . '</div>';
    }

    $urlext = explode(',', $urlext);

    $count_url = 0;
    $setup_jwplayer = '';
    foreach ($urlext as $key => $value) {
        if ($count_url == 0) {
            $setup_jwplayer .= '{file: "' . $value . '"}';
        } else {
            $setup_jwplayer .= ',{file: "' . $value . '"}';
        }
        $count_url++;
    }

    $asignatura = '';
    if ($row["asignatura"] != '-') {
        $asignatura = '<div class="col-lg-4 col-md-4 col-sm-4">'
                        . '<strong>Asignatura: </strong>' . $row["asignatura"]
                    . '</div>';
    }

   

    $video .= '<h2 class="text-center '. $iddiv .'" data-name="' . $nombrevideo .'">' . $nombrevideo . '</h2>'
            . '<div class="embed-responsive embed-responsive-16by9">'
                . '<div id="' . $iddiv .'" class="embed-responsive-item"></div>'
                . '<script>'
                    . 'var playerInstance = jwplayer("' . $iddiv .'");'
                    . 'playerInstance.setup({'
                        . 'mediaid: "UPCTmedia player",'
                        . 'width: "100%",'
                        . 'aspectratio: "16:9",'
                        . 'image: "' . $thumb . '",'
                        . 'sources: [eval(\'(' . $setup_jwplayer . ')\')],'
                        . 'primary: "flash"'
                    . '});'
                . '</script>'
            . '</div>';

    $result->free();
    // $mysqli->close();
    return $video;
}
?>