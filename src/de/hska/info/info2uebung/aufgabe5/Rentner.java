package de.hska.info.info2uebung.aufgabe5;
/**
 * class Rentner.
 * @author Melanie Wolf
 * Diese Klasse berechnet die zu leistende Hoehe der Steuern
 * und der Sozialabgaben des Einwohnertyps Rentner.
 */
public class Rentner extends Steuerpflichtiger {

	/**
	 * Standardkonstruktor zum Erzeugen eines Rentners.
	 */
	public Rentner() {
		this.setFreibetrag(0);
		this.setSteuerpflichtig(false);
		this.setSozialabgabenpflichtig(false);
		this.setJahreseinkommen(0);
	}
	
	/**
	 * Konstruktor zum Erzeugen eines Rentners mit Uebergabe
	 * vom Wert des Jahreseinkommens.
	 * @param jahreseinkommen Jahreseinkommen
	 */
	public Rentner(int jahreseinkommen) {
		this.setFreibetrag(0);
		this.setSteuerpflichtig(false);
		this.setSozialabgabenpflichtig(false);
		this.setJahreseinkommen(jahreseinkommen);
	}
}
