package fr.eni.encheres.dal;

import java.sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fr.eni.encheres.bo.Enchere;
import fr.eni.encheres.bo.Utilisateur;

public class UtilisateurjdbcDaoImpl implements UtilisateurDAO {
	
	private static final String INSERT= "INSERT INTO UTILISATEURS (pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit) VALUES (?,?,?,?,?,?,?,?,?,?,?);";

	@Override
	public void créer_un_compte(Utilisateur utilisateur) {
		Connection cnx = null;
		try {
			cnx = ConnectionProvider.getConnection();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		try {
		PreparedStatement ps = cnx.prepareStatement (INSERT, PreparedStatement.RETURN_GENERATED_KEYS);
		ps.setString(2, utilisateur.getPseudo());
		ps.setString(3, utilisateur.getNom());
		ps.setString(4, utilisateur.getPrenom());
		ps.setString(5, utilisateur.getEmail());
		ps.setString(6, utilisateur.getTelephone());
		ps.setString(7, utilisateur.getRue());
		ps.setString(8, utilisateur.getVille());
		ps.setString(9, utilisateur.getMotDePasse());
		ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();
		if(rs.next()) {
			utilisateur.setNoUtilisateur(1);
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void se_connecter(Utilisateur utilisateur) {
		Connection cnx = ConnectionProvider.getConnection();

		try {
		PreparedStatement ps = cnx.prepareStatement (SELECT * FROM UTILISATEURS WHERE  );
		ps.setString(2, utilisateur.getPseudo());
		ps.setString(3, utilisateur.getNom());
		ps.setString(4, utilisateur.getPrenom());
		ps.setString(5, utilisateur.getEmail());
		ps.setString(6, utilisateur.getTelephone());
		ps.setString(7, utilisateur.getRue());
		ps.setString(8, utilisateur.getVille());
		ps.setString(9, utilisateur.getMotDePasse());
		ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();
		if(rs.next()) {
			utilisateur.setNoUtilisateur(1);
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void se_deconnecter(Utilisateur utilisateur) {
	if(utilisateur == null) {
			
		}
		try(Connection cnx = ConnectionProvider.getConnection()) {
			
		}
		PreparedStatement ps = cnx.preparedStatement (PreparedStatement.RETURN_GENERATED_KEYS, INSERT);
		ps.setString(2, utilisateur.getPseudo());
		ps.setString(3, utilisateur.getNom());
		ps.setString(4, utilisateur.getPrenom());
		ps.setString(5, utilisateur.getEmail());
		ps.setString(6, utilisateur.getTelephone());
		ps.setString(7, utilisateur.getRue());
		ps.setString(8, utilisateur.getVille());
		ps.setString(9, utilisateur.getMotDePasse());
		ps.setInt(10, utilisateur.getCredit());
		ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();
		if(rs.next()) {
			utilisateur.setNoUtilisateur(1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void gerer_son_profil(fr.eni.encheres.bo.Utilisateur utilisateur) {
		
	}

	@Override
	public void voir_profil_autre_utilisateur(fr.eni.encheres.bo.Utilisateur utilisateur) {
		
	}

	@Override
	public void consulter_les_encheres(Enchere enchere) {
		
	}
}

	
