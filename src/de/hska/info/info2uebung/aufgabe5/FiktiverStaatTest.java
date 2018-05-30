package de.hska.info.info2uebung.aufgabe5;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiktiverStaatTest {
	
	/**
	 * Testet die Methode getJahreseinkommen().
	 */
	@Test
	public void testGetJahreseinkommen() {
		Studierender s1 = new Studierender();
		assertEquals(0, s1.getJahreseinkommen());
		
		Studierender s2 = new Studierender(6000);
		assertEquals(6000, s2.getJahreseinkommen());
		
		Studierender s3 = new Studierender(12000);
		assertEquals(12000, s3.getJahreseinkommen());
		
		Angestellter a1 = new Angestellter();
		assertEquals(0, a1.getJahreseinkommen());
		Angestellter a2 = new Angestellter(12000);
		assertEquals(12000, a2.getJahreseinkommen());
		Angestellter a3 = new Angestellter(30000);
		assertEquals(30000, a3.getJahreseinkommen());
		
		Beamter b1 = new Beamter();
		assertEquals(0, b1.getJahreseinkommen());
		Beamter b2 = new Beamter(12000);
		assertEquals(12000, b2.getJahreseinkommen());
		Beamter b3 = new Beamter(75001);
		assertEquals(75001, b3.getJahreseinkommen());
		
		Selbststaendiger se1 = new Selbststaendiger();
		assertEquals(0, se1.getJahreseinkommen());
		Selbststaendiger se2 = new Selbststaendiger(24000);
		assertEquals(24000, se2.getJahreseinkommen());
		Selbststaendiger se3 = new Selbststaendiger(24001);
		assertEquals(24001, se3.getJahreseinkommen());
		
		Hinterbliebener h1 = new Hinterbliebener();
		assertEquals(0, h1.getJahreseinkommen());
		Hinterbliebener h2 = new Hinterbliebener(50000);
		assertEquals(50000, h2.getJahreseinkommen());
		Hinterbliebener h3 = new Hinterbliebener(50001);
		assertEquals(50001, h3.getJahreseinkommen());
		
		Rentner r1 = new Rentner();
		assertEquals(0, r1.getJahreseinkommen());
		Rentner r2 = new Rentner(12000);
		assertEquals(12000, r2.getJahreseinkommen());
		Rentner r3 = new Rentner(30000);
		assertEquals(30000, r3.getJahreseinkommen());
	
	}
	
	/**
	 * Testet die Methode setJahreseinkommen(int jahreseinkommen).
	 */
	@Test
	public void testSetJahreseinkommen() {
		Studierender s1 = new Studierender();
		s1.setJahreseinkommen(5000);
		assertEquals(5000, s1.getJahreseinkommen());
		
		Studierender s2 = new Studierender(6000);
		s2.setJahreseinkommen(0);
		assertEquals(0, s2.getJahreseinkommen());
		
		Studierender s3 = new Studierender(12000);
		s3.setJahreseinkommen(700);
		assertEquals(700, s3.getJahreseinkommen());
		
		Angestellter a1 = new Angestellter();
		a1.setJahreseinkommen(700);
		assertEquals(700, a1.getJahreseinkommen());
		
		Angestellter a2 = new Angestellter(12000);
		a2.setJahreseinkommen(65000);
		assertEquals(65000, a2.getJahreseinkommen());
		
		Angestellter a3 = new Angestellter(30000);
		a3.setJahreseinkommen(1000);
		assertEquals(1000, a3.getJahreseinkommen());
		
		Beamter b1 = new Beamter();
		b1.setJahreseinkommen(70000);
		assertEquals(70000, b1.getJahreseinkommen());
		
		Beamter b2 = new Beamter(12000);
		b2.setJahreseinkommen(13000);
		assertEquals(13000, b2.getJahreseinkommen());
		
		Beamter b3 = new Beamter(75001);
		b3.setJahreseinkommen(80000);
		assertEquals(80000, b3.getJahreseinkommen());
		
		Selbststaendiger se1 = new Selbststaendiger();
		se1.setJahreseinkommen(0);
		assertEquals(0, se1.getJahreseinkommen());
		
		Selbststaendiger se2 = new Selbststaendiger(24000);
		se2.setJahreseinkommen(6000);
		assertEquals(6000, se2.getJahreseinkommen());
		
		Selbststaendiger se3 = new Selbststaendiger(24001);
		se3.setJahreseinkommen(25000);
		assertEquals(25000, se3.getJahreseinkommen());
		
		Hinterbliebener h1 = new Hinterbliebener();
		h1.setJahreseinkommen(2500);
		assertEquals(2500, h1.getJahreseinkommen());
		
		Hinterbliebener h2 = new Hinterbliebener(50000);
		h2.setJahreseinkommen(250);
		assertEquals(250, h2.getJahreseinkommen());
		
		Hinterbliebener h3 = new Hinterbliebener(50001);
		h3.setJahreseinkommen(5000);
		assertEquals(5000, h3.getJahreseinkommen());
		
		Rentner r1 = new Rentner();
		r1.setJahreseinkommen(80000);
		assertEquals(80000, r1.getJahreseinkommen());
		
		Rentner r2 = new Rentner(12000);
		r2.setJahreseinkommen(9000);
		assertEquals(9000, r2.getJahreseinkommen());
		
		Rentner r3 = new Rentner(30000);
		r3.setJahreseinkommen(16000);
		assertEquals(16000, r3.getJahreseinkommen());
	}
	
	/**
	 * Testet die Methode setJahreseinkommen(int jahreseinkommen) mit nicht erlaubtem 
	 * Mitgabewert.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testSetJahreseinkommenIllegalArgumentException() {
		Studierender s1 = new Studierender();
		s1.setJahreseinkommen(-5000);
		
		Angestellter a1 = new Angestellter();
		a1.setJahreseinkommen(-700);
		
		Beamter b1 = new Beamter();
		b1.setJahreseinkommen(-70000);
		
		Selbststaendiger se1 = new Selbststaendiger();
		se1.setJahreseinkommen(-12000);
		
		Hinterbliebener h1 = new Hinterbliebener();
		h1.setJahreseinkommen(-2500);
		
		Rentner r1 = new Rentner();
		r1.setJahreseinkommen(-80000);
		
		
	}
	
	/**
	 * Testet die Methode getSteuerpflichtig().
	 */
	@Test
	public void testGetSteuerpflichtig() {
		Studierender s1 = new Studierender();
		assertTrue(s1.getSteuerpflichtig());
		
		Studierender s2 = new Studierender(6000);
		assertTrue(s2.getSteuerpflichtig());
		
		Studierender s3 = new Studierender(12000);
		assertTrue(s3.getSteuerpflichtig());
		
		Angestellter a1 = new Angestellter();
		assertTrue(a1.getSteuerpflichtig());
		
		Angestellter a2 = new Angestellter(12000);
		assertTrue(a2.getSteuerpflichtig());
		
		Angestellter a3 = new Angestellter(30000);
		assertTrue(a3.getSteuerpflichtig());
		
		Beamter b1 = new Beamter();
		assertTrue(b1.getSteuerpflichtig());
		
		Beamter b2 = new Beamter(12000);
		assertTrue(b2.getSteuerpflichtig());
		
		Beamter b3 = new Beamter(75001);
		assertTrue(b3.getSteuerpflichtig());
		
		Selbststaendiger se1 = new Selbststaendiger();
		assertTrue(se1.getSteuerpflichtig());
		
		Selbststaendiger se2 = new Selbststaendiger(24000);
		assertTrue(se2.getSteuerpflichtig());
		
		Selbststaendiger se3 = new Selbststaendiger(24001);
		assertTrue(se3.getSteuerpflichtig());
		
		Hinterbliebener h1 = new Hinterbliebener();
		assertFalse(h1.getSteuerpflichtig());
		
		Hinterbliebener h2 = new Hinterbliebener(50000);
		assertFalse(h2.getSteuerpflichtig());
		
		Hinterbliebener h3 = new Hinterbliebener(50001);
		assertFalse(h3.getSteuerpflichtig());
		
		Rentner r1 = new Rentner();
		assertFalse(r1.getSteuerpflichtig());
		
		Rentner r2 = new Rentner(12000);
		assertFalse(r2.getSteuerpflichtig());
		
		Rentner r3 = new Rentner(30000);
		assertFalse(r3.getSteuerpflichtig());
	}
	
	/**
	 * Testet die Methode setSteuerpflichtig(boolean steuerpflichtig).
	 */
	@Test
	public void testSetSteuerpflichtig() {
		Studierender s1 = new Studierender();
		s1.setSteuerpflichtig(false);
		assertFalse(s1.getSteuerpflichtig());
		s1.setSteuerpflichtig(true);
		assertTrue(s1.getSteuerpflichtig());
		
		Studierender s2 = new Studierender(6000);
		s2.setSteuerpflichtig(true);
		assertTrue(s2.getSteuerpflichtig());
		s2.setSteuerpflichtig(false);
		assertFalse(s2.getSteuerpflichtig());
		
		
		Studierender s3 = new Studierender(12000);
		s3.setSteuerpflichtig(false);
		assertFalse(s3.getSteuerpflichtig());
		s3.setSteuerpflichtig(false);
		assertFalse(s3.getSteuerpflichtig());
		
		Angestellter a1 = new Angestellter();
		a1.setSteuerpflichtig(false);
		assertFalse(a1.getSteuerpflichtig());
		a1.setSteuerpflichtig(true);
		assertTrue(a1.getSteuerpflichtig());
		
		Angestellter a2 = new Angestellter(12000);
		a2.setSteuerpflichtig(true);
		assertTrue(a2.getSteuerpflichtig());
		a2.setSteuerpflichtig(false);
		assertFalse(a2.getSteuerpflichtig());
		
		Angestellter a3 = new Angestellter(30000);
		a3.setSteuerpflichtig(false);
		assertFalse(a3.getSteuerpflichtig());
		a3.setSteuerpflichtig(false);
		assertFalse(a3.getSteuerpflichtig());
		
		Beamter b1 = new Beamter();
		b1.setSteuerpflichtig(false);
		assertFalse(b1.getSteuerpflichtig());
		b1.setSteuerpflichtig(true);
		assertTrue(b1.getSteuerpflichtig());
		
		Beamter b2 = new Beamter(12000);
		b2.setSteuerpflichtig(true);
		assertTrue(b2.getSteuerpflichtig());
		b2.setSteuerpflichtig(false);
		assertFalse(b2.getSteuerpflichtig());
		
		Beamter b3 = new Beamter(75001);
		b3.setSteuerpflichtig(false);
		assertFalse(b3.getSteuerpflichtig());
		b3.setSteuerpflichtig(false);
		assertFalse(b3.getSteuerpflichtig());
		
		Selbststaendiger se1 = new Selbststaendiger();
		se1.setSteuerpflichtig(false);
		assertFalse(se1.getSteuerpflichtig());
		se1.setSteuerpflichtig(true);
		assertTrue(se1.getSteuerpflichtig());
		
		Selbststaendiger se2 = new Selbststaendiger(24000);
		se2.setSteuerpflichtig(true);
		assertTrue(se2.getSteuerpflichtig());
		se2.setSteuerpflichtig(false);
		assertFalse(se2.getSteuerpflichtig());
		
		Selbststaendiger se3 = new Selbststaendiger(24001);
		se3.setSteuerpflichtig(false);
		assertFalse(se3.getSteuerpflichtig());
		se3.setSteuerpflichtig(false);
		assertFalse(se3.getSteuerpflichtig());
		
		Hinterbliebener h1 = new Hinterbliebener();
		h1.setSteuerpflichtig(false);
		assertFalse(h1.getSteuerpflichtig());
		h1.setSteuerpflichtig(true);
		assertTrue(h1.getSteuerpflichtig());
		
		Hinterbliebener h2 = new Hinterbliebener(50000);
		h2.setSteuerpflichtig(true);
		assertTrue(h2.getSteuerpflichtig());
		h2.setSteuerpflichtig(false);
		assertFalse(h2.getSteuerpflichtig());
		
		Hinterbliebener h3 = new Hinterbliebener(50001);
		h3.setSteuerpflichtig(false);
		assertFalse(h3.getSteuerpflichtig());
		h3.setSteuerpflichtig(false);
		assertFalse(h3.getSteuerpflichtig());
		
		Rentner r1 = new Rentner();
		r1.setSteuerpflichtig(false);
		assertFalse(r1.getSteuerpflichtig());
		r1.setSteuerpflichtig(true);
		assertTrue(r1.getSteuerpflichtig());
		
		Rentner r2 = new Rentner(12000);
		r2.setSteuerpflichtig(true);
		assertTrue(r2.getSteuerpflichtig());
		r2.setSteuerpflichtig(false);
		assertFalse(r2.getSteuerpflichtig());
		
		Rentner r3 = new Rentner(30000);
		r3.setSteuerpflichtig(false);
		assertFalse(r3.getSteuerpflichtig());
		r3.setSteuerpflichtig(false);
		assertFalse(r3.getSteuerpflichtig());
	}
	
	/**
	 * Testet die Methode getSozialabgabenpflichtig().
	 */
	@Test
	public void testGetSozialabgabenpflichtig() {
		Studierender s1 = new Studierender();
		assertFalse(s1.getSozialabgabenpflichtig());
		
		Studierender s2 = new Studierender(6000);
		assertFalse(s2.getSozialabgabenpflichtig());
		
		Studierender s3 = new Studierender(12000);
		assertFalse(s3.getSozialabgabenpflichtig());
		
		Angestellter a1 = new Angestellter();
		assertTrue(a1.getSozialabgabenpflichtig());
		
		Angestellter a2 = new Angestellter(12000);
		assertTrue(a2.getSozialabgabenpflichtig());
		
		Angestellter a3 = new Angestellter(30000);
		assertTrue(a3.getSozialabgabenpflichtig());
		
		Beamter b1 = new Beamter();
		assertFalse(b1.getSozialabgabenpflichtig());
		
		Beamter b2 = new Beamter(12000);
		assertFalse(b2.getSozialabgabenpflichtig());
		
		Beamter b3 = new Beamter(75001);
		assertFalse(b3.getSozialabgabenpflichtig());
		
		Selbststaendiger se1 = new Selbststaendiger();
		assertFalse(se1.getSozialabgabenpflichtig());
		
		Selbststaendiger se2 = new Selbststaendiger(24000);
		assertFalse(se2.getSozialabgabenpflichtig());
		
		Selbststaendiger se3 = new Selbststaendiger(24001);
		assertFalse(se3.getSozialabgabenpflichtig());
		
		Hinterbliebener h1 = new Hinterbliebener();
		assertTrue(h1.getSozialabgabenpflichtig());
		
		Hinterbliebener h2 = new Hinterbliebener(50000);
		assertTrue(h2.getSozialabgabenpflichtig());
		
		Hinterbliebener h3 = new Hinterbliebener(50001);
		assertTrue(h3.getSozialabgabenpflichtig());
		
		Rentner r1 = new Rentner();
		assertFalse(r1.getSozialabgabenpflichtig());
		
		Rentner r2 = new Rentner(12000);
		assertFalse(r2.getSozialabgabenpflichtig());
		
		Rentner r3 = new Rentner(30000);
		assertFalse(r3.getSozialabgabenpflichtig());
	}
	
	/**
	 * Testet die Methode setSozialabgabenpflichtig(boolean sozialabgabenpflichtig).
	 */
	@Test
	public void testSetSozialabgabenpflichtig() {
		Studierender s1 = new Studierender();
		s1.setSozialabgabenpflichtig(true);
		assertTrue(s1.getSozialabgabenpflichtig());
		s1.setSozialabgabenpflichtig(false);
		assertFalse(s1.getSozialabgabenpflichtig());
		
		Studierender s2 = new Studierender(6000);
		s2.setSozialabgabenpflichtig(false);
		assertFalse(s2.getSozialabgabenpflichtig());
		s2.setSozialabgabenpflichtig(true);
		assertTrue(s2.getSozialabgabenpflichtig());
		
		Angestellter a1 = new Angestellter();
		a1.setSozialabgabenpflichtig(false);
		assertFalse(a1.getSozialabgabenpflichtig());
		a1.setSozialabgabenpflichtig(true);
		assertTrue(a1.getSozialabgabenpflichtig());
		
		Angestellter a2 = new Angestellter(12000);
		a2.setSozialabgabenpflichtig(true);
		assertTrue(a2.getSozialabgabenpflichtig());
		a2.setSozialabgabenpflichtig(false);
		assertFalse(a2.getSozialabgabenpflichtig());
		
		Beamter b1 = new Beamter();
		b1.setSozialabgabenpflichtig(true);
		assertTrue(b1.getSozialabgabenpflichtig());
		b1.setSozialabgabenpflichtig(false);
		assertFalse(b1.getSozialabgabenpflichtig());
		
		Beamter b2 = new Beamter(12000);
		b2.setSozialabgabenpflichtig(false);
		assertFalse(b2.getSozialabgabenpflichtig());
		b2.setSozialabgabenpflichtig(true);
		assertTrue(b2.getSozialabgabenpflichtig());
		
		Selbststaendiger se1 = new Selbststaendiger();
		se1.setSozialabgabenpflichtig(true);
		assertTrue(se1.getSozialabgabenpflichtig());
		se1.setSozialabgabenpflichtig(false);
		assertFalse(se1.getSozialabgabenpflichtig());
		
		Selbststaendiger se2 = new Selbststaendiger(24000);
		se2.setSozialabgabenpflichtig(false);
		assertFalse(se2.getSozialabgabenpflichtig());
		se2.setSozialabgabenpflichtig(true);
		assertTrue(se2.getSozialabgabenpflichtig());
		
		Hinterbliebener h1 = new Hinterbliebener();
		h1.setSozialabgabenpflichtig(true);
		assertTrue(h1.getSozialabgabenpflichtig());
		h1.setSozialabgabenpflichtig(false);
		assertFalse(h1.getSozialabgabenpflichtig());
		
		Hinterbliebener h2 = new Hinterbliebener(50000);
		h2.setSozialabgabenpflichtig(false);
		assertFalse(h2.getSozialabgabenpflichtig());
		h2.setSozialabgabenpflichtig(true);
		assertTrue(h2.getSozialabgabenpflichtig());
		
		Rentner r1 = new Rentner();
		r1.setSozialabgabenpflichtig(true);
		assertTrue(r1.getSozialabgabenpflichtig());
		r1.setSozialabgabenpflichtig(false);
		assertFalse(r1.getSozialabgabenpflichtig());
		
		Rentner r2 = new Rentner(12000);		
		r2.setSozialabgabenpflichtig(false);
		assertFalse(r2.getSozialabgabenpflichtig());
		r2.setSozialabgabenpflichtig(true);
		assertTrue(r2.getSozialabgabenpflichtig());
	}
	
	/**
	 * Testet die Methode getFreibetrag().
	 */
	@Test
	public void testGetFreibetrag() {
		Studierender s1 = new Studierender();
		assertEquals(6000, s1.getFreibetrag());
		
		Studierender s2 = new Studierender(6000);
		assertEquals(6000, s2.getFreibetrag());
		
		Studierender s3 = new Studierender(12000);
		assertEquals(6000, s3.getFreibetrag());
		
		Angestellter a1 = new Angestellter();
		assertEquals(12000, a1.getFreibetrag());
		
		Angestellter a2 = new Angestellter(12000);
		assertEquals(12000, a2.getFreibetrag());
		
		Angestellter a3 = new Angestellter(30000);
		assertEquals(12000, a3.getFreibetrag());
		
		Beamter b1 = new Beamter();
		assertEquals(0, b1.getFreibetrag());
		
		Beamter b2 = new Beamter(12000);
		assertEquals(0, b2.getFreibetrag());
		
		Beamter b3 = new Beamter(75001);
		assertEquals(0, b3.getFreibetrag());
		
		Selbststaendiger se1 = new Selbststaendiger();
		assertEquals(0, se1.getFreibetrag());
		
		Selbststaendiger se2 = new Selbststaendiger(24000);
		assertEquals(0, se2.getFreibetrag());
		
		Selbststaendiger se3 = new Selbststaendiger(24001);
		assertEquals(0, se3.getFreibetrag());
		
		Hinterbliebener h1 = new Hinterbliebener();
		assertEquals(0, h1.getFreibetrag());
		
		Hinterbliebener h2 = new Hinterbliebener(50000);
		assertEquals(0, h2.getFreibetrag());
		
		Hinterbliebener h3 = new Hinterbliebener(50001);
		assertEquals(0, h3.getFreibetrag());
		
		Rentner r1 = new Rentner();
		assertEquals(0, r1.getFreibetrag());
		
		Rentner r2 = new Rentner(12000);
		assertEquals(0, r2.getFreibetrag());
		
		Rentner r3 = new Rentner(30000);
		assertEquals(0, r3.getFreibetrag());
	}
	
	/**
	 * Testet die Methode setFreibetrag(int freibetrag).
	 */
	@Test
	public void testSetFreibetrag() {
		Studierender s1 = new Studierender();
		s1.setFreibetrag(0);
		assertEquals(0, s1.getFreibetrag());
		
		Studierender s2 = new Studierender(6000);
		s2.setFreibetrag(8000);
		assertEquals(8000, s2.getFreibetrag());
		
		Studierender s3 = new Studierender(12000);
		s3.setFreibetrag(90000);
		assertEquals(90000, s3.getFreibetrag());
		
		Angestellter a1 = new Angestellter();
		a1.setFreibetrag(0);
		assertEquals(0, a1.getFreibetrag());
		
		Angestellter a2 = new Angestellter(12000);
		a2.setFreibetrag(8000);
		assertEquals(8000, a2.getFreibetrag());
		
		Angestellter a3 = new Angestellter(30000);
		a3.setFreibetrag(90000);
		assertEquals(90000, a3.getFreibetrag());
		
		Beamter b1 = new Beamter();
		b1.setFreibetrag(0);
		assertEquals(0, b1.getFreibetrag());
		
		Beamter b2 = new Beamter(12000);
		b2.setFreibetrag(8000);
		assertEquals(8000, b2.getFreibetrag());
		
		Beamter b3 = new Beamter(75001);
		b3.setFreibetrag(90000);
		assertEquals(90000, b3.getFreibetrag());
		
		Selbststaendiger se1 = new Selbststaendiger();
		se1.setFreibetrag(0);
		assertEquals(0, se1.getFreibetrag());
		
		Selbststaendiger se2 = new Selbststaendiger(24000);
		se2.setFreibetrag(8000);
		assertEquals(8000, se2.getFreibetrag());
		
		Selbststaendiger se3 = new Selbststaendiger(24001);
		se3.setFreibetrag(90000);
		assertEquals(90000, se3.getFreibetrag());
		
		Hinterbliebener h1 = new Hinterbliebener();
		h1.setFreibetrag(0);
		assertEquals(0, h1.getFreibetrag());
		
		Hinterbliebener h2 = new Hinterbliebener(50000);
		h2.setFreibetrag(8000);
		assertEquals(8000, h2.getFreibetrag());
		
		Hinterbliebener h3 = new Hinterbliebener(50001);
		h3.setFreibetrag(90000);
		assertEquals(90000, h3.getFreibetrag());
		
		Rentner r1 = new Rentner();
		r1.setFreibetrag(0);
		assertEquals(0, r1.getFreibetrag());
		
		Rentner r2 = new Rentner(12000);
		r2.setFreibetrag(8000);
		assertEquals(8000, r2.getFreibetrag());
		
		Rentner r3 = new Rentner(30000);
		r3.setFreibetrag(90000);
		assertEquals(90000, r3.getFreibetrag());
	}
	
	/**
	 * Testet die Methode setFreibetrag(int freibetrag) mit 
	 * nicht erlaubtem Mitgabewert.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testSetFreibetragIllegalArgumentException() {
		Studierender s1 = new Studierender();
		s1.setFreibetrag(-2000);
		
		Angestellter a1 = new Angestellter();
		a1.setFreibetrag(-8);
		
		Beamter b1 = new Beamter();
		b1.setFreibetrag(-90000);
		
		Selbststaendiger se1 = new Selbststaendiger();
		se1.setFreibetrag(-600);
		
		Hinterbliebener h1 = new Hinterbliebener();
		h1.setFreibetrag(-70000);
		
		Rentner r1 = new Rentner();
		r1.setFreibetrag(-500);
		
		
		
	}
	
	/**
	 * Testet die Methode getTax().
	 */
	@Test
	public void testGetTax() {
		Studierender s1 = new Studierender();
		assertEquals(0, s1.getTax());
		
		Studierender s2 = new Studierender(6000);
		assertEquals(0, s2.getTax());
		
		Studierender s3 = new Studierender(12000);
		assertEquals(600, s3.getTax());
		
		Angestellter a1 = new Angestellter();
		assertEquals(0, a1.getTax());
		
		Angestellter a2 = new Angestellter(12000);
		assertEquals(0, a2.getTax());
		
		Angestellter a3 = new Angestellter(30000);
		assertEquals(5400, a3.getTax());
		
		Beamter b1 = new Beamter();
		assertEquals(0, b1.getTax());
		
		Beamter b2 = new Beamter(12000);
		assertEquals(1200, b2.getTax());
		
		Beamter b3 = new Beamter(75001);
		assertEquals(37500, b3.getTax());
		
		Selbststaendiger se1 = new Selbststaendiger();
		assertEquals(0, se1.getTax());
		
		Selbststaendiger se2 = new Selbststaendiger(24000);
		assertEquals(6000, se2.getTax());
		
		Selbststaendiger se3 = new Selbststaendiger(24001);
		assertEquals(7200, se3.getTax());
		
		Hinterbliebener h1 = new Hinterbliebener();
		assertEquals(0, h1.getTax());
		
		Hinterbliebener h2 = new Hinterbliebener(50000);
		assertEquals(0, h2.getTax());
		
		Hinterbliebener h3 = new Hinterbliebener(50001);
		assertEquals(0, h3.getTax());
		
		Rentner r1 = new Rentner();
		assertEquals(0, r1.getTax());
		
		Rentner r2 = new Rentner(12000);
		assertEquals(0, r2.getTax());
		
		Rentner r3 = new Rentner(30000);
		assertEquals(0, r3.getTax());
	
	}
	
	/**
	 * Testet die Methode getSocialTax().
	 */
	@Test
	public void testGetSocialTax() {
		Studierender s1 = new Studierender();
		assertEquals(0, s1.getSocialTax());
		
		Studierender s2 = new Studierender(6000);
		assertEquals(0, s2.getSocialTax());
		
		Studierender s3 = new Studierender(12000);
		assertEquals(0, s3.getSocialTax());
		
		Angestellter a1 = new Angestellter();
		assertEquals(0, s3.getSocialTax());
		
		Angestellter a2 = new Angestellter(12000);
		assertEquals(3360, a2.getSocialTax());
		
		Angestellter a3 = new Angestellter(30000);
		assertEquals(8400, a3.getSocialTax());
		
		Beamter b1 = new Beamter();
		assertEquals(0, b1.getSocialTax());
		
		Beamter b2 = new Beamter(12000);
		assertEquals(0, b2.getSocialTax());
		
		Beamter b3 = new Beamter(75001);
		assertEquals(0, b3.getSocialTax());
		
		Selbststaendiger se1 = new Selbststaendiger();
		assertEquals(0, se1.getSocialTax());
		
		Selbststaendiger se2 = new Selbststaendiger(24000);
		assertEquals(0, se2.getSocialTax());
		
		Selbststaendiger se3 = new Selbststaendiger(24001);
		assertEquals(0, se3.getSocialTax());
		
		Hinterbliebener h1 = new Hinterbliebener();
		assertEquals(0, h1.getSocialTax());
		
		Hinterbliebener h2 = new Hinterbliebener(50000);
		assertEquals(14000, h2.getSocialTax());
		
		Hinterbliebener h3 = new Hinterbliebener(50001);
		assertEquals(14000, h3.getSocialTax());
		
		Rentner r1 = new Rentner();
		assertEquals(0, r1.getSocialTax());
		
		Rentner r2 = new Rentner(12000);
		assertEquals(0, r2.getSocialTax());
		
		Rentner r3 = new Rentner(30000);
		assertEquals(0, r3.getSocialTax());
	}

}
