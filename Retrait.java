package fr.eni.encheres.bo;

public class Retrait {
	
	private String rue;
	private String code_postal;
	private String ville;
	
	private ArticleVendu av;

	public Retrait(String rue, String code_postal, String ville) {
		
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}
	
	

}
