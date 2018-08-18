$(document).ready(function($){
  var pop1 = "<strong>Para determinar las necesidades de formación pueden utilizarse distintos medios:</strong><ul>"+
  "<li>Observación directa de cómo se realizan las tareas.</li>"+
  "<li>Solicitudes de los directivos que hayan identificado necesidades entre su personal.</li>"+
  "<li>Cuestionarios.</li>"+
  "<li>Pruebas o exámenes.</li>"+
  "<li>Evaluación del rendimiento de los trabajadores.</li>"+
  "<li>Bases de datos sobre el personal y su formación adquirida.</li>"+
  "<li>Planificación de las necesidades futuras.</li></ul>";
  var pop2 = "<strong>La necesidad de formación surge por diversos motivos:</strong><ul>"+
  "<li>Cambio de métodos de trabajo.</li>"+
  "<li>Exceso de defectos en la producción.</li>"+
  "<li>Alto número de accidentes.</li>"+
  "<li>Poca versatilidad de los empleados.</li>"+
  "<li>Averías frecuentes de la maquinaria.</li>"+
  "<li>Creación de nuevas tareas.</li>"+
  "<li>Reasignación de empleados a puestos.</li>"+
  "<li>Problemas de comunicación entre directivos y empleados.</li></ul>";
  $('#objetivo02_01_01').attr('data-content',pop1);
  $('#objetivo02_01_02').attr('data-content',pop2);
});
