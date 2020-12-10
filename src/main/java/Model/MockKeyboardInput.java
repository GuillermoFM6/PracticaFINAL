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
		
		case 1:
			jugadas.add(0);

			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
			
		}
	
	}
}