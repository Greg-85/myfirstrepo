package fr.eni.encheres.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletInscription")
public class ServletInscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String jdbcURL = "jdbc:mysql://localhost:3306/enchere?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC\"";
		final String dbUser = "root";
		final String dbPassword = "root";
		
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	     String title = "Database Result";
	     out.println("<html>\n" +
	     "<head><title>" + title + "</title></head>\n" +
	     "<body bgcolor=\"#f0f0f0\">\n" +
	     "<h1 align=\"center\">" + title + "</h1>\n");
		
        try {
           System.out.println("je suis la");
           Class.forName("com.mysql.cj.jdbc.Driver");
           System.out.println("je suis la 1");
           Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
           System.out.println("je suis la 2");
           if (connection != null) {
        	   out.println("connected");
           }
           Statement stAddUser = connection.createStatement(); 
           ResultSet rs = stAddUser.executeQuery("Select * from categorie");
           
           while(rs.next()){
        	   out.println("ID: " + rs.getString("no_categorie"));
        	   out.println("Libele :" + rs.getString("libele"));
        	}
           out.println("</body></html>");
           
           
           rs.close();
           stAddUser.close();
           connection.close();
           
           
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       } catch (SQLException e) {
		e.printStackTrace();
       }
       
		
		
	  
	      
	}

}
