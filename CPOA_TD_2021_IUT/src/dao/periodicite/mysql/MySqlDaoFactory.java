package dao.periodicite.mysql;

import dao.factory.DaoFactory;
import dao.periodicite.IDaoPeriodicite;

public class MySqlDaoFactory extends DaoFactory {

	@Override
	public IDaoPeriodicite getPeriodiciteDao() {
		return MySqlDaoPeriodicite.getInstance();
	}
}
