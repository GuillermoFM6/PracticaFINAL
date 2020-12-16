import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Controlador.Partida;
import Model.ConnectaQuatre;

public class AutomatitzacioPartidesTest {

	Partida connectaQuatre;
	ConnectaQuatre tauler;
	String guanyaGroc = "Jugador " + "Y" + " ha guanyat!";
	String guanyaVermell = "Jugador " + "R" + " ha guanyat!";
	String missatgeEmpat = "S'ha acabat. No hi ha guanyador!";
	
	@Before
	public void setUp() throws Exception {
		connectaQuatre = new Partida();
		tauler = connectaQuatre.getTauler();
	}

	@Test
	public void guanyaVermellHoritzontalmentTest() {
		char[][] taulerGuanyaVermellHoritzontalment = 
					{{'.','.','.','.','.','.','.'},
					{'.','.','.','.','.','.','.'},
					{'.','.','.','.','.','.','.'},
					{'.','.','.','.','.','.','.'},
					{'Y','Y','Y','.','.','.','.'},
					{'R','R','R','R','.','.','.'},};
		
		String missatgeFinal = connectaQuatre.jugar(1);
		assertEquals(guanyaVermell, missatgeFinal);
		assertArrayEquals(taulerGuanyaVermellHoritzontalment,tauler.getTauler());
	}
	
	@Test
	public void guanyaVermellVerticalmentTest() {
		char[][] taulerGuanyaVermellVerticalment = 
			{{'.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.'},
			{'R','.','.','.','.','.','.'},
			{'R','.','.','.','.','.','.'},
			{'R','.','.','.','.','.','.'},
			{'R','Y','Y','Y','.','.','.'},};
		String missatgeFinal = connectaQuatre.jugar(2);
		assertEquals(guanyaVermell, missatgeFinal);
		assertArrayEquals(taulerGuanyaVermellVerticalment,tauler.getTauler());
		
		}
	
	@Test
	public void guanyaVermellDiagonalmentTest() {
		char[][] taulerGuanyaVermellDiagonalment = 
			{{'.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.'},
			{'.','.','.','R','.','.','.'},
			{'.','.','R','Y','.','.','.'},
			{'.','R','Y','Y','.','.','.'},
			{'R','Y','Y','R','R','.','.'},};
		String missatgeFinal = connectaQuatre.jugar(3);
		assertEquals(guanyaVermell, missatgeFinal);
		assertArrayEquals(taulerGuanyaVermellDiagonalment,tauler.getTauler());
	}
	
	@Test
	public void guanyaGrocHoritzontalmetTest() {
		char[][] taulerGuanyaGrocHoritzontalment = 
			{{'.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.'},
			{'R','R','R','.','.','.','.'},
			{'Y','Y','Y','Y','R','.','.'},};
		String missatgeFinal = connectaQuatre.jugar(4);
		assertEquals(guanyaGroc, missatgeFinal);
		assertArrayEquals(taulerGuanyaGrocHoritzontalment,tauler.getTauler());
	}
	
	@Test
	public void guanyaGrocVerticalmentTest() {
		char[][] taulerGuanyaGrocVerticalment = 
			{{'.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.'},
			{'Y','.','.','.','.','.','.'},
			{'Y','.','.','.','.','.','.'},
			{'Y','.','.','.','.','.','.'},
			{'Y','R','R','R','.','.','R'},};
		String missatgeFinal = connectaQuatre.jugar(5);
		assertEquals(guanyaGroc, missatgeFinal);
		assertArrayEquals(taulerGuanyaGrocVerticalment,tauler.getTauler());
	}
	
	@Test
	public void guanyaGrocDiagonalmentTest() {
		char[][] taulerGuanyaGrocDiagonalment = 
			{{'.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.'},
			{'.','.','.','Y','.','.','.'},
			{'.','.','Y','R','.','.','.'},
			{'.','Y','R','R','.','.','Y'},
			{'Y','R','R','Y','.','.','R'},};
		String missatgeFinal = connectaQuatre.jugar(6);
		assertEquals(guanyaGroc, missatgeFinal);
		assertArrayEquals(taulerGuanyaGrocDiagonalment,tauler.getTauler());
	}
	
	@Test
	public void empatTest() {
		char[][] empat = 
			{{'Y','R','Y','R','Y','R','Y'},
			{'Y','R','Y','R','Y','R','R'},
			{'Y','R','Y','R','Y','R','Y'},
			{'R','Y','R','Y','R','Y','R'},
			{'R','Y','R','Y','R','Y','Y'},
			{'R','Y','R','Y','R','Y','R'},};
		String missatgeFinal = connectaQuatre.jugar(7);
		assertEquals(missatgeEmpat, missatgeFinal);
		assertArrayEquals(empat,tauler.getTauler());
	}

}
