package Exc32;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

//        Path path = Paths.get("C:/Users/migda/Desktop/JAVA25_poznan_zadania_zaawansowane.txt");
//
//        String[] list = path.toString().split("\\\\");
//        StringBuffer newName = new StringBuffer();
//        int i = 0;
//        for (String s : list) {
//            i++;
//            newName.append(s);
//            if (i < list.length) {
//                newName.append("/");
//            }
//        }
//        newName.delete(newName.length() - 4, newName.length()).append("-table.txt");
//        System.out.println(newName);

        List<String> fileReaderTwo = Files.readAllLines(Paths.get("C:/Users/migda/Desktop/JAVA25_poznan_zadania_zaawansowane.txt"), StandardCharsets.UTF_8);

        StringBuilder sB = new StringBuilder();
        for (String fRT : fileReaderTwo) {
            sB.append(fRT);
        }
        String[] chars = sB.toString().toLowerCase().split("");
        List<String> listChar = Stream.of(chars).collect(Collectors.toList());
        List<String> newListChar = listChar.stream()
                .filter(e -> !e.equals("."))
                .filter(e -> !e.equals(","))
                .collect(Collectors.toList());

        StringBuilder textWithoutSigns = new StringBuilder();
        for (String nWC : newListChar) {
            textWithoutSigns.append(nWC);
        }

        String[] words = textWithoutSigns.toString().split(" ");
        List<String> listWords = Stream.of(words).collect(Collectors.toList());

        Map<String, Integer> wordsCount = new HashMap<>();
        listWords.forEach(element -> {
            if (!wordsCount.containsKey(element)) {
                wordsCount.put(element, 1);
            } else {
                Integer currentValueForKey = wordsCount.get(element);
                currentValueForKey++;
                wordsCount.put(element, currentValueForKey);
            }
        });

        String mapAsString = wordsCount.keySet().stream()
                .map(key -> key + "=" + wordsCount.get(key) + "\n")
                .collect(Collectors.joining());

//        try (PrintWriter writer = new PrintWriter(new FileWriter(String.valueOf(newName), true))) {
//            writer.println(mapAsString);
//        }
    }
}

