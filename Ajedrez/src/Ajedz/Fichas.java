package Ajedz;
/**
 * Clase padre que se utiliza como plantilla para
 *  las demas clases de las piezas como los peones, caballos, torres, etc
 * 
 * @author Ower
 * @author Diego
 *
 */
public interface Fichas {
	
	private Tablero tablero;
	private String color;

	  public Fichas(Tablero tablero, String color) {
	        this.tablero = tablero;
	        this.color = color;
	    }
	  
	  /**
	   * devuelve el color de la ficha, que se almacena en la variable color
	   * @return
	   */
	    public String getColor() {
	        return color;
	    }

}
