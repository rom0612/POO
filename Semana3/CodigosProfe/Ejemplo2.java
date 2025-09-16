import java.util.Hashtable;
// Mapas (diccionarios
// HASHTABLE: 

public class Ejemplo2 {   
    public static void main(String[] args) {
        //Sintaxis de Hashtable: 
        // |--> Hashtable<tipoKey, tipoDato> nombreHT = new Hashtable<tipoKey, tipoDato>();
        Hashtable<String, Integer> tabla = new Hashtable<String, Integer>();

        //---OPERACIONES:

        //put: Agregar una clave y su valor a la colección -> nombreHT.put(clave,valor);
        tabla.put("uno", 1);
        tabla.put("dos", 2);
        tabla.put("cincuenta", 50);

//---->get: devuelve el valor que contiene la clave o null si no existe -> nombreHT.get(clave);
/*----*/int u = tabla.get("uno");
        System.out.println("uno contiene" + u);
    //containsKey: verifica si el map contiene a la llave--> nombreHT.containsKey(clave);
        System.out.println("¿Contiene a cuatro?" + tabla.containsKey("cuatro"));
//---->containsValue: verifica si el map contiene el valor --> nombreHT.containsValue(valor);
/*----*/System.out.println("¿Contiene a 1?" + tabla.containsValue(1));

//keySet: devuelve todas las claves del map->> nombreHT.keySet();
        for (String c : tabla.keySet()) {
            System.out.println(c);
        }
//values: devuelve todos los valores del map->> nombreHT.values();
        for (Integer i : tabla.values()) {
            System.out.println(i);
        }
//---->remove: elimina una clave-> nombreHT.remove(clave);
/*----*/tabla.remove("dos");
    }
}