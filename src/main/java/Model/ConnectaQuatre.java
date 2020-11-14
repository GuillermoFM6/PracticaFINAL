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
	
	public int getUltCol() { return ultCol;}
	
	public int getUltRow() {return ultRow;}
	
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
	public void setUltCol(int col) {this.ultCol=col;}
	public void setUltRow(int row) {this.ultRow=row;}
	// Retornem com a string la fila de la última posició que s'ha actualitzat
	public String horitzontal(){
		String horitzontal = new String(tauler[ultRow]);
	    return horitzontal;
	}
	// Retornem com a string la columna de la última posició que s'ha actualitzat
	public String vertical() {
		  StringBuilder sb = new StringBuilder(altura);
	
		    for (int alt = 0; alt < altura; alt++) {
		      sb.append(tauler[alt][ultCol]);
		    }
		    // Aquest to string és una funció de la llibreria StringBuilder, no és la funció que tenim abans implementada
		    String vertical = sb.toString();
		    return vertical;
	  }
	// Retornem com a string la diagonal "/" de la última posició que s'ha actualitzat
	public String diagonalPositiva() {
		StringBuilder sb = new StringBuilder(altura);

	    for (int alt = 0; alt < altura; alt++) {
	      int amp = ultCol + ultRow - alt;

	      if (0 <= amp && amp < amplada) {
	        sb.append(tauler[alt][amp]);
	      }
	    }
	    String diagonal = sb.toString();
	    return diagonal;
	  }
	 // Retornem com a string la diagonal "\" de la última posició que s'ha actualitzat
	 public String diagonalNegativa() {
	    StringBuilder sb = new StringBuilder(altura);

	    for (int alt = 0; alt < altura; alt++) {
	      int amp = ultCol - ultRow + alt;

	      if (0 <= amp && amp < amplada) {
	        sb.append(tauler[alt][amp]);
	      }
	    }
	    String diagonal = sb.toString();
	    return diagonal;
	  }
}
