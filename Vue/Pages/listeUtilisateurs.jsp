<%@page import="java.util.Collection"%>
<%@page import="projetAppli.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">-->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>MeeticMusique : Rencontrez les musiciens de votre groupe !</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/hover.css" rel="stylesheet">

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
                        <a href="propos.html">À propos du site</a>
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
                    		<a href="#" class="list-group-item active">Explorez les annonces</a>
                    		<a href="#" class="list-group-item">Recherchez un utilisateur</a>
                    		<a href="#" class="list-group-item">Créez votre annonce</a>
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
                    <h1>Liste des utilisateurs</h1>
                </div>
                <div class="well">
                	<table class="table">
  						<thead>
    						<tr>
      						<th></th>
      						<th>id</th>
      						<th>Identifiant</th>
      						<th>Addresse Mail</th>
      						<th>Prénom</th>
    						</tr>
  						</thead>
  						<tbody>
    						<tr>
      						<th><img alt="" src="images/user-icon.png"/></th>
      						<th scope="row">1</th>
      						<td>Mchristi</td>
      						<td>m.c@gmail.fr</td>
      						<td>Maeva</td>
    						</tr>
  						</tbody>
					</table>
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