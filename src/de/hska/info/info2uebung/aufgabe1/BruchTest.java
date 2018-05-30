package de.hska.info.info2uebung.aufgabe1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BruchTest {
	
	/**
	 * Testet die Klasse getZaehler().
	 */
	@Test
	public void testGetZaehler() {
		Bruch bruch1 = new Bruch();
		assertEquals(1, bruch1.getZaehler());
		Bruch bruch2 = new Bruch(1, 2);
		assertEquals(1, bruch2.getZaehler());
		Bruch bruch3 = new Bruch(3, 5);
		assertEquals(3, bruch3.getZaehler());
		Bruch bruch4 = new Bruch(0, -7);
		assertEquals(0, bruch4.getZaehler());
		Bruch bruch5 = new Bruch(-1, 8);
		assertEquals(-1, bruch5.getZaehler());
	}
	
	/**
	 * Testet die Klasse getNenner().
	 */

	@Test
	public void testGetNenner() {
		Bruch bruch1 = new Bruch();
		assertEquals(1, bruch1.getNenner());
		Bruch bruch2 = new Bruch(1, 2);
		assertEquals(2, bruch2.getNenner());
		Bruch bruch3 = new Bruch(3, 5);
		assertEquals(5, bruch3.getNenner());
		Bruch bruch4 = new Bruch(0, -7);
		assertEquals(-7, bruch4.getNenner());
		Bruch bruch5 = new Bruch(-1, 8);
		assertEquals(8, bruch5.getNenner());
	}
	
	/**
	 * Testet die Klasse setZaehler(int zaehler).
	 */

	@Test
	public void testSetZaehler() {
		Bruch bruch = new Bruch();
		assertEquals(1, bruch.getZaehler());
		bruch.setZaehler(2);
		assertEquals(2, bruch.getZaehler());
		bruch.setZaehler(1);
		assertEquals(1, bruch.getZaehler());
		bruch.setZaehler(0);
		assertEquals(0, bruch.getZaehler());
		bruch.setZaehler(4);
		assertEquals(4, bruch.getZaehler());
		bruch.setZaehler(-4);
		assertEquals(-4, bruch.getZaehler());
	}
	
	/**
	 * Testet die Klasse setNenner(int nenner).
	 */

	@Test
	public void testSetNenner() {
		Bruch bruch = new Bruch();
		assertEquals(1, bruch.getNenner());
		bruch.setNenner(2);
		assertEquals(2, bruch.getNenner());
		bruch.setNenner(3);
		assertEquals(3, bruch.getNenner());
		bruch.setNenner(-10);
		assertEquals(-10, bruch.getNenner());
		bruch.setNenner(5);
		assertEquals(5, bruch.getNenner());
	}
	
	/**
	 * Testet die Klasse setNenner(int nenner) mit ungueltigem Uebergabewert.
	 */
	
	@Test (expected = IllegalArgumentException.class)
	public void testSetNennerIllegalArgumentException() {
		Bruch bruch = new Bruch(2, 9);
		assertEquals(9, bruch.getNenner());
		/*try {
			bruch.setNenner(0);
			fail(); //dieser Abschnitt wird niemals erreicht
		} catch (IllegalArgumentException expected) {
			assertEquals("Der Nenner darf nicht Null gesetzt werden!",
					     expected.getMessage());
		}*/
		bruch.setNenner(0);
	}
	
	/**
	 * Testet die Klasse addiereBrueche(Bruch bruch).
	 */

	@Test
	public void testAddiereBrueche1() {
		Bruch bruch1 = new Bruch();
		Bruch bruch2 = new Bruch(2, 1);
		Bruch ergebnis1 = bruch1.addiereBrueche(bruch2);
		assertEquals(3, ergebnis1.getZaehler());
		assertEquals(1, ergebnis1.getNenner());
		
		Bruch bruch3 = new Bruch(-1, 2);
		Bruch bruch4 = new Bruch(1, 2);
		Bruch ergebnis2 = bruch3.addiereBrueche(bruch4);
		assertEquals(0, ergebnis2.getZaehler());
		assertEquals(1, ergebnis2.getNenner());
		
		Bruch bruch5 = new Bruch(4, 2);
		Bruch bruch6 = new Bruch(1, 5);
		Bruch ergebnis3 = bruch5.addiereBrueche(bruch6);
		assertEquals(11, ergebnis3.getZaehler());
		assertEquals(5, ergebnis3.getNenner());
		
		Bruch bruch7 = new Bruch(-1, 2);
		Bruch bruch8 = new Bruch(1, 2);
		Bruch ergebnis4 = bruch7.addiereBrueche(bruch8);
		assertEquals(0, ergebnis4.getZaehler());
		assertEquals(1, ergebnis4.getNenner());
		
		Bruch bruch9 = new Bruch(-8, 11);
		Bruch bruch10 = new Bruch(-9, 5);
		Bruch ergebnis5 = bruch9.addiereBrueche(bruch10);
		assertEquals(-139, ergebnis5.getZaehler());
		assertEquals(55, ergebnis5.getNenner());
		
		Bruch bruch11 = new Bruch(8, 11);
		Bruch bruch12 = new Bruch(9, 5);
		Bruch ergebnis6 = bruch11.addiereBrueche(bruch12);
		assertEquals(139, ergebnis6.getZaehler());
		assertEquals(55, ergebnis6.getNenner());
		
		Bruch bruch13 = new Bruch(8, -11);
		Bruch bruch14 = new Bruch(-9, 5);
		Bruch ergebnis7 = bruch13.addiereBrueche(bruch14);
		assertEquals(139, ergebnis7.getZaehler());
		assertEquals(-55, ergebnis7.getNenner());
		
		
		
	}
	
	/**
	 * Testet die Klasse subtrahiereBrueche(Bruch bruch).
	 */
	

	@Test
	public void testSubtrahiereBruch1() {
		Bruch bruch1 = new Bruch();
		Bruch bruch2 = new Bruch(2, 1);
		Bruch ergebnis1 = bruch1.subtrahiereBrueche(bruch2);
		assertEquals(-1, ergebnis1.getZaehler());
		assertEquals(1, ergebnis1.getNenner());
		
		Bruch bruch3 = new Bruch(1, 2);
		Bruch bruch4 = new Bruch(1, 2);
		Bruch ergebnis2 = bruch3.subtrahiereBrueche(bruch4);
		assertEquals(0, ergebnis2.getZaehler());
		assertEquals(1, ergebnis2.getNenner());
		
		Bruch bruch5 = new Bruch(4, 2);
		Bruch bruch6 = new Bruch(1, 5);
		Bruch ergebnis3 = bruch5.subtrahiereBrueche(bruch6);
		assertEquals(9, ergebnis3.getZaehler());
		assertEquals(5, ergebnis3.getNenner());
		
		Bruch bruch7 = new Bruch(1, 2);
		Bruch bruch8 = new Bruch(-1, 2);
		Bruch ergebnis4 = bruch7.subtrahiereBrueche(bruch8);
		assertEquals(1, ergebnis4.getZaehler());
		assertEquals(1, ergebnis4.getNenner());
		
		Bruch bruch9 = new Bruch(-8, 11);
		Bruch bruch10 = new Bruch(-9, 5);
		Bruch ergebnis5 = bruch9.subtrahiereBrueche(bruch10);
		assertEquals(59, ergebnis5.getZaehler());
		assertEquals(55, ergebnis5.getNenner());
		
		Bruch bruch11 = new Bruch(8, 11);
		Bruch bruch12 = new Bruch(-9, 5);
		Bruch ergebnis6 = bruch11.subtrahiereBrueche(bruch12);
		assertEquals(139, ergebnis6.getZaehler());
		assertEquals(55, ergebnis6.getNenner());
		
		Bruch bruch13 = new Bruch(8, -11);
		Bruch bruch14 = new Bruch(-9, 5);
		Bruch ergebnis7 = bruch13.subtrahiereBrueche(bruch14);
		assertEquals(59, ergebnis7.getZaehler());
		assertEquals(55, ergebnis7.getNenner());
	}
	
	/**
	 * Testet die Klasse multipliziereBrueche(Bruch bruch).
	 */
	
	@Test
	public void testMultipliziereBruch() {
		Bruch bruch1 = new Bruch();
		Bruch bruch2 = new Bruch(0, 1);
		Bruch ergebnis1 = bruch1.multipliziereBrueche(bruch2);
		assertEquals(0, ergebnis1.getZaehler());
		assertEquals(1, ergebnis1.getNenner());
		
		Bruch bruch3 = new Bruch(5, 6);
		Bruch bruch4 = new Bruch(2, 4);
		Bruch ergebnis2 = bruch3.multipliziereBrueche(bruch4);
		assertEquals(5, ergebnis2.getZaehler());
		assertEquals(12, ergebnis2.getNenner());
		
		Bruch bruch5 = new Bruch(1, 2);
		Bruch bruch6 = new Bruch(-1, 4);
		Bruch ergebnis3 = bruch5.multipliziereBrueche(bruch6);
		assertEquals(-1, ergebnis3.getZaehler());
		assertEquals(8, ergebnis3.getNenner());
		
		Bruch bruch7 = new Bruch(-1, 2);
		Bruch bruch8 = new Bruch(-1, 2);
		Bruch ergebnis4 = bruch7.multipliziereBrueche(bruch8);
		assertEquals(1, ergebnis4.getZaehler());
		assertEquals(4, ergebnis4.getNenner());
		
		Bruch bruch9 = new Bruch(-3, 4);
		Bruch bruch10 = new Bruch(2, -3);
		Bruch ergebnis5 = bruch9.multipliziereBrueche(bruch10);
		assertEquals(1, ergebnis5.getZaehler());
		assertEquals(2, ergebnis5.getNenner());
	}
	
	/**
	 * Testet die Klasse dividiereBrueche(Bruch bruch).
	 */

	@Test
	public void testDividiereBruch() {
		Bruch bruch1 = new Bruch();
		Bruch bruch2 = new Bruch(2, 1);
		Bruch ergebnis1 = bruch1.dividiereBrueche(bruch2);
		assertEquals(1, ergebnis1.getZaehler());
		assertEquals(2, ergebnis1.getNenner());
		
		Bruch bruch3 = new Bruch(5, 6);
		Bruch bruch4 = new Bruch(2, 4);
		Bruch ergebnis2 = bruch3.dividiereBrueche(bruch4);
		assertEquals(5, ergebnis2.getZaehler());
		assertEquals(3, ergebnis2.getNenner());
		
		Bruch bruch5 = new Bruch(1, 2);
		Bruch bruch6 = new Bruch(-1, 4);
		Bruch ergebnis3 = bruch5.dividiereBrueche(bruch6);
		assertEquals(2, ergebnis3.getZaehler());
		assertEquals(-1, ergebnis3.getNenner());
		
		Bruch bruch7 = new Bruch(-1, 2);
		Bruch bruch8 = new Bruch(-1, 2);
		Bruch ergebnis4 = bruch7.dividiereBrueche(bruch8);
		assertEquals(1, ergebnis4.getZaehler());
		assertEquals(1, ergebnis4.getNenner());
		
		Bruch bruch9 = new Bruch(-3, 4);
		Bruch bruch10 = new Bruch(2, -3);
		Bruch ergebnis5 = bruch9.dividiereBrueche(bruch10);
		assertEquals(9, ergebnis5.getZaehler());
		assertEquals(8, ergebnis5.getNenner());
	}
	
	/**
	 * Testet die Klasse dividiereBrueche(Bruch bruch) mit ungueltigem Ergebnis.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testDividiereBruchIllegalArgumentException() {
		Bruch bruch1 = new Bruch(2, 3);
		Bruch bruch2 = new Bruch(0, 1);
		Bruch ergebnis1 = bruch1.dividiereBrueche(bruch2);
	}
	
}
