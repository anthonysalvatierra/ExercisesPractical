import java.util.*;
import java.util.stream.Collectors;

/* Dado un String se ordena descendentemente
 * basado en la frecuencia de los caracteres.
 * la frecuencia de los caracteres es el numero
 * de veces que aparece en el String */

public class FrecuenciaCaracteres{
    public static void main(String[] args) {
        String valor = "Acaacc";
        System.out.println(frecuenciaCaracteres(valor));
    }
    
    
    public static String frecuenciaCaracteres(String sc){
        
        String[] caracteres = sc.split("");
        Map<String, Integer> frecuencias = new HashMap<>();

        for(String caracter: caracteres){
            if(!frecuencias.containsKey(caracter)){
                frecuencias.put(caracter, 0);
            }
            frecuencias.put(caracter, frecuencias.get(caracter) + 1);
        }

        Map<String, Integer> frecuenciasOrdenadas = frecuencias.entrySet()
                        .stream()
                                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, LinkedHashMap::new));

        String frecuencia = "";
        for(String value: frecuenciasOrdenadas.keySet()){
            frecuencia = frecuencia.concat(value.repeat(frecuenciasOrdenadas.get(value)));
        }

        return frecuencia;
    }
    
}

