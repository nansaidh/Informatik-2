package de.hska.info.info2uebung.aufgabe5;

/**
 * class Beamter.
 * @author Melanie Wolf
 * Diese Klasse berechnet die zu leistende Hoehe der Steuern
 * und der Sozialabgaben des Einwohnertyps Beamter.
 */
public class Beamter extends Steuerpflichtiger {
	/**
	 * Standardkonstruktor zum Erzeugen eines Beamten.
	 */
	public Beamter() {
		this.setFreibetrag(0);
		this.setSteuerpflichtig(true);
		this.setSozialabgabenpflichtig(false);
		this.setJahreseinkommen(0);
	}
	
	/**
	 * Konstruktor zum Erzeugen eines Beamten mit Uebergabe
	 * vom Wert des Jahreseinkommens.
	 * @param jahreseinkommen Jahreseinkommen
	 */
	public Beamter(int jahreseinkommen) {
		this.setFreibetrag(0);
		this.setSteuerpflichtig(true);
		this.setSozialabgabenpflichtig(false);
		this.setJahreseinkommen(jahreseinkommen);
	}



}
