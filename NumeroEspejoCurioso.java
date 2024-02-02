/* Dado a una secuencia de numeros enteros
* determinar cual de ellos es curioso y
* contarlos, tambien colocar el numero espejop de cada uno
* de ellos */

public class NumeroEspejoCurioso {

    public static void main(String[] args) {

        int[] numeros = {12, 10, 5, 25};
        int totalCurioso = 0;

        for (int numero : numeros) {
            espejo(numero);
            totalCurioso += curioso(numero);
        }

        System.out.println("Total Curioso: " + totalCurioso);

    }


    public static void espejo(int numero){

        if(String.valueOf(numero).length() == 1){
            System.out.printf("El espejo de %d es %d\n", numero, numero);
        }else{

            char[] digits = String.valueOf(numero).toCharArray();
            char[] digitsReverse = new char[digits.length];
            int counter = 0;

            for(int i = digits.length - 1; i >= 0; i--){
                digitsReverse[counter++] = digits[i];
            }

            int reverse = Integer.parseInt(new String(digitsReverse));

            System.out.printf("El numero espejo de %d es %d\n", numero, reverse);

        }

    }

    public static int curioso(int numero){

        int resultado = numero * numero;

        if(String.valueOf(resultado).endsWith(String.valueOf(numero))){

            System.out.println(numero + " es curioso (" + resultado + ")");
            return 1;

        }else{

            System.out.println(numero + " no es curioso (" + resultado + ")");
            return 0;

        }

    }
}
