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
	private boolean Mover;
	
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
	
	 /**
	  * Metodos
	  */
	 
	 public boolean Mover() {
		 return this.Mover;
	 }
	 
	 
	@Override
	public void comer() {
		
		
		
	}

	@Override
	public void movimientos() {
		
		
		
	}


}
