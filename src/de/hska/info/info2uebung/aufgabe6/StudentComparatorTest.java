package de.hska.info.info2uebung.aufgabe6;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

/**
 * class StudentComparatorTest.
 * @author Melanie Wolf
 * Testet die Klassen Student und StudentComparator.
 */
public class StudentComparatorTest {
	private Student s1 = new Student(54978, "Miriam", "Tenhaken");
	private Student s2 = new Student(54979, "Matthias", "Fertig");
	private Student s3 = new Student(54980, "Claudia", "Kihn");
	private Student s4 = new Student(54981, "Alexandra", "Kihn");
	private Student s5 = new Student(54982, "Claudia", "Kihn");
	
	/**
	 * Testet die Methode getMatriculationNumber() der Klasse Student.
	 */
	@Test
	public void testGetMatriculationNumber() {
		assertEquals(54978, s1.getMatriculationNumber());
		assertEquals(54979, s2.getMatriculationNumber());
		assertEquals(54980, s3.getMatriculationNumber());		
	}
	
	/**
	 * Testet die Methode getFirstname() der Klasse Student.
	 */
	@Test
	public void testGetFirstname() {
		assertEquals("Miriam", s1.getFirstname());
		assertEquals("Matthias", s2.getFirstname());
		assertEquals("Claudia", s3.getFirstname());
	}
	
	/**
	 * Testet die Methode getLastname() der Klasse Student.
	 */
	@Test
	public void testGetLastname() {
		assertEquals("Tenhaken", s1.getLastname());
		assertEquals("Fertig", s2.getLastname());
		assertEquals("Kihn", s3.getLastname());
	}
	
	/**
	 * Testet die Methode setMatriculationNumber(int matriculationNumber) der Klasse Student.
	 */
	@Test
	public void testSetMatriculationNumber() {
		assertEquals(54978, s1.getMatriculationNumber());
		s1.setMatriculationNumber(9);
		assertEquals(9, s1.getMatriculationNumber());
		s1.setMatriculationNumber(54978);
		assertEquals(54978, s1.getMatriculationNumber());
		
		assertEquals(54979, s2.getMatriculationNumber());
		s2.setMatriculationNumber(9);
		assertEquals(9, s2.getMatriculationNumber());
		s2.setMatriculationNumber(54979);
		assertEquals(54979, s2.getMatriculationNumber());
	}
	
	/**
	 * Testet die Methode setMatriculationNumber( int matriculationNumber) der Klasse Student
	 * mit nicht erlaubter Parameterübergabe.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testSetMatriculationNumberIllegalException() {
		assertEquals(54978, s1.getMatriculationNumber());
		s1.setMatriculationNumber(-9);
		
		assertEquals(54979, s2.getMatriculationNumber());
		s2.setMatriculationNumber(0);
	}
	
	/**
	 * Testet die Methode setFirstname(String firstname) der Klasse Student.
	 */
	@Test
	public void testSetFirstname() {
		assertEquals("Miriam", s1.getFirstname());
		s1.setFirstname("Martina");
		assertEquals("Martina", s1.getFirstname());
		s1.setFirstname("Miriam");
		assertEquals("Miriam", s1.getFirstname());
		
		assertEquals("Matthias", s2.getFirstname());
		s2.setFirstname("Moritz");
		assertEquals("Moritz", s2.getFirstname());
		s2.setFirstname("Matthias");
		assertEquals("Matthias", s2.getFirstname());
	}
	
	/**
	 * Testet die Methode setFirstname(String firstname) der Klasse Student 
	 * mit nicht erlaubter Parameterübergabe.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testSetFirstnameIllegalException() {
		assertEquals("Miriam", s1.getFirstname());
		s1.setFirstname("");
		
		assertEquals("Matthias", s2.getFirstname());
		s2.setFirstname("");
	}
	
	/**
	 * Testet die Methode setLastname(String lastname) der Klasse Student.
	 */
	@Test
	public void testSetLastname() {
		assertEquals("Tenhaken", s1.getLastname());
		s1.setLastname("Miller");
		assertEquals("Miller", s1.getLastname());
		s1.setLastname("Tenhaken");
		assertEquals("Tenhaken", s1.getLastname());
		
		assertEquals("Fertig", s2.getLastname());
		s2.setLastname("Kihn");
		assertEquals("Kihn", s2.getLastname());
		s2.setLastname("Fertig");
		assertEquals("Fertig", s2.getLastname());
	}
	
	/**
	 * Testet die Methode setLastname(String lastname) der Klasse Student
	 * mit nicht erlaubter Parameterübergabe.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testSetLastnameIllegalException() {
		assertEquals("Tenhaken", s1.getLastname());
		s1.setLastname("");
		
		assertEquals("Fertig", s2.getLastname());
		s2.setLastname("");
	}
	
	
	/**
	 * Testet die Methode compare(Student s1, Student s2) der Klasse StudentComparator. 
	 */
	@Test
	public void testCompare() {
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		assertEquals(5, list.size());
		
		assertEquals(s1, list.get(0));
		assertEquals(s2, list.get(1));
		assertEquals(s3, list.get(2));
		assertEquals(s4, list.get(3));
		assertEquals(s5, list.get(4));
		
		Collections.sort(list, new StudentComparator());
		
		assertEquals(5, list.size());
		
		assertEquals(s2, list.get(0));
		assertEquals(s4, list.get(1));
		assertEquals(s3, list.get(2));
		assertEquals(s5, list.get(3));
		assertEquals(s1, list.get(4));
		
		Student s6 = new Student(52921, "Melissa", "Anderson");
		Student s7 = new Student(89965, "Dieter", "Wolf");
		Student s8 = new Student(65800, "Melanie", "Wolf");
		list.add(s6);
		list.add(s7);
		list.add(s8);
		
		Collections.sort(list, new StudentComparator());
		
		assertEquals(8, list.size());
		
		assertEquals(s6, list.get(0));
		assertEquals(s2, list.get(1));
		assertEquals(s4, list.get(2));
		assertEquals(s3, list.get(3));
		assertEquals(s5, list.get(4));
		assertEquals(s1, list.get(5));
		assertEquals(s7, list.get(6));
		assertEquals(s8, list.get(7));
	}
	
	

}
