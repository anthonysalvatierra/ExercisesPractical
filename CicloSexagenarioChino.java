
/* El ciclo sexagenario chino es un sistema numérico cíclico
    de 60 combinaciones de dos ciclos básicos: los diez troncos
    celestiales y las doce Ramas Terrenales. El nombre de un año
    se divide en dos partes y los nombres rotan cada 60 años.

    el metodo getCicloSexagenarioChino recibe como parametro el año
    que queremos saber a que ciclo pertenece y retorna su equivalente
    al ciclo sexagenario */

public final class CicloSexagenarioChino {

    public static void main(String[] args) {

        String cicloSexagenario = getCicloSexagenarioChino(2024);
        System.out.println(cicloSexagenario);

    }

    private static final String[] ELEMENTS = {"Madera", "Fuego", "Tierra", "Metal", "Agua"};

    private static final String[] ANIMALS = {"Rata", "Buey", "Tigre", "Conejo", "Dragon", "Serpiente",
                                             "Caballo", "Oveja", "Mono", "Gallo", "Perro", "Cerdo"};

    private CicloSexagenarioChino(){}

    private static String getElementYear(Integer passed){

        passed %= CicloSexagenarioChino.ELEMENTS.length * 2;
        int index = passed / 2;
        return CicloSexagenarioChino.ELEMENTS[index];

    }

    private static String getAnimalYear(Integer passed){

        passed %= CicloSexagenarioChino.ANIMALS.length;
        return CicloSexagenarioChino.ANIMALS[passed];

    }

    public static String getCicloSexagenarioChino(Integer year){

        Integer beginPeriod = 1984;
        Integer passed = year - beginPeriod;

        String element = CicloSexagenarioChino.getElementYear(passed);
        String animal = CicloSexagenarioChino.getAnimalYear(passed);

        return animal.concat(" de ").concat(element);

    }

}
