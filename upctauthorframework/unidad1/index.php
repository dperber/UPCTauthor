<!DOCTYPE html>
<?php

$numero = count($_GET);
$tags = array_keys($_GET);// obtiene los nombres de las varibles
$valores = array_values($_GET);// obtiene los valores de las varibles

//require_once $_SERVER['DOCUMENT_ROOT']. "/tsugi/config.php";
require_once "../../config.php";

use \Tsugi\Util\LTI;
use \Tsugi\Core\Settings;
use \Tsugi\Core\LTIX;
use \Tsugi\UI\SettingsForm;

$LTI = LTIX::requireData();
$p = $CFG->dbprefix;

if (isset($_POST["points"])){
	//$points = json_decode($_POST["points"], true);
	$points = $_POST["points"];
	$tipo = "gamification";
	$identificador = $_POST["identificador"];
	$unidades = $_POST["unidades"];
}else{
	$points = "";
	$tipo = "normal";
	$uri_parts = explode('?', $_SERVER['REQUEST_URI'], 2);
	$identificador =  "https://". $_SERVER["HTTP_HOST"] . $uri_parts[0];
	$unidades = 0;
}

 $context = $_SESSION['lti']['context_id'];

?>
<html>
  <head>
    <meta charset="utf-8">
    <title>Demo Unit 1</title>
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css" media="screen" charset="utf-8">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" media="screen" charset="utf-8">
    <!-- Base -->
    <!--<link rel="stylesheet" href="css/main.css" media="screen" charset="utf-8">-->
    <link rel="stylesheet" href="css/base.css" media="screen" charset="utf-8">
    <link rel="stylesheet" href="css/box.css" media="screen" charset="utf-8">
    <link rel="stylesheet" href="css/lists.css" media="screen" charset="utf-8">
    <link rel="stylesheet" href="css/tooltip.css" media="screen" charset="utf-8">
    <link rel="stylesheet" href="css/utils.css" media="screen" charset="utf-8">
    <link rel="stylesheet" href="css/flex.css" media="screen" charset="utf-8">
    <link rel="stylesheet" href="css/sinister.css" media="screen" charset="utf-8">
    <link rel="stylesheet" type="text/css" href="css/icomoon.css">
    <link rel="stylesheet" type="text/css" href="css/custom.css">
    <link href="css/tabs.min.css" rel="stylesheet" />
 <link rel="stylesheet" type="text/css" href="css/social.css">
	
	




				<link rel="stylesheet" type="text/css" href="css/figcaption.css">


				<link rel="stylesheet" type="text/css" href="css/figcaption.css">


				<link rel="stylesheet" type="text/css" href="css/imgbutton.css">






				
				
				<link rel="stylesheet" type="text/css" href="css/animation.css">


				<link rel="stylesheet" type="text/css" href="css/draganddrop.css">




	

    <!--Progreso-->
    <link rel="stylesheet" type="text/css" href="progreso/css/progreso_mapa.css">

   <script type="text/javascript" src="jquery/jquery-1.11.3.min.js"></script>
   <script src="https://code.jquery.com/ui/1.11.3/jquery-ui.min.js"></script>
   <script src="jquery-ui-touch-punch-master/jquery.ui.touch-punch.min.js"></script>
    <script src="https://content.jwplatform.com/libraries/47wx7PfZ.js"></script>
	<script type="text/x-mathjax-config">
	  MathJax.Hub.Config({
	    tex2jax: {inlineMath: [["$","$"],["\\(","\\)"]]}
	  });
	</script>
	<script type="text/javascript" src="../../MathJax-master/MathJax.js?config=TeX-AMS_HTML-full"></script>
  </head>

  <body id="body" data-spy="scroll" data-offset="50" data-target="#navbar-main" unload="javascript:finUnidad();" onLoad="setInterval('keepAlive()',600000);">
	<script type="text/javascript">
		var link = '<?php echo $LINK->id; ?>';
		var title = '<?php echo $LINK->title; ?>';
		var usd = '<?php echo $USER->id; ?>';
		var displayname = '<?php echo $USER->displayname; ?>';
		var email = '<?php echo $USER->email; ?>';
		var firstname = '<?php echo $USER->firstname; ?>';
		var lastname = '<?php echo $USER->lastname; ?>';
		var session_id = '<?php echo session_id(); ?>';
		var tipounit = '<?php echo $tipo; ?>';
		var points = '<?php echo $points; ?>';
		var unidades = '<?php echo $unidades; ?>';
		var identificador = '<?php echo $identificador; ?>';
		 var context = '<?php echo $context; ?>';
	</script>

	<div id="navbar-main">
		<!-- Fixed navbar -->
		<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
						<span class="icon icon-menu" style="font-size:30px; color:#3498db;"></span>
					</button>
					<a class="navbar-brand hidden-xs hidden-sm sctop" href="#body">
						<img src="img/logo.png" class="img-responsive" style="margin-top: -5px" alt="logo Indra" />
					</a>
				</div>
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li> <a href="#apdo1" class="scold navbar-link">Section1</a></li>
						<li> <a href="#apdo2" class="scold navbar-link">Section2</a></li>
						<li> <a href="#apdo3" class="scold navbar-link">Section3</a></li>
						<li> <a href="#apdo4" class="scold navbar-link">Section4</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>	
  
    <div id="progreso_mp"></div>

	
	<section id="apdo1" class="section-divider textdividersub divider1" style="background:url('img/cabeceras/cabecera.jpg');">
      <div class="container">
        <h1>ENTREPRENEURSHIP AND ENTREPRENEURS</h1>
        <hr>
        <p></p>
      </div>
    </section>

					

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

			
			<p><blockquote> <strong>Entrepreneurship</strong> is the process of creating a business enterprise capable of entering new or established markets.</blockquote></p>

					
					
						
		

		
				<div class="row">
					<div class="col-md-12">
						<i id="objetivos1r1c1e2" class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
					</div>
				</div>
				
				<div>
		          <?php 	require_once('./php/funcionesgenerales.php'); echo getVideo("Nzk=", "s1r1c1e2"); ?>
		        </div>



					
	          </div>

        </div>
      </div>
    </section>
	


							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-6">
					
						
		

					
					<p>This can be one of the most exciting management challenges because successful entrepreneurship requires deploying resources and people in unique ways to develop a new organization.</p>
					
					<p>An entrepreneur is an individual who creates an enterprise that becomes a new entry in the market. Broadly stated, an entrepreneur is anyone who recognizes an opportunity (by changing, revolutionizing, transforming or introducing new products or services), undertakes some innovative projects and bears some risk.</p>

					
	          </div>

			        	  
			 <div class="col-md-6">
					
						
		

					
					<p>There are some myths about entrepreneurs. One common belief is that entrepreneurs possess certain innate traits that make them different from regular people, but many types of people with different personality characteristics have become successful entrepreneurs. In fact, many of them studied entrepreneurship as a discipline before launching a business because useful skills for entrepreneurs can be learned and practiced.</p>
					
					<p>Another myth is to consider that only wealthy people can start a business. Many companies have been started by people with few resources and accumulated capital by putting in long hours without pay and reinvesting their profits in the business.</p>

					
	          </div>

        </div>
      </div>
    </section>
	


							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

					
					<p>Although some of the most celebrated entrepreneurs were young when they started their business (Bill Gates - Microsoft, Steve Jobs - Apple, Mark Zuckerberg - Facebook), not all successful entrepreneurs were young when they got started. For instance, Harland Sanders was 65 when he started his Kentucky Fried Chicken franchise, and Herb Kelleher was 40 when he founded Southwest Airlines.</p>

					
	          </div>

        </div>
      </div>
    </section>
	


							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-6">
					
						
		

				
				
				<div class="row">
					<div class="col-md-12">
						<i id="objetivos1r4rt1c1e1" class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
					</div>
				</div>
				
				<div class="grid mask">
		            <figure class="text">
		                <img id="s1r4rt1c1e1" data-type="ImageTextOver" data-desc="Section1left" class="img-responsive mano btnmostrar control_objetivo_unico_click" title="Imagen" alt="figcaption" src="img/oldtimer-1198776_1920.jpg">
		                <figcaption>
										
					<p>Finally, people tend to remember entrepreneurial success, but very often failure is a key part of the learning process. Entrepreneurs learn lessons that eventually lead to the creation of a successful company. For example Henry Ford founded two automotive companies that failed before he was able to gain success with the Ford Motor Company. At the time of his death, Ford’s estimated net worth was 188 billion dollars.</p>
		                </figcaption>
		            </figure>
		        </div>




					
	          </div>

			        	  
			 <div class="col-md-6">
					
						
		

				
				
				<div class="row">
					<div class="col-md-12">
						<i id="objetivos1r4rt1c2e1" class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
					</div>
				</div>
				
				<div class="grid mask">
		            <figure class="text">
		                <img id="s1r4rt1c2e1" data-type="ImageTextOver" data-desc="section1right" class="img-responsive mano btnmostrar control_objetivo_unico_click" title="Imagen" alt="figcaption" src="img/apple-758333_1920.jpg">
		                <figcaption>
										
					<p>Steve Jobs was actually fired from Apple Computers, the company that he was responsible for making it the success it is today. When Jobs was fired from Apple, he was quoted as stating “I didn’t see it then, but it turned out that getting fired from Apple was the best thing that could have ever happened to me. The heaviness of being successful was replaced by the lightness of being a beginner again, less sure about everything. It freed me to enter one of the most creative periods of my life”.</p>
		                </figcaption>
		            </figure>
		        </div>




					
	          </div>

        </div>
      </div>
    </section>
	


					

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

			
			<p><h2> The importance of entrepreneurship</h2></p>

					
	          </div>

        </div>
      </div>
    </section>
	


							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

					
					<p>When entrepreneurs create a company, they are starting a basic unit of production that has a reflection on the economies of their countries, creating jobs, stimulating innovation and providing opportunities for diverse people in society.</p>
					
					<p>Entrepreneurship creates jobs because the person who started the company creates his/her own job and, as the company grows, it will need more employees who receive salaries in return for their work. The individual income earned by these workers gives them the ability to satisfy their needs (paying for the products and services that they want) and governments can also improve their income by taxing the companies and workers in order to improve public services. Therefore, entrepreneurship impacts on the overall long-term economic health of communities, regions and nations, improving the whole of society’s quality of life.</p>

					
	          </div>

        </div>
      </div>
    </section>
	


							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

				
