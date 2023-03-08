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

	/**
	 * Atributos
	 */
	String FichasN = "Negro";
	String FichasB = "Blancas";
	/**
	 * Funciones de las fichas, las cuales serian 
	 * sus movimientos y el comer a otras fichas
	 */
	void comer();
	boolean movimientos();

}
