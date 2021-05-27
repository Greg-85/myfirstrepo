<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet"  href="../css/style.css">
<title>Index</title>
 
</head>
<body>
<form method="post" name="index">
<div class="container">
	<div class="row">
	<div class="col-6">
	<p align="left">ENI-Encheres</p>
	</div>
	<div class="col-6"><p align="right"><a href = "http://localhost:8080/ENI_-_Encheres/inscription">S'inscrire - Se connecter </a></p>
</div>
</div>
<div class="container">
	<h1 align="center">Liste des enchères</h1>
</div>

 <div class="container-fluid">
    <div class="col-12">
  
<div style="padding:20px;">
  <label>Filtres :</label>
    <form class="form-search form-inline">
        <div class="input-append">
            <input type="text" class="search-query" placeholder="Le nom de l'article contient" size= 40 />
            <button type="submit" class="btn btn-lg btn-primary" style="margin-left: 100px">Rechercher</button>
     </div>
 <style type="text/css">
input.search-query {
    padding-left:26px;
}

form.form-search {
    position: relative;
}

form.form-search:before {
    content:'';
    display: block;
    width: 14px;
    height: 14px;
    background-image: url(http://getbootstrap.com/2.3.2/assets/img/glyphicons-halflings.png);
    background-position: -48px 0;
    position: absolute;
    top:8px;
    left:8px;
    opacity: .5;
    z-index: 1000;
}
</style>
    <div class="container-fluid">
    <div class="col-12">
     <div class="row">
		<label>Catégorie :</label>
		<select name="Catégorie" style="margin-left:30px;">
			<option value="Toutes">Toutes</option>
			<option value="Informatique">Informatique</option>
			<option value="Ameublement">Ameublement</option>
			<option value="Vêtement">Vêtement</option>
			<option value="Sport&Loisirs">Sport et Loisirs</option>
		</select></div>
	</form>
	</div>
 </div>
</div>   

<div class="container-fluid">
 <div class="row my-3">
    <div class="col-12 col-sm-6 my-3 my-sm-0">
       <div class="card mb-3" style="max-width: 540px;">
         <div class="row no-gutters">
          <div class="col-md-4">
          <img src="https://images.asos-media.com/products/nike-air-max-90-baskets-en-cuir-bleu-302519-400/9536548-1-blue?$n_640w$&amp;wid=634&amp;fit=constrain" name="image" id="image" class="card-img-top" alt="Nike - Air Max 90">
         </div>
         <div class="col-md-8" name="enchere1" id="enchere1" required="required">
         <div class="card-body">
            <h5 class="card-title"><small name="titre" id="titre"></small></h5></br>
            <p class="card-text"><label name="prix" id="prix">Prix:</label></br>
            <label name="fin_enchere" id="fin_enchere">Fin de l'enchère:</label></br>
            <label name="vendeur" id="vendeur">Vendeur:</label></p>
         </div><!-- /card-body -->
       </div><!-- /card-->
    </div><!-- /col -->
</div>
</div>
<div class="col-12 col-sm-6 my-3 my-sm-0">
 <div class="card mb-3" style="max-width: 540px;">
         <div class="row no-gutters">
          <div class="col-md-4">
          <img src="https://images.asos-media.com/products/nike-air-max-90-baskets-en-cuir-bleu-302519-400/9536548-1-blue?$n_640w$&amp;wid=634&amp;fit=constrain"  name="image" id="image" class="card-img-top" alt="Nike - Air Max 90" >
         </div>
         <div class="col-md-8">
         <div class="card-body">
            <h5 class="card-title">
            <small name="titre" id="titre"></small></h5></br>     
            <p class="card-text"><label name="prix" id="prix">Prix:</label></br>
            <label name="fin_enchere" id="fin_enchere">Fin de l'enchère:</label></br>
            <label name="vendeur" id="vendeur">Vendeur:</label></p>
         </div><!-- /card-body -->
       </div><!-- /card-->
    </div><!-- /col -->
</div>
</div>
</div>
</div>
</form>

</body>
</html>