package Model;

import java.util.Arrays;


public class ConnectaQuatre {
	//Definim les fitxes de cada jugador
	private static final char[] JUGADORS = {'R','Y'};
	//Variables per guardar l'ultim moviment del jugador
	private int ultCol = -1, ultRow = -1;
	//Dimensions del tauler
	private final int amplada, altura;
	//Quadricula per el tauler
	private final char[][] tauler;
	
	public int getUltCol() { return 0;}
	
	public int getUltRow() {return 0;}
	
	public int getAmplada() {return amplada;}
	
	public int getAltura() {return altura;}
	
	public char[] getJugador() {return JUGADORS;}
	
	public char [][] getTauler(){return tauler;}
	
	public ConnectaQuatre(int amp,int alt) {
		amplada = amp;
		altura = alt;
		tauler = new char[alt][];
		//Inicialitzem el tauler amb espais blancs
		for (int i=0; i<alt; i++) {
			Arrays.fill(tauler[i]= new char[amp], '.');
		}
		
	}
	public void setUltCol(int col) {}
	public void setUltRow(int row) {}
	public String horitzontal(){
		return null;
		
	}
}
