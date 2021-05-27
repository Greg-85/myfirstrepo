package fr.eni.encheres.bo;

import java.io.Serializable;

public class Acquereur  extends Utilisateur implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Acquereur acquereur = (Acquereur) new Utilisateur();
	private int faireUneEnchere = 0;
	private boolean acheterUnArticle = false;
	
	public Acquereur getAcquereur() {
		return acquereur;
	}
	public void setAcquereur(Acquereur acquereur) {
		this.acquereur = acquereur;
	}
	public int getFaireUneEnchere() {
		return faireUneEnchere;
	}
	public void setFaireUneEnchere(int faireUneEnchere) {
		this.faireUneEnchere = faireUneEnchere;
	}
	public boolean isAcheterUnArticle() {
		return acheterUnArticle;
	}
	public void setAcheterUnArticle(boolean acheterUnArticle) {
		this.acheterUnArticle = acheterUnArticle;
	}
	
	
	
	

}
