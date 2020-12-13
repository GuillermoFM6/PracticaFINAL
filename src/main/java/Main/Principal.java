package Main;

import java.util.Scanner;

import Controlador.Controlador;
import Model.Teclado;

public class Principal {
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      //Assignem les dimensions del nostre tauler
      int altura = 7; int amplada = 7; int moves = altura * amplada;

      //Creem la partida
      Controlador controlador = new Controlador(amplada, altura);
     
      controlador.vistaEscriuNumero(amplada);
      
      controlador.vistaPrintBoard(controlador.getBoard());
      Teclado intTec= new Teclado();
      //Iterem sobre el nombre màxim de moviments i a cada iteració canviem al jugador que li toca
      for (int player = 0; moves-- > 0; player = 1 - player) {
        //Recuperem el símbol de cada jugador
        char simbol = controlador.getBoard().getJugador()[player];

        //Demanem a quina columna vol posar el símbol
        controlador.ferJugada(simbol, input,intTec);

        
        controlador.vistaPrintBoard(controlador.getBoard());

        
        if (controlador.getBoard().jugadaGuanyadora()) {
          controlador.vistaPrintGuanyador(simbol);
          return;
        }
      }

      controlador.vistaPrintNoGuanyador();
    }
  }

}
