<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet"  href="../css/style.css">
<link rel="stylesheet" href="/webapp/CSS/datepicker.css">

<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
<link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />

<script src="/webapp/js/jquery-ui.min.js"></script>
<script src="/webapp/js/datepicker_fr.js"></script>
<script type="text/javascript">
     $.datepicker.setDefaults($.datepicker.regional["fr"]);
     $( "#datepicker").datepicker();
</script>

<title>Nouvelle vente</title>
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col-6">
			<p align="left">ENI-Encheres</p>
		</div>		
	</div>

	<div class="row" style="margin-bottom: 10px;">
		<div class="col-3">
   		</div>
   
   <div class="col-6">
       <h3 style="text-align : center;">Nouvelle vente</h3>
   </div>

   <div class="col-3">
   </div>
	</div>
</div>


<div class="container">
	<div class="row">
		<div class="col-4">
			<!-- colonne image -->		
			<img alt="logo bootstrap" src="http://angel-pm.fr/wp-content/uploads/2018/12/logo-bootstrap.png" style="widht: 300px; height:200px">
		</div>
		<div class="col-8">
			<!-- colonne formulaire -->	
			<!-- enctype spécifie l'envoie de donner -->	
<form method="post" enctype="multipart/form-data">
  <div class="form-group row">
    <label for="article" class="col-sm-2 col-form-label mr-2">Article:</label>
    <div class="col-6">
      <input type="text" class="form-control" name="article" id="article" required="required">
    </div>
  </div>
  <div class="form-group row">
    <label for="description" class="col-sm-2 col-form-label mr-2">Description</label>
    <div class="col-6">
      <textarea class="form-control"  name="description" id="description" required="required"  rows="3"></textarea>
    </div>
  </div>
  
  <div class="form-group row">
  	<label for="categorie" class="col-sm-2 col-form-label mr-4">Categorie</label>
  		<div class="col-6">
    <select id="categorie" name="categorie" style="width: 91%; margin-top: 10px; margin-left: 15px;">
            <option value="Toutes">Toutes</option>
			<option value="Informatique">Informatique</option>
			<option value="Ameublement">Ameublement</option>
			<option value="Vêtement">Vêtement</option>
			<option value="Sport&Loisirs">Sport et Loisirs</option>
    </select>
    	</div>
  </div>
  
  <div class="form-group row">
  	<p class="mx-3" style="padding-top: 10px;">Photo de l'article</p>	
  		<label class="btn btn-primary ml-4" for="my-file-selector" style="width: 42%;">
    		<input id="my-file-selector" type="file" style="display:none" name="my-file-selector">
   			 UPLOADER
		</label>  	
  </div>
  
  <div class="form-group row">
  	<label for="prix" class="mx-3">Mise à prix:</label>
		<input type="number" id="tentacles" name="tentacles"min="1" max="100000" value="150" class="text-sm-right" style="margin-left: 65px;">
  </div>
  
  <div class="form-group row">
  		<label for="debut de l'enchere" id="debut de l'enchere" name="debut de l'enchere" class="mx-3">Début de l'enchère</label>
   		<input id="datepicker" width="250" class="ml-2" placeholder="/   /" />   
   		
		
 
    <script>
        $('#datepicker').datepicker({
            uiLibrary: 'bootstrap4'        
        });
    </script>
    </div>
    
    <div class="form-group row">
    	<label for="debut_d_enchere" name="debut_d_enchere" id="debut_d_enchere"  class="mx-3">Fin de l'enchère</label>
   		<input id="datepicker2" width="272" style="margin-left: 30px;" placeholder="/   /"  />
  
	<script>
        $('#datepicker2').datepicker({
            uiLibrary: 'bootstrap4'
        });
    </script>
    </div>
    

    
  <div class="form-group" style="border : solid 1px black; width: 66%; padding-top: 20px;">
   
    <div class="form-group row">
    	
    	<label class="col-form-label col-sm-2 pt-0 mx-2">Retrait</label></br>
    
     <div class="col-4 text-sm-left form-label">
		<div class="form-group row">
          <label class="col-sm-9 col-form-label" for="rue">Rue:</label>
          	<div class="col-sm-3">
          		<input  type="text" name="rue" id="rue" required="required">
          	</div>
         </div>
         
     	<div class="form-group row"> 
          	<label class="col-sm-9 col-form-label" for="code_postal">Code postal:</label>
          		<div class="col-sm-3">
          			<input  type="text" name="code_postal" id="rue" required="required">  
          		</div>
        </div>
     
     	<div class="form-group row">
          	<label class="col-sm-9 col-form-label" for="ville">Ville :</label>
          		<div class="col-sm-3">
          			<input  type="text" name="code_postal" id="ville" required="required">
          		</div> 
        </div>
     </div>
   </div>
 </div>
          

 
  <div class="form-group row upload">
    <div>
      <button type="submit" class="btn btn-primary btn-lg mx-3" name="enregistrer" id="enregistrer" style="padding: 50 px;">Enregistrer</button>
      <button type="submit" class="btn btn-danger btn-lg">Annuler</button>
    </div>
  </div>

</form>
			
		</div>
	</div>
</div>


</body>
</html>