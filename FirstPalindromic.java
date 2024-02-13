/* Given an array of strings, return the first palindromic string in the array.
 * If there is no such string, return an empty string.
 * A string is palindromic if it reads the same forward and backward. */
public class FirstPalindromic {
    public static void main(String[] args) {
        String[] words = {"asd", "acc", "ssa"};
        System.out.println(palindromic(words));
    }

    public static String palindromic(String[] words){

        String word = "";

        for(String w: words){
            String reverse = new StringBuilder(w).reverse().toString();
            if(reverse.equals(w)){
                word = w;
                break;
            }
        }

        return word;
    }
}
