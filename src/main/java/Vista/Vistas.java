package Vista;

import Model.ConnectaQuatre;

public class Vistas {
	public void printTornJugador(char symbol) {
		System.out.println("\nTorn del jugador: " + symbol);
	}
	
	public void printAmpladaTauler(int amp) {
		System.out.println("La columna ha d'estar entre 0 i " + (amp));
	}
	
	public void printColumnaPlena(int col) {
		System.out.println("La columna " + col + " està plena.");
	}
	
	public void printEscriuNumero(int amplada) {
		System.out.println("Escriu un número de 0-" + (amplada - 1) + " per escollir una columna");
	}
	
	public void printBoard(ConnectaQuatre board) {
		System.out.println(board);
	}
	
	public void printGuanyador(char simbol) {
		System.out.println("\nJugador " + simbol + " ha guanyat!");
	}
	
	public void printNoGuanyador()
	{
		System.out.println("S'ha acabat. No hi ha guanyador!");
	}
}
