package Model;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class ConnectaQuatre {
	//Definim les fitxes de cada jugador
	private static final char[] JUGADORS = {'R','Y'};
	//Variables per guardar l'ultim moviment del jugador
	private int ultCol = -1, ultRow = -1;
	//Dimensions del tauler
	private final int amplada, altura;
	//Quadricula per el tauler
	private  char[][] tauler;
	
	public int getUltCol() { return ultCol;}
	
	public int getUltRow() {return ultRow;}
	
	public int getAmplada() {return amplada;}
	
	public int getAltura() {return altura;}
	
	public char[] getJugador() {return JUGADORS;}
	
	public char [][] getTauler(){return tauler;}
	
	public void setTauler(char [][]a) {tauler=a;}
	
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
	 //Coloca el simbol del jugador a la posició dessitjada
	 public Boolean posarSimbol(int col, char symbol) {
		  Boolean ficat=false;
		  for (int h = altura - 1; h >= 0; h--) {
			  if (tauler[h][col] == '.') {
				  tauler[ultRow = h][ultCol = col] = symbol;
				  ficat = true;
				  break;
			  }
	      }
		  return ficat;
	  }
	// Mètode per comprovar si una String conté una Substring al seu interior
	public static boolean estaDins(String str, String guanyadora) {
	    Boolean dins = str.indexOf(guanyadora) >= 0;
	    return dins;
	  }
	public boolean jugadaGuanyadora() {
		if (ultCol == -1) 
			{
		      System.err.println("Encara no s'han fet moviments");
		      return false;
		    }
		    char caracter =tauler[ultRow][ultCol];
		    //Possible String guanyadora
		    String guanyadora =String.format("%c%c%c%c", caracter, caracter, caracter, caracter);
		    //Mira si la String guanyadora es troba en alguna de les strings que generem a partir de l'últim moviment
		    boolean trobat=false;
		    if( estaDins(horitzontal(), guanyadora) || 
		    		estaDins(vertical(), guanyadora) || 
		    		estaDins(diagonalPositiva(), guanyadora) || 
		    		estaDins(diagonalNegativa(), guanyadora))
			{
			    trobat=true;
			}
		    return trobat;
	}
	// Fem ús de la llibreria Stream per representar millor el tauler cada vegada que el volem mostrar per pantalla
	public String toString() {
	    return IntStream.range(0,  amplada).
	           mapToObj(Integer::toString).
	           collect(Collectors.joining()) + 
	           "\n" +
	           Arrays.stream(tauler).
	           map(String::new).
	           collect(Collectors.joining("\n"));
	  }
 
	 
}
