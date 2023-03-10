package Ajedz;
/**
 * clase de la pieza peon
 * 
 * @author Ower
 * @author Diego
 *
 */
public class Peon implements Fichas{
	
	/**
	 * Atributos del Peon
	 */
	private String color;

	private boolean movimientoInicial;
	private boolean mover;
	
	/**
	 * Contructor
	 */
	public Peon() {
		this.movimientoInicial = true;
		this.mover = false;
	}

	/**
	 * varibale de movimiento inicla que me indicara su peon realizo el primer moviento pasando a "True"
	 * variable mover servira como incador para saber cuando peon haga su primer movimiento la cual se establecera a "True"
	 * @param color variable con la cual se le asignara el color a la ficha peon 
	 */
	public Peon(String color) {
		this.color = color;
		this.movimientoInicial = true;
		this.mover = false;
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
	 
	 public void setMovimientoInicial(boolean movimientoInicial) {
		 this.movimientoInicial = movimientoInicial;
	 }
	 
	 public void setMover(boolean mover) {
		 this.mover=mover;
	 }
	
	 
	 /**
	  * Metodos
	  */
	 public boolean movimientoInicial() {
		 return this.movimientoInicial;
	 }
	 
	 public boolean mover() {
		 return this.mover;
	 }
	 
	 
	 
	@Override
	public void comer() {
		
		
	}

	@Override
	public boolean movimientos() {
	    if (!movimientoInicial) {
	        /**
	         * si es el primer moviento del peon
	         * podra mover 1 o 2 posiciones
	         */
	        mover = true;
	        movimientoInicial = false;
	    } else {
	        /**
	         * si el peon ya realizo su primer movimiento
	         * el resto de sus movimiento solo podran ser de 1 posicion 
	         */
	        mover = true;
	    }
		return mover;
		
	}

}
