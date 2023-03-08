package Ajedz;
/**
 * clase de la pieza alfil
 * 
 * @author Ower
 * @author Diego
 *
 */
public class Alfil implements Fichas{

	/**
	 * Atributos del alfil
	 */
	private String color;
	private boolean mover;
	private int fila;
	private char columna;
	
	/**
	 * contructor
	 */
	
	public Alfil() {}
	
	public Alfil(String color) {
		this.color=color;
	}
	
	/**
	 * Get y Set
	 */
	 public String getColor(String color) {
		 return this.color;
	 }
	 
	 public void setColor(String color) {
		 this.color = color;
	 }
	 
	 public void setMover(boolean mover) {
		 this.mover=mover;
	 }
	
	 /**
	  * Metodos
	  */
	 
	 public boolean Mover() {
		 return this.mover;
	 }
	 
	 
	@Override
	public void comer() {
		
		
		
	}

	@Override
	public boolean movimientos() {
		for(int i = 1; i<7; i++) {
			/**
			 * Diagonal Arriba-Derecha
			 */
			if(fila + i <= 7 && columna + i <= 7) {
				/**
				 * Validador si la posicion seleccionada es un posicion vacia o tiene alguna otra pieza 
				 */
			}
			/**
			 * Diagonal Abajo-Izquierda
			 */
			if(fila - i >= 1 && columna - i >= 1) {
				/**
				 * Validador si la posicion seleccionada es un posicion vacia o tiene alguna otra pieza 
				 */
			}
			/**
			 * Diagonal Arriba-Izquierda
			 */
			if(fila + i <= 7 && columna - i >= 7) {
				/**
				 * Validador si la posicion seleccionada es un posicion vacia o tiene alguna otra pieza 
				 */
			}
			/**
			 * Diagonal Abajo-Derecha
			 */
			if(fila - i >= 1 && columna + i <= 7) {
				/**
				 * Validador si la posicion seleccionada es un posicion vacia o tiene alguna otra pieza 
				 */
			}
		}
		return mover;


	}
}
