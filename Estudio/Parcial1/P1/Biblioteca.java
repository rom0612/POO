import java.util.ArrayList;

public class Biblioteca {
    //Atributos
    ArrayList <Libro> libros = new ArrayList<>();

    //métodos
    public void mostrarLibros() {
    int indLib = 1;
    if (libros.isEmpty()){
        System.out.println("No hay libros para mostrar");
    }else{
    for (Libro lib : libros) {
        System.out.println(indLib + ". Nombre: " + lib.nombre + " -> Autor: " + lib.autor);
        indLib++;
    }
}
}

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void eliminarLibro (){
        if (libros.isEmpty()){
        System.out.println("No hay libros para eliminar");
    }else{
        System.out.println("Se eliminó el último libro");
        libros.removeLast();
    }
    }

    public void eliminarLibro(int indLibro){
        libros.remove(indLibro-1);
        System.out.println("Se eliminó el libro " + indLibro);
    }

}
