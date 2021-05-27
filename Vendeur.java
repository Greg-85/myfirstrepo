package fr.eni.encheres.bo;

import java.io.Serializable;
import java.util.List;

public class Vendeur extends Utilisateur implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Vendeur vendeur = (Vendeur) new Utilisateur();
	private List<String>vente;
	private String vendreUnArticle;
	private boolean annulerUnevente = false;
	
	public Vendeur getVendeur() {
		return vendeur;
	}
	public void setVendeur(Vendeur vendeur) {
		this.vendeur = vendeur;
	}
	public List<String> getVente() {
		return vente;
	}
	public void setVente(List<String> vente) {
		this.vente = vente;
	}
	public String getVendreUnArticle() {
		return vendreUnArticle;
	}
	public void setVendreUnArticle(String vendreUnArticle) {
		this.vendreUnArticle = vendreUnArticle;
	}
	public boolean isAnnulerUnevente() {
		return annulerUnevente;
	}
	public void setAnnulerUnevente(boolean annulerUnevente) {
		this.annulerUnevente = annulerUnevente;
	}
	
	

}
