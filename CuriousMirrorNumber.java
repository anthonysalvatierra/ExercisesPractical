/* Given to a sequence of integers
* determine which of them is curious,
* and count them also place the mirror number
* of each of them */

public class CuriousMirrorNumber {

    public static void main(String[] args) {

        int[] numbers = {12, 10, 5, 25};
        int totalCurious = 0;

        for (int number : numbers) {
            mirror(number);
            totalCurious += curious(number);
        }

        System.out.println("Total Curious: " + totalCurious);

    }


    public static void mirror(int number){

        if(String.valueOf(number).length() == 1){
            System.out.printf("The mirror number of %d is %d\n", number, number);
        }else{

            char[] digits = String.valueOf(number).toCharArray();
            char[] digitsReverse = new char[digits.length];
            int counter = 0;

            for(int i = digits.length - 1; i >= 0; i--){
                digitsReverse[counter++] = digits[i];
            }

            int reverse = Integer.parseInt(new String(digitsReverse));

            System.out.printf("The mirror number of %d is %d\n", number, reverse);

        }

    }

    public static int curious(int number){

        int result = number * number;

        if(String.valueOf(result).endsWith(String.valueOf(number))){

            System.out.println(number + " is curious (" + result + ")");
            return 1;

        }else{

            System.out.println(number + " is not curious (" + result + ")");
            return 0;

        }

    }
}
