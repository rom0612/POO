public class EjPunto {
    public static void main (String [] args){

        //castear los args de string a int
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);

        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);

        Distancia d = new Distancia(p1,p2);

        System.out.println("Punto 1: " + p1);
        System.out.println("Punto 2: " + p2);
        System.out.println(d);

        Mensaje msj = new Mensaje();

        System.out.println(msj);

        Ventana vent = new Ventana(msj, p1, p2, d);
        vent.setVisible(true);


    }
}
