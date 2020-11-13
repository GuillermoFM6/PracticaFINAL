package PracticaFINAL;

import static org.junit.Assert.*;

import org.junit.Test;

public class JugadorTest {

	
	
	@Test
	public void testgetPlayer() {
		Jugador jug= new Jugador(1);
		int Player=jug.getPlayer();
		assertEquals(Player,1);
	}
	@Test
	public void testgetGuanyador() {
		Jugador jug= new Jugador(1);
		boolean guanyador=jug.getGuanyador();
		assertEquals(guanyador,false);
	}
	@Test 
	public void testJugador() {
		Jugador jugador=new Jugador(3);
		assertEquals(3, jugador.getPlayer());
	}
}
