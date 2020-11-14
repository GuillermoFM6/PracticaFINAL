package Model;

import static org.junit.Assert.*;

import java.awt.print.Printable;

import org.junit.Before;
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
	public void testConnectaQuatre() {
		ConnectaQuatre c4=new ConnectaQuatre(5, 9);
		 assertEquals( c4.getAltura(),9 );
		 assertEquals(c4.getAmplada(), 5);
		 for(int i = 0;i<c4.getAltura();i++) {
			 for(int j=0;j<c4.getAmplada();j++) {
				 assertEquals('.', c4.getTauler()[i][j]);
			 }
		 }
	}
	@Test
	public void testGetUltCol(){
		ConnectaQuatre c4=new ConnectaQuatre(3,4);
		int c4ultCol=c4.getUltCol();
		assertEquals(-1, c4ultCol);
	}
	@Test
	public void testGetUltRow(){
		ConnectaQuatre c4=new ConnectaQuatre(3,4);
		int c4ultRow=c4.getUltRow();
		assertEquals(-1, c4ultRow);
	}
	
	@Test
	public void testSetUltCol() {
		ConnectaQuatre c4= new ConnectaQuatre(5, 6);
		c4.setUltCol(2);
		assertEquals(2, c4.getUltCol());
	}
	@Test
	public void testSetUltRow() {
		ConnectaQuatre c4= new ConnectaQuatre(5, 6);
		c4.setUltRow(2);
		assertEquals(2, c4.getUltRow());
	}
	@Test
	public void testHoritzontal() {
		MockTableroHoritzontal mcHoritzontal =new MockTableroHoritzontal();
		ConnectaQuatre c4=new ConnectaQuatre(5, 9);
		 c4.setTauler(mcHoritzontal.getTauler());
		 c4.setUltRow(0);
		 String sHoritzontal= c4.horitzontal();
		 String proba = "HHHHH";
		 assertEquals(proba, sHoritzontal);
		 
	}
	@Test
	public void testVertical() {
		//Funcionament normal de la funció
		//ConnectaQuatre c4=new ConnectaQuatre(5, 9);
		 /*for(int j=0;j<c4.getAltura();j++) {
			  c4.getTauler()[j][0]='H';
		 }*/
		 MockTableroVertical mcVertical= new MockTableroVertical();
		 ConnectaQuatre c4=new ConnectaQuatre(5, 9);
		 c4.setTauler(mcVertical.getTauler());
		 c4.setUltCol(0);
		 String sVertical= c4.vertical();
		 String proba="HHHHHHHHH";
		 assertEquals(proba, sVertical);
		 //Valor limit per evitar el loop
		 ConnectaQuatre c4limit =new ConnectaQuatre(6, 0);
		 for(int j=0;j<c4limit.getAltura();j++) {
			  c4limit.getTauler()[j][0]='H';
		 }
		 c4limit.setUltCol(0);
		 String verticallimit= c4limit.vertical();
		 assertEquals("", verticallimit);
		//Valor limit per entrar un cop al loop
		 ConnectaQuatre c41loop =new ConnectaQuatre(6, 1);
		 for(int j=0;j<c41loop.getAltura();j++) {
			  c41loop.getTauler()[j][0]='H';
		 }
		 c41loop.setUltCol(0);
		 String verticallimit1= c41loop.vertical();
		 assertEquals("H", verticallimit1);
		 //Valor limit gran per fer moltes passadas
		 ConnectaQuatre c4gran =new ConnectaQuatre(6, 15);
		 for(int j=0;j<c4gran.getAltura();j++) {
			  c4gran.getTauler()[j][0]='H';
		 }
		 c4gran.setUltCol(0);
		 String verticallimitgran= c4gran.vertical();
		 assertEquals("HHHHHHHHHHHHHHH", verticallimitgran);
		 
		
		 
	}
	@Test
	public void testDiagonalPositiva() {
		//Test amb funcionament normal.
		ConnectaQuatre c4=new ConnectaQuatre(5, 9);
		c4.setUltCol(0);
		c4.setUltRow(8);
	    for (int alt = 0; alt < c4.getAltura(); alt++) {
	      int amp = c4.getUltCol() + c4.getUltRow() - alt;

	      if (0 <= amp && amp < c4.getAmplada()) {
	        c4.getTauler()[alt][amp]='H';
	      		}
	    }
	     
		 String sDiagonalPositiva= c4.diagonalPositiva();
		 String proba="HHHHH";
		 assertEquals(proba, sDiagonalPositiva);
		 //Valor limit per evitar el loop
		 ConnectaQuatre c4limit=new ConnectaQuatre(6, 0);
			c4limit.setUltCol(0);
			c4limit.setUltRow(0);
		    for (int alt = 0; alt < c4limit.getAltura(); alt++) {
		      int amp = c4limit.getUltCol() + c4limit.getUltRow() - alt;
	
		      if (0 <= amp && amp < c4limit.getAmplada()) {
		        c4limit.getTauler()[alt][amp]='H';
		      		}
		    }
		     
			 String sDiagonalPositivalimit= c4limit.diagonalPositiva();
			 String probalimit="";
			 assertEquals(probalimit, sDiagonalPositivalimit);
		//Valor limit per entrar una vegada al loop
		 ConnectaQuatre c4limit1=new ConnectaQuatre(6, 1);
			c4limit1.setUltCol(0);
			c4limit1.setUltRow(0);
		    for (int alt = 0; alt < c4limit1.getAltura(); alt++) {
		      int amp = c4limit1.getUltCol() + c4limit1.getUltRow() - alt;
	
		      if (0 <= amp && amp < c4limit1.getAmplada()) {
		        c4limit1.getTauler()[alt][amp]='H';
		      		}
		    }
		     
			 String sDiagonalPositivalimit1= c4limit1.diagonalPositiva();
			 String probalimit1="H";
			
			 assertEquals(probalimit1, sDiagonalPositivalimit1);
		//Valor limit per entrar molts cops al loop
		 ConnectaQuatre c4limitm=new ConnectaQuatre(6, 25);
			c4limitm.setUltCol(0);
			c4limitm.setUltRow(5);
		    for (int alt = 0; alt < c4limitm.getAltura(); alt++) {
		      int amp = c4limitm.getUltCol() + c4limitm.getUltRow() - alt;
	
		      if (0 <= amp && amp < c4limitm.getAmplada()) {
		        c4limitm.getTauler()[alt][amp]='H';
		      		}
		    }
			 String sDiagonalPositivalimitm= c4limitm.diagonalPositiva();
			 String probalimitm="HHHHHH";
			 assertEquals(probalimitm, sDiagonalPositivalimitm);
		 
	}
	@Test
	public void testDiagonalNegativa() {
		//TEST amb funcionament normal
		ConnectaQuatre c4=new ConnectaQuatre(5, 9);
		c4.setUltCol(4);
		c4.setUltRow(8);
	    for (int alt = 0; alt < c4.getAltura(); alt++) {
	      int amp = c4.getUltCol() - c4.getUltRow() + alt;

	      if (0 <= amp && amp < c4.getAmplada()) {
	        c4.getTauler()[alt][amp]='H';
	      		}
	    }
	     
		 String sDiagonalNegativa= c4.diagonalNegativa();
		 String proba="HHHHH";
		 assertEquals(proba, sDiagonalNegativa);
		 //TEST amb valor limit per evitar loop
		ConnectaQuatre c4lim=new ConnectaQuatre(6, 0);
		c4lim.setUltCol(0);
		c4lim.setUltRow(0);
	    for (int alt = 0; alt < c4lim.getAltura(); alt++) {
	      int amp = c4lim.getUltCol() - c4lim.getUltRow() + alt;

	      if (0 <= amp && amp < c4lim.getAmplada()) {
	        c4lim.getTauler()[alt][amp]='H';
	      		}
	    }
	     
		 String sDiagonalNegativalim= c4lim.diagonalNegativa();
		 String probalim="";
		 assertEquals(probalim, sDiagonalNegativalim);
		 //TEST amb valor limit per entrar 1 cop al loop
		ConnectaQuatre c4lim1=new ConnectaQuatre(6, 1);
		c4lim1.setUltCol(5);
		c4lim1.setUltRow(0);
	    for (int alt = 0; alt < c4lim1.getAltura(); alt++) {
	      int amp = c4lim1.getUltCol() - c4lim1.getUltRow() + alt;

	      if (0 <= amp && amp < c4lim1.getAmplada()) {
	        c4lim1.getTauler()[alt][amp]='H';
	      		}
	    }
	     
		 String sDiagonalNegativalim1= c4lim1.diagonalNegativa();
		 
		 String probalim1="H";
		 assertEquals(probalim1, sDiagonalNegativalim1);
		//TEST amb valor limit per entrar molts cops al loop
		ConnectaQuatre c4limm=new ConnectaQuatre(6, 25);
		c4limm.setUltCol(5);
		c4limm.setUltRow(24);
	    for (int alt = 0; alt < c4limm.getAltura(); alt++) {
	      int amp = c4limm.getUltCol() - c4limm.getUltRow() + alt;

	      if (0 <= amp && amp < c4limm.getAmplada()) {
	        c4limm.getTauler()[alt][amp]='H';
	      		}
	    }
	     
		 String sDiagonalNegativalimm= c4limm.diagonalNegativa();
		 String probalimm="HHHHHH";
		 assertEquals(probalimm, sDiagonalNegativalimm);
	}
	@Test
	public void testposarSimbol() {
		//Comprobem que s'ha introduit el nombre correctament
		ConnectaQuatre c4 = new ConnectaQuatre(6, 7);
		boolean c4proba=c4.posarSimbol(3, 'R');	
		assertEquals(true, c4proba);
		//Comprobem que el nombre s'ha introduit a la posició correcta
		String columnaString=c4.vertical();
		assertEquals("......R", columnaString);
		//Comprobem que s'ha introduit correctament a sobre de un altre simbol.
		boolean c4proba2=c4.posarSimbol(3, 'Y');
		assertEquals(true, c4proba2);
		//Comprobem que el nombre s'ha introduit a la posició correcta a sobre de un altre simbol.
		String columnaString2 = c4.vertical();
		assertEquals(".....YR", columnaString2);
		//Test condicio if false
		ConnectaQuatre c4col = new ConnectaQuatre(6, 2);
		boolean proba=c4col.posarSimbol(3, 'Y');
		 		proba=c4col.posarSimbol(3, 'Y');
		 		proba=c4col.posarSimbol(3, 'Y');
		assertEquals(false, proba);
		//Test amb valor limit per evitar loop
		ConnectaQuatre c4no = new ConnectaQuatre(6, 0);
		boolean testno=c4no.posarSimbol(1, 'Y');
		assertEquals(false, testno);
		//Test amb valor limit per entrar 1 cop al loop
		ConnectaQuatre c4lim = new ConnectaQuatre(6, 1);
		boolean c4limit=c4lim.posarSimbol(3, 'R');	
		assertEquals(true, c4limit);
		String columnaStringlimit=c4lim.vertical();
		assertEquals("R", columnaStringlimit);
		//Test amb valor limit per entrar moltes vegades al loop
		ConnectaQuatre c4mol = new ConnectaQuatre(6, 15);
		boolean c4molt=false;
		for(int i=0;i<c4mol.getAltura();i++)
		{c4molt=c4mol.posarSimbol(3, 'R');}
		assertEquals(true, c4molt);
		String columnaStringmolt=c4mol.vertical();
		assertEquals("RRRRRRRRRRRRRRR", columnaStringmolt);
	}
	@Test
	public void testEstadins()
	{
		
		boolean PROBAtrue=ConnectaQuatre.estaDins("YYYYRRRRYYYY", "RRRR");
		assertEquals(true, PROBAtrue);
		boolean Probafalse=ConnectaQuatre.estaDins("YRYRYRYRYRYRY", "RRRR");
		assertEquals(false, Probafalse);
	}
	@Test
	public void testjugadaGuanyadora() {
		//Test comprobació jugada amb horitzontal
		ConnectaQuatre c4h =new ConnectaQuatre(6, 7);
		boolean test=c4h.posarSimbol(1, 'Y');
		test=c4h.posarSimbol(2, 'Y');
		test=c4h.posarSimbol(3, 'Y');
		test=c4h.posarSimbol(4, 'Y');
		boolean testwinhoritzontal=c4h.jugadaGuanyadora();
		assertEquals(true,testwinhoritzontal );
		//Test comprobació jugada amb vertical
		ConnectaQuatre c4v =new ConnectaQuatre(6, 7);
		boolean test1=c4v.posarSimbol(1, 'Y');
		test1=c4v.posarSimbol(1, 'Y');
		test1=c4v.posarSimbol(1, 'Y');
		test1=c4v.posarSimbol(1, 'Y');
		boolean testwinvertical=c4v.jugadaGuanyadora();
		assertEquals(true,testwinvertical );
		//Test comprobació jugada amb diagonalpositiva
		ConnectaQuatre c4dp =new ConnectaQuatre(6, 7);
		boolean test2=c4dp.posarSimbol(1, 'Y');
		test2=c4dp.posarSimbol(2, 'R');
		test2=c4dp.posarSimbol(2, 'Y');
		test2=c4dp.posarSimbol(3, 'R');
		test2=c4dp.posarSimbol(3, 'R');
		test2=c4dp.posarSimbol(3, 'Y');
		test2=c4dp.posarSimbol(4, 'Y');
		test2=c4dp.posarSimbol(4, 'R');
		test2=c4dp.posarSimbol(4, 'R');
		test2=c4dp.posarSimbol(4, 'Y');
		boolean testwindiagonalP=c4dp.jugadaGuanyadora();
		assertEquals(true,testwindiagonalP );
		//Test comprobació jugada amb DiagonalNegativa
		ConnectaQuatre c4dn =new ConnectaQuatre(6, 7);
		boolean test3=c4dn.posarSimbol(4, 'Y');
		test3=c4dn.posarSimbol(3, 'R');
		test3=c4dn.posarSimbol(3, 'Y');
		test3=c4dn.posarSimbol(2, 'R');
		test3=c4dn.posarSimbol(2, 'R');
		test3=c4dn.posarSimbol(2, 'Y');
		test3=c4dn.posarSimbol(1, 'Y');
		test3=c4dn.posarSimbol(1, 'R');
		test3=c4dn.posarSimbol(1, 'R');
		test3=c4dn.posarSimbol(1, 'Y');
		boolean testwindiagonalN=c4dn.jugadaGuanyadora();
		assertEquals(true,testwindiagonalN );
		//Test comprovacio false
		ConnectaQuatre c4f =new ConnectaQuatre(6, 7);
		boolean test4=c4f.posarSimbol(1, 'Y');
		test4=c4f.posarSimbol(1, 'Y');
		test4=c4f.posarSimbol(1, 'Y');
		test4=c4f.posarSimbol(1, 'R');
		boolean testfalse=c4f.jugadaGuanyadora();
		assertEquals(false,testfalse );
		//Test comprovacio if true
		ConnectaQuatre c4if =new ConnectaQuatre(6, 7);
		boolean testiffalse=c4if.jugadaGuanyadora();
		assertEquals(false, testiffalse);

	}
	

}

