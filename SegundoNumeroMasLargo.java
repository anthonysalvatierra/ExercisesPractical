import java.util.Arrays;
import java.util.List;

/* El ejercicio trata sobre pasar una lista de numeros enteros
* y retornar el segundo numero que sea mas largo en la lista */

public class SegundoNumeroMasLargo {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(-123456, 1, 12, 123, 1234, 12345, 123456, 123456);

        Integer segundoLargo = segundoLargo(numeros);

        System.out.println("segundoLargo = " + segundoLargo);

    }

    public static Integer segundoLargo(List<Integer> numeros){
        int segundoLargo = 0;

        List<String> cadenas = numeros.stream()
                .map(numero -> {
                    if(numero < 0){
                        return numero * -1;
                    }

                    return numero;
                })
                .sorted()
                .map(String::valueOf)
                .toList();

        for(int i = cadenas.size() - 1; i > 0; i--){
            if( cadenas.get(i - 1).length() < cadenas.get(i).length() ){
                segundoLargo = Integer.parseInt(cadenas.get(i - 1));
                break;
            }
        }

        return segundoLargo;
    }
}
