package Classes;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    String name;
    private int weight; // private - для того, что бы не было доступа к поллю класса извне
     String breed;
     List<String> vaccines = new ArrayList<>();

    public void something() {
        System.out.println("мяу");
    }

    public int getWeight() {
        return weight;
    }//геттер -> метод, который возвращает значение поля

    public void setWeight(int weight) {
        this.weight = weight;
    }//сеттер -> метод, который принимает и изменяет значение поля

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", vaccines=" + vaccines +
                '}';
    }
}//можно сгенерировать через alt + insert

