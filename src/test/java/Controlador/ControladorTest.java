package Controlador;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.ConnectaQuatre;

public class ControladorTest {

	@Test
	public void testGetBoard() {
		Controlador test = new Controlador(4, 7);
		ConnectaQuatre c4=test.getBoard();
		int altura=c4.getAltura();
		int amplada=c4.getAmplada();
		assertEquals(4, amplada);
		assertEquals(7, altura);
	}
	@Test 
	public void testControlador() {
		Controlador test=new Controlador(7, 15);
		ConnectaQuatre c4=test.getBoard();
		int altura=c4.getAltura();
		int amplada=c4.getAmplada();
		assertEquals(7, amplada);
		assertEquals(15, altura);
	}

}
