package Exc29;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Integer [] table = {1,2,3,4,5,6,7,8,9,10};
        String [] table2 = {"ala", "basia", "maria", "sylwia"};


        System.out.println(partOf(table, n -> n % 2 == 0));

        System.out.println(partOf(table, n -> n > 6));

        System.out.println(partOf(table2, n -> n.contains("s")));
    }

    private static <T> double partOf (T[] values, Predicate<T> predicate) {
        return (double)Arrays.stream(values).filter(predicate).count()/Arrays.stream(values).count();
    }
}
