package de.hska.info.info2uebung.aufgabe5;

/**
 * class Selbststaendiger.
 * @author Melanie Wolf
 * Diese Klasse berechnet die zu leistende Hoehe der Steuern
 * und der Sozialabgaben des Einwohnertyps Selbststaendiger.
 */
public class Selbststaendiger extends Steuerpflichtiger {

	/**
	 * Standardkonstruktor zum Erzeugen eines Selbststaendigen.
	 */
	public Selbststaendiger() {
		this.setFreibetrag(0);
		this.setSteuerpflichtig(true);
		this.setSozialabgabenpflichtig(false);
		this.setJahreseinkommen(0);
	}
	
	/**
	 * Konstruktor zum Erzeugen eines Selbststaendigen mit Uebergabe
	 * vom Wert des Jahreseinkommens.
	 * @param jahreseinkommen Jahreseinkommen
	 */
	public Selbststaendiger(int jahreseinkommen) {
		this.setFreibetrag(0);
		this.setSteuerpflichtig(true);
		this.setSozialabgabenpflichtig(false);
		this.setJahreseinkommen(jahreseinkommen);
	}

}
