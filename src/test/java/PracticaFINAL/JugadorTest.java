package PracticaFINAL;

import static org.junit.Assert.*;

import org.junit.Test;

public class JugadorTest {

	
	
	@Test
	public void getPlayer() {
		Jugador jug= new Jugador();
		int Player=jug.getPlayer();
		assertEquals(Player,1);
	}
	@Test
	public void getGuanyador() {
		Jugador jug= new Jugador();
		boolean guanyador=jug.getGuanyador();
		assertEquals(guanyador,false);
	}
}
