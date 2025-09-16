import java.util.ArrayList;

public class Ejemplo1 {
    public static void main(String[] args) {
        //Sintaxis de ArrayList: 
        // |--> ArrayList<tipoDeDato> nombreAL = new ArrayList<Integer>(tipoDeDato);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // Integer es una clase contenedora que envuelve un tipo primitivo int en un objeto.
        // |--> Sirve para hacer casteos

        // ---OPERACIONES---
        //add: añadir elementos -> nombreAL.add(valor);
        arr.add(10);
        arr.add(20);
        arr.add(50);
        //size: devuelve el tamaño del ArrayList -> nombreAL.size(valor)
        System.out.println("Tamaño del ArrayList: " + arr.size());
        System.out.println("Suma de los primeros 3 elementos: " + (arr.get(0)+arr.get(1)+arr.get(2)));
        //--> add con índice: nombreAL.add(índice, valor); -> en la posición n, "empuja" a los demás y se inderta ahí
        arr.add(1, 9);
        System.out.println("Tamaño del ArrayList: " + arr.size());
        //get: llama al valor del índice "i" --> nombreAL.get(i)
        System.out.println("Elemento en la posición 4: " + arr.get(3));
        // Impresión con for-each
        // for (tipoDeDato varControl : nombreAL) {
        for (Integer e : arr) {
            System.out.println(e);
        }
        System.out.println(arr);
    }   
}