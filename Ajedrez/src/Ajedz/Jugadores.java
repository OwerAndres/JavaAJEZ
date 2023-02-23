package Ajedz;

import java.util.Scanner;

/**
 * Clase donde se alojan las variables de los dos jugadores
 * 
 * @author Ower
 * @author Diego
 *
 */
public class Jugadores {

	private Tablero tablero;
	private String jugador1;
	private String jugador2;

	public Jugadores(String jugador1, String jugador2, Tablero tablero) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.tablero = tablero;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public String getJugador1() {
		return jugador1;
	}

	public String getJugador2() {
		return jugador2;
	}

	public void jugador() {
		Scanner teclado = new Scanner(System.in);

		String colorBlanco;
		String colorNegro;

		// pedimos a los jugadores que pidan un color
		System.out.println("================================================");
		System.out.println("digite una de las opciones prederterminada: ");
		System.out.println("1. Color Blanco");
		System.out.println("2. Color Negro ");
		System.out.println("================================================");

		String jugador1;
		String jugador2;
		// damos la opcion de esoger al jugador que color quiere tomar.
		System.out.println("el primer jugador digite el color que desea: ");
		jugador1 = teclado.next();

		System.out.println("el segundo jugador digite el color que desea: ");
		jugador2 = teclado.next();

		// creamos un if y un else para saber quien empieza primero
		if (jugador1.equals("1")) {

			System.out.println("Jugador 1 empieza primero ya que ha tomado el color blanco.");

		}

		else {

			System.out.println("Jugador 2 empieza primero ya que ha tomado el color blanco.");
		}
	}
}
