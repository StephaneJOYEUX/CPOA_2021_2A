package dao.periodicite.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.connection.Connexion;
import dao.periodicite.IDaoPeriodicite;
import metier.Periodicite;

public class MySqlDaoPeriodicite implements IDaoPeriodicite {

	// Ajout de l'objet connection ...

	private static MySqlDaoPeriodicite instance;
	private Connexion connexion;

	/* @return un objet de type MySqlDaoPeriodicite en singleton */
	public static MySqlDaoPeriodicite getInstance() {
		if (instance == null) {
			instance = new MySqlDaoPeriodicite();
		}
		System.out.println("Je suis en SQL");
		return instance;
	}

	private MySqlDaoPeriodicite() {
		connexion = new Connexion();
	}

	@Override
	public Periodicite getById(int id) {
		Periodicite p = null;
		try {
			Connection laConnexion = connexion.creeConnexion();
			Statement requete = laConnexion.createStatement();
			ResultSet res = requete.executeQuery("select * from periodicite");
			while (res.next()) {
				p = new Periodicite(res.getInt(1), res.getString("libelle"));
			}
		} catch (SQLException sqle) {
			System.out.println("Pb select" + sqle.getMessage());
		}
		return p;
	}

	@Override
	public List<Periodicite> getAll() {
		List<Periodicite> liste = new ArrayList<>();
		// operation de Select // preparestatement
//		while rest.next() {
//			liste.add(new Periodicite(res.getId, rest.getlibbe));
//		}
		// TODO Auto-generated method stub
		return liste;
	}

	@Override
	public boolean update(Periodicite objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean create(Periodicite objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Periodicite objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

}
