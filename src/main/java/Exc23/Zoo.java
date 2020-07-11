package Exc23;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class Zoo {

    private List<String> animals;

    public Zoo(List<String> animals) {
        this.animals = animals;
    }

    public int getNumberOfAllTypesOfAnimals() {
        Set<String> numberOfAnimals = new HashSet<>(animals);
        return numberOfAnimals.size();
    }

    public int getNumberOfAllAnimals() {
        return animals.size();
    }

    public Map<String, Integer> getAnimalsCount() {
        Map<String, Integer> animalsCount = new HashMap<>();
        animals.forEach(element -> {
            if (!animalsCount.containsKey(element)) {
                animalsCount.put(element, 1);
            } else {
                Integer currentValueForKey = animalsCount.get(element);
                currentValueForKey++;
                animalsCount.put(element, currentValueForKey);
            }
        });
        return animalsCount;
    }

    public Map<String, Integer> getAnimalsCountSorted() {
        return getAnimalsCount()
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

}
