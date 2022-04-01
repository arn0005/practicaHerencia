package paquete;

public class Persona {

    private String nombre;
    private String direccion;
    private String DNI;
    protected boolean sexo; // true = chico

    public Persona(String nombre, String direccion, String DNI, boolean sexo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        this.sexo = sexo;
    }

    public void personaCopia(Persona copia) {
        this.nombre = copia.nombre;
        this.direccion = copia.direccion;
        this.DNI = copia.DNI;
        this.sexo = copia.sexo;
    }

    public String dameNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String dameDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String dameDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public boolean dameSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        String res = this.nombre + " - " + this.DNI;
        if (this.sexo == true) {
            return res + "\nEs un chico\n" + this.direccion;
        } else {
            return res + "\nEs una chica\n" + this.direccion;
        }
    }
}
