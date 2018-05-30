package de.hska.info.info2uebung.aufgabe5;

/**
 * class Steuerpflichtiger.
 * @author Melanie Wolf
 * Diese Klasse kann anhand verschiedener Steuersaetze die Sozialabgaben und Steuerabgaben 
 * verschiedener Einwohnertypen berechnen.
 */
public abstract class Steuerpflichtiger {
	private int jahreseinkommen;
	private boolean steuerpflichtig;
	private boolean sozialabgabenpflichtig;
	private int freibetrag;
	private static final double SOZIALABGABENSATZ = 0.28;
	
	/**
	 * Gibt den Wert des Jahreseinkommens zurueck.
	 * @return Jahreseinkommen
	 */
	public int getJahreseinkommen() {
		return this.jahreseinkommen;
	}
	
	/**
	 * Erlaubt das Aendern des Jahreseinkommens. 
	 * Jahreseinkommen kann nicht kleiner 0 sein.
	 * @param einkommen Einkommen
	 */
	public void setJahreseinkommen(int einkommen) {
		if (einkommen < 0) {
			throw new IllegalArgumentException("Jahreseinkommen darf nicht kleiner 0 sein!");
		}
		this.jahreseinkommen = einkommen;
	}
	
	/**
	 * Gibt zurueck, ob der Einwohnertyp steuerpflichtig ist oder nicht.
	 * @return steuerpflichtig
	 */
	public boolean getSteuerpflichtig() {
		return this.steuerpflichtig;
	}
	
	/**
	 * Erlaubt das Aendern, ob ein Einwohner Steuern zahlen muss oder nicht.
	 * @param steuerpflichtig steuerpflichtig
	 */
	public void setSteuerpflichtig(boolean steuerpflichtig) {
		this.steuerpflichtig = steuerpflichtig;
	}
	
	/**
	 * Gibt zurueck, ob ein Einwohner sozialabgabenpflichtig ist oder nicht.
	 * @return sozialabgabenpflichtig
	 */
	
	public boolean getSozialabgabenpflichtig() {
		return this.sozialabgabenpflichtig;
	}
	
	/**
	 * Erlaubt das Aendern, ob jemand sozialabgabenpflichtig ist oder nicht.
	 * @param sozialabgabenpflichtig sozialabgabenpflichtig
	 */
	public void setSozialabgabenpflichtig(boolean sozialabgabenpflichtig) {
		this.sozialabgabenpflichtig = sozialabgabenpflichtig;
	}
	
	/**
	 * Gibt den Wert des Freibetrags aus, den der Einwohner hat.
	 * @return Freibetrag
	 */
	public int getFreibetrag() {
		return this.freibetrag;
	}
	
	/**
	 * Erlaubt das Aendern des Freibetrags.
	 * Freibetrag darf nicht kleiner 0 gesetzt werden.
	 * @param freibetrag Freibetrag
	 */
	public void setFreibetrag(int freibetrag) {
		if (freibetrag < 0) {
			throw new IllegalArgumentException("Freibetrag darf nicht kleiner als 0 sein!");
		}
		this.freibetrag = freibetrag;
	}
	
	/**
	 * Ermittelt den abgerundeten Betrag, den der Einwohner an Steuern zu zahlen hat.
	 * @return Hoehe der Steuern
	 */
	public int getTax() {
		if (steuerpflichtig && (this.freibetrag < this.jahreseinkommen)) {
			return (int) (Math.floor(ermittleSteuersatz() * (this.jahreseinkommen - this.freibetrag)));
		}
		return 0;
	}
	
	/**
	 * Ermittelt den abgerundeten Betrag, den der Einwohner an Sozialabgaben leisten muss.
	 * @return Hoehe der Sozialabgaben
	 */
	public int getSocialTax() {
		if (this.sozialabgabenpflichtig) {
			return (int) (Math.floor(this.jahreseinkommen * SOZIALABGABENSATZ));
		}
		return 0;
	}
	
	private double ermittleSteuersatz() {
		double steuersatz;
		
		if (this.jahreseinkommen <= 12000) {
			steuersatz = 0.1;
		} else if (this.jahreseinkommen > 12000 && this.jahreseinkommen <= 24000) {
			steuersatz = 0.25;
		} else if (this.jahreseinkommen > 24000 && this.jahreseinkommen <= 50000) {
			steuersatz = 0.3;
		} else if (this.jahreseinkommen > 50000 && this.jahreseinkommen <= 75000) {
			steuersatz = 0.4;
		} else {
			steuersatz = 0.5;
		}
		
		return steuersatz;		
	}
	

}
