package dao.periodicite.mysql;

import java.util.ArrayList;
import java.util.List;

import dao.periodicite.IDaoPeriodicite;
import metier.Periodicite;

public class MySqlDaoPeriodicite implements IDaoPeriodicite {

	// Ajout de l'objet connection ...

	private static MySqlDaoPeriodicite instance;

	/* @return un objet de type MySqlDaoPeriodicite en singleton */
	public static MySqlDaoPeriodicite getInstance() {
		if (instance == null) {
			instance = new MySqlDaoPeriodicite();
		}
		System.out.println("Je suis en SQL");
		return instance;
	}

	@Override
	public Periodicite getById(int id) {
		// TODO Auto-generated method stub
		return null;
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
