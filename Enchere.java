package fr.eni.encheres.bo;

import java.sql.Date;

public class Enchere {
	
	private Date dateEnchère;
	private int montant_enchere;
	
	public Enchere(Date dateEnchère, int montant_enchere) {
		
		this.dateEnchère = dateEnchère;
		this.montant_enchere = montant_enchere;
	}
	
	

}