<div class="row">
	<div class="col-md-12">
		<i id="objetivos1r7rt1c1e1" class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
	</div>
</div>

<div class="col-md-6">
				
	            <img id="s1r7rt1c1e1" class="img-responsive btnmostrar mano events control_objetivo_unico_click" data-type="ImageTextRight" data-desc="section1textright" data-target="#imagens1r7rt1c1e1" src="img/shutterstock_198994412.jpg" alt="">
	        </div>
	        <div id="imagens1r7rt1c1e1" class="col-md-6 hidden">   
						
					<p>Entrepreneurship is also responsible for introducing a major proportion of new and innovative products and services into the market. These enterprises are often started by visionary people who develop an innovative way of doing something faster, better, cheaper or with improved features, pioneering the design of new technologies that make older ones obsolete. The “creative destruction” process that characterizes innovation leads to technological changes and employment growth. Entrepreneurial companies act as “agents of change” by providing an essential source of new and unique ideas that may otherwise go untapped.</p>
						
					<p>Consequently, entrepreneurship is not limited to starting a company. Entrepreneurship and entrepreneurial innovation can occur in a variety of organizations. Entrepreneurship emerges under widely diverse circumstances, typically in response to new conditions and in pursuit of newly perceived opportunities, delivering traditional products or services or creating new combinations that result in novel technologies, products, services and operating practices—that is, substantial innovation.</p>
	        </div>
				



					
	          </div>

        </div>
      </div>
    </section>
	


							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

					
					<p>Finally, people from diverse backgrounds who have experienced frustration and blocked career paths in large corporations can improve their economic status and pursue interesting careers by becoming entrepreneurs. Entrepreneurship provides an attractive alternative for avoiding the unpleasant politics of organizations, gaining more challenges and autonomy or balancing work and family responsibilities, among other benefits.</p>

					
	          </div>

        </div>
      </div>
    </section>
	


							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

					
					<p><blockquote>Entrepreneurial characteristics and skills</blockquote></p>

					
	          </div>

        </div>
      </div>
    </section>
	


							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

					
					<p>In general, entrepreneurs have some key characteristics that can be acquired in various ways, such as: a) learning from family role models; b) exposure to school, work or social activities, or c) by imitating others who have them. <strong>Some of the characteristics that are associated with entrepreneurship are:</strong></p>

					
	          </div>

        </div>
      </div>
    </section>
	


							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

	       		
