package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MockKeyboardInput implements InterfazTeclado {
	private List<Integer> jugadas = new ArrayList<Integer>();
	@Override
	public int leerDato(Scanner input) {
		return jugadas.remove(0);
	}
	public MockKeyboardInput(int numero) {
		switch(numero) {
		//Sempre inicia el mateix color.
		case 1:
			//Guanya amb horitzontals
			jugadas.add(0);
			jugadas.add(-1);
			jugadas.add(0);
			jugadas.add(1);
			jugadas.add(1);
			jugadas.add(5);
			jugadas.add(2);
			jugadas.add(2);
			jugadas.add(3);

			break;
		case 2:
			//Guanya amb verticals
			jugadas.add(0);
			jugadas.add(-1);
			jugadas.add(1);
			jugadas.add(0);
			jugadas.add(5);
			jugadas.add(2);
			jugadas.add(0);
			jugadas.add(3);
			jugadas.add(0);
			break;
		case 3:
			//Guanya amb diagonal
			jugadas.add(0);
			jugadas.add(-1);
			jugadas.add(1);
			jugadas.add(1);
			jugadas.add(5);
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
			//Guanya amb horitzontals
			jugadas.add(4);
			jugadas.add(0);
			jugadas.add(-1);
			jugadas.add(0);
			jugadas.add(1);
			jugadas.add(1);
			jugadas.add(5);
			jugadas.add(2);
			jugadas.add(2);
			jugadas.add(3);
			break;
		case 5:
			//Guanya amb verticals
			jugadas.add(4);
			jugadas.add(0);
			jugadas.add(-1);
			jugadas.add(1);
			jugadas.add(0);
			jugadas.add(5);
			jugadas.add(2);
			jugadas.add(0);
			jugadas.add(3);
			jugadas.add(0);
			break;
		case 6:
			//Guanya amb diagonal
			jugadas.add(4);
			jugadas.add(0);
			jugadas.add(-1);
			jugadas.add(1);
			jugadas.add(1);
			jugadas.add(5);
			jugadas.add(2);
			jugadas.add(3);
			jugadas.add(2);
			jugadas.add(2);
			jugadas.add(3);
			jugadas.add(4);
			jugadas.add(3);
			jugadas.add(3);
			break;
			
		}
	
	}
}