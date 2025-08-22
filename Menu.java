import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            // Mostrar menú
            System.out.println("\nMENÚ:");
            System.out.println("1. Factorial");
            System.out.println("2. Fibonacci");
            System.out.println("3. Secuencia de Collatz");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción (1-4): ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingres el número para calcular su factorial: ");
                    int numFactorial = scanner.nextInt();
                    if (numFactorial < 0) {
                        System.out.println("Error: No puede calcularse para numeros negativos");
                    } else {
                        long resultadoFactorial = factorial(numFactorial);
                        System.out.println("El factorial de " + numFactorial + " es: " + resultadoFactorial);
                    }
                    break;
                    
                case 2:
                    System.out.print("Ingrese la posición en la secuencia de Fibonacci: ");
                    int numFibonacci = scanner.nextInt();
                    if (numFibonacci < 0) {
                        System.out.println("Error: La posición debe ser un número positivo");
                    } else {
                        long resultadoFibonacci = fibonacci(numFibonacci);
                        System.out.println("El término en la posición " + numFibonacci + " de Fibonacci es: " + resultadoFibonacci);
                    }
                    break;
                    
                case 3:
                    System.out.print("Se selecc. Collatz");
                    break;
                    
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
            }
            
        } while (opcion != 4);
        
        scanner.close();
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}