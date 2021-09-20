package dao.periodicite.listememoire.dao;

import java.util.ArrayList;
import java.util.List;

import dao.periodicite.IDaoPeriodicite;
import metier.Periodicite;

/* Cette classe va simuler un accès à la DB. */
public class ListeMemoireDao implements IDaoPeriodicite {

	private static IDaoPeriodicite instance;

	private List<Periodicite> data;

	/* @return un objet de type IDaoPeriodicite en singleton. */
	public static IDaoPeriodicite getInstance() {
		if (instance == null) {
			instance = new ListeMemoireDao();
		}
		System.out.println("Je suis en mémoire");
		return instance;
	}

	private ListeMemoireDao() {
		if (data == null || data.isEmpty()) {
			data = new ArrayList<>();
			data.add(new Periodicite(1, "Journalière"));
			data.add(new Periodicite(2, "Hebdomadaire"));
			data.add(new Periodicite(3, "Mensuelle"));
			data.add(new Periodicite(4, "Annuelle"));
		}
	}

	@Override
	public Periodicite getById(int id) {
//		for (Periodicite periodicite : data) {
//			if (periodicite.getId() == id) {
//				return periodicite;
//			}
//		}
//		return null;
		int idx = this.data.indexOf(new Periodicite(id, "test"));
		if (idx == -1) {
			throw new IllegalArgumentException("Aucun objet ne possède cet identifiant");
		} else {
			return this.data.get(idx);
		}
	}

	@Override
	public List<Periodicite> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Periodicite objet) {
		return true;
	}

	@Override
	public boolean create(Periodicite objet) {
		objet.setId(3);
		// Ne fonctionne que si l'objet métier est bien fait...
		while (this.data.contains(objet)) {
			objet.setId(objet.getId() + 1);
		}
		return this.data.add(objet);
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
