package Exc1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> sortedList = getSortedList(Arrays.asList("AAA", "BBB", "cccc", "123", "ZXY", "Aab"));
        System.out.println(sortedList);
    }

    private static List<String> getSortedList(List<String> aList) {
        // Collections.sort(aList);
//        aList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
        return aList
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
