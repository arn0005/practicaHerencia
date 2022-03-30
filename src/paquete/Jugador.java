package paquete;

public class Jugador extends Persona {

    /*
    altura, posicion(base,escolta,alero,ala-pivot,pivot),
    numero partidos jugados(empieza en 0),comprobar si esta jugando,
    
    
    
     */
    private double altura; //en metros
    private Posicion posicion;
    private int partidosJugados;
    private boolean estaJugando;

    public Jugador(double altura, Posicion posicion, String nombre, String direccion, String DNI, boolean sexo) {
        super(nombre, direccion, DNI, sexo);
        if (altura > 1.65) {
            this.altura = altura;
        } else {
            this.altura = 1.70;
        }
        if (posicion == Posicion.base) {
            this.posicion = Posicion.base;
        } else if (posicion == Posicion.alapivot) {
            this.posicion = Posicion.alapivot;
        } else if (posicion == Posicion.escolta) {
            this.posicion = Posicion.escolta;
        } else if (posicion == Posicion.pivot) {
            this.posicion = Posicion.pivot;
        } else {
            this.posicion = Posicion.alero;
        }
        this.partidosJugados = 0;
        this.estaJugando = false;
    }

    public void jugando() {
        if (estaJugando == true) {
            if (sexo == true) {
                System.out.println("El jugador " + super.dameNombre() + " está jugando");
            } else {
                System.out.println("La jugadora " + super.dameNombre() + " está jugando");
            }
        } else {
            if (sexo == true) {
                System.out.println("El jugador " + super.dameNombre() + " no está jugando");
            } else {
                System.out.println("La jugadora " + super.dameNombre() + " no está jugando");
            }
        }
    }

    @Override
    public String toString() {
        String res;
        res = super.toString() + "\nAltura: " + this.altura + "\nSu posicion es: "
                + this.posicion + "\nJugador/a en " + this.partidosJugados + " partidos";
        if (estaJugando == true) {
            return res + "\nAhora mismo está jugando";
        } else {
            return res + "\nAhora mismo no está jugando";
        }
    }

}
