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
		
		//Test Columna incorrecta i jugada guanyadora.LimitFrontera.
		int moves=8*6;
		Controlador test =new Controlador(8, 6);
		ArrayList<Integer> a =new ArrayList<Integer>();
		a.add(-1);
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
		//Test Columna correcta i jugada guanyadora.Limit frontera.
		int moves1=8*6;
		Controlador test1 =new Controlador(8, 6);
		ArrayList<Integer> a1 =new ArrayList<Integer>();
		a1.add(0);
		a1.add(0);
		a1.add(1);
		a1.add(1);
		a1.add(2);
		a1.add(2);
		a1.add(3);
		MockTeclado teclado1= new MockTeclado(a1);
		boolean jugadaGuanyadora1 = false;
		for (int player = 0; moves1-- > 0; player = 1 - player) {
		char symbol1=test1.getBoard().getJugador()[player];
		test1.ferJugada(symbol1, new Scanner(System.in),teclado1);
		jugadaGuanyadora1 = test1.getBoard().jugadaGuanyadora();
		if(jugadaGuanyadora1) { 
			
			test1.vistaPrintGuanyador(symbol1);
			break;
			
			}
		
		}
		assertEquals(true, jugadaGuanyadora1);
		
		//Test Columna incorrecta i jugada guanyadora.Limit frontera.
		int moves3=8*6;
		Controlador test3 =new Controlador(8, 6);
		ArrayList<Integer> a3 =new ArrayList<Integer>();
		a3.add(8);
		a3.add(0);
		a3.add(0);
		a3.add(1);
		a3.add(1);
		a3.add(2);
		a3.add(2);
		a3.add(3);
		MockTeclado teclado3= new MockTeclado(a3);
		boolean jugadaGuanyadora3 = false;
		for (int player = 0; moves3-- > 0; player = 1 - player) {
		char symbol3=test3.getBoard().getJugador()[player];
		test3.ferJugada(symbol3, new Scanner(System.in),teclado3);
		jugadaGuanyadora3 = test3.getBoard().jugadaGuanyadora();
		if(jugadaGuanyadora3) { 
			
			test3.vistaPrintGuanyador(symbol3);
			break;
			
			}
		
		}
		assertEquals(true, jugadaGuanyadora3);
		//Test Columna correcta i jugada guanyadora.Limit frontera.
		int moves4=8*6;
		Controlador test4 =new Controlador(8, 6);
		ArrayList<Integer> a4 =new ArrayList<Integer>();
		a4.add(7);
		a4.add(7);
		a4.add(6);
		a4.add(6);
		a4.add(5);
		a4.add(5);
		a4.add(4);
		MockTeclado teclado4= new MockTeclado(a4);
		boolean jugadaGuanyadora4 = false;
		for (int player = 0; moves4-- > 0; player = 1 - player) {
		char symbol4=test4.getBoard().getJugador()[player];
		test4.ferJugada(symbol4, new Scanner(System.in),teclado4);
		jugadaGuanyadora4 = test4.getBoard().jugadaGuanyadora();
		if(jugadaGuanyadora4) { 
			
			test4.vistaPrintGuanyador(symbol4);
			break;
			
			}
		
		}
		assertEquals(true, jugadaGuanyadora4);
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
