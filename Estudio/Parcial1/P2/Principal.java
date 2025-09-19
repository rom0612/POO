import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaTareas toDoList = new ListaTareas();

        Tarea t1 = new Tarea("Practica 1", "Lab1", "Alta", "Pendiente");
        Tarea t2 = new Tarea("T1 Vectorial", "Multiplicadores de lagrange", "Media", "Completada");

        toDoList.agregarTarea(t1);
        toDoList.agregarTarea(t2);

        System.out.println("Bienvendido a tu gestpr de tareas");
        int opcion=0;
        do{
            System.out.println("----\nMenú:");
            System.out.println("1. Mostrar tareas");
            System.out.println("2. Agregar tarea");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            opcion=sc.nextInt();

            sc.nextLine();
            switch (opcion) {
                case 1:
                    toDoList.imprimirTareas();
                    break;
                case 2:
                    System.out.println("Nombre de la tarea: ");
                    String nomTarea=sc.nextLine();
                    System.out.println("\tDescripción: ");
                    String descTarea=sc.nextLine();
                    System.out.println("\tPrioridad: ");
                    String prioTarea=sc.nextLine();
                    System.out.println("\tEstado: ");
                    String estadoTarea=sc.nextLine();
                    Tarea tarea = new Tarea(nomTarea, descTarea, prioTarea, estadoTarea);
                    toDoList.agregarTarea(tarea);
                    break;
                case 3:
                    System.out.println("Qué tarea quieres marcar como completada?");
                    toDoList.imprimirTareas();
                    int indexTar = sc.nextInt();
                    toDoList.marcarComplet(indexTar);
                    break;
                case 4:
                    System.out.println("Qué tarea quieres eliminar?");
                    toDoList.imprimirTareas();
                    int indTar = sc.nextInt();
                    toDoList.eliminarTarea(indTar);
                    break;
                case 5:
                    System.out.println("Saliendo....");
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }while(opcion!=5);

        sc.close();
    }
}
