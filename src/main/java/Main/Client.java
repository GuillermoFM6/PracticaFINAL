package Main;

import java.util.Scanner;

import Controlador.Controlador;
import Model.InterfazTeclado;
import Model.KeyboardInputMock;
import Model.Teclado;

public class Client {
	public static void main(String[] args) {
		int partida = 0;
		while(partida != 7){
			System.out.print("*-----------------MENU-----------------*\n");
			System.out.print("Seleccioni la partida que vol visualitzar:\n");
			System.out.print("1. Vermell guanya amb fila horitzontal\n");
			System.out.print("2. Vermell guanya amb fila vertical\n");
			System.out.print("3. Vermell guanya amb fila diagonal\n");
			System.out.print("4. Groc guanya amb fila horitzontal\n");
			System.out.print("5. Groc guanya amb fila vertical\n");
			System.out.print("6. Groc guanya amb fila diagonal\n");
			System.out.print("7. Exit\n");
			
			Scanner input = new Scanner(System.in);
			partida = input.nextInt();
			if(partida > 0 && partida < 7) {
			boolean guanyador = false;
		      //Assignem les dimensions del nostre tauler
		      int altura = 7; int amplada = 7; int moves = altura * amplada;
	
		      //Creem la partida
		      Controlador controlador = new Controlador(amplada, altura);
		     
		      controlador.vistaEscriuNumero(amplada);
		      
		      controlador.vistaPrintBoard(controlador.getBoard());
		      InterfazTeclado keyboardInputMock= new KeyboardInputMock(partida);
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
		          guanyador = true;
		        }
		      }
		      if(!guanyador) {
		      controlador.vistaPrintNoGuanyador();
		      }
		 
			}
		}
	}
}


