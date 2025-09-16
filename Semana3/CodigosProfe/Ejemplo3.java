import java.util.Enumeration;
import java.util.Hashtable;
/*
 * Enumeration:
 * Sirve para:
Recorrer elementos de colecciones legacy como Hashtable, Vector y Properties
Acceder a elementos uno por uno sin tener que conocer la estructura interna de la colección
Proporcionar acceso de solo lectura a los elementos
 */


public class Ejemplo3 {
    public static void main(String[] args) {
        Hashtable<String, Integer> tabla = new Hashtable<String, Integer>();

        tabla.put("diez", 10);
        tabla.put("veinte",  20);
        tabla.put("treinta", 30);

        String llave;
        Integer valor;
        //Sintaxis: Enumeration<tipoElemento>nomVariable = coleccion.métodoQueDevuelveEnumeration();
        Enumeration<String> llaves = tabla.keys();

        //hasMoreElements: es booleano, devuelve true si hay más elementos por recorrer -> nomVariable.hasMoreElements();
        while (llaves.hasMoreElements()) {
            //nextElement: devuelve el sig. elemento de la enumeración --> nomVariable.nextElement();
            llave = llaves.nextElement();
            valor = tabla.get(llave); //método de HashTaBLE
            System.out.println("Llave: " + llave + "\tValor: " + valor);
        }
    }
}