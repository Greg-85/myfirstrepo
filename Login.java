package fr.eni.encheres.servlet;

import java.io.*;  
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		HttpSession session = request.getSession();
//		this.getServletContext().getRequestDispatcher( "/WEB-INF/Inscriptions.jsp" ).forward( request, response );
//		
//	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("pseudo");  
	    String p=request.getParameter("mdp");  
	          
	    if(p.equals("servlet")){  
	    	
	    	System.out.println("OK"); 
	        RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/jsp/Accueil.jsp");  
	        rd.include(request, response);  
	                      
	        }  
	    }  

}