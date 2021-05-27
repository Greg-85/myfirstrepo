package fr.eni.encheres.bll;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.DaoFactory;
import fr.eni.encheres.dal.UtilisateurDAO;
import fr.eni.encheres.dal.UtilisateurjdbcDaoImpl;

	
	public class UtilisateurManager {

		private static UtilisateurDAO utilisateurDAO = new UtilisateurjdbcDaoImpl();
		//private static Utilisateur utilisateur = new Utilisateur();


		public UtilisateurManager() {
			UtilisateurManager.utilisateurDAO = DaoFactory.getUtilisateurDAO();
		}

		
		public static Utilisateur selectByPseudo (String pseudo) {
			//pseudo =pseudo.trim();
			return utilisateurDAO.selectByPseudo(pseudo);
		
	}

}