<div class="row">
	<div class="col-md-12">
		<i id="objetivos1r11rt1c1e13" class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>

		<i id="objetivos1r11rt1c1e15" class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>

		<i id="objetivos1r11rt1c1e17" class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>

	</div>
</div>

<div class="panel-group" id="s1r11rt1c1e1" role="tablist" aria-multiselectable="true">
					<div class="panel panel-default">
		                <div class="panel-heading" role="tab" id="headings1r11rt1c1e11">
		                    <h4 class="panel-title ">
		                        <!-- T�tulo de la Pesta�a -->
		                        <a class="events" data-toggle="collapse" data-parent="s1r11rt1c1e1" href="#collapses1r11rt1c1e11" aria-expanded="true" aria-controls="collapse1">
										
										NEED FOR ACHIEVEMENT
								</a>
		                    </h4>
		                </div>        
		                <div id="collapses1r11rt1c1e11" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headings1r11rt1c1e11"> <!-- la primera pesta�a lleva la clase 'in', el resto no -->
		                    <div class="panel-body">	 
		                        <!-- Cuerpo de la Pesta�a -->
											
											<p>This refers to a strong desire to solve problems on your own. These types of people enjoy setting goals and accomplishing them through their own efforts and like receiving feedback on how they are doing. These characteristics help entrepreneurs to be more proactive and anticipate future problems, needs or changes.</p>
		                    </div>
		                </div>
	            	</div>
					<div class="panel panel-default">
		                <div class="panel-heading" role="tab" id="headings1r11rt1c1e13">
		                    <h4 class="panel-title control_objetivo_unico_click" id="s1r11rt1c1e13" data-type="VerticalAccordion" data-desc="section1verticalaccordion">
		                        <!-- T�tulo de la Pesta�a -->
		                        <a class="events" data-toggle="collapse" data-parent="s1r11rt1c1e1" href="#collapses1r11rt1c1e13" aria-expanded="true" aria-controls="collapse1">
										
										AN INTERNAL LOCUS OF CONTROL
								</a>
		                    </h4>
		                </div>        
		                <div id="collapses1r11rt1c1e13" class="panel-collapse collapse " role="tabpanel" aria-labelledby="headings1r11rt1c1e13"> <!-- la primera pesta�a lleva la clase 'in', el resto no -->
		                    <div class="panel-body">	 
		                        <!-- Cuerpo de la Pesta�a -->
											
											<p>This is related to a strong belief in one’s own ability to succeed, so that if one fails or makes a mistake, the individual is likely to accept responsibility for the outcome and try harder rather than search for external reasons to explain the failure (luck, fate, etc.). These help entrepreneurs to be persistent and motivated to overcome barriers that would deter others.</p>
		                    </div>
		                </div>
	            	</div>
					<div class="panel panel-default">
		                <div class="panel-heading" role="tab" id="headings1r11rt1c1e15">
		                    <h4 class="panel-title control_objetivo_unico_click" id="s1r11rt1c1e15" data-type="VerticalAccordion" data-desc="section1verticalaccordion">
		                        <!-- T�tulo de la Pesta�a -->
		                        <a class="events" data-toggle="collapse" data-parent="s1r11rt1c1e1" href="#collapses1r11rt1c1e15" aria-expanded="true" aria-controls="collapse1">
										
										WILLINGNESS TO TAKE RISK
								</a>
		                    </h4>
		                </div>        
		                <div id="collapses1r11rt1c1e15" class="panel-collapse collapse " role="tabpanel" aria-labelledby="headings1r11rt1c1e15"> <!-- la primera pesta�a lleva la clase 'in', el resto no -->
		                    <div class="panel-body">	 
		                        <!-- Cuerpo de la Pesta�a -->
											
											<p>Sometimes entrepreneurs may risk a substantial portion of their own capital as well as funds contributed by family, friends and other investors. Therefore, entrepreneurs should be capable of dealing with a certain level of uncertainty.</p>
		                    </div>
		                </div>
	            	</div>
					<div class="panel panel-default">
		                <div class="panel-heading" role="tab" id="headings1r11rt1c1e17">
		                    <h4 class="panel-title control_objetivo_unico_click" id="s1r11rt1c1e17" data-type="VerticalAccordion" data-desc="section1verticalaccordion">
		                        <!-- T�tulo de la Pesta�a -->
		                        <a class="events" data-toggle="collapse" data-parent="s1r11rt1c1e1" href="#collapses1r11rt1c1e17" aria-expanded="true" aria-controls="collapse1">
										
										SELF-CONFIDENCE
								</a>
		                    </h4>
		                </div>        
		                <div id="collapses1r11rt1c1e17" class="panel-collapse collapse " role="tabpanel" aria-labelledby="headings1r11rt1c1e17"> <!-- la primera pesta�a lleva la clase 'in', el resto no -->
		                    <div class="panel-body">	 
		                        <!-- Cuerpo de la Pesta�a -->
											
											<p>This is related to the perception that the person can master the skills needed to run a business and that he/she can overcome unforeseen obstacles. This can be used by entrepreneurs to energize and motivate employees. It also helps them to improvise and to find novel solutions to business problems that may discourage people who are more self-critical.</p>
		                    </div>
		                </div>
	            	</div>
	        </div>



					
	          </div>

        </div>
      </div>
    </section>
	


							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

					
					<p>As well as an entrepreneur’s personal characteristics, there are also <strong>skills</strong> which are related to success. Although an entrepreneur uses a variety of business skills to create and operate an enterprise, some of the most important ones are:</p>

					
	          </div>

        </div>
      </div>
    </section>
	


							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

				
