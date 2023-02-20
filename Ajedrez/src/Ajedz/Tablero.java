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
<<<<<<< HEAD
	
=======

	/**
	 * Variables del tamaño del tablero Variables para los colores del tablero
	 */
	static int Ancho = 8;
	static int Largo = 8;

	String ColorBlanco = "Blanco";
	String ColorNegro = "Negro";

	public static void dibujar() {
		 // Dibuja la primera fila con las letras
        System.out.print("  ");
        for (char letra = 'A'; letra <= 'H'; letra++) {
            System.out.printf(" %c ", letra);
        }
        System.out.println();

        // Dibuja las filas del tablero
        for (int i = Largo; i >= 1; i--) {

            System.out.printf("%d ", i);
            // Dibuja las columnas del tablero
            for (int j = 1; j <= Ancho; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("[N]");
                } else {
                    System.out.print("[B]");
                }
            }
       
            System.out.printf(" %d", i);
            System.out.println();
        }

        // Dibuja la última fila con las letras
        System.out.print("  ");
        for (char letra = 'A'; letra <= 'H'; letra++) {
            System.out.printf(" %c ", letra);
        }
        System.out.println();
    }
>>>>>>> main
}
