package PracticaFINAL;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableroTest {

	@Test 
	public void testgetRows() {
		Tablero tab= new Tablero(4, 0);
		int row=tab.getRow();
		assertEquals(row,4);
	}
	@Test
	public void testgetCol() {
			Tablero tab= new Tablero(0, 4);
			int col=tab.getCol();
			assertEquals(col,4);
		}
	@Test
	public void testTablero() {
		Tablero tablero=new Tablero(4, 3);
		assertEquals(4 ,tablero.getCol() );
		assertEquals(3, tablero.getRow());
	}

}
