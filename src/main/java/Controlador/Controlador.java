package Controlador;


import Model.ConnectaQuatre;
import Vista.Vistas;

public class Controlador {
	private ConnectaQuatre board=null;
	private Vistas vistas = new Vistas();
	public Controlador(int amp,int alt) {
		this.board =new ConnectaQuatre(amp, alt);
	}
	public ConnectaQuatre getBoard() {return board;}

}
