package Controlador;

import java.util.Scanner;

import Model.ConnectaQuatre;
import Model.InterfazTeclado;
import Model.KeyboardInputMock;

public class Partida {
	//Classe que creada per automatitzar els tests. 
	private Controlador controlador;
	private int altura; 
	private int amplada; 
	private int moves;
	
	public Partida() {
		altura = 7;
		amplada = 7;
		moves = altura * amplada;
		controlador = new Controlador(amplada, altura);
	}
	public String play(int numero) {
		/*Simula una partida a partir d'un mock object que conté les jugades d'aquesta. 
		 El número que passem com a paràmetre correspon a una inicilització diferent del mock que permetrà simular les següents partides:
		
		    1. Vermell guanya amb línia horitzontal
			2. Vermell guanya amb línia vertical
			3. Vermell guanya amb línia diagonal
			4. Groc guanya amb línia horitzontal
			5. Groc guanya amb línia vertical
			6. Groc guanya amb línia diagonal*/
			
		    String missatgeFinal = "";
			boolean guanyador = false;
		  
		      //Creem la partida
		      controlador.vistaEscriuNumero(amplada);
		      controlador.vistaPrintBoard(controlador.getBoard());
		      InterfazTeclado keyboardInputMock= new KeyboardInputMock(numero);
		      int player = 0;
		      //Iterem sobre el nombre màxim de moviments i a cada iteració canviem al jugador que li toca
		      while(moves > 0 && !guanyador) {
		        //Recuperem el símbol de cada jugador
		        char simbol = controlador.getBoard().getJugador()[player];
	
		        //Demanem a quina columna vol posar el símbol
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
