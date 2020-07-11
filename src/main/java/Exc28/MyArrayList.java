package Exc28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyArrayList<T> extends ArrayList<T> {

    public MyArrayList() {
    }

    public List<T> getEveryNthElement(int startIndex, int skip) {
        return this.stream()
                .skip(startIndex)
                .filter(e -> (indexOf(e) - startIndex) % (skip + 1) == 0)
                .collect(Collectors.toList());
    }
}


