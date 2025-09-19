public class Libro{
    //atributos
    String nombre;
    String autor;

    //constructores
    public Libro (String nombre, String autor){
        this.nombre = nombre;
        this.autor = autor;
    }

    public void printLibro(Libro libro){
        System.out.println("Nombre: " + libro.nombre + " -> Autor: " + libro.autor);
    }
}