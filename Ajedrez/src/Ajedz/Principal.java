package Ajedz;

import java.util.Scanner;

/**
 * Clase principal donde se ejecutara todo el juego
 * 
 * @author Ower
 * @author Diego
 *
 */
public class Principal {

	public static void main(String[] args) {
		Tablero tablero = new Tablero();
		tablero.peonN();
		tablero.peonB();
		tablero.alfilN();
		tablero.alfilB();
		tablero.mostrarTablero();

		Scanner reader = new Scanner(System.in);

		int val = 10;

		do {
			
			tablero.movPeonB(reader);
			tablero.mostrarTablero();
			/*
			tablero.movPeonN(reader);
			tablero.mostrarTablero();
			*/
			tablero.movAlfilB(reader);
			tablero.mostrarTablero();
		} while (val != 10);
		
		reader.close();

	}

}
