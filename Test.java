package fr.eni.encheres.bo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Test {

	public static void main(String[] args) throws SQLException{
		
		String jdbcURL = "jdbc:mysql://localhost:8889/BDD_ENCHERES?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String dbUser = "root";
		String dbPassword = "root";

		        try {
		        	Class.forName("com.mysql.cj.jdbc.Driver");

		        Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
		        Statement stAddUser = connection.createStatement();
		        //stAddUser.executeUpdate(strInsert);
		        ResultSet rs = stAddUser.executeQuery("Select * from CATEGORIES");
		        rs.next();
		        while(rs.next()){
		        	System.out.println(rs.getString("no_categorie"));
		        	System.out.println(rs.getString("libele"));
		        }          
		           
		           
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
		        if (connection != null) {
		            System.out.println("connected");
		        }
		 
	}
}


