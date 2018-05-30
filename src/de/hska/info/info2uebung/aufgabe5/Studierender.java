package de.hska.info.info2uebung.aufgabe5;

/**
 * class Studierender.
 * @author Melanie Wolf
 * Diese Klasse berechnet die zu leistende Hoehe der Steuern
 * und der Sozialabgaben des Einwohnertyps Studierender.
 */
public class Studierender extends Steuerpflichtiger {
	
	/**
	 * Standardkonstruktor zum Erzeugen eines Studierenden.
	 */
	public Studierender() {
		this.setFreibetrag(6000);
		this.setSteuerpflichtig(true);
		this.setSozialabgabenpflichtig(false);
		this.setJahreseinkommen(0);
	}
	
	/**
	 * Konstruktor zum Erzeugen eines Studierenden mit Uebergabe
	 * vom Wert des Jahreseinkommens.
	 * @param jahreseinkommen Jahreseinkommen
	 */
	public Studierender(int jahreseinkommen) {
		this.setFreibetrag(6000);
		this.setSteuerpflichtig(true);
		this.setSozialabgabenpflichtig(false);
		this.setJahreseinkommen(jahreseinkommen);
	}

}
