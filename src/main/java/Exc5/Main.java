package Exc5;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Number> firstMap = new TreeMap<>();
        firstMap.put("Java", 18);
        firstMap.put("Python", 1);
        firstMap.put("PHP", 0);
        firstMap.put("Ruby", 3);

        printFirstAndLast(firstMap);
    }

    public static void printFirstAndLast (TreeMap map) {
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
    }
}
