//Operaciones de ArraylIst
import java.util.ArrayList;

public class ArrList{
    public static void main (String [] args){
        //Sintaxis p crear un ArrayList: 
        // |--> ArrayList<tipoDeDato> nombreAL = new ArrayList<Integer>(tipoDeDato);
        ArrayList<Integer> arr = new ArrayList<Integer>();

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
    //set: modificar un elemento -> nombreAL.set(indice,nuevoValor);
        arr.set(2,45);
        System.out.println("--- después de modif. con set: ");
        for (Integer i : arr) {
            System.out.println(i);
        }
    // remove: eliminar un elemento en el indice j-> nombreAL.remove(j);
    //-->elimina el índice, y recorre los demás elementos "hacia la izquierda"
        arr.remove(0);
        System.out.println("--- después de eliminar la posición 0: ");
        for (Integer i : arr) {
            System.out.println(i);
        }
        System.out.println("Nuevo elemento en el índice 0: "+ arr.get(0));
    }
}