package fr.eni.encheres.bo;

import java.sql.Date;

// import com.sun.tools.javac.util.List;

public class ArticleVendu {
	
	private int noArticle;
	private String nomArticle;
	private String description;
	private Date dateDebutEncheres;
	private Date dateFinEncheres;
	private int miseAPRIX;
	private int prixVente;
	private boolean etatVente;
	
//	private List<Enchere> concerne;

	public ArticleVendu(int noArticle, String nomArticle, String description, Date dateDebutEncheres,
			Date dateFinEncheres, int miseAPRIX, int prixVente, boolean etatVente) {
	
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPRIX = miseAPRIX;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		
	}
	
	
}
