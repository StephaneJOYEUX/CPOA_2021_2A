package metier;

/**
 * POJO
 * 
 * @author stephane.joyeux
 *
 */
public class Periodicite {

	private int id;
	private String libelle;

	public Periodicite(int id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public String getLibelle() {
		return libelle;
	}
}
