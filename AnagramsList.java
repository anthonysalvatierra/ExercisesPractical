import java.util.*;

/* the function receives a words' array and returns
* an anagram words' list, that is,
* they have exactly the same letters */

public class AnagramsList {
    public static void main(String[] args) {
        String[] array = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(array));
    }

    public static List<List<String>> groupAnagrams(String[] array) {

        Map<String, List<String>> wordOrdered = new HashMap<>();

        for (String str : array) {
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
