package Exc2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Number> firstMap = new HashMap<>();
        firstMap.put("Java", 18);
        firstMap.put("Python", 1);
        firstMap.put("PHP", 0);

        printMap(firstMap);
    }

    public static void printMap (Map <String, Number> map) {
        int iterator = 0;
        for (Map.Entry entry:map.entrySet()) {
            System.out.print(entry.getKey() + ", Wartość: " + entry.getValue());
            if (iterator == map.size()-1) {
                System.out.println(".");
            } else {
                System.out.println(",");
            }
            iterator ++;
        }
    }
}
