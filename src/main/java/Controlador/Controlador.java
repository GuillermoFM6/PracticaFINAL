package Controlador;


import java.util.Scanner;

import Model.ConnectaQuatre;
import Model.InterfazTeclado;
import Vista.Vistas;

public class Controlador {
	private ConnectaQuatre board=null;
	private Vistas vistas = new Vistas();
	public Controlador(int amp,int alt) {
		this.board =new ConnectaQuatre(amp, alt);
	}
	public ConnectaQuatre getBoard() {return board;}
	
	public void ferJugada(char symbol,Scanner input,InterfazTeclado tec) {
		do {
	          vistas.printTornJugador(symbol);
	          int col = tec.leerDato(input);
	          //Comprobem que la columna que ens ha donat el jugador és vàlida
	          if (!(0 <= col && col < board.getAmplada())) {
	              int ampmenys1 = board.getAmplada() - 1;
	              vistas.printAmpladaTauler(ampmenys1);
	          }else {
	              //Posem el símbol a la posició més baixa possible de la columna
	              if(board.posarSimbol(col, symbol)) {
	                  return;
	              }
	              //Si la columna està plena demanem un altre input
	              vistas.printColumnaPlena(col);
	              }
	           } while (true);	
	}
	public void vistaEscriuNumero(int amplada) {
		vistas.printEscriuNumero(amplada);
	}
	public void vistaPrintBoard(ConnectaQuatre board) {
		vistas.printBoard(board);
	}
	public void vistaPrintGuanyador(char simbol) {
		vistas.printGuanyador(simbol);
	}
	public void vistaPrintNoGuanyador() {
		vistas.printNoGuanyador();
	}
}
