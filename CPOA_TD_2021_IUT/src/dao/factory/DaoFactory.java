package dao.factory;

import dao.periodicite.IDaoPeriodicite;
import dao.periodicite.listememoire.ListeMemoireDaoFactory;
import dao.periodicite.mysql.MySqlDaoFactory;
import enumerations.EPersistance;

public abstract class DaoFactory {

	public static DaoFactory getDaoFactory(EPersistance cible) {
		DaoFactory daof = null;
		switch (cible) {
		case MYSQL:
			daof = new MySqlDaoFactory();
			break;
		case LISTE_MEMOIRE:
			daof = new ListeMemoireDaoFactory();
			break;
		default:
			break;
		}
		return daof;
	}

	public abstract IDaoPeriodicite getPeriodiciteDao();

}
