package Ajedz;
/**
 * Clase donde se alojan las variables de los dos jugadores 
 * 
 * @author Ower
 * @author Diego
 *
 */
public class Jugadores {

	 private Tablero tablero;
	    private String jugador1;
	    private String jugador2;
	    
	    // colores 
	    private String colornegro;
	    private String colorblanco;
	    
	    public Jugadores(String jugador1, String jugador2, Tablero tablero) {
	        this.jugador1 = jugador1;
	        this.jugador2 = jugador2;
	        this.tablero = tablero;
	    }
	    
	   
	    public Tablero getTablero() {
	        return tablero;
	    }
	    
	    public String getJugador1() {
	        return jugador1;
	    }
	    
	    public String getJugador2() {
	        return jugador2;
	    }
	    
}
