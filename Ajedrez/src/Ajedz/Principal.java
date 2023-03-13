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
      tablero.torreB();
      tablero.torreN();
      tablero.mostrarTablero();
      
   Scanner reader = new Scanner(System.in);
 
   String val = "Seguir";
    tablero.movTorreN();
    
   String vol="seguir";
   tablero.movTorreB();
  /*    
      do {
    	  
    	     tablero.movPeonB();
    	      tablero.mostrarTablero();
    	      tablero.movPeonN();
    	      tablero.mostrarTablero();
    	      System.out.println("seguir");
    	      
    	     
    	  tablero.movAlfilB();
    	  tablero.mostrarTablero();
    	  System.out.println("seguir");
    	  val = reader.next();
      }while(val!="Seguir");
   */
   
  
  
      
      
      
      
     
      
      
      
      
      
      
      
      
      
      
      
      
      
	}

}
