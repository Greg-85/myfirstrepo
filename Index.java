package fr.eni.encheres.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

import fr.eni.encheres.bll.UtilisateurManager;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.ConnectionProvider;
/**
 * Servlet implementation class Index
 */
@WebServlet("/PageAccueil")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dp = request.getRequestDispatcher("/jsp/Index.jsp");
        dp.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	
		String image = request.getParameter("image");
		String titre = request.getParameter("titre");
		String prix = request.getParameter("prix");
		String fin_enchere = request.getParameter("fin_enchere");
		String vendeur = request.getParameter("vendeur");
		 
		
		 try (Connection cnx = ConnectionProvider.getConnection()) {
	            String SELECT_LAST_ENCHERE = "SELECT nom_article, date_fin_encheres, prix_initial ,pseudo FROM BDD_ENCHERES.ARTICLES_VENDUS INNER JOIN UTILISATEURS ON ARTICLES_VENDUS.no_utilisateur = UTILISATEURS.pseudo ORDER BY date_debut_encheres DESC";
	            PreparedStatement statement = cnx.prepareStatement(SELECT_LAST_ENCHERE);
	            statement.setString(1, titre);
	            statement.setString(2, fin_enchere);
	            statement.setString(3, prix);
	            statement.setString(4, vendeur);
	            statement.executeUpdate();
	            
	          
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}