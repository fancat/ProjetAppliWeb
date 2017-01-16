<!DOCTYPE html>
<html lang="fr">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>MeeticMusique : Rencontrez les musiciens de votre groupe !</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/hover.css" rel="stylesheet">

    <!-- Custom CSS -->
<!--     <link href="css/shop-item.css" rel="stylesheet"> -->

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">MeeticMusique</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="login.html"><strong>Profil</strong></a>
                    </li>
                    <li>
                        <a href="connection.html">Notifications</a>
                    </li>
                    <li>
                        <a href="propos.html">� propos du site</a>
                    </li>
                    <li>
                        <a href="contact.html">Contact</a>
                    </li>
                    <li>
                        <a href="faq.html">FAQ</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">

        <div class="row">

            <div class="col-md-3">
                <p class="lead">Shop Name</p>
                
                	<div class="row">
                		<div class="list-group">
                    		<a href="listeAnnonces.jsp" class="list-group-item active">Explorez les annonces</a>
                    		<a href="#" class="list-group-item">Recherchez un utilisateur</a>
                    		<a href="creerAnnonce.jsp" class="list-group-item">D�poser une annonce</a>
                    		<a href="ajoutInstru.jsp" class="list-group-item">Ajouter un instrument</a>                    		
                		</div>
                		<div class="input-group stylish-input-group">
                    		<input type="text" class="form-control"  placeholder="Rechercher rapidement" >
                    		<span class="input-group-addon">
                        	<button type="submit">
                            <span class="glyphicon glyphicon-search"></span>
                        	</button>  
                    		</span>
                		</div>        
                </div>
            </div>

            <div class="col-md-9">

                <div class="thumbnail">
                    <img class="img-responsive" src="images/image_centrale.jpg" alt="">
					<div class="caption-full">
                    </div>
                </div>

                <div class="well">
                <h1><%out.println(request.getAttribute("identifiant"));%><h1>
                    
                </div>
                <div class="well">
					<h4>Vous souhaitez <em>jouer de la musique � plusieurs</em> mais il vous manque des musiciens ?</h4>
					<h3>Vous �tes bien tomb�s !</h3>
					<p>Ici vous trouverez les musiciens qui vous manquent pour compl�ter votre groupe de musique.</p>
					<p>Jouer lors d'un �venement ou juste occasionellement.</p>
                 
                    <hr>
                </div>

            </div>

        </div>

    </div>
    <!-- /.container -->

    <div class="container">

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; MeeticMusique 2016</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>