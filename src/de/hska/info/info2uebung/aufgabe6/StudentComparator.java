package de.hska.info.info2uebung.aufgabe6;

/**
 * class StudentComparator.
 * @author Melanie Wolf
 * Diese Klasse erlaubt das Vergleichen von zwei Student Objekten.
 *
 */

public class StudentComparator implements java.util.Comparator<Student> {
	
	/**
	 * Die Methode compare(Student s1, Student s2) vergleicht zwei Student Objekte.
	 */
	@Override
	public int compare(Student s1, Student s2) {
		
		int result = s1.getLastname().compareTo(s2.getLastname());
		
		if (result == 0) {
			result = s1.getFirstname().compareTo(s2.getFirstname());
			
			if (result == 0) {
				Integer m1 = new Integer(s1.getMatriculationNumber());
				Integer m2 = new Integer(s2.getMatriculationNumber());
				result = m1.compareTo(m2);
			}
		}
		return result;
	}
	
	

}
