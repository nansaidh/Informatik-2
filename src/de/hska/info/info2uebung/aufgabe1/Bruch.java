package de.hska.info.info2uebung.aufgabe1;

/**
 * class Bruch.
 * @author Melanie Wolf
 * Diese Klasse erzeugt Brueche und erlaubt einfache Operationen mit ihnen.
 */

public class Bruch {

	private int zaehler;
	private int nenner;
	
	/**
	 * Standardkonstruktor zum Erzeugen eines Bruches. 
	 */
	public Bruch() {
		this.zaehler = 1;
		this.nenner = 1;
	}
	
	/**
	 * Konstruktor zum Erzeugen eines Bruches mit Uebergabe von
	 * Zaehler und Nenner; Nenner darf nicht Null sein.
	 * @param zaehler Zaehler
	 * @param nenner Nenner
	 */	
	public Bruch(int zaehler, int nenner) {
		
		this.zaehler = zaehler;
		
		if (nenner == 0) {
			throw new IllegalArgumentException("Nenner darf nicht 0 sein!");
		}
		
		this.nenner = nenner;
	
	}
	
	/**
	 * Gibt Wert des Zaehlers zurück.
	 * @return Zaehler
	 */
	public int getZaehler() {
		return this.zaehler;
	}
	
	/**
	 * Gibt Wert des Nenners zurück.
	 * @return Nenner
	 */
	public int getNenner() {
		return this.nenner;
	}
	
	/**
	 * Erlaubt das Setzen des Zaehlerwertes.
	 * @param zaehler Zaehler
	 */
	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}
	
	/**
	 * Erlaubt das Setzen des Nennerwertes. Die Zahl Null ist dabei unzulässig.
	 * @param nenner Nenner
	 */
	public void setNenner(int nenner) {
		if (nenner == 0) {
			throw new IllegalArgumentException("Der Nenner darf nicht Null gesetzt werden!");
		}
		this.nenner = nenner;
	}
	
	/**
	 * Klasse zum Addieren von zwei Bruechen.
	 * @param bruch zweiter Bruch
	 * @return ergebnis gekuerzter Bruch als Ergebnis
	 */
	public Bruch addiereBrueche(Bruch bruch) {
		Bruch ergebnis = new Bruch();
		ergebnis.zaehler = (this.zaehler * bruch.nenner) + (bruch.zaehler * this.nenner);
		ergebnis.nenner = this.nenner * bruch.nenner;
		return ergebnis.kuerzeBruch(ergebnis.zaehler, ergebnis.nenner);
	}
	
	/**
	 * Klasse zum Subtrahieren von zwei Bruechen.
	 * @param bruch zweiter Bruch
	 * @return ergebnis gekuerzter Bruch als Ergebnis
	 */
	public Bruch subtrahiereBrueche(Bruch bruch) {
		Bruch ergebnis = new Bruch();
		ergebnis.zaehler = (this.zaehler * bruch.nenner) - (bruch.zaehler * this.nenner);
		ergebnis.nenner = this.nenner * bruch.nenner;
		return ergebnis.kuerzeBruch(ergebnis.zaehler, ergebnis.nenner);
	}
	
	/**
	 * Klasse zum Multiplizieren von zwei Bruechen.
	 * @param bruch zweiter Bruch
	 * @return ergebnis gekuerzter Bruch als Ergebnis
	 */
	public Bruch multipliziereBrueche(Bruch bruch) {
		Bruch ergebnis = new Bruch();
		ergebnis.zaehler = this.zaehler * bruch.zaehler;
		ergebnis.nenner = this.nenner * bruch.nenner;
		return ergebnis.kuerzeBruch(ergebnis.zaehler, ergebnis.nenner);
	}
	
	/**
	 * Klasse zum Dividieren von zwei Bruechen.
	 * @param bruch zweiter Bruch
	 * @return ergebnis gekuerzter Bruch als Ergebnis
	 */
	public Bruch dividiereBrueche(Bruch bruch) {
		Bruch ergebnis = new Bruch();
		if (bruch.zaehler == 0) {
			throw new IllegalArgumentException("Nenner darf nicht 0 werden");
		}
		ergebnis.zaehler = this.zaehler * bruch.nenner;
		ergebnis.nenner = this.nenner * bruch.zaehler;
		return ergebnis.kuerzeBruch(ergebnis.zaehler, ergebnis.nenner);
	}
	
	/**
	 * Klasse zum Kuerzen eines Bruches.
	 * @param zaehler Zaehler
	 * @param nenner Nenner
	 * @return gekuerzterBruch gekuerzter Bruch
	 */
	private Bruch kuerzeBruch(int zaehler, int nenner) {
		Bruch gekuerzterBruch = new Bruch();
		int x = ermittleGGT(zaehler, nenner);
		gekuerzterBruch.zaehler = this.zaehler / x;
		gekuerzterBruch.nenner = this.nenner / x;
		if (gekuerzterBruch.zaehler < 0 && gekuerzterBruch.nenner < 0) {
			gekuerzterBruch.zaehler = Math.abs(gekuerzterBruch.zaehler);
			gekuerzterBruch.nenner = Math.abs(gekuerzterBruch.nenner);
		}
		return gekuerzterBruch;
	}
	
	/**
	 * Klasse zum Ermitteln des groeßten gemeinsamen Teilers zweier Zahlen.
	 * @param zahl1 Erste Zahl (hier immer Zaehler)
	 * @param zahl2 Zweite Zahl (hier immer Nenner)
	 * @return zahl1 Groeßter gemeinsamer Teiler
	 */
	private int ermittleGGT(int zahl1, int zahl2) {
		if (zahl1 == 0) {
			return zahl2;
		}
		zahl1 = Math.abs(zahl1);  //wandelt negative in positive Zahlen um
		zahl2 = Math.abs(zahl2);
		
		while (zahl1 != zahl2) {
			if (zahl1 > zahl2) {
				zahl1 = zahl1 - zahl2;
			} else {
				zahl2 = zahl2 - zahl1;
			}
		}
		return zahl1;
	}
	
}