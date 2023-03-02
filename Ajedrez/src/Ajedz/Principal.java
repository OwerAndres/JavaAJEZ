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
   int num = 0;
    
      
      do {
    	     tablero.movPeonB();
    	      tablero.mostrarTablero();
    	      tablero.movPeonN();
    	      tablero.mostrarTablero();
    	      System.out.println("seguir");
    	      num = reader.nextInt();
      }while(num!=0);
      
  
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}

}