<div class="row">
	<div class="col-md-12">
		<i id="objetivos1r13rt1c1e13" class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
		
		<i id="objetivos1r13rt1c1e15" class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
		
	</div>
</div>

 <div role="tabpanel"> 
	            <ul class="nav nav-tabs" role="tablist">
	                		<li role="presentation" id="s1r13rt1c1e11" data-type="HorizontalTabs" data-desc="section1horiztonaltab" class="active"><a class="events" href="#pess1r13rt1c1e11" aria-controls="pess1r13rt1c1e11" role="tab" data-toggle="tab">
										NEGOTIATION SKILLS
							</a></li> 
	                		<li role="presentation" id="s1r13rt1c1e13" data-type="HorizontalTabs" data-desc="section1horiztonaltab" class="control_objetivo_unico_click"><a class="events" href="#pess1r13rt1c1e13" aria-controls="pess1r13rt1c1e13" role="tab" data-toggle="tab">
										NETWORKING SKILLS
							</a></li> 
	                		<li role="presentation" id="s1r13rt1c1e15" data-type="HorizontalTabs" data-desc="section1horiztonaltab" class="control_objetivo_unico_click"><a class="events" href="#pess1r13rt1c1e15" aria-controls="pess1r13rt1c1e15" role="tab" data-toggle="tab">
										LEADERSHIP SKILLS
							</a></li> 
	            </ul>
	            <div class="tab-content">
										
				                <div role="tabpanel" class="col-md-12 tab-pane active" id="pess1r13rt1c1e11">
												
												<p>Entrepreneurs use these skills to obtain the resources needed to launch and maintain a company, such as borrowing money from a bank at good rates, obtaining a low price for raw materials from a supplier, discussing employment contracts, etc.</p>
				                </div>
										
				                <div role="tabpanel" class="col-md-12 tab-pane " id="pess1r13rt1c1e13">
												
												<p>This refers to the relationships between the entrepreneur and other parties, including other entrepreneurs, suppliers, creditors, investors, friends, former colleagues and other people. These personal contacts can help an entrepreneur make effective decisions by gathering information that reduces uncertainty for the business. Networks can be formed through participation in professional societies, business clubs, charitable organizations, trade fairs and networks of entrepreneurs. Business networks can also help build alliances formed with other businesses to achieve mutually beneficial goals.</p>
				                </div>
										
				                <div role="tabpanel" class="col-md-12 tab-pane " id="pess1r13rt1c1e15">
														
											<img src="img/shutterstock_198994412.jpg" alt="Imagen" title="Imagen" class="img-responsive mano btnmostrar" >
				                </div>
	            </div>
	        </div>

		       


					
	          </div>

        </div>
      </div>
    </section>
	

	

	
	<section id="apdo2" class="section-divider textdividersub divider1" style="background:url('img/cabeceras/cabecera1.jpg');">
      <div class="container">
        <h1>INTEGRATED WATER RESOURCE MANAGEMENT</h1>
        <hr>
        <p></p>
      </div>
    </section>

							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

				
		<div class="row">
			<div class="col-md-12">
				<i id="objetivos2r1rt1c1e1" class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
			</div>
		</div>
		
		<div class="col-md-12" id="s2r1rt1c1e1"></div>
		
		
		
		
		
		
		



					
	          </div>

        </div>
      </div>
    </section>
	

	

	
	<section id="apdo3" class="section-divider textdividersub divider1" style="background:url('img/cabeceras/color-767166_1920.png');">
      <div class="container">
        <h1>Activities Human Resource Recruitment</h1>
        <hr>
        <p></p>
      </div>
    </section>

							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

				
