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
	
	public int getAmplada() {return 0;}
	
	public int getAltura() {return 0;}
	
	public char[] getJugador() {return null;}
	
	public char [][] getTauler(){return null;}
	
	public ConnectaQuatre(int amp,int alt) {
		this.tauler = null;
		this.altura=0;
		this.amplada=0;
		
	}
}
