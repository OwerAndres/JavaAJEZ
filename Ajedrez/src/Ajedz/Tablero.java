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
	 * Mostrar el Peon Negro en el tablero, con el caracter "P"
	 */
	public void peonN() {
	    for (int i = 0; i < Largo; i++) {
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
	        }
	    }
	}

	/**
	 * Mostrar el Peon Blanco en el tablero, con el caracter "P"
	 */
	public void peonB() {
	    for (int i = 0; i < Largo; i++) {
	        for (int j = 0; j < Ancho; j++) {
	            /**
	             * Dibuja los Peones blancos en el tablero en la fila de la columna 2
	             */
	            if (i == 6 && j >= 0 && j <= 8) {
	                matrizTablero[i][j] = "[PB]";
	            }
	        }
	    }
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


	

}

