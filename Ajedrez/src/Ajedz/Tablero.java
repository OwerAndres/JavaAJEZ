package Ajedz;

import java.util.Scanner;

/**
 * clase interfaz de tablero, la cual describe el funcionamiento genral de un
 * tablero de ajedrez
 * 
 * @author Ower
 * @author Diego
 * 
 *
 */
public class Tablero {
	/**
	 * Variables del tamaño del tablero Variables para los colores del tablero
	 */
	static int Ancho = 8;
	static int Largo = 8;

	String ColorBlanco = "Blanco";
	String ColorNegro = "Negro";

	String[][] matrizTablero = new String[Ancho][Largo];

	/**
	 * Mostrar el Peon Negro en el tablero, con el caracter "PN"
	 */
	public void peonN() {
		for (int i = 0; i < Largo; i++) {
			for (int j = 0; j < Ancho; j++) {
				if (i == 1 && j >= 0 && j <= 7) {
					/**
					 * Dibuja los peones negros en la fila de la columna 1
					 */
					matrizTablero[i][j] = "[PN]";
				} else if ((i + j) % 2 == 0) {
					matrizTablero[i][j] = "[  ]";
				} else {
					matrizTablero[i][j] = "[  ]";
				}
			}
		}
	}

	
	
	/**
	 * Mostrar el Peon Blanco en el tablero, con el caracter "PB"
	 */
	public void peonB() {
		for (int i = 0; i < Largo; i++) {
			for (int j = 0; j < Ancho; j++) {
				/**
				 * Dibuja los Peones blancos en el tablero en la fila de la columna 6
				 */
				if (i == 6 && j >= 0 && j <= 8) {
					matrizTablero[i][j] = "[PB]";
				}
			}
		}
	}
	
	/**
	 * Mostrar los alfiles negros en tablero
	 */
	public void alfilN() {
		matrizTablero[0][2] = "[AN]";
		matrizTablero[0][5] = "[AN]";
	}

	/**
	 * Mostrar los alfiles blancos en tablero
	 */
	public void alfilB() {
		matrizTablero[7][2] = "[AB]";
		matrizTablero[7][5] = "[AB]";
	}
	
	/**
	 * Mostrar las torres negras en el tablero 
	 */
	public void torreN() {
		matrizTablero[0][0] ="[TN]";
		matrizTablero[0][7] ="[TN]";
		
	}
	
	/**
	 * Mostrar las torres blancas en el tablero
	 */
	public void torreB() {
		matrizTablero[7][0] ="[TB]";
		matrizTablero[7][7] ="[TB]";
		
	}
	
	
	
	/**
	 * Mostrar el tablero completo con ambos tipos de peones
	 */
	public void mostrarTablero() {
		/**
		 * Dibuja la primera fila de letras del tablero
		 */
		System.out.print("  ");
		for (char letra = 'A'; letra <= 'H'; letra++) {
			System.out.printf(" %c  ", letra);
		}
		System.out.println();

		for (int i = 0; i < Largo; i++) {
			System.out.printf("%d ", i);
			for (int j = 0; j < Ancho; j++) {
				System.out.print(matrizTablero[i][j]);
			}
			System.out.printf(" %d", i);
			System.out.println();
		}

		/**
		 * Dibuja la ultima fila de letras del tablero
		 */
		System.out.print("  ");
		for (char letra = 'A'; letra <= 'H'; letra++) {
			System.out.printf(" %c  ", letra);
		}
		System.out.println();
	}

	
	
	
	
	
	
	
	
