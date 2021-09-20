package main;

import static dao.factory.DaoFactory.getDaoFactory;
import static enumerations.EPersistance.LISTE_MEMOIRE;

import dao.factory.DaoFactory;
import dao.periodicite.IDaoPeriodicite;

public class StartProgramme {

	public static void main(String[] args) {
		DaoFactory daof = getDaoFactory(LISTE_MEMOIRE);
		IDaoPeriodicite dao = daof.getPeriodiciteDao();
		System.out.println(dao.getById(2));
//		Periodicite p1 = new Periodicite(1, "toto");
//		Periodicite p2 = new Periodicite(2, "toto");
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p1.equals(p2));
	}

}
