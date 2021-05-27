<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet"  href="../css/style.css">
<title>Afficher un profil</title>
</head>
<body>
<form method="post" name="afficher_profil">
<%@include file="Header.jsp" %>
	 <div class="container-fluid d-flex justify-content-center aligne-items-center">
	<div class="vertical-center-row">
    <div class="col-12">
     
		<label name="pseudo" id="pseudo"></label></br>
		
		<label name="nom" id="nom"></label></br>
		
		<label name="prenom" id="prenom"></label></br>
		
		<label name="email" id="email"></label></br>
		
		<label name="telephone" id="telephone"></label></br>
		
		<label name="rue" id="rue"></label></br>
		
		<label name="codePostal" id="codePostal"></label></br>
		
		<label name="ville" id="ville"></label></br>

<style type="text/css">

.container-fluid {
  position: fixed;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}

</style>

	</div>
	</div>
	</div>
</form>
</body>
</html>