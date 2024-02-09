
/* The chinese sexagenarian cycle is a cyclic numeric system
    of 60 combinations of two basic cycle: the ten heavenly trunks
    and the twelve earthly branches. The name of the year
    is divided into two parts and the names rotate every 60 years.

    the method getChineseSexagenarianCycle receives as a parameter
    the year that we want to know to which cycle it belongs
    and returns its equivalent to the sexagenarian cycle. */

public final class ChineseSexagenarianCycle {

    public static void main(String[] args) {

        String sexagenarianCycle = getChineseSexagenarianCycle(2024);
        System.out.println(sexagenarianCycle);

    }

    private static final String[] ELEMENTS = {"Wood", "Fire", "Land", "Metal", "Water"};

    private static final String[] ANIMALS = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                                             "Horse", "Sheep", "Monkey", "Rooster", "Dog", "Pig"};

    private ChineseSexagenarianCycle(){}

    private static String getElementYear(Integer passed){

        passed %= ChineseSexagenarianCycle.ELEMENTS.length * 2;
        int index = passed / 2;
        return ChineseSexagenarianCycle.ELEMENTS[index];

    }

    private static String getAnimalYear(Integer passed){

        passed %= ChineseSexagenarianCycle.ANIMALS.length;
        return ChineseSexagenarianCycle.ANIMALS[passed];

    }

    public static String getChineseSexagenarianCycle(Integer year){

        Integer beginPeriod = 1984;
        Integer passed = year - beginPeriod;

        String element = ChineseSexagenarianCycle.getElementYear(passed);
        String animal = ChineseSexagenarianCycle.getAnimalYear(passed);

        return animal.concat(" de ").concat(element);

    }

}
