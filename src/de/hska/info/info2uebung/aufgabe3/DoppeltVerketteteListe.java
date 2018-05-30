package de.hska.info.info2uebung.aufgabe3;

public class DoppeltVerketteteListe {
	
	private int size;
	private ListElement first;
	private ListElement last;
	
	/**
	 * Standardkonstruktor erzeugt leere Liste.
	 */
	public DoppeltVerketteteListe() {
		this.size = 0;
	}
	
	/**
	 * Traegt Element vorne in die Liste ein.
	 * @param value Element
	 */
	public void addFirst(String value) {
		ListElement elem = new ListElement(value);
		
		if (this.first == null) {
			this.last = elem;
			
		} else {
			this.first.setPrevious(elem);
			elem.setNext(this.first);
		}
		
		this.first = elem;
		this.size++;
	}
	
	/**
	 * Traegt Element hinten in die Liste ein.
	 * @param value Element
	 */
	public void addLast(String value) {
		ListElement elem = new ListElement(value);
		if (this.last == null) {
			this.first = elem;
			
		} else {
			this.last.setNext(elem);
			elem.setPrevious(this.last);
		}
		this.last = elem;
		this.size++;
	}
	
	/**
	 * Traegt Element am angegebenen Index in die Liste ein.
	 * @param index Index
	 * @param value Element
	 */
	public void add(int index, String value) {
		if (index == 0) {
			this.addFirst(value);
			
		} else if (index == this.size) {
			this.addLast(value);
			
		} else {
			ListElement elem = new ListElement(value);
			ListElement current = this.getElement(index);
			elem.setNext(current);
			elem.setPrevious(current.getPrevious());
			current.getPrevious().setNext(elem);
			current.setPrevious(elem);
			this.size++;
			
		}
	}
	
	/**
	 * Liest den Wert am uebergebenen Index aus.
	 * @param index Index
	 * @return Wert am uebergebenen Index
	 */
	public String get(int index) {
		return this.getElement(index).getValue();
	}
	
	/**
	 * Loescht das erste Element.
	 * @return Wert des geloeschten Elements
	 */
	public String removeFirst() {
		 assert size != 0;
		 String value = null;
		 
		 if (this.first != null) {
			 value = this.first.getValue();
			 
			 if (this.size > 1) {
				 this.first = this.first.getNext();
				 this.first.setPrevious(null);
				 
			 } else {
				 this.first = null;
				 this.last = null;
				 
			 }
			 
			 this.size--;
		 }	 
		 
		 return value;
	}
		 
	
	/**
	 * Loescht das letzte Element.
	 * @return Wert des geloeschten Elements
	 */
	public String removeLast() {
		assert size != 0;
		String value = null;
		
		if (this.last != null) {
			value = this.last.getValue();
			
			if (this.size > 1) {
				this.last = this.last.getPrevious();
				this.last.setNext(null);
				
			} else {
				this.first = null;
				this.last = null;
				
			}
			
			this.size--;
		}
		
		return value;	
	}
	
	/**
	 * Loescht das Element am angegebenen Index.
	 * @param index Index des zu loeschenden Elements
	 * @return Wert des geloeschten Elements
	 */
	public String remove(int index) {
		assert size != 0;
		String value = null;
		
		if (index == 0) {
			value = this.removeFirst();
			
		} else if (index == this.size) {
			value = this.removeLast();
			
		} else {
			ListElement current = this.getElement(index);
			value = current.getValue();
			current.getPrevious().setNext(current.getNext());
			current.getNext().setPrevious(current.getPrevious());
			current.setPrevious(null);
			current.setNext(null);
			this.size--;
			
		}
		
		return value;
	}
	
	/**
	 * Liest die Anzahl der Werte in der Liste aus.
	 * @return Groesse der Liste
	 */
	public int getSize() {
		return this.size;
	}
	
	private ListElement getElement(int index) {
		assert index >= 0 && index < this.size;
		ListElement current = this.first;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		
		return current;
	}
	
	/** 
	 * class ListElement.
	 * @author Melanie Wolf
	 * Diese Klasse erzeugt Stringelemente einer doppelt verketteten Liste.
	 */
	private static final class ListElement { //static: soll nicht auf aeußere Klasse zugreifen koennen; final: Ableitung nicht sinnvoll
		private String value;
		private ListElement previous;
		private ListElement next;
		
		/**
		 * Konstruktor erzeugt neues Listenelement.
		 * @param value Wert des Elements
		 */
		private ListElement(String value) {
			this.value = value;
			this.previous = null;
			this.next = null;
		}
		
		/**
		 * Gibt den Wert des Elementes zur�ck.
		 * @return Wert
		 */
		public String getValue() {
			return this.value;
		}
		
		/**
		 * Gibt den Wert des vorherigen Elementes zur�ck.
		 * @return Wert des vorherigen Elements
		 */
		public ListElement getPrevious() {
			return this.previous;
		}
		
		/**
		 * Gibt den Wert des nachfolgenden Elementes zur�ck.
		 * @return Wert des nachfolgenden Elements
		 */
		public ListElement getNext() {
			return this.next;
		}
		
		/**
		 * Wert des vorherigen Elements wird gesetzt.
		 * @param previous Element
		 */
		public void setPrevious(ListElement previous) {
			this.previous = previous;
		}
		
		/**
		 * Wert des nachfolgenden Elements wird gesetzt.
		 * @param next Element
		 */
		public void setNext(ListElement next) {
			this.next = next;
		}	
	}
}
