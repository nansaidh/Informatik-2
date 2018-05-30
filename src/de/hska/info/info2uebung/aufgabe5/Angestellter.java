package de.hska.info.info2uebung.aufgabe5;

/**
 * class Angestellter.
 * @author Melanie Wolf
 * Diese Klasse berechnet die zu leistende Hoehe der Steuern
 * und der Sozialabgaben des Einwohnertyps Angestellter.
 */
public class Angestellter extends Steuerpflichtiger {
	
	/**
	 * Standardkonstruktor zum Erzeugen eines Angestellten. 
	 */
	public Angestellter() {
		this.setFreibetrag(12000);
		this.setSteuerpflichtig(true);
		this.setSozialabgabenpflichtig(true);
		this.setJahreseinkommen(0);
	}
	
	/**
	 * Konstruktor zum Erzeugen eines Angestellten mit Uebergabe
	 * vom Wert des Jahreseinkommens.
	 * @param jahreseinkommen Jahreseinkommen
	 */
	public Angestellter(int jahreseinkommen) {
		this.setFreibetrag(12000);
		this.setSteuerpflichtig(true);
		this.setSozialabgabenpflichtig(true);
		this.setJahreseinkommen(jahreseinkommen);
	}

}
