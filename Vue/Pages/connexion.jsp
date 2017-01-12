<!DOCTYPE html>
<html lang="en">
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1" charset="utf-8">


		<!-- Website CSS style -->
		<link href="css/bootstrapLogin.css" rel="stylesheet">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		<link rel="stylesheet" href="style.css">
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>

		<title>Connexion|MeeticMusique</title>
	</head>
	<body>
		<div class="container">
			<div class="row main">
				<div class="main-login main-center">
				<h5>Entrez vos données pour vous connecter.</h5>
					<form class="" method="post" action="ServConnection">


						<div class="form-group">
							<label for="username" class="cols-sm-2 control-label">Identifiant</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="username" id="username"  placeholder="Entrez votre identifiant"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Mot de passe</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input type="password" class="form-control" name="password" id="password"  placeholder="Entrez votre mot de passe"/>
								</div>
							</div>
						</div>



						<div class="form-group ">
						<% String redirection;
							boolean inscrit =(boolean) request.getAttribute("inscrit");
						   if (inscrit){
							   redirection = "indexLogged.html";
						   }else {
								   redirection = "inscription.html";
							   }
							%>
						}
							<a href=redirection target="_blank" type="button" id="button" class="btn btn-primary btn-lg btn-block login-button">connexion</a>
						</div>
						<h5> Pas encore membre?</h5>
						<div class="form-group ">
							<a href="inscription.html" type="button" id="button" class="btn btn-primary btn-lg btn-block login-button">inscrivez-vous gratuitement</a>
						</div>
						
						<input type="hidden" name="op" value="connexion">
					</form>
				</div>
			</div>
		</div>

		 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
	</body>
</html>