package Exc23;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList();
        animals.add("Słoń");
        animals.add("Pies");
        animals.add("Kot");
        animals.add("Słoń");
        animals.add("Pies");
        animals.add("Pies");
        Zoo zoo = new Zoo(animals);
        System.out.println(zoo.getNumberOfAllAnimals());
        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getAnimalsCountSorted());
    }
}