<div class="row">
	<div class="col-md-12">
		<i id="objetivos3r1rt1c1e1" class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
	</div>
</div>

<div class="row">
	<div class="col-md-3 col-sm-3 col-xs-3">
    	<div id="drops3r1rt1c1e111" class="ui-droppable drops drops3r1rt1c1e11 smar1 ui-helper-reset">
        	<img src="img/drag1.png" id="drag1" class="img img-responsive ui-widget-content ui-draggable">
        </div>
	</div>
	<div class="col-md-3 col-sm-3 col-xs-3">
		<div id="drops3r1rt1c1e11" class="smar1 ui-droppable ui-widget-content drops drops3r1rt1c1e11"></div>
	</div>
	<div class="col-md-6 col-sm-6 col-xs-6">
			<img src="img/text2.png" class="img img-responsive textdrag">
	</div>
</div>
<div class="row">
	<div class="col-md-3 col-sm-3 col-xs-3">
    	<div id="drops3r1rt1c1e144" class="ui-droppable drops drops3r1rt1c1e14 smar1 ui-helper-reset">
        	<img src="img/drag2.png" id="drag2" class="img img-responsive ui-widget-content ui-draggable">
        </div>
	</div>
	<div class="col-md-3 col-sm-3 col-xs-3">
		<div id="drops3r1rt1c1e14" class="smar1 ui-droppable ui-widget-content drops drops3r1rt1c1e14"></div>
	</div>
	<div class="col-md-6 col-sm-6 col-xs-6">
			<img src="img/text1.png" class="img img-responsive textdrag">
	</div>
