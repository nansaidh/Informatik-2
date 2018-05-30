package de.hska.info.info2uebung.aufgabe7;


public class DoppeltVerketteteListeGenerisch<T> {
	private int size;
	private ListElement<T> first;
	private ListElement<T> last;
	
	/**
	 * Standardkonstruktor erzeugt leere Liste.
	 */
	public DoppeltVerketteteListeGenerisch() {
		this.size = 0;
	}
	
	/**
	 * Traegt Element vorne in die Liste ein.
	 * @param value Element
	 */
	public void addFirst(T value) {
		ListElement<T> elem = new ListElement<T>(value);
		
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
	public void addLast(T value) {
		ListElement<T> elem = new ListElement<T>(value);
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
	public void add(int index, T value) {
		if (index == 0) {
			this.addFirst(value);
			
		} else if (index == this.size) {
			this.addLast(value);
			
		} else {
			ListElement<T> elem = new ListElement<T>(value);
			ListElement<T> current = this.getElement(index);
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
	public T get(int index) {
		return this.getElement(index).getValue();
	}
	
	/**
	 * Loescht das erste Element.
	 * @return Wert des geloeschten Elements
	 */
	public T removeFirst() {
		 assert size != 0;
		 T value = null;
		 
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
	public T removeLast() {
		assert size != 0;
		T value = null;
		
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
	public T remove(int index) {
		assert size != 0;
		T value = null;
		
		if (index == 0) {
			value = this.removeFirst();
			
		} else if (index == this.size) {
			value = this.removeLast();
			
		} else {
			ListElement<T> current = this.getElement(index);
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
	
	private ListElement<T> getElement(int index) {
		assert index >= 0 && index < this.size;
		ListElement<T> current = this.first;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		
		return current;
	}
	
	/** 
	 * class ListElement.
	 * @author Melanie Wolf
	 * Diese Klasse erzeugt Stringelemente einer doppelt verketteten Liste.
	 * @param <T> Platzhalter
	 */
	private static final class ListElement<T> { //static: soll nicht auf aeußere Klasse zugreifen koennen; final: Ableitung nicht sinnvoll
		private T value;
		private ListElement<T> previous;
		private ListElement<T> next;
		
		/**
		 * Konstruktor erzeugt neues Listenelement.
		 * @param value Wert des Elements
		 */
		private ListElement(T value) {
			this.value = value;
			this.previous = null;
			this.next = null;
		}
		
		/**
		 * Gibt den Wert des Elementes zur�ck.
		 * @return Wert
		 */
		public T getValue() {
			return this.value;
		}
		
		/**
		 * Gibt den Wert des vorherigen Elementes zur�ck.
		 * @return Wert des vorherigen Elements
		 */
		public ListElement<T> getPrevious() {
			return this.previous;
		}
		
		/**
		 * Gibt den Wert des nachfolgenden Elementes zur�ck.
		 * @return Wert des nachfolgenden Elements
		 */
		public ListElement<T> getNext() {
			return this.next;
		}
		
		/**
		 * Wert des vorherigen Elements wird gesetzt.
		 * @param previous Element
		 */
		public void setPrevious(ListElement<T> previous) {
			this.previous = previous;
		}
		
		/**
		 * Wert des nachfolgenden Elements wird gesetzt.
		 * @param next Element
		 */
		public void setNext(ListElement<T> next) {
			this.next = next;
		}	
	}
}
