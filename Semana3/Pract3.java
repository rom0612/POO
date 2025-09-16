import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class Pract3{


   //FUNCION PARA GENERAR HASH
   public static String generarHash(String texto){
       //Crea semilla
       int semilla=0;
       for (char c : texto.toCharArray()){
           semilla+=c;
       }


   Random random = new Random (semilla);


   //Generar 32 carac. hexadecimales
   StringBuilder sb = new StringBuilder();
   for (int i =0; i<32; i++){
       int valor = random.nextInt(16);
       sb.append(Integer.toHexString(valor));
   }
   return sb.toString();
   }


   public static void main (String [] args){

      
       ArrayList<String> entradas = new ArrayList<>();
       for (String arg : args) {
           entradas.add(arg);
       }
      
       HashMap<String, String> salidasDigest = new HashMap<>();
      
       for (String entrada : entradas) {
           String hash = generarHash(entrada);
           salidasDigest.put(entrada, hash);
       }
      
       System.out.println("RESULTADOS:");
       for (String ent : entradas) {
           String hash = salidasDigest.get(ent);
           System.out.println("Entrada: '" + ent + "' -> Hash: " + hash);
       }
   }

   }
