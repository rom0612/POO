public class Mensaje {
    public String mensaje(Punto p1, Punto p2, Distancia d){
        return ("Punto A : ("+ p1.x + ","+ p1.y + ")\n"
                + "Punto B : ("+ p2.x + ","+ p2.y + ")\n"
                +  d + "\n");
    }
}
