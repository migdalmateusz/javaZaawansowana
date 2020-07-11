package Exc27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Joiner<T> {

    private List<T> tObject = new ArrayList<>();
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... types) {
        tObject.addAll(Arrays.asList(types));
        String s = "";
        StringBuilder sB = new StringBuilder(s);
        for (int i=0; i<tObject.size(); i++) {
            String s2 = tObject.get(i).toString();
            sB.append(s2);
            if (i != tObject.size()-1){
                sB.append(separator);
            }
        }
        return sB.toString();
    }
}

