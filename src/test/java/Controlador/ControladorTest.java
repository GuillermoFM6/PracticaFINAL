package Controlador;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import Model.ConnectaQuatre;
import Model.MockTeclado;

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
	@Test
	public void testFerJugada()
	{
		//Test Columna incorrecta i jugada guanyadora.
		int moves=8*6;
		Controlador test =new Controlador(8, 6);
		ArrayList<Integer> a =new ArrayList<Integer>();
		a.add(10);
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(3);
		a.add(3);
		a.add(4);
		MockTeclado teclado= new MockTeclado(a);
		boolean jugadaGuanyadora = false;
		for (int player = 0; moves-- > 0; player = 1 - player) {
		char symbol=test.getBoard().getJugador()[player];
		test.ferJugada(symbol, new Scanner(System.in),teclado);
		jugadaGuanyadora = test.getBoard().jugadaGuanyadora();
		if(jugadaGuanyadora) { 
			
			test.vistaPrintGuanyador(symbol);
			break;
			
			}
		
		}
		assertEquals(true, jugadaGuanyadora);
		//Test Columna plena jugada Guanyadora
		int moves2=8*6;
		Controlador test2 =new Controlador(8, 6);
		ArrayList<Integer> a2 =new ArrayList<Integer>();
		a2.add(1);
		a2.add(1);
		a2.add(1);
		a2.add(1);
		a2.add(1);
		a2.add(1);
		a2.add(1);//Missatge d'error.
		a2.add(2);
		a2.add(2);
		a2.add(3);
		a2.add(3);
		a2.add(4);
		
		MockTeclado teclado2= new MockTeclado(a2);
		boolean jugadaGuanyadora2 =false;
		for (int player = 0; moves2-- > 0; player = 1 - player) {
		char symbol2=test2.getBoard().getJugador()[player];
		test2.ferJugada(symbol2, new Scanner(System.in),teclado2);
		jugadaGuanyadora2 = test2.getBoard().jugadaGuanyadora();
		if(jugadaGuanyadora2) { 
			
			test2.vistaPrintGuanyador(symbol2);
			break;
			
			}
		
		}
		assertEquals(true, jugadaGuanyadora2);
		
		
		
	}
}
