package paquete;

public class Partido {

    private String fecha;
    private String nombrePabellon;
    private Equipo local;
    private Equipo visitante;
    private Arbitro arbitro;
    private Arbitro listaArbitros[] = new Arbitro[1];

    public Partido(String fecha, String nombrePabellon) {
        this.fecha = fecha;
        this.nombrePabellon = nombrePabellon;
    }

    public Partido(String fecha, String nombrePabellon, Equipo local, Equipo visitante) {
        this.fecha = fecha;
        this.nombrePabellon = nombrePabellon;
        this.local = local;
        this.visitante = visitante;
        listaArbitros[0] = arbitro;
    }

    public void aniadirLocal(Equipo local) {

    }

    public void aniadirVisitante(Equipo visitante) {

    }

    public void aniadirArbitro(Arbitro nuevo) {
        if (nuevo == arbitro) {
            System.out.println("El arbitro ya habia sido añadido");
        } else {
            System.out.println("El arbitro se ha añadido");
        }
    }

    public void jugarpartido() {

    }

}