</div>
<div class="row">
	<div class="col-md-3 col-sm-3 col-xs-3">
    	<div id="drops3r1rt1c1e177" class="ui-droppable drops drops3r1rt1c1e17 smar1 ui-helper-reset">
        	<img src="img/drag3.png" id="drag3" class="img img-responsive ui-widget-content ui-draggable">
        </div>
	</div>
	<div class="col-md-3 col-sm-3 col-xs-3">
		<div id="drops3r1rt1c1e17" class="smar1 ui-droppable ui-widget-content drops drops3r1rt1c1e17"></div>
	</div>
	<div class="col-md-6 col-sm-6 col-xs-6">
			<img src="img/text4.png" class="img img-responsive textdrag">
	</div>
</div>
<div class="row">
	<div class="col-md-3 col-sm-3 col-xs-3">
    	<div id="drops3r1rt1c1e11010" class="ui-droppable drops drops3r1rt1c1e110 smar1 ui-helper-reset">
        	<img src="img/drag4.png" id="drag4" class="img img-responsive ui-widget-content ui-draggable">
        </div>
	</div>
	<div class="col-md-3 col-sm-3 col-xs-3">
		<div id="drops3r1rt1c1e110" class="smar1 ui-droppable ui-widget-content drops drops3r1rt1c1e110"></div>
	</div>
	<div class="col-md-6 col-sm-6 col-xs-6">
			<img src="img/text3.png" class="img img-responsive textdrag">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<a class="btn btn-lg btn-success boton_quizs3r1rt1c1e1">Check your answers</a>
	</div>
	<div class="col-md-9 resultado"></div>