	/**
	 * Funcion para mover el Alfil blanco
	 */
	
	
	public void movAlfilB() {
		System.out.println("Blanco");
		Scanner reader = new Scanner(System.in);
		System.out.println("Ingresa la fila del alfil que movera: ");
		int filaInicial=reader.nextInt();
		System.out.println("Ingresa la columna del peon que movera: ");
		char columnaInicial = reader.next().toUpperCase().charAt(0);
		
		
		/**
		 * validar si el alfil seleccionado es un falfil blanco
		 */
		if(matrizTablero[filaInicial][columnaInicial - 'A'].equals("[AB]")){
			System.out.println("En la posicion inicial no hay un alfil blanco");
			return;
		}
		
		System.out.println("ingresa la fila donde movera el alfil");
		int filaFinal = reader.nextInt();
		System.out.println("Ingresa la columna donde movera el alfil");
		char columnaFinal = reader.next().toUpperCase().charAt(0);
		
		/**
		 * validar si la posicion final es una casilla vacia o tiene alguna ficha negra
		 */
		if(matrizTablero[filaFinal][columnaFinal - 'A'].equals("[PN]")
				|| !matrizTablero[filaFinal][columnaFinal - 'A'].equals("[  ]")) {
			System.out.println("La posicion final ingresada no es una casilla vacia");
			return;
		}
		
		/**
		 * Mover el alfil por el tablero
		 */
		Alfil alfilB = new Alfil();
		
		if (alfilB.Mover()) {
			if (filaFinal == filaInicial || filaFinal == filaInicial) {
				matrizTablero[filaInicial][columnaInicial - 'A'] = "[  ]";
				matrizTablero[filaFinal][columnaFinal - 'A'] = "[AB]";
				}
			}
		
		
		reader.close();	
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * Funcion para mover el peon blanco en el tablero
	 */
	
	public void movPeonB() {
		System.out.println("Peon Blanco");
		Scanner reader = new Scanner(System.in);
		System.out.print("Ingrese la fila del peon que desea mover: ");
		int filaInicial = reader.nextInt();
		System.out.print("Ingrese la columna del peon que desea mover: ");
		char columnaInicial = reader.next().toUpperCase().charAt(0);

		/**
		 * validador,verificar si peon seleccionado es peon blanco
		 */
		if (!matrizTablero[filaInicial][columnaInicial - 'A'].equals("[PB]")) {
			System.out.println("La posición inicial no hay un peón blanco");
			return;
		}

		System.out.print("Ingrese la fila donde movera el peon: ");
		int filaFinal = reader.nextInt();
		System.out.print("Ingrese la columna donde movera el peon:  ");
		char columnaFinal = reader.next().toUpperCase().charAt(0);

		/**
		 * validador, si la posicion seleccionada es una casilla vacia o tiene alguna ficha 
		 * negra
		 */
		if (matrizTablero[filaFinal][columnaFinal - 'A'].equals("[PN]")
				|| !matrizTablero[filaFinal][columnaFinal - 'A'].equals("[  ]")) {
			System.out.println("La posicion final ingresada no es una casilla vacia");
			return;
		}

		/**
		 * verificar si el peon va realizar su primer movimiento, 
		 * podra mover 2 posiciones
		 * despues solo podra mover 1 posicion
		 */
		Peon peon = new Peon();
		if (peon.movimientoInicial()) {
			if (filaFinal == filaInicial - 1 || filaFinal == filaInicial - 2) {
				matrizTablero[filaInicial][columnaInicial - 'A'] = "[  ]";
				matrizTablero[filaFinal][columnaFinal - 'A'] = "[PB]";
				peon.setMovimientoInicial(true);
			} else {
				System.out.println("El peon solo puede moverse una o dos casillas");
			}
		} else {
			if (filaFinal == filaInicial - 1) {
				matrizTablero[filaInicial][columnaInicial - 'A'] = "[  ]";
				matrizTablero[filaFinal][columnaFinal - 'A'] = "[PB]";
			} else {
				System.out.println("El peon solo puede moverse una posicion hacia delante");
			}
		}
		reader.close();
	}
	
	
	
	/**
	 * Funcion para mover el peon negro en el tablero
	 */
	public void movPeonN() {
		System.out.println("Peon Negro");
		Scanner reader = new Scanner(System.in);
		System.out.print("Ingrese la fila del peon que desea mover: ");
		int filaInicial = reader.nextInt();
		System.out.print("Ingrese la columna del peon que desea mover: ");
		char columnaInicial = reader.next().toUpperCase().charAt(0);

		/**
		 * validador,verificar si peon seleccionado es peon negro
		 */
		if (!matrizTablero[filaInicial][columnaInicial - 'A'].equals("[PN]")) {
			System.out.println("La posición inicial no hay un peon negro");
			return;
		}

		System.out.print("Ingrese la fila donde movera el peon: ");
		int filaFinal = reader.nextInt();
		System.out.print("Ingrese la columna donde movera el peon:  ");
		char columnaFinal = reader.next().toUpperCase().charAt(0);

		/**
		 * validador, si la posicion seleccionada es una casilla vacia o tiene alguna ficha 
		 * blanca
		 */
		if (matrizTablero[filaFinal][columnaFinal - 'A'].equals("[PB]")
				|| !matrizTablero[filaFinal][columnaFinal ].equals("[  ]")) {
			System.out.println("La posicion final ingresada no es una casilla vacia");
			return;
		}

		/**
		 * verificar si el peon va realizar su primer movimiento, 
		 * podra mover 2 posiciones
		 * despues solo podra mover 1 posicion
		 */
		Peon peon = new Peon();
		if (peon.movimientoInicial()) {
			if (filaFinal == filaInicial + 1 || filaFinal == filaInicial + 2) {
				matrizTablero[filaInicial][columnaInicial - 'A'] = "[  ]";
				matrizTablero[filaFinal][columnaFinal - 'A'] = "[PN]";
				peon.setMovimientoInicial(true);
			} else {
				System.out.println("El peon solo puede moverse una o dos casillas");
			}
		} else {
			if (filaFinal == filaInicial + 1) {
				matrizTablero[filaInicial][columnaInicial - 'A'] = "[  ]";
				matrizTablero[filaFinal][columnaFinal - 'A'] = "[PN]";
			} else {
				System.out.println("El peon solo puede moverse una posicion hacia delante");
			}
		}
		reader.close();
		
	
			
	}
	
	public void movTorreN () {
		//parte negra de la torre
		System.out.println("Torre");
		Scanner reader = new Scanner(System.in);
		System.out.print("Ingrese la fila de la torre que desea mover: ");
		int filaInicial = reader.nextInt();
		System.out.print("Ingrese la columna de la torre que desea mover: ");
		char columnaInicial = reader.next().toUpperCase().charAt(0);
		
		/**
		 * validar si la poscion seleccionada es una torre
		 */
		if (!matrizTablero[filaInicial][columnaInicial - 'A'].equals("[TN]")) {
			System.out.println("La posición inicial no hay una torre negra");
			return;
		}
		
		System.out.print("Ingrese la fila donde movera la torre: ");
		int filaFinal = reader.nextInt();
		System.out.print("Ingrese la columna donde movera la torre:  ");
		char columnaFinal = reader.next().toUpperCase().charAt(0);
		
		/**
		 * validador, si la posicion seleccionada es una casilla vacia o tiene alguna ficha 
		 *
		 */
		System.out.println(filaFinal);
		System.out.println(columnaFinal);
		
		if (matrizTablero[filaFinal][columnaFinal - 'A'].equals("[PN]")
				|| !matrizTablero[filaFinal][columnaFinal - 'A'].equals("[  ]")) {
			System.out.println("La posicion final ingresada no es una casilla vacia");
			return;
		}
		
		int num = 0;
		
		
	    switch (columnaFinal) {
	    
	    case'A':
	    	
	        num=0;
	    	
	    	
	    	break;
	    	
	    	
	    	
	    case'B':
	    	num=1;
	    	
	    	break;
	    case'C':
	    	
	    	num=2;
	    	
	    	break;
	    	
	    case'D':
	    	num=3;
	    	
	    	break;
	    case'E':
	    	num=4;
	    	
	    	break;
	    	
	    	
	    	
	    case'F':
	    	num=5;
	    	
	    	break;
	    	
	    case'G':
	    	num=6;
	    
	    	break;
	    case'H':
	    	
	    	num=7;
	    	break;
	    }
	    System.out.println(num);
	    

		// Mover la torre hacia la derecha
	    
		for (columnaFinal = (char) (columnaInicial - 'A'); columnaFinal < Ancho; columnaFinal++) {
		    matrizTablero[filaInicial][columnaFinal] = "T";
		    matrizTablero[filaInicial][columnaInicial] = "-"; // "-" representa una celda vacía
		    columnaInicial = columnaFinal;
		}

		// Mover la torre hacia abajo
		for (int filaNueva = filaInicial + 1; filaNueva < Largo; filaNueva++) {
		    matrizTablero[filaNueva][columnaInicial] = "T";
		    matrizTablero[filaNueva][columnaInicial] = "-";
		    filaInicial = filaNueva;
		}

		// Mover la torre hacia la izquierda
		for (int columnaNueva = columnaInicial - 1; columnaNueva >= 0; columnaNueva--) {
		    matrizTablero[filaInicial][columnaNueva] = "T";
		    matrizTablero[filaInicial][columnaNueva] = "-";
		    columnaInicial = columnaInicial;
		}

		// Mover la torre hacia arriba
		for (int filaNueva = filaInicial - 1; filaNueva >= 0; filaNueva--) {
		    matrizTablero[filaNueva][columnaInicial] = "T";
		    matrizTablero[filaInicial][columnaInicial] = "-";
		    filaInicial = filaNueva;
		}
	}
	
	public void movTorreB() {
		//parte negra de la torre
		System.out.println("Torre");
		Scanner reader = new Scanner(System.in);
		System.out.print("Ingrese la fila de la torre que desea mover: ");
		int filaInicial = reader.nextInt();
		System.out.print("Ingrese la columna de la torre que desea mover: ");
		char columnaInicial = reader.next().toUpperCase().charAt(0);
		
		/**
		 * validar si la poscion seleccionada es una torre
		 */
		if (!matrizTablero[filaInicial][columnaInicial - 'A'].equals("[TN]")) {
			System.out.println("La posición inicial no hay una torre blanca");
			return;
		}
		
		System.out.print("Ingrese la fila donde movera la torre: ");
		int filaFinal = reader.nextInt();
		System.out.print("Ingrese la columna donde movera la torre:  ");
		char columnaFinal = reader.next().toUpperCase().charAt(0);
		
		/**
		 * validador, si la posicion seleccionada es una casilla vacia o tiene alguna ficha 
		 *
		 */
		System.out.println(filaFinal);
		System.out.println(columnaFinal);
		
		if (matrizTablero[filaFinal][columnaFinal - 'A'].equals("[PN]")
				|| !matrizTablero[filaFinal][columnaFinal - 'A'].equals("[  ]")) {
			System.out.println("La posicion final ingresada no es una casilla vacia");
			return;
		}
	
int num = 0;
		
		
	    switch (columnaFinal) {
	    
	    case'A':
	    	
	        num=0;
	    	
	    	
	    	break;
	    	
	    	
	    	
	    case'B':
	    	num=1;
	    	
	    	break;
	    case'C':
	    	
	    	num=2;
	    	
	    	break;
	    	
	    case'D':
	    	num=3;
	    	
	    	break;
	    case'E':
	    	num=4;
	    	
	    	break;
	    	
	    	
	    	
	    case'F':
	    	num=5;
	    	
	    	break;
	    	
	    case'G':
	    	num=6;
	    
	    	break;
	    case'H':
	    	
	    	num=7;
	    	break;
	    }
	    System.out.println(num);
	    

		// Mover la torre hacia la derecha
	    
		for (columnaFinal = (char) (columnaInicial - 'A'); columnaFinal < Ancho; columnaFinal++) {
		    matrizTablero[filaInicial][columnaFinal] = "T";
		    matrizTablero[filaInicial][columnaInicial] = "-"; // "-" representa una celda vacía
		    columnaInicial = columnaFinal;
		}

		// Mover la torre hacia abajo
		for (int filaNueva = filaInicial + 1; filaNueva < Largo; filaNueva++) {
		    matrizTablero[filaNueva][columnaInicial] = "T";
		    matrizTablero[filaNueva][columnaInicial] = "-";
		    filaInicial = filaNueva;
		}

		// Mover la torre hacia la izquierda
		for (int columnaNueva = columnaInicial - 1; columnaNueva >= 0; columnaNueva--) {
		    matrizTablero[filaInicial][columnaNueva] = "T";
		    matrizTablero[filaInicial][columnaNueva] = "-";
		    columnaInicial = columnaInicial;
		}

		// Mover la torre hacia arriba
		for (int filaNueva = filaInicial - 1; filaNueva >= 0; filaNueva--) {
		    matrizTablero[filaNueva][columnaInicial] = "T";
		    matrizTablero[filaInicial][columnaInicial] = "-";
		    filaInicial = filaNueva;
		}
	}
	
	
}



	

	
	
	
	


