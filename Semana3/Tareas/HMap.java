//https://www.w3schools.com/java/java_hashmap.asp
import java.util.HashMap;

public class HMap {
    public static void main(String[] args) {
        HashMap<String, String> capitales = new HashMap<>();
        // put: añadir llaves y valores
        capitales.put("England", "London");
        capitales.put("India", "New Dehli");
        capitales.put("Austria", "Wien");
        capitales.put("Norway", "Oslo");
        capitales.put("Norway", "Oslo"); // Duplicado
        capitales.put("USA", "Washington DC");

        System.out.println(capitales);
    }
}
