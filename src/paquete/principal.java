package paquete;

/**
 *
 * @author angel
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona Angel = new Persona("Angel", "Poeta Agustin", "26836851Z", true);
       // System.out.println(Angel);
        Jugador Angel2 = new Jugador(1.71, Posicion.base, Angel.dameNombre(), Angel.dameDireccion(), Angel.dameDNI(), true);
        System.out.println(Angel2.toString());
    }

}
