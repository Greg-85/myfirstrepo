package fr.eni.encheres.dal;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.bo.Enchere;

public interface UtilisateurDAO {
	
	void créer_un_compte(Utilisateur utilisateur );

	void se_connecter (Utilisateur utilisateur);
	
	void se_deconnecter (Utilisateur utilisateur);
	
	void gerer_son_profil (Utilisateur utilisateur);
	
	void voir_profil_autre_utilisateur (Utilisateur utilisateur);
	
	void consulter_les_encheres (Enchere enchere);
	
	
	
}
