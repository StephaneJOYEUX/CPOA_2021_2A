package dao.periodicite.listememoire;

import dao.factory.DaoFactory;
import dao.periodicite.IDaoPeriodicite;
import dao.periodicite.listememoire.dao.ListeMemoireDao;

public class ListeMemoireDaoFactory extends DaoFactory {

	@Override
	public IDaoPeriodicite getPeriodiciteDao() {
		return ListeMemoireDao.getInstance();
	}
}
