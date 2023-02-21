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
	 * Variables del tamaño del tablero 
	 * Variables para los colores del tablero
	 */
	static int Ancho = 8;
	static int Largo = 8;

	String ColorBlanco = "Blanco";
	String ColorNegro = "Negro";

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
			System.out.printf("%d ", Largo - i);
			
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
			System.out.printf(" %d", Largo - i);
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
	
	
}
