<?php

	require_once "analytics/vendor/autoload.php";
	use IMSGlobal\Caliper\Client;
	use IMSGlobal\Caliper\Options;
	use IMSGlobal\Caliper\Sensor;
	use IMSGlobal\Caliper\events\SessionEvent;
	use IMSGlobal\Caliper\entities\agent\Person;
	use IMSGlobal\Caliper\entities\lis\CourseSection;
	use IMSGlobal\Caliper\entities\agent\SoftwareApplication;
	use IMSGlobal\Caliper\util\TimestampUtil;
	use \IMSGlobal\Caliper\actions\Action;
	use \IMSGlobal\Caliper\entities\session\Session;
	use IMSGlobal\Caliper\events\AssessmentEvent;
	use IMSGlobal\Caliper\events\OutcomeEvent;
	use IMSGlobal\Caliper\entities\assessment\Assessment;
	use IMSGlobal\Caliper\entities\assessment\AssessmentItem;
	use IMSGlobal\Caliper\entities\assignable\Attempt;
	use IMSGlobal\Caliper\entities\schemadotorg\CreativeWork;
	use IMSGlobal\Caliper\entities\outcome\Result;
	use IMSGlobal\Caliper\events\AssessmentItemEvent;
	use IMSGlobal\Caliper\entities\media\VideoObject;
	use IMSGlobal\Caliper\entities\media\MediaLocation;
	use IMSGlobal\Caliper\events\MediaEvent;

	class SensorUPCTforma{
		private $sensor;
		private $user;
		private $actor;
		private $edApp;
		private $org;
		private $generatedSession;
		private $quiz;
		private $assessmentItem1;
		private $generatedAttempt;

		 public function __construct($id) {
			$this->sensor = new Sensor($id);
			
			$thisPath = dirname($_SERVER['PHP_SELF']);
			$url = 'URL';
			
			$options = (new Options())
				->setApiKey('org.imsglobal.caliper.php.apikey')
				->setDebug(true)
				->setHost($url);

			$this->sensor->registerClient('http', new Client('clientId', $options));

		 }


		public function currentUser($userid,$nombre,$apellidos,$email) {
			  $currentUserId =  $userid;
			  $this->actor = new Person($currentUserId);
			  $this->actor->setName($nombre . " " . $apellidos);
			  $this->actor->setDescription("Acceso del usuario " . $nombre . " " . $apellidos);
			  $ext = array($nombre,$apellidos,$email);
			  $this->actor->setExtensions($ext);
			  $objDateTime = new DateTime('NOW');
			  $objDateTime->format('Y-m-d H:i:s');
			  $this->actor->setDateCreated($objDateTime);
			  $this->actor->setDateModified($objDateTime);
		}

		public function getEdApp() {
			$this->edApp = new SoftwareApplication("http://forma.upct.es");
			$this->edApp->setName("UPCTforma");
			$this->edApp->setDescription("Herramienta de autor de la Universidad Politécnica de Cartagena");
			$objDateTime = new DateTime('NOW');
			$objDateTime->format('Y-m-d H:i:s');
			$this->edApp->setDateCreated($objDateTime);
			$this->edApp->setDateModified($objDateTime);
		}

		public function getCourse($link,$titulo,$porcentaje,$tipo,$url,$context) {
			$this->org = new CourseSection("http://forma.upct.es");
			$this->org->setCourseNumber($link);
			$this->org->setName($titulo);
			$this->org->setDescription("Curso creado por la Universidad Politécnica de Cartagena");
			$this->org->setAcademicSession("2017-2018");
			$objDateTime = new DateTime('2018-10-13 00:00:00');
			$this->org->setDateCreated($objDateTime);
			$this->org->setDateModified($objDateTime);
			
			$sporcentaje = (string)$porcentaje;
			$slink = (string)$link;
			$stitulo = (string)$titulo;
			$stipo = (string)$tipo;
			$surl = (string)$url;
			$scontext = (string) $context;
  			$ext = array($slink,$stitulo,$sporcentaje,$stipo,$surl,$scontext);
			$this->org->setExtensions($ext);

		}

		public function newEventoSesion($link,$titulo,$session,$context,$porcentaje,$objDateTime,$url){
			  $sessionEvent = new SessionEvent();
			  $action = new Action(Action::LOGGED_IN);

			  $this->getEdApp();
			  //$objDateTime = new DateTime('NOW');
			  //$objDateTime->format('Y-m-d H:i:s');
			  
			  // The generated object (Session) within the Event Object
			  $this->generatedSession = new Session($session);
			  $this->generatedSession->setName($session);
			  $this->generatedSession->setDescription("Unidad " . $link . " con título " . $titulo);
			  $this->generatedSession->setActor($this->actor);
			  $this->generatedSession->setStartedAtTime($objDateTime);
			  $this->generatedSession->setDateCreated($objDateTime);
			  $this->getCourse($link,$titulo,$porcentaje,"1",$url,$context);

			  $sessionEvent->setActor($this->actor);
			  $sessionEvent->setAction($action);
			  $sessionEvent->setObject($this->edApp);
			  $sessionEvent->setGenerated($this->generatedSession);
			  $sessionEvent->setGroup($this->org);
			  $sessionEvent->setEdApp($this->edApp);
			  $sessionEvent->setEventTime($objDateTime);

			  return $this->enviarEvento($sessionEvent);
		 }
		 
		 public function keepAliveEventoSesion($link,$titulo,$session,$context,$porcentaje,$objDateTime,$url){
			  $sessionEvent = new SessionEvent();
			  $action = new Action(Action::LOGGED_IN);

			  $this->getEdApp();
			  //$objDateTime = new DateTime('NOW');
			  //$objDateTime->format('Y-m-d H:i:s');
			  
			  // The generated object (Session) within the Event Object
			  $this->generatedSession = new Session($session);
			  $this->generatedSession->setName($session);
			  $this->generatedSession->setDescription("Unidad " . $link . " con título " . $titulo);
			  $this->generatedSession->setActor($this->actor);
			  $this->generatedSession->setStartedAtTime($objDateTime);
			  $this->generatedSession->setDateCreated($objDateTime);
			  $this->getCourse($link,$titulo,$porcentaje,"2",$url,$context);

			  $sessionEvent->setActor($this->actor);
			  $sessionEvent->setAction($action);
			  $sessionEvent->setObject($this->edApp);
			  $sessionEvent->setGenerated($this->generatedSession);
			  $sessionEvent->setGroup($this->org);
			  $sessionEvent->setEdApp($this->edApp);
			  $sessionEvent->setEventTime($objDateTime);

			  return $this->enviarEvento($sessionEvent);
		 }
		 
		public function newEventoSesionSalida($link,$titulo,$session,$context,$porcentaje,$objDateTime,$url){
			$sessionEvent = new SessionEvent();
			$action = new Action(Action::LOGGED_OUT);
			$objDateTime = new DateTime('NOW');
			$objDateTime->format('Y-m-d H:i:s');

			$this->getEdApp();
			//$objDateTime = new DateTime('NOW');
			//$objDateTime->format('Y-m-d H:i:s');

			// The generated object (Session) within the Event Object
			$this->generatedSession = new Session($session);
			$this->generatedSession->setName($session);
			$this->generatedSession->setDescription("Unidad " . $link . " con título " . $titulo);
			$this->generatedSession->setActor($this->actor);
			$this->generatedSession->setStartedAtTime($objDateTime);
			$this->generatedSession->setDateCreated($objDateTime);
			$this->getCourse($link,$titulo,$porcentaje,"1",$url,$context);

			  
			/*$fechai = $this->generatedSession->getStartedAtTime();
			$interval = $objDateTime->format('U') - $fechai->format('U');
			$this->generatedSession->setEndedAtTime($objDateTime);
			$this->generatedSession->setDuration((string)$interval);*/

			$sessionEvent->setActor($this->actor);
			$sessionEvent->setAction($action);
			$sessionEvent->setObject($this->edApp);
			$sessionEvent->setGenerated($this->generatedSession);
			$sessionEvent->setGroup($this->org);
			$sessionEvent->setEdApp($this->edApp);
			$sessionEvent->setEventTime($objDateTime);
			
			return $this->enviarEvento($sessionEvent);
		 }

		 public function MediaEventSeek($tipo,$link,$titulo,$sesion,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url,$position,$target){
			  $this->getEdApp();
			  $this->getCourse($link,$titulo,$porcentaje,"1",$url,$context);
			  $action = new Action(Action::JUMPED_TO);	
			  $typeO = array("Video");
			  $learningObjectives = array($objetivo);
			
			  $mediaObject = new VideoObject($objetivo);
			  $mediaObject->setId($objetivo);
			  $mediaObject->setName($descripcion);
			  $mediaObject->setDescription($url);
			  $mediaObject->setObjectTypes($typeO);
			 
			  	  
			  $selemento = (string)$objetivo;
			  $stipo = (string)$tipo;
			  $sporcentaje = (string)$porcentaje;
			  $slink = (string)$link;
			  $stitulo = (string)$titulo;
			  $sdescripcion = (string)$descripcion;
			  $scadenaevento = (string)$cadenaevento;
			  $surl = (string)$url;
  			  $ext = array($stipo,$slink,$stitulo,$sporcentaje,$selemento,$sdescripcion,$scadenaevento,$surl);
			  $mediaObject->setExtensions($ext);
			 
			  
			  
			  $mediaLocationTarget = new MediaLocation($objetivo);
			  $mediaLocationTarget->setCurrentTime($position+0);
			  $mediaLocationTarget->setObjectTypes($typeO);
			  $mediaLocationTarget->setName($descripcion);
			  $mediaLocationTarget->setDescription($url);
			  $offset = ($target+0);
			  $soffset = (string)$offset;
  			  $ext = array($soffset);
			  $mediaLocationTarget->setExtensions($ext);
			  
			  $mediaEvent = new MediaEvent();
			  $mediaEvent->setActor($this->actor);
			  $mediaEvent->setAction($action);
			  $mediaEvent->setObject($mediaObject);
			  $mediaEvent->setEdApp($this->edApp);
			  $mediaEvent->setGroup($this->org);
			  $mediaEvent->setTarget($mediaLocationTarget);
			  $mediaEvent->setEventTime($objDateTime);

			  return $this->enviarEvento($mediaEvent);		 
		 }
		 
		 
		 public function AssessmentItemEventFinalizo($tipo,$link,$titulo,$sesion,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){
			  $this->getEdApp();
			  $this->getCourse($link,$titulo,$porcentaje,"1",$url,$context);
			  $action = new Action(Action::COMPLETED);
			  //$objDateTime = new DateTime('NOW');
			  //$objDateTime->format('Y-m-d H:i:s');

			  $assessmentItem1 = new AssessmentItem($objetivo);
			  $assessmentItem1->setName("UPCTforma - Unidad " . $link . " Elemento " . $objetivo);
			  $assessmentItem1->setVersion("UPCTforma-V2");
			  $assessmentItem1->setDateModified($objDateTime);
			  $assessmentItem1->setDateCreated($objDateTime);
			  $assessmentItem1->setDatePublished($objDateTime);
			  $assessmentItem1->setDateToActivate($objDateTime);
			  $assessmentItem1->setDateToShow($objDateTime);
			  $assessmentItem1->setDateToStartOn($objDateTime);
			  $assessmentItem1->setDateToSubmit($objDateTime);
			  $assessmentItem1->setMaxAttempts(1);
			  $assessmentItem1->setMaxSubmits(1);
			  $assessmentItem1->setMaxScore(1.0);

			  $selemento = (string)$objetivo;
			  $stipo = (string)$tipo;
			  $sporcentaje = (string)$porcentaje;
			  $slink = (string)$link;
			  $stitulo = (string)$titulo;
			  $sdescripcion = (string)$descripcion;
			  $scadenaevento = (string)$cadenaevento;
			  $surl = (string)$url;
  			  $ext = array($stipo,$slink,$stitulo,$sporcentaje,$selemento,$sdescripcion,$scadenaevento,$surl);
			  $assessmentItem1->setExtensions($ext);

			  $this->generatedAttempt = new Attempt($link);
			  $this->generatedAttempt->setName("UPCTforma. Elemento: " . $objetivo);
			  $this->generatedAttempt->setDescription("Unidad " . $link);
			  $this->generatedAttempt->setActor($this->actor);
			  $this->generatedAttempt->setAssignable($assessmentItem1);
			  $this->generatedAttempt->setDateCreated($objDateTime);
			  $this->generatedAttempt->setCount(1);
			  $this->generatedAttempt->setStartedAtTime($objDateTime);

			  $assessmentItemEvent = new AssessmentItemEvent();
			  $assessmentItemEvent->setActor($this->actor);
			  $assessmentItemEvent->setAction($action);
			  $assessmentItemEvent->setObject($assessmentItem1);
			  $assessmentItemEvent->setGenerated($this->generatedAttempt);
			  $assessmentItemEvent->setEdApp($this->edApp);
			  $assessmentItemEvent->setGroup($this->org);
			  $assessmentItemEvent->setEventTime($objDateTime);

			  return $this->enviarEvento($assessmentItemEvent);
		 }
		 public function newEventoMediaSeek($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url,$position,$target){
			 $tipo="interaccion";
			 return $this->MediaEventSeek($tipo,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url,$position,$target);
		 } 
		 public function newEventoInteraccion($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){
			 $tipo="interaccion";
			 return $this->AssessmentItemEventFinalizo($tipo,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
		 }
		 public function newEventoInteraccionMovimiento($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){
			 $tipo="interaccionMovimiento";
			 return $this->AssessmentItemEventFinalizo($tipo,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
		 }
		 public function newEventoObjetivo($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){
			 $tipo="objetivo";
			 return $this->AssessmentItemEventFinalizo($tipo,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
		 }
		 
		public function newEventoPoint($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){
			 $tipo="objetivePoint";
			 return $this->AssessmentItemEventFinalizo($tipo,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
		 }
		public function newUnitPoint($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){
			 $tipo="unitPoint";
			 return $this->AssessmentItemEventFinalizo($tipo,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
		 }
		public function newUnitMissions($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){
			 $tipo="unitMissions";
			 return $this->AssessmentItemEventFinalizo($tipo,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
		 }
		public function newUnitBadget($link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){
			 $tipo="unitBadget";
			 return $this->AssessmentItemEventFinalizo($tipo,$link,$titulo,$session,$context,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url);
		 }
		 
		 private function enviarEvento($evento){
			$retryCount = 0;
			$retry = false;

			do{
				$retry = false;
				try {
					$this->sensor->send($this->sensor, $evento);
				} catch (\RuntimeException $sendException) {
					$retry = true;
					$retryCount++;
					Sleep(3);
					if ($retryCount==3){
						return 0;
						//echo 'Error sending event: ' . $sendException->getMessage() . PHP_EOL;
					}
				}
			} while (($retry == true) && ($retryCount < 3));
			return 1;
		 }

	}


?>
