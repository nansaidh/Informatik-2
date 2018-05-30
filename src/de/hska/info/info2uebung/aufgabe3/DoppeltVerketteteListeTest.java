package de.hska.info.info2uebung.aufgabe3;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoppeltVerketteteListeTest {

		@Test
		public void testAddFirst() {
			DoppeltVerketteteListe l = new DoppeltVerketteteListe();
			l.addFirst("42");
			assertEquals(1, l.getSize());
			assertEquals("42", l.get(0));
			l.addFirst("20");
			assertEquals(2, l.getSize());
			assertEquals("20", l.get(0));
			assertEquals("42", l.get(1));
		}

		@Test
		public void testAddLast() {
			DoppeltVerketteteListe l = new DoppeltVerketteteListe();
			l.addLast("Melanie");
			assertEquals(1, l.getSize());
			assertEquals("Melanie", l.get(0));
			l.addLast("Wolf");
			assertEquals(2, l.getSize());
			assertEquals("Melanie", l.get(0));
			assertEquals("Wolf", l.get(1));	
		}

		@Test
		public void testAdd() {
			String[] in = {"Frische", "Brötchen", "essen", "des", "Gesangvereins"};
			DoppeltVerketteteListe l = new DoppeltVerketteteListe();
			for (int i = 0; i < in.length; i++) {
				l.add(i, in[i]);
				assertEquals(i + 1, l.getSize());
				assertEquals(in[i], l.get(i));
			}
			assertEquals(5, l.getSize());
			assertEquals("des", l.get(3));
			l.add(3, "Asse");
			assertEquals(6, l.getSize());
			assertEquals("Asse", l.get(3));
		}
		
		@Test(expected = AssertionError.class)
		public void testAdd2() {
			String[] in = {"Froh", "zu", "sein", "bedarf", "es", "wenig"};
			DoppeltVerketteteListe l = new DoppeltVerketteteListe();
			for (int i = 0; i < in.length; i++) {
				l.add(i, in[i]);
				assertEquals(i + 1, l.getSize());
				assertEquals(in[i], l.get(i));
			}
			assertEquals(6, l.getSize());
			assertEquals ("Froh", l.get(-1));	
		}
		
	    @Test(expected = AssertionError.class)
	    public void testRemoveFirst1() {
	        new DoppeltVerketteteListe().removeFirst();
	    }
	    
	    @Test(expected = AssertionError.class)
	    public void testRemoveFirst2() {
	    	DoppeltVerketteteListe l = new DoppeltVerketteteListe();
	        l.addFirst("42");
	        l.removeFirst();
	        
	        assertEquals(0, l.getSize());
	        l.get(0);
	    }
	    
	    @Test(expected = AssertionError.class)
	    public void testRemoveLast1() {
	        new DoppeltVerketteteListe().removeLast();
	    }
	    
	    @Test(expected = AssertionError.class)
	    public void testRemoveLast2() {
	    	DoppeltVerketteteListe l = new DoppeltVerketteteListe();
	        l.addLast("42");
	        l.removeLast();
	        
	        assertEquals(0, l.getSize());
	        l.get(0);
	    }
}

