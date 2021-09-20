package main;

import static dao.factory.DaoFactory.getDaoFactory;

import dao.factory.DaoFactory;
import dao.periodicite.IDaoPeriodicite;
import enumerations.EPersistance;

public class StartProgramme {

	public static void main(String[] args) {
		DaoFactory daof = getDaoFactory(EPersistance.MYSQL);
		IDaoPeriodicite dao = daof.getPeriodiciteDao();
		System.out.println(dao.getById(1));
//		System.out.println(dao.create(new Periodicite(7, "me")));
//		for (Periodicite periodicite : dao.getAll()) {
//			System.out.println(periodicite);
//		}
//		Periodicite p1 = new Periodicite(1, "toto");
//		Periodicite p2 = new Periodicite(2, "toto");
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p1.equals(p2));
	}

}
