package Exc4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {
    private Map<String, List<String>> map = new HashMap<>();

    public Storage() {
    }

    public Storage(Map<String, List<String>> map) {
        this.map = map;
    }

    public void addStorage(String key, String value) {
        if (!map.containsKey(key)) {
            List<String> values = new ArrayList<>();
            values.add(value);
            map.put(key,values);
        } else {
            map.get(key).add(value);
        }
    }

    ;

//    public void printValues(String key) {
//        if (!map.containsKey(key)) {
//            System.out.println("There is not key in map");
//        } else {
//            String value = map.get(key);
//            System.out.println(value);
//        }
//    }

    public void printValues(String key) {
        if (!map.containsKey(key)) {
            System.out.println("There is not key in map: " + key);
            return;
        }
        List <String> value = map.get(key);
        System.out.println(value);
    }

    public void printKeysByValue(String value) {
        if (!isValuePresentInMap(value)) {
            System.out.println("There is not value in map: " + value);
            return;
        }
        map.entrySet().stream()
                .filter(entry -> entry.getValue().contains(value))
//                .forEach(entry -> System.out.println(entry));
                .forEach(System.out::println);
    }

//    private boolean isValuePresentInMap (String value) {
//        return map.entrySet().stream()
//                .filter(entry -> entry.getValue().contains(value))
//                .count()>0;
//    }

    private boolean isValuePresentInMap (String value) {
        return map.entrySet().stream()
                .anyMatch(entry -> entry.getValue().contains(value));
    }

    ;

}
