import java.util.ArrayList;

public class ListaTareas {
    ArrayList<Tarea>listaTareas=new ArrayList<>();

    public void imprimirTareas(){
        if (listaTareas.isEmpty()){
            System.out.println("No hay tareas");
        }else{
            int tarea =1;
            for (Tarea tar : listaTareas){
                System.out.print(tarea+". ");
                tar.printTarea(tar);
                tarea++;
            }
        }
    }

    public void agregarTarea(Tarea tarea){
        listaTareas.add(tarea);
        System.out.println("Tarea agregada");
    }

    public void marcarComplet(int indTarea){
        Tarea tareaAux=listaTareas.get(indTarea-1);
        tareaAux.estado="Completado";
        listaTareas.set(indTarea,tareaAux);
        System.out.println("Tarea "+ indTarea + "Marcada como completada.");
    }

    public void eliminarTarea(int indTarea){
        if (listaTareas.isEmpty()){
            System.out.println("No hay tareas");
        }else{listaTareas.remove(indTarea-1);
        System.out.println("Tarea Eliminada");
        }
    }
}
