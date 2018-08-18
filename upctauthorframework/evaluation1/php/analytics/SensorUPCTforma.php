<?php
	require_once "vendor/autoload.php";
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
			$options = (new Options())
				->setApiKey('org.imsglobal.caliper.php.apikey')
				->setDebug(true)
				->setHost('URL');

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
		public function getCourse($link,$titulo,$porcentaje,$tipo,$url) {
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
			$surl = (string) $url;
  			$ext = array($slink,$stitulo,$sporcentaje,$stipo,$surl);
			$this->org->setExtensions($ext);
		}
		public function newEventoSesion($link,$titulo,$session,$porcentaje,$objDateTime,$url){
			$sessionEvent = new SessionEvent();
			$action = new Action(Action::LOGGED_IN);

			$this->getEdApp();
			
			// The generated object (Session) within the Event Object
			$this->generatedSession = new Session($session);
			$this->generatedSession->setName($session);
			$this->generatedSession->setDescription("Unidad " . $link . " con título " . $titulo);
			$this->generatedSession->setActor($this->actor);
			$this->generatedSession->setStartedAtTime($objDateTime);
			$this->generatedSession->setDateCreated($objDateTime);
			$this->getCourse($link,$titulo,$porcentaje,"1",$url);

			$sessionEvent->setActor($this->actor);
			$sessionEvent->setAction($action);
			$sessionEvent->setObject($this->edApp);
			$sessionEvent->setGenerated($this->generatedSession);
			$sessionEvent->setGroup($this->org);
			$sessionEvent->setEdApp($this->edApp);
			$sessionEvent->setEventTime($objDateTime);

			return $this->enviarEvento($sessionEvent);
		}
		public function keepAliveEventoSesion($link,$titulo,$session,$porcentaje,$objDateTime,$url){
			$sessionEvent = new SessionEvent();
			$action = new Action(Action::LOGGED_IN);

			$this->getEdApp();
			
			// The generated object (Session) within the Event Object
			$this->generatedSession = new Session($session);
			$this->generatedSession->setName($session);
			$this->generatedSession->setDescription("Unidad " . $link . " con título " . $titulo);
			$this->generatedSession->setActor($this->actor);
			$this->generatedSession->setStartedAtTime($objDateTime);
			$this->generatedSession->setDateCreated($objDateTime);
			$this->getCourse($link,$titulo,$porcentaje,"2",$url);

			$sessionEvent->setActor($this->actor);
			$sessionEvent->setAction($action);
			$sessionEvent->setObject($this->edApp);
			$sessionEvent->setGenerated($this->generatedSession);
			$sessionEvent->setGroup($this->org);
			$sessionEvent->setEdApp($this->edApp);
			$sessionEvent->setEventTime($objDateTime);

			return $this->enviarEvento($sessionEvent);
		}		 
		public function newEventoSesionSalida($link,$titulo,$session,$porcentaje,$objDateTime,$url){
			$sessionEvent = new SessionEvent();
			$action = new Action(Action::LOGGED_OUT);
			$objDateTime = new DateTime('NOW');
			$objDateTime->format('Y-m-d H:i:s');

			$this->getEdApp();

			// The generated object (Session) within the Event Object
			$this->generatedSession = new Session($session);
			$this->generatedSession->setName($session);
			$this->generatedSession->setDescription("Unidad " . $link . " con título " . $titulo);
			$this->generatedSession->setActor($this->actor);
			$this->generatedSession->setStartedAtTime($objDateTime);
			$this->generatedSession->setDateCreated($objDateTime);
			$this->getCourse($link,$titulo,$porcentaje,"1",$url);

			$sessionEvent->setActor($this->actor);
			$sessionEvent->setAction($action);
			$sessionEvent->setObject($this->edApp);
			$sessionEvent->setGenerated($this->generatedSession);
			$sessionEvent->setGroup($this->org);
			$sessionEvent->setEdApp($this->edApp);
			$sessionEvent->setEventTime($objDateTime);
			
			return $this->enviarEvento($sessionEvent);
		}
		
		public function AssessmentItemEventEvaluacion($tipo, $link,$titulo,$sesion,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$url){
			$this->getEdApp();
			$this->getCourse($link,$titulo,$porcentaje,"1",$url);
			$action = new Action(Action::STARTED);

			$assessmentItem1 = new AssessmentItem($descripcion);
			$assessmentItem1->setName("UPCTforma - Unidad " . $link . " Evaluacion");
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

			$selemento = "";
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
			$this->generatedAttempt->setName("UPCTforma. Elemento: " . $descripcion);
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
		/*public function newEventoInteraccion($link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime){
			$tipo="interaccion";
			return $this->AssessmentItemEventFinalizo($tipo,$link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime);
		}	*/		 
		/*public function newEventoObjetivo($link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime){
			$tipo="objetivo";
			return $this->AssessmentItemEventFinalizo($tipo,$link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime);
		}	*/
		public function newEventoEvaluacion($link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$url){
			$tipo="evaluacion interaccion";
			return $this->AssessmentItemEventEvaluacion($tipo,$link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$url);
		}	
		public function newEventoEvaluacionCompleta($link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$url){
			$tipo="evaluacion finalizada";
			return $this->AssessmentItemEventEvaluacion($tipo,$link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$url);
		}	
		public function newUnitPoint($link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){
			 $tipo="unitPoint";
			 return $this->AssessmentItemEventEvaluacion($tipo,$link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$url);
		 }
		public function newUnitMissions($link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){
			 $tipo="unitMissions";
			 return $this->AssessmentItemEventEvaluacion($tipo,$link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$url);
		 }
		public function newUnitBadget($link,$titulo,$session,$porcentaje,$objetivo,$descripcion,$cadenaevento,$objDateTime,$url){
			 $tipo="unitBadget";
			 return $this->AssessmentItemEventEvaluacion($tipo,$link,$titulo,$session,$porcentaje,$descripcion,$cadenaevento,$objDateTime,$url);
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
					}
				}
			} while (($retry == true) && ($retryCount < 3));
			return 1;
		}
	}
?>