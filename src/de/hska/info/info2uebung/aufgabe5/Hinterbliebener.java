package de.hska.info.info2uebung.aufgabe5;

/**
 * class Hinterbliebener.
 * @author Melanie Wolf
 * Diese Klasse berechnet die zu leistende Hoehe der Steuern
 * und der Sozialabgaben des Einwohnertyps Hinterbliebener.
 */
public class Hinterbliebener extends Steuerpflichtiger {
	
	/**
	 * Standardkonstruktor zum Erzeugen eines Hinterbliebenen.
	 */
	public Hinterbliebener() {
		this.setFreibetrag(0);
		this.setSteuerpflichtig(false);
		this.setSozialabgabenpflichtig(true);
		this.setJahreseinkommen(0);
	}
	
	/**
	 * Konstruktor zum Erzeugen eines Hinterbliebenen mit Uebergabe
	 * vom Wert des Jahreseinkommens.
	 * @param jahreseinkommen Jahreseinkommen
	 */
	public Hinterbliebener(int jahreseinkommen) {
		this.setFreibetrag(0);
		this.setSteuerpflichtig(false);
		this.setSozialabgabenpflichtig(true);
		this.setJahreseinkommen(jahreseinkommen);
	}

}
