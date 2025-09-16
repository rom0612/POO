import java.util.Scanner;
public class Ejemplo0 {
    public static void main(String[] args) {
        // Abrir escaner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor de a: ");
        int a = sc.nextInt(); //recibe el sig entero
        System.out.println("Ingrese el valor de b: ");
        int b = sc.nextInt();
        a-=b;
        System.out.println("Nuevo valor de a: "+ a);
        boolean result = (a>0)? true : false;
        System.out.println("El resultado de la comparación es: " + result);

        //Cerrar escaner
        sc.close();
    }
}
