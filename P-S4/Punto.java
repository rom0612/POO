public class Punto {

    // Atributos
    int x =0;
    int y = 0;

    //Métodos
    //Imprimirlo
    public String toString(){
        return "Punto: (x= " + x + ", y= " + y +")";
    }
    //Constructores
    public Punto (){} //Inicializarlo sin argumentos (va a inicializar en los valores anteriores)
    //Sobreescribiendo uno que si reciba argumentos
    public Punto (int x, int y){
        this.x=x;
        this.y=y;
    }
}