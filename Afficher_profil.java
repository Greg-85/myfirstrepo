package fr.eni.encheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Afficher_profil
 */
@WebServlet("/Afficher_profil")
public class Afficher_profil extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dp = request.getRequestDispatcher("/jsp/Afficher_profil.jsp");
        dp.forward(request, response);
        
        String Pseudo = request.getParameter("pseudo");
        String Nom = request.getParameter("nom");
        String Prénom = request.getParameter("prénom");
        String Email = request.getParameter("email");
        String Téléphone = request.getParameter("telephone");
        String Rue = request.getParameter("rue");
        String CodePostale = request.getParameter("codePostal");
        String Ville = request.getParameter("ville");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
