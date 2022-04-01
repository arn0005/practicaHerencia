package paquete;

public class Persona {

    private String nombrePersona;
    private String direccion;
    private String DNI;
    protected boolean sexo; // true = chico

    public Persona(String nombre, String direccion, String DNI, boolean sexo) {
        this.nombrePersona = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        this.sexo = sexo;
    }

    public void personaCopia(Persona copia) {
        this.nombrePersona = copia.nombrePersona;
        this.direccion = copia.direccion;
        this.DNI = copia.DNI;
        this.sexo = copia.sexo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
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
        String res = this.nombrePersona + " - " + this.DNI;
        if (this.sexo == true) {
            return res + "\nEs un chico\n" + this.direccion;
        } else {
            return res + "\nEs una chica\n" + this.direccion;
        }
    }
}
