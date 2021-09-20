package dao.periodicite;

import dao.IDao;
import metier.Periodicite;

public interface IDaoPeriodicite extends IDao<Periodicite> {

	String getByLibelle(String libelle);
}
