package paquete;

public class Equipo {

    private String nombre;
    private int anioFundacion;
    private int numVictorias;
    private double presupuesto; //en euros
    private Jugador jugadores[];
    private boolean estaEnEquipo;

    public Equipo(String nombre, int anioFundacion, double presupuesto, int jugadores) {
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.presupuesto = presupuesto;
        if (presupuesto < 19700) {
            this.presupuesto = 20000;
        }
        this.jugadores = new Jugador[jugadores];
        if (jugadores < 6 || jugadores > 12) {
            this.jugadores = new Jugador[8];
        }

        this.numVictorias = 0;
    }

    /**
     * Agrega el jugador en el array si existe una posision cuyo valor sea nulo
     *
     * @param nuevo jugador a agregar
     * @return true si se puedo agregar false si el array ya esta lleno
     */
    public String aniadirJugador(Jugador nuevo) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                jugadores[i] = nuevo;
                return "Se ha añadido al jugador";
            }
        }
        return "No ha sido posible añadir el jugador";
    }

    public boolean enEquipo(Jugador player) {
        for (int i = 0; i < jugadores.length; i++) {
            if (estaEnEquipo == true) {
                jugadores[i] = player;
                System.out.println("El jugador esta en el equipo");
                return true;
            }
        }
        System.out.println("El jugador no se encuentra en el equipo");
        return false;
    }

    public String elminarJugador(Jugador borrar) {
        
        return "";
    }

}
