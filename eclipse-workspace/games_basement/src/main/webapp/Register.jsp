<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
<%@ include file="css/Register.css" %>
</style>
<head>
<meta charset="UTF-8">
<title>Registrazione</title>
</head>
<body>
	<div class="container">

		<form class="register_form" action=" " method="post" id="contact_form">
			<h4>Dati Personali</h4><br>

				<!-- Nome-->

				<div class="form-group">
					<label>Nome</label><br>
					<input type="text" placeholder="Inserisci il tuo nome" id="Nome">
				</div>

				<!-- Cognome-->

				<div class="form-group">
					<label >Cognome</label><br>
					<input type="text" placeholder="Inserisci il tuo cognome" id="Cognome">
				</div> 

				<!-- Username-->

				<div class="form-group">
					<label >Username</label><br>
					<input type="text" placeholder="Scegli un username!" id="Username">
				</div> 

				<!-- Password-->

				<div class="form-group">
					<label >Password</label><br>
					<input type="password" placeholder="Inserisci la tua password" id="Password">
				</div> 

				<!-- Text input-->

				<div class="form-group">
					<label >Confirm Password</label><br>
					<input type="password" placeholder="Reinserisci la tua password" id="PasswordDue">
				</div> 

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label">E-Mail</label><br>
					<input type="email" placeholder="Inserisci la tua e-mail" id="email">					
				</div> 


				<!-- Num. Telefono-->

				<div class="form-group">
					<label >Numero di Telefono</label><br>
					<input type="text" placeholder="Inserisci il tuo numero di telefono">
				</div> 

				<!-- BDay -->
				<div class="form-group">
					<label>Data di nascita</label><br>
					<input type="date" placeholder="01/01/1901">
				</div> 
				
				<!-- Residenza -->
				<div class="form-group">
					<label>Indirizzo Residenza</label><br>
					<input type="text" placeholder="Via Roma 01">
				</div> 

				<!-- CAP -->
				<div class="form-group">
					<label>CAP</label><br>
					<input type="text" placeholder="00000">
				</div> 
				
				<!-- Button -->
				<div class="form-group">
					<input type="submit" value="Registrati!">&nbsp;
					<input type="reset" value="Clear All">&nbsp;
					Già registrato?<a href="Login.jsp">Clicca qui!</a>
				</div>
		</form>
	</div><br>
	<!-- /.container -->
	<footer>
		<a href="HomePage.html" >Home</a>
	</footer>
</body>
</html>