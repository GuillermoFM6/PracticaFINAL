package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyboardInputMock implements InterfazTeclado {
	//Mock creat per simular els inputs que introdueix l'usuari per teclat
	
	private List<Integer> jugadas = new ArrayList<Integer>();
	
	
	public KeyboardInputMock(int numero) {
		switch(numero) {
		//Sempre inicia la partida les fitxes vermelles.
		case 1:
			//Guanya vermell amb horitzontals
			jugadas.add(0);
			jugadas.add(-1);
			jugadas.add(0);
			jugadas.add(1);
			jugadas.add(1);
			jugadas.add(7);
			jugadas.add(2);
			jugadas.add(2);
			jugadas.add(3);

			break;
		case 2:
			//Guanya vermell amb verticals
			jugadas.add(0);
			jugadas.add(-1);
			jugadas.add(1);
			jugadas.add(0);
			jugadas.add(7);
			jugadas.add(2);
			jugadas.add(0);
			jugadas.add(3);
			jugadas.add(0);
			break;
		case 3:
			//Guanya vermell amb diagonal
			jugadas.add(0);
			jugadas.add(-1);
			jugadas.add(1);
			jugadas.add(1);
			jugadas.add(7);
			jugadas.add(2);
			jugadas.add(3);
			jugadas.add(2);
			jugadas.add(2);
			jugadas.add(3);
			jugadas.add(4);
			jugadas.add(3);
			jugadas.add(3);
			break;
		case 4:
			//Guanya groc amb horitzontals
			jugadas.add(4);
			jugadas.add(0);
			jugadas.add(-1);
			jugadas.add(0);
			jugadas.add(1);
			jugadas.add(1);
			jugadas.add(7);
			jugadas.add(2);
			jugadas.add(2);
			jugadas.add(3);
			break;
		case 5:
			//Guanya groc amb verticals
			jugadas.add(6);
			jugadas.add(0);
			jugadas.add(-1);
			jugadas.add(1);
			jugadas.add(0);
			jugadas.add(7);
			jugadas.add(2);
			jugadas.add(0);
			jugadas.add(3);
			jugadas.add(0);
			break;
		case 6:
			//Guanya groc amb diagonal
			jugadas.add(6);
			jugadas.add(0);
			jugadas.add(-1);
			jugadas.add(1);
			jugadas.add(1);
			jugadas.add(7);
			jugadas.add(2);
			jugadas.add(3);
			jugadas.add(2);
			jugadas.add(2);
			jugadas.add(3);
			jugadas.add(6);
			jugadas.add(3);
			jugadas.add(3);
			break;
		case 7:
			//Empat. No hi ha guanyadors
			jugadas.add(-1);
			jugadas.add(7);
			jugadas.add(0);
			jugadas.add(1);
			jugadas.add(0);
			jugadas.add(1);
			jugadas.add(0);
			jugadas.add(1);
			jugadas.add(1);
			jugadas.add(0);
			jugadas.add(1);
			jugadas.add(0);
			jugadas.add(1);
			jugadas.add(0);
			jugadas.add(0);
			jugadas.add(1);
			jugadas.add(2);
			jugadas.add(3);
			jugadas.add(2);
			jugadas.add(3);
			jugadas.add(2);
			jugadas.add(3);
			jugadas.add(3);
			jugadas.add(2);
			jugadas.add(3);
			jugadas.add(2);
			jugadas.add(3);
			jugadas.add(2);
			jugadas.add(2);
			jugadas.add(3);
			jugadas.add(4);
			jugadas.add(5);
			jugadas.add(4);
			jugadas.add(5);
			jugadas.add(4);
			jugadas.add(5);
			jugadas.add(5);
			jugadas.add(4);
			jugadas.add(5);
			jugadas.add(4);
			jugadas.add(5);
			jugadas.add(4);
			jugadas.add(4);
			jugadas.add(5);
			jugadas.add(6);
			jugadas.add(6);
			jugadas.add(6);
			jugadas.add(6);
			jugadas.add(6);
			jugadas.add(6);
			jugadas.add(6);
			break;
		}
	
	}
	
	@Override
	public int leerDato(Scanner input) {
		// TODO Auto-generated method stub
	    return jugadas.remove(0);
	}
	
}