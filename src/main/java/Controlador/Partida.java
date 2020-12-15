package Controlador;

import java.util.Scanner;

import Model.ConnectaQuatre;
import Model.InterfazTeclado;
import Model.TeclatMock;

public class Partida {
	//Classe que creada per automatitzar els tests. 
	private Controlador controlador;
	private int altura; 
	private int amplada; 
	private int moves;
	
	public Partida() {
		altura = 6;
		amplada = 7;
		moves = altura * amplada;
		controlador = new Controlador(amplada, altura);
	}
	public String jugar(int numero) {
		/*Simula una partida a partir d'un mock object que cont� les jugades d'aquesta. 
		 El n�mero que passem com a par�metre correspon a una inicilitzaci� diferent del mock que permetr� simular les seg�ents partides:
		
		    1. Vermell guanya amb l�nia horitzontal
			2. Vermell guanya amb l�nia vertical
			3. Vermell guanya amb l�nia diagonal
			4. Groc guanya amb l�nia horitzontal
			5. Groc guanya amb l�nia vertical
			6. Groc guanya amb l�nia diagonal
			7. Empat*/
			
		    String missatgeFinal = "";
			boolean guanyador = false;
		  
		      //Creem la partida
		      controlador.vistaEscriuNumero(amplada);
		      controlador.vistaPrintBoard(controlador.getBoard());
		      InterfazTeclado keyboardInputMock= new TeclatMock(numero);
		      int player = 0;
		      //Iterem sobre el nombre m�xim de moviments i a cada iteraci� canviem al jugador que li toca
		      while(moves > 0 && !guanyador) {
		        //Recuperem el s�mbol de cada jugador
		        char simbol = controlador.getBoard().getJugador()[player];
	
		        //Demanem a quina columna vol posar el s�mbol
		        controlador.ferJugada(simbol, new Scanner(System.in), keyboardInputMock);
		        
		        moves--;
		        player = 1 - player;
		        controlador.vistaPrintBoard(controlador.getBoard());
		        if (controlador.getBoard().jugadaGuanyadora()) {
		          controlador.vistaPrintGuanyador(simbol);
		          missatgeFinal = "Jugador " + simbol + " ha guanyat!";
		          guanyador = true;
		        }
		      }
		      if(!guanyador) {
		      controlador.vistaPrintNoGuanyador();
		      missatgeFinal = "S'ha acabat. No hi ha guanyador!";
		      }
			return missatgeFinal;
		}
	
	public ConnectaQuatre getTauler() {
		return controlador.getBoard();
	}
}
