package be.ifosup.login;

import java.sql.*;

public class LoginDAO {
    public static boolean valide(String nom, String pass) {
        boolean action = false;
        /**
         * Tentative de chargement du driver
         */
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver OK");

        } catch (ClassNotFoundException e) {
            System.out.println("Pas trouvé le Driver");
        }
        /**
         * Connection a la base de données
         */
        String url = "jdbc:mysql://localhost:8889/JDKS";
        String user = "root";
        String password = "root";

        /**
         * Déclaration des différents objets pour la requête
         */
        Connection connection = null;
        Statement statement = null;
        ResultSet resultat = null;

        /**
         * Tentative de connection au moteur de DB
         */

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection OK");
        } catch (SQLException e) {
            System.out.println("Impossible de connecter à JDKS");
        }

        /**
         * Verification user
         */
        try {
            System.out.println(pass + nom);
            statement = connection.createStatement();
            PreparedStatement requete = connection.prepareStatement("SELECT * FROM login WHERE user =? and password =?");
            requete.setString(1, nom);
            requete.setString(2, pass);
            resultat = requete.executeQuery();
            if (resultat.next()) {
                action = true;
            }
        } catch (SQLException e) {
            System.out.println("Problème avec la requête");
        } finally {
            // fermeture de tout les objets
            if (resultat != null) {
                try {
                    resultat.close();
                } catch (SQLException ignore) {
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ignore) {
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ignore) {
                }
            }
        }
        return action;
    }
}