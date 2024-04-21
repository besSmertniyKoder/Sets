package Classes;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.breed = "персидская";
        cat.name = "мурзик";
        cat.setWeight(7);
        System.out.println(cat);
        cat.vaccines = List.of("от бешенства", "прививка294823","ежегодная прививка");
        System.out.println(cat);

    }
}
