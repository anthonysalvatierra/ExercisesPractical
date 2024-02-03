/* El ejercicio pone en practica la conjetura de collatz
* si el numero es 1 termina el proceso
* si el numero es par se divide entre 2,
* si el numero es impar se multiplica por 3 y se suma 1,
* La conjetura collatz dice que, a partir de cualquier numero inicial,
* la sucesion obtenida siempre termina en 1 */
public class ConjeturaCollatz {
    public static void main(String[] args) {
        conjeturaCollatz(6);
    }

    public static void conjeturaCollatz(int numero){

        System.out.println(numero);

        while(numero > 0){

            if(numero == 1){
                break;
            }

            if(numero % 2 == 0){
                numero /= 2;
                System.out.println(numero);
                continue;
            }

            numero = (numero * 3) + 1;
            System.out.println(numero);

        }
    }
}
