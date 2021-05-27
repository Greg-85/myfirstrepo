<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
</head>
<body>
<%@include file="Header.jsp" %>
	<h1>Mon Profil</h1>
	<form method="get" name="inscription">
		
		<label>Pseudo : </label>
		<input type="text" placeholder="Pseudo" name="Pseudo" id="Pseudo" required="required"><br>
	
		<label>Prénom : </label>
		<input type="text" placeholder="Prénom" name="Prénom" id="Prénom" required="required"><br>
		
		<label>Teléphone : </label>
		<input type="text" placeholder="Teléphone" name="Teléphone" id="Teléphone"><br>
		
		<label>Code postal : </label>
		<input type="text" placeholder="Code postal" name="Cp" id="Cp" required="required"><br>
		
		<label>Mot de passe : </label>
		<input type="text" placeholder="Mot de passe" name="Mdp" id="Mdp" required="required"><br>
		
		<label>Nom : </label>
		<input type="text" placeholder="Nom" name="Nom" id="Nom" required="required"><br>
		
		<label>Email : </label>
		<input type="text" placeholder="Email" name="Email" id="Email" required="required"><br>
		
		<label>Rue : </label>
		<input type="text" placeholder="Rue" name="Rue" id="Rue" required="required"><br>
		
		<label>Ville : </label>
		<input type="text" placeholder="Ville" name="Ville" id="Ville" required="required"><br>
		
		<label>Confirmation : </label>
		<input type="text" placeholder="Confirmation" name="Confirmation" id="Confirmation" required="required"><br>
	
		<input type="submit" value="Créer" name="creation" id="creation">
		
	</form>
		<button onclick="window.location.href = '/Enchere/accueil';">Annuler</button>
</body>
</html>