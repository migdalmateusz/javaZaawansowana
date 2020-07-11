package Exc7;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private List<String> magazine = new ArrayList<>();
    private int capacity;

    public Magazine(int capacity) {
        this.capacity = capacity;
    }

    void loadBullet(String bullet) {
        if (magazine.size() == capacity){
            throw new IllegalArgumentException("magazine is full");
        }
        magazine.add(bullet);
    }

    boolean isLoaded() {
        if (magazine.isEmpty()) {
            System.out.println("Magazine is empty");
        }
        return !magazine.isEmpty();
    }

    void shot() {
        if (isLoaded()) {
            magazine.remove(magazine.size()-1);
            System.out.println("Pif paf");
        }

    }

}
