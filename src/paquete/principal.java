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
        /*Persona personaAngel = new Persona("Angel", "Poeta Agustin", "26836851Z", true);
        Jugador jugadorAngel = new Jugador(1.71, "", personaAngel.dameNombre(), personaAngel.dameDireccion(), personaAngel.dameDNI(), true);
        System.out.println(jugadorAngel.toString());*/

        Arbitro arbitro1 = new Arbitro(799, "principal", "Angel", "poeta", "26836851Z", true);
        System.out.println(arbitro1);
    }

}
