package fr.eni.encheres.dal;

import java.sql.*;

import fr.eni.encheres.dal.Utilisateur;

//import fr.eni.enchere.javaee.Utilisateur;

public class UserDAO {
 
 public Utilisateur checkLogin(String email, String motDePasse) throws SQLException,ClassNotFoundException {

 String jdbcURL = "jdbc:mysql://localhost:3306/enchere?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC\"";
 String dbUser = "root";
 String dbPassword = "root";

 Class.forName("com.mysql.jdbc.Driver");
 Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
 
 
 String sql = "SELECT * FROM utilisateur WHERE email = ? and mot_de_passe = ?";
 PreparedStatement statement = connection.prepareStatement(sql);
 statement.setString(1, email);
 statement.setString(2, motDePasse);

 ResultSet result = statement.executeQuery();

 Utilisateur utilisateur = null;

 if (result.next()) {
     utilisateur = new Utilisateur();
     utilisateur.setPseudo(result.getString("pseudo"));
     utilisateur.setEmail(email);
 }

 connection.close();

 return utilisateur;
}

}


