package paquete;

public class principal {

    public static void main(String[] args) {
        Persona Angel = new Persona("Angel", "Poeta Agustin", "26836851Z", true);
       // System.out.println(Angel);
        
        Arbitro Manuel = new Arbitro(860, "futbol", "Manuel", "direccion", "256301899H", true);
        System.out.println(Manuel);
    }

}
