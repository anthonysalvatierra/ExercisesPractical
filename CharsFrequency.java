import java.util.*;
import java.util.stream.Collectors;

/* Given a string, it is sorted descending
 * based on the chars' frequency.
 * the chars' frequency is the number of times
 * it appears in the string */

public class CharsFrequency {
    public static void main(String[] args) {
        String value = "Acaacc";
        System.out.println(charsFrequency(value));
    }
    
    
    public static String charsFrequency(String sc){
        
        String[] chars = sc.split("");
        Map<String, Integer> frequencies = new HashMap<>();

        for(String character: chars){
            if(!frequencies.containsKey(character)){
                frequencies.put(character, 0);
            }
            frequencies.put(character, frequencies.get(character) + 1);
        }

        Map<String, Integer> sortedFrequencies = frequencies.entrySet()
                        .stream()
                                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, LinkedHashMap::new));

        String frequency = "";
        for(String value: sortedFrequencies.keySet()){
            frequency = frequency.concat(value.repeat(sortedFrequencies.get(value)));
        }

        return frequency;
    }
    
}

