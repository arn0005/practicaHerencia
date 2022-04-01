package paquete;

public class Jugador extends Persona {

    private double altura; //en metros
    private String posicion;
    private int partidosJugados;
    private boolean estaJugando;

    public Jugador(double altura, String posicion, String nombre, String direccion, String DNI, boolean sexo) {
        super(nombre, direccion, DNI, sexo);
        if (altura > 1.65) {
            this.altura = altura;
        } else {
            this.altura = 1.70;
        }
        switch (posicion) {
            case "base":
                this.posicion = "base";
                break;
            case "pivot":
                this.posicion = "pivot";
                break;
            case "alapivot":
                this.posicion = "alapivot";
                break;
            case "escolta":
                this.posicion = "escolta";
                break;
            case "alero":
                this.posicion = "alero";
                break;
            default:
                this.posicion = "alero";
                break;
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
