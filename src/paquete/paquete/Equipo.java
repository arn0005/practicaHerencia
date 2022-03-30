package paquete;

public class Equipo {

    private String nombre;
    private int anioFundacion;
    private int nVictorias;
    private double presupuesto;
    

    public Equipo(String nombre, int anioFundacion, double presupuesto) {
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.presupuesto = presupuesto;
        this.nVictorias = 0;
        if (this.presupuesto < 19700) {
            this.presupuesto = 20000;
        }
    }
    
    public void aniadirJugador(Jugador nuevo){
        
    }
    
    public void enEquipo(Jugador player){
        
    }
    
    public void elminarJugador(Jugador borrar){
        
    }

}
