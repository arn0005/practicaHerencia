package paquete;

public class Equipo {

    private String nombreEquipo;
    private int anioFundacion;
    private int numVictorias;
    private double presupuesto; //en euros
    private Jugador listaJugadores[];
    private boolean estaEnEquipo;

    public Equipo(String nombre, int anioFundacion, double presupuesto, int jugadores) {
        this.nombreEquipo = nombre;
        this.anioFundacion = anioFundacion;
        this.presupuesto = presupuesto;
        if (presupuesto < 19700) {
            this.presupuesto = 20000;
        }
        this.listaJugadores = new Jugador[jugadores];
        if (jugadores < 6 || jugadores > 12) {
            this.listaJugadores = new Jugador[8];
        }

        this.numVictorias = 0;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getAnioFundacion() {
        return anioFundacion;
    }

    public int getNumVictorias() {
        return numVictorias;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void aniadirJugador(Jugador nuevo) {
        String res = "";
        for (int i = 0; i < listaJugadores.length; i++) {
            if (listaJugadores[i] == null) {
                listaJugadores[i] = nuevo;
                i = listaJugadores.length + 1;
                res = "Se ha añadido el jugador";
            } else {
                res = "No se ha podido añadir el jugador";
            }
        }
        System.out.println(res);
    }

    public void enEquipo(Jugador player) {
        String res = "";
        for (int i = 0; i < listaJugadores.length; i++) {
            if (player == listaJugadores[i]) {
                this.estaEnEquipo = true;
                res = "El jugador se encuentra en el equipo";
            } else {
                this.estaEnEquipo = false;
                res = "El jugador no se encuentra en el equipo";
            }
        }
        System.out.println(res);
    }

    public void elminarJugador(Jugador borrar) {
        String res = "";
        for (int i = 0; i < listaJugadores.length; i++) {
            if (listaJugadores[i] != null) {
                listaJugadores[i] = borrar;
                i = listaJugadores.length - 1;
                res = "El jugador se ha borrado del equipo";
            } else {
                res = "El jugador no se ha borrado del equipo";
            }
        }
        System.out.println(res);
    }

    public void inscripción() {
        for (int i = 0; i < listaJugadores.length; i++) {

        }

    }

    public Boolean enEquipo(String otro) {
        if () {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String res = this.nombreEquipo
                + "\nFundado en " + this.anioFundacion + ". Con " + this.presupuesto + "€ de presupuesto actual."
                + "\nVictorias: " + this.numVictorias
                + "\nIntegrantes del equipo: " + "\n===================================";
        for (int i = 0; i < this.listaJugadores.length; i++) {
            if (this.listaJugadores[i] != null) {
                res += this.listaJugadores[i];
            }
        }

        return res;
    }
}
