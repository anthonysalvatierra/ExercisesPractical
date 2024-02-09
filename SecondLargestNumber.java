import java.util.Arrays;
import java.util.List;

/* the exercise is about passing a list of numbers
* and returning the second longest */

public class SecondLargestNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-123456, 1, 12, 123, 1234, 12345, 123456, 123456);

        Integer secondLargest = secondLargest(numbers);

        System.out.println("Second Largest = " + secondLargest);

    }

    public static Integer secondLargest(List<Integer> numbers){
        int secondLargest = 0;

        List<String> strings = numbers.stream()
                .map(number -> {
                    if(number < 0){
                        return number * -1;
                    }

                    return number;
                })
                .sorted()
                .map(String::valueOf)
                .toList();

        for(int i = strings.size() - 1; i > 0; i--){
            if( strings.get(i - 1).length() < strings.get(i).length() ){
                secondLargest = Integer.parseInt(strings.get(i - 1));
                break;
            }
        }

        return secondLargest;
    }
}
