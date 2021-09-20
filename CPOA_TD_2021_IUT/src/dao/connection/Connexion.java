package dao.connection;

import static java.sql.DriverManager.getConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Connexion {

	public Connection creeConnexion() {
		String url = "jdbc:mysql://localhost:3306/cpoa_db";
		url += "?serverTimezone=Europe/Paris";
		String login = "root";
		String pwd = "root";
		Connection maConnexion = null;
		try {
			maConnexion = getConnection(url, login, pwd);
			System.out.println("Connection réussie");
		} catch (SQLException sqle) {
			System.out.println("Erreur connexion" + sqle.getMessage());
		}
		return maConnexion;
	}
}
