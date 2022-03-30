package paquete;

public class Arbitro extends Persona {

    private double sueldo;
    private String especialidad;

    public Arbitro(double sueldo, String especialidad, String nombre, String direccion, String DNI, boolean sexo) {
        super(nombre, direccion, DNI, sexo);
        this.sueldo = sueldo;

        if (this.sueldo < 800 || this.sueldo > 1200) {
            this.sueldo = 914;
        }

        switch (especialidad) {
            case "principal":
                this.especialidad = "principal";
                break;
            case "auxiliar":
                this.especialidad = "auxiliar";
                break;
            case "oficial de mesa":
                this.especialidad = "oficial de mesa";
                break;
            default:
                this.especialidad = "auxiliar";
                break;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecializado/a como " + this.especialidad + " que cobra " + this.sueldo +"€ por partido.";
    }

}
