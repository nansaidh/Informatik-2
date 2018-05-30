package de.hska.info.info2uebung.aufgabe2.gol;
/**
 * Die eigentliche Spielelogik. Das Spielfeld wird hier nicht
 * als zyklisch geschlossen betrachtet wird.
 *
 * @author Holger Vogelsang
 */
public class GameOfLifeLogic {
	
	private boolean[][] generation;
	
	/**
	 * Diese Klasse setzt die Startgeneration.
	 * @param generation uebergebene Startgeneration
	 */
	public void setStartGeneration(boolean[][] generation) {
		this.generation = generation;
	}
	
	/**
	 * Diese Klasse berechnet die naechste Generation.
	 */

	public void nextGeneration() {
		boolean[][] nextGeneration = new boolean[this.generation.length][this.generation[0].length];

		for (int i = 0; i < this.generation.length; i++) {
			for (int j = 0; j < this.generation[0].length; j++) {
				
				if (isCellAlive(i, j) 
					&& ((howManyNeighboursAlive(i, j) == 2 || howManyNeighboursAlive(i, j) == 3))) {
					nextGeneration[i][j] = true;
					
				} else if (!isCellAlive(i, j) && howManyNeighboursAlive(i, j) == 3) {
					nextGeneration[i][j] = true;
					
				} else {
					nextGeneration[i][j] = false;
				}
				
			}
		}
		this.generation = nextGeneration;
		
	}
	
	/**
	 * Diese Klasse prueft, ob die Zelle an der uebergebenen Position 
	 * in der aktuellen Generation am Leben ist.
	 * @param x Zeile
	 * @param y Spalte
	 * @return true, falls Zelle lebt; false, falls Zelle tot
	 */

	public boolean isCellAlive(int x, int y) {
		if ((x < 0 || x >= this.generation.length) || (y < 0 || y >= this.generation[0].length)) {
			return false; //Felder außerhalb des Spielfeldes immer false
		}
		
		return this.generation[x][y];
	}
	
	private int howManyNeighboursAlive(int x, int y) {
		int neighboursAlive = 0;
		for (int i = (x - 1); i <= (x + 1); i++) {
			for (int j = (y - 1); j <= (y + 1); j++) {
				if (((i != x) || (j != y)) && (isCellAlive(i, j))) {
					neighboursAlive++;
				}
			}
		}
		
		return neighboursAlive;
	}
}