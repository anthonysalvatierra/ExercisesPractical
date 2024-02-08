import java.util.*;

/* la funcion recibe un arreglo de palabras y devuelve
* una lista de las palabras que son anagramas, es decir,
* que possen exactamente las mismas letras */

public class ListaAnagramas {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> wordOrdered = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if (!wordOrdered.containsKey(sortedStr)) {
                wordOrdered.put(sortedStr, new ArrayList<>());
            }
            wordOrdered.get(sortedStr).add(str);
        }

        return new ArrayList<>(wordOrdered.values());


    }

}
