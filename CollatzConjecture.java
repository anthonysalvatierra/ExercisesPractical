/* This exercise put into practice the collatz conjecture
* if number is 1, finish the process
* if number is even number, it is divided by two,
* if number is odd number, it is multiplied by three and plus one,
* The collatz conjecture says that starting from any initial number,
* the sequence obtained always ends in one */
public class CollatzConjecture {
    public static void main(String[] args) {
        collatzConjecture(6);
    }

    public static void collatzConjecture(int number){

        System.out.println(number);

        while(number > 0){

            if(number == 1){
                break;
            }

            if(number % 2 == 0){
                number /= 2;
                System.out.println(number);
                continue;
            }

            number = (number * 3) + 1;
            System.out.println(number);

        }
    }
}
