public class Tarea{

    //Atributos
    String titulo;
    String descripcion;
    String prioridad;
    String estado;

    //constructor
    public Tarea (String titulo,String descripcion, String prioridad, String estado){
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.prioridad=prioridad;
        this.estado=estado;
    }

    public void printTarea(Tarea tarea){
        System.out.println("Tarea: " + tarea.titulo);
        System.out.println("-> Descrición: " + tarea.descripcion);
        System.out.println("-> Prioridad: " + tarea.prioridad);
        System.out.println("-> Estado: " + tarea.estado);
    }

}