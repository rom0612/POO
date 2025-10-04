package mx.unam.fi.poo.p56;
public class Articulo {
    //atributos
    private String articulo;
    private double precio;
    //constructor
    public Articulo(String articulo, double precio){
        setArticulo(articulo);
        setPrecio(precio);
    }
    //getters y setters
    public String getArticulo(){
        return articulo;
    }
    public void setArticulo(String articulo){
        this.articulo=articulo;
    }
    
    public void setPrecio(double precio){
        if(precio>0){
            this.precio=precio;
        }else{
            System.out.println("Precio no válido");
        }
    }
    
    public double getPrecio(){
        return precio;
    }
    //metodos
    public void printArticulo(){
        System.out.print(articulo);
        System.out.println("\tPrecio: " + precio);
    }
}
