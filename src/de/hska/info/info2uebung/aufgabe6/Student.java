package de.hska.info.info2uebung.aufgabe6;
/**
 * class Student.
 * @author Melanie Wolf
 * Mithilfe dieser Klasse können Studentenobjekte angelegt werden.
 */
public class Student {
	private int matriculationNumber;
	private String firstname;
	private String lastname;
	
	/**
	 * Konstruktor der Klasse Student mit Matrikelnummer, Vorname und Nachname als Parameter.
	 * @param matriculationNumber Matrikelnummer; darf nicht <= 0 sein.
	 * @param firstname Vorname; darf kein leerer String sein.
	 * @param lastname Nachname; darf kein leerer String sein.
	 */
	public Student(int matriculationNumber, String firstname, String lastname) {
		if (matriculationNumber <= 0) {
			throw new IllegalArgumentException("Die Matrikelnummer muss größer 0 sein!");
		}
		
		this.matriculationNumber = matriculationNumber;
		
		if (firstname == "" || lastname == "") {
			throw new IllegalArgumentException("Vor- und Nachname müssen vorhanden sein!");
		}
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	/**
	 * Gibt den Wert der Matrikelnummer zurück.
	 * @return Matrikelnummer
	 */
	public int getMatriculationNumber() {
		return this.matriculationNumber;
	}
	
	/**
	 * Erlaubt das Setzen der Matrikelnummer. Die Matrikelnummer darf nicht <= 0 sein.
	 * @param matriculationNumber Matrikelnummer
	 */
	public void setMatriculationNumber(int matriculationNumber) {
		if (matriculationNumber <= 0) {
			throw new IllegalArgumentException("Die Matrikelnummer muss größer 0 sein!");
		}
		this.matriculationNumber = matriculationNumber;
	}
	
	/**
	 * Gibt den Wert des Vornamens zurück.
	 * @return Vorname
	 */
	public String getFirstname() {
		return this.firstname;
	}
	
	/**
	 * Erlaubt das Setzen des Vornamens. Der Vorname darf dabei kein leerer String sein.
	 * @param firstname Vorname
	 */
	public void setFirstname(String firstname) {
		if (firstname == "") {
			throw new IllegalArgumentException("Vorname muss vorhanden sein!");	
		}
		this.firstname = firstname;
	}
	
	/**
	 * Gibt den Wert des Nachnamens zurück.
	 * @return Nachname
	 */
	public String getLastname() {
		return this.lastname;
	}
	
	/**
	 * Erlaubt das Setzen des Nachnamens. Der Nachname darf kein leerer String sein.
	 * @param lastname Nachname
	 */
	public void setLastname(String lastname) {
		if (lastname == "") {
			throw new IllegalArgumentException("Nachname muss vorhanden sein!");	
		}
		this.lastname = lastname;
	}
}
