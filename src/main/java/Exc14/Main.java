package Exc14;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(random.nextInt(5000));
        }
        System.out.println(list.size());
        Set<Integer> set = new HashSet<>();
        list.forEach(element -> set.add(element));
        System.out.println(set.size());
//        System.out.println(getDuplicatedElements(list));
        printTopDuplicatedElements(list);
    }

    private static Set<Integer> getDuplicatedElements(List<Integer> ints) {
        Map<Integer, Integer> countedIntsMap = new HashMap<>();
        ints.forEach(element -> {
            if (countedIntsMap.containsKey(element)) {
                Integer currentValueForKey = countedIntsMap.get(element);
                currentValueForKey++;
                countedIntsMap.put(element, currentValueForKey);
            } else {
                countedIntsMap.put(element, 1);
            }
        });
        return countedIntsMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());
    }

    private static void printTopDuplicatedElements(List<Integer> ints) {
        Map<Integer, Integer> countedIntsMap = new HashMap<>();
        ints.forEach(element -> {
            if (countedIntsMap.containsKey(element)) {
                Integer currentValueForKey = countedIntsMap.get(element);
                currentValueForKey++;
                countedIntsMap.put(element, currentValueForKey);
            } else {
                countedIntsMap.put(element, 1);
            }
        });
        countedIntsMap
                .entrySet()
                .stream()
                .sorted(new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                })
                .limit(25)
                .forEach(entry -> System.out.println(entry));
    }
}

