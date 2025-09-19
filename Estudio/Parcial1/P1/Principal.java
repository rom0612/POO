import java. util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca bib = new Biblioteca();
        /*Libro lib1 = new Libro("El principito", "Autor del principito");
        Libro lib2 = new Libro("Orgullo y Prejuicio", "Jane Austen");
        
        bib.agregarLibro(lib1);
        bib.agregarLibro(lib2);
        */

        int opcion =0;

        System.out.println("Bienvenido a la biblioteca, ingresa el número de opción que quieres realizar: ");

        do {
        System.out.println("----\nMenú de opciones:");
        System.out.println("1. Ver los libros que hay");
        System.out.println("2. Agregar un libro");
        System.out.println("3. Eliminar un libro");
        System.out.println("4. Eliminar el ultimo libro");
        System.out.println("5. Salir");
        opcion=sc.nextInt();
        switch(opcion){
            case 1:
                bib.mostrarLibros();
                break;
            case 2:
                System.out.println("Nombre del libro: ");
                String nombrelib = sc.next();
                System.out.println("Autor del libro: ");
                String autorLib= sc.next();
                Libro nuevoLibro = new Libro(nombrelib, autorLib);
                bib.agregarLibro(nuevoLibro);
                break;
            case 3:
                System.out.println("Qué libro desea eliminar?");
                bib.mostrarLibros();
                int elimLibro = sc.nextInt();
                bib.eliminarLibro(elimLibro);
                break;
            case 4:
                bib.eliminarLibro();
                break;
            case 5:
                System.out.println("Sliendo...");
                break;
            default:
                System.out.println("Opcion no válida");
                break;
        }
        }while(opcion!=5);
    
        sc.close();
    }

}
