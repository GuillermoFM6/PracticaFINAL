import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Controlador.Partida;
import Model.ConnectaQuatre;

public class automatedPlaysTest {

	Partida connectaQuatre;
	ConnectaQuatre tauler;
	String guanyaGroc = "Jugador " + "Y" + " ha guanyat!";
	String guanyaVermell = "Jugador " + "R" + " ha guanyat!";
	String empat = "S'ha acabat. No hi ha guanyador!";
	
	@Before
	public void setUp() throws Exception {
		connectaQuatre = new Partida();
		tauler = connectaQuatre.getTauler();	
	}

	@Test
	public void guanyaVermellHoritzontalmentTest() {
		String missatgeFinal = connectaQuatre.play(1);
		assertEquals(guanyaVermell, missatgeFinal);
		assertEquals("RRRR...", tauler.horitzontal());
	}
	
	@Test
	public void guanyaVermellVerticalmentTest() {
		String missatgeFinal = connectaQuatre.play(2);
		assertEquals(guanyaVermell, missatgeFinal);
		assertEquals("..RRRR", tauler.vertical());
		}
	
	@Test
	public void guanyaVermellDiagonalmentTest() {
		String missatgeFinal = connectaQuatre.play(3);
		assertEquals(guanyaVermell, missatgeFinal);
		assertEquals("..RRRR", tauler.diagonalPositiva());
	}
	
	@Test
	public void guanyaGrocHoritzontalmetTest() {
		String missatgeFinal = connectaQuatre.play(4);
		assertEquals(guanyaGroc, missatgeFinal);
		assertEquals("YYYYR..", tauler.horitzontal());
	}
	
	@Test
	public void guanyaGrocVerticalmentTest() {
		String missatgeFinal = connectaQuatre.play(5);
		assertEquals(guanyaGroc, missatgeFinal);
		assertEquals("..YYYY", tauler.vertical());
	}
	
	@Test
	public void guanyaGrocDiagonalmentTest() {
		String missatgeFinal = connectaQuatre.play(6);
		assertEquals(guanyaGroc, missatgeFinal);
		assertEquals("..YYYY", tauler.diagonalPositiva());
	}
	
	@Test
	public void empatTest() {
		String missatgeFinal = connectaQuatre.play(7);
		assertEquals(empat, missatgeFinal);
	}

}
