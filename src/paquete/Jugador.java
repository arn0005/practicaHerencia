package paquete;

public class Jugador extends Persona {

    /*
    altura, posicion(base,escolta,alero,ala-pivot,pivot),
    numero partidos jugados(empieza en 0),comprobar si esta jugando,
    
    
    
     */
    private double altura;
    private Posicion posicion;
    private int partidosJugados;
    private boolean estaJugando;

    public Jugador(double altura, Posicion posicion, String nombre, String direccion, String DNI, boolean sexo) {
        super(nombre, direccion, DNI, sexo);
        this.altura = altura;
        this.posicion = posicion;
        this.partidosJugados = 0;
        this.estaJugando = false;
    }
}