</div>

	
	
	


					
	          </div>

        </div>
      </div>
    </section>
	


					

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

			
			<p></p>

					
	          </div>

        </div>
      </div>
    </section>
	

	

	
	<section id="apdo4" class="section-divider textdividersub divider1" style="background:url('img/cabeceras/cabeceramath.jpg');">
      <div class="container">
        <h1>LaTex - Mathematical expressions</h1>
        <hr>
        <p></p>
      </div>
    </section>

					

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

			
			<p>Example 1: $$\begin{bmatrix}{a}&{b}\\{a}&{b}\end{bmatrix}$$</p>
			
			<p>Example 2:  $$f(n) = \left \{ \begin{matrix} n/2 & \mbox{si }n\mbox{ es par} \\ 3n+1 & \mbox{si }n\mbox{ es impar}\end{matrix}\right.$$ </p>
			
			<p>Example 3: $$x = {-b \pm \sqrt{b^2-4ac} \over 2a}.$$</p>

					
	          </div>

        </div>
      </div>
    </section>
	


							

	<section class="bgwhitecab2">
      <div class="container">
		<br>
        <div class="row">

			        	  
			 <div class="col-md-12">
					
						
		

	       		
<div class="row">
	<div class="col-md-12">
		<i id="objetivos4r2rt1c1e13" class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>

	</div>
</div>

<div class="panel-group" id="s4r2rt1c1e1" role="tablist" aria-multiselectable="true">
					<div class="panel panel-default">
		                <div class="panel-heading" role="tab" id="headings4r2rt1c1e11">
		                    <h4 class="panel-title ">
		                        <!-- T�tulo de la Pesta�a -->
		                        <a class="events" data-toggle="collapse" data-parent="s4r2rt1c1e1" href="#collapses4r2rt1c1e11" aria-expanded="true" aria-controls="collapse1">
										
										ECONOMIC AND SOCIAL COHESION
								</a>
		                    </h4>
		                </div>        
		                <div id="collapses4r2rt1c1e11" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headings4r2rt1c1e11"> <!-- la primera pesta�a lleva la clase 'in', el resto no -->
		                    <div class="panel-body">	 
		                        <!-- Cuerpo de la Pesta�a -->
											
											<p>Promote competitiveness, ecological economic growth in the regions, and provide better services, more job opportunities and a better quality of life for the population.</p>
		                    </div>
		                </div>
	            	</div>
					<div class="panel panel-default">
		                <div class="panel-heading" role="tab" id="headings4r2rt1c1e13">
		                    <h4 class="panel-title control_objetivo_unico_click" id="s4r2rt1c1e13" data-type="VerticalAccordion" data-desc="section3verticalaccordion">
		                        <!-- T�tulo de la Pesta�a -->
		                        <a class="events" data-toggle="collapse" data-parent="s4r2rt1c1e1" href="#collapses4r2rt1c1e13" aria-expanded="true" aria-controls="collapse1">
										
										TERRITORIAL COHESION
								</a>
		                    </h4>
		                </div>        
		                <div id="collapses4r2rt1c1e13" class="panel-collapse collapse " role="tabpanel" aria-labelledby="headings4r2rt1c1e13"> <!-- la primera pesta�a lleva la clase 'in', el resto no -->
		                    <div class="panel-body">	 
		                        <!-- Cuerpo de la Pesta�a -->
											
											<p>Link up the regions to allow them to benefit from their respective strengths and work together on new and innovative configurations to address common challenges (such as climate change), thereby benefiting the EU and strengthening the Union as a whole.</p>
		                    </div>
		                </div>
	            	</div>
	        </div>



					
	          </div>

        </div>
      </div>
    </section>
	

	

 <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">UPCTforma</h4>
        </div>
        <div class="modal-body">
          <p id="bodymymodal"></p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
	<script>
		function entrarRanking(link) {
			url = "../ranking.php";
			var url2 = url + "?PHPSESSID=" + '<?php echo session_id(); ?>';		
			var form = '';
			form += "<input type='hidden' name='unidades' value='"+ unidades +"'>";
            form += "<input type='hidden' name='link' value='"+ link +"'>";
			$('<form action="'+url2+'" method="POST">'+form+'</form>').appendTo('body').submit();
			
		}
	</script>
	<?php 
		if ($tipo=="gamification"){
			echo '<div class="social">';
			echo '<ul>';
			echo '<li><a onclick="entrarRanking( ' . $LINK->id . ')" target="_blank" ><i class="fa fa-trophy" style="font-size:48px;" aria-hidden="true"></i></a></li>';
			echo '</ul>';
			echo '</div>';
		}
	?>
	<footer id="footerwrap">
		<div class="container">
			<div class="row">
				<div class="col-md-2 col-sm-4 col-xs-4 lefted">
					<a href="http://cpcd.upct.es/" target="_blank"><img class="img-responsive mano" src="img/Logo_CPCD_letras_blancas.png" alt="img4"></a>
				</div>
				<div class="col-md-9 col-sm-8 col-xs-8 col-md-offset-1 lefted">
					<p><i class="fa fa-copyright"></i> Center of Production of Digital Contents of the Polytechnic University of Cartagena</p>
					<p style="margin-top: -17px"> Cartagena, Region of Murcia, Spain.</p>
				</div>
			</div>	
		</div>
	</footer>
    	<div class="modal fade" id="sharedModal" tabindex="-1" role="dialog" aria-labelledby="sharedModalLabel">
            <div class="modal-dialog" role="document">
               
            </div>
        </div>

    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="progreso/lib/jquery.line.js"></script>
     <script src="progreso/lib/jQuery-plugin-progressbar.js"></script>
    <!-- MAPA DE PROGRESO / Control de OBJETIVOS-->
<script type="text/javascript" src="js/easeljs-0.6.0.min.js"></script>
    <script type="text/javascript" language="javascript" src="progreso/js/progreso_datos.js"></script>
 	<script type="text/javascript" language="javascript" src="progreso/js/progreso_obj.js"></script>
    <script type="text/javascript" language="javascript" src="progreso/js//progreso_mapa.js"></script>   
    <script type="text/javascript" language="javascript" src="progreso/js/progreso_control.js"></script>
    <script type="text/javascript" src="js/retina.js"></script>
    <script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
    <script type="text/javascript" src="js/easeljs-0.6.0.min.js"></script>
    <script type="text/javascript" src="js/responsive-paginate.js"></script>
    <script type="text/javascript" src="js/smoothscroll.js"></script>
    <script type="text/javascript" src="js/classie.js"></script>
    <script type="text/javascript" src="js/jquery-func.js"></script>

    <script type="text/javascript" src="js/utils.js"></script>
    <script type="text/javascript" src="js/tabs.min.js"></script>
    <script type="text/javascript" src="js/jsplantilla18.js"></script>
    <script src="js/jsplantilla19.js"></script>
	    		<script type="text/javascript" src="js/figcaption.js"></script>
	    		<script type="text/javascript" src="js/figcaption.js"></script>
	    		<script type="text/javascript" src="js/imgbutton.js"></script>
	    		<script type="text/javascript" src="js/acordeon.js"></script>
	    		<script type="text/javascript" src="js/tabs.js"></script>
	    		<script type="text/javascript" src="js/animation.js"></script>
	    		<script type="text/javascript" src="js/draganddrop.js"></script>
	    		<script type="text/javascript" src="js/acordeon.js"></script>
	
	
  </body>
</html>
