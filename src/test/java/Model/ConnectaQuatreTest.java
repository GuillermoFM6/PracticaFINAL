package Model;

import static org.junit.Assert.*;

import java.awt.print.Printable;

import org.junit.Test;

public class ConnectaQuatreTest {

	@Test
	public void testgetAmplada(){
		ConnectaQuatre c4=new ConnectaQuatre(3,4);
		int c4amplada=c4.getAmplada();
		assertEquals(3, c4amplada);
	}
	@Test
	public void testgetAltura(){
		ConnectaQuatre c4=new ConnectaQuatre(3,4);
		int c4altura=c4.getAltura();
		assertEquals(4, c4altura);
	}
	@Test
	public void testgetTauler()
	{
		ConnectaQuatre c4=new ConnectaQuatre(5, 9);
		char c4tauler[][]= c4.getTauler();
		 int amplada = c4tauler[0].length;
		 int altura =c4tauler.length;
		 assertEquals(5, amplada);
		 assertEquals(9, altura);
	}
	@Test
	public void testgetJugador(){
		ConnectaQuatre c4= new ConnectaQuatre(5, 6);
		char Jugador1= c4.getJugador()[0];
		char Jugador2= c4.getJugador()[1];
		assertEquals('Y', Jugador2);
		assertEquals('R', Jugador1);
	}
	@Test
	public void ConnectaQuatre() {
		ConnectaQuatre c4=new ConnectaQuatre(5, 9);
		 assertEquals( c4.getAltura(),9 );
		 assertEquals(c4.getAmplada(), 5);
		 for(int i = 0;i<c4.getAltura();i++) {
			 for(int j=0;j<c4.getAmplada();j++) {
				 assertEquals('.', c4.getTauler()[i][j]);
			 }
		 }
	}

}
