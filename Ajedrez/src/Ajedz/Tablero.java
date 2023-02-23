package Ajedz;

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

	/**
	 * Dibuja el tablero
	 */
	public static void dibujar() {
		  /**
	     * Dibuja la primera fila de las letras
	     */
	    System.out.print("  ");
	    for (char letra = 'A'; letra <= 'H'; letra++) {
	        System.out.printf(" %c ", letra);
	    }
	    System.out.println();

	    /**
	     * Dibujas las filas del tablero
	     */
	    String[][] matrizTablero = new String[Ancho][Largo];

	    for (int i = 0; i < Largo; i++) {
	        /**
	         * Dibuja los numeros de la columna izquierda del tablero
	         */
	        System.out.printf("%d ", i + 1);

	        /**
	         * dibuja las columnas del tablero
	         */
	        for (int j = 0; j < Ancho; j++) {
	            if ((i + j) % 2 == 0) {
	                matrizTablero[i][j] = "[ ]";
	            } else {
	                matrizTablero[i][j] = "[ ]";
	            }
	            System.out.print(matrizTablero[i][j]);
	        }
	        /**
	         * dibuja los numeros de la columna derecha del tablero
	         */
	        System.out.printf(" %d", i + 1);
	        System.out.println();
	    }

	    /**
	     * Dibuja las letras de la ultima fila del tablero
	     */
	    System.out.print("  ");
	    for (char letra = 'A'; letra <= 'H'; letra++) {
	        System.out.printf(" %c ", letra);
	    }
	    System.out.println();
}
	

	/**
	 * Mostrar el Peon Negro en el tablero, con el caracter "P"
	 */
	public static void peon() {
	    /**
	     * Dibuja la primera fila de letras del tablero
	     */
	    System.out.print("  ");
	    for (char letra = 'A'; letra <= 'H'; letra++) {
	        System.out.printf(" %c  ", letra);
	    }
	    System.out.println();

	    String[][] matrizTablero = new String[Ancho][Largo];
	    for (int i = 0; i < Largo; i++) {
	        System.out.printf("%d ", i);
	        for (int j = 0; j < Ancho; j++) {
	            if (i == 1 && j >= 0 && j <= 7) {
	                /**
	                 * Dibuja los peones negros en la fila de la columna 7
	                 */
	                matrizTablero[i][j] = "[PN]";
	            } else if ((i + j) % 2 == 0) {
	                matrizTablero[i][j] = "[  ]";
	            } else {
	                matrizTablero[i][j] = "[  ]";
	            }
	            /**
	             * Dibuja los Peones blancos en el tablero
	             * en la fila de la columna 2 
	             */
	            if (i == 6 && j >= 0 && j <= 7) {
	                matrizTablero[i][j] = "[PB]";
	            }
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
	 * metodo mover
	 */
	
	}


