package Model;

import java.util.Scanner;

public class Teclado implements InterfazTeclado{

	public int leerDato(Scanner input) {
		return input.nextInt();
	}
}
