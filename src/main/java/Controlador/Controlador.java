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
