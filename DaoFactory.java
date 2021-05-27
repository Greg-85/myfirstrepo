package fr.eni.encheres.dal;



public abstract class DaoFactory {
 

    // Récupération du Dao
    public static UtilisateurDAO getUtilisateurDAO() {
        return new UtilisateurjdbcDaoImpl();
    }
}
