package Model;

import java.util.ArrayList;
import java.util.Scanner;


public class MockTeclado implements InterfazTeclado {
	private ArrayList<Integer> array = new ArrayList<Integer>();
	@Override
	public int leerDato(Scanner input) {
		return array.remove(0);
	}
	public MockTeclado(ArrayList<Integer> a) {
		array=a;
	}


}
