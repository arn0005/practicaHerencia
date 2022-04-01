package paquete;

public class principal {

    public static void main(String[] args) {
        Persona Angel = new Persona("Angel", "poeta agustin", "26836851Z", true);
        // System.out.println(Angel);

        Jugador j1 = new Jugador(1.60, "base", "Elena", "calle asd", "2683232D", false);

        Arbitro a1 = new Arbitro(699, "auxiliar", "manu", "calle dfgh", "2382763", true);
        Arbitro a2 = new Arbitro(1400, "oficial de mesa", "otro manu", "calle dfgh", "34255355", false);
        //System.out.println(Manuel); 

        Partido p1 = new Partido("12/06/2000", "Malaga");
        //p1.aniadirArbitro(celia);

        Equipo e1 = new Equipo("malga", 1923, 46.7, 4);
        System.out.println(e1.toString());
        p1.aniadirArbitro(a2);
        p1.aniadirArbitro(a2);

        p1.jugarpartido();

    }

}
