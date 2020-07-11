package Exc30;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:/Users/migda/Desktop/JAVA25_poznan_zadania_zaawansowane.txt");
        String name = path.getFileName().toString();
        StringBuilder newName = new StringBuilder();
        newName.append(name).delete(newName.length() - 4, newName.length()).reverse();
        String[] list = path.toString().split("\\\\");
        list[list.length - 1] = newName.toString();
        StringBuffer reverseName = new StringBuffer();
        int i = 0;
        for (String s : list) {
            i++;
            reverseName.append(s);
            if (i < list.length) {
                reverseName.append("/");
            }
        }
        reverseName.append(".txt");
        System.out.println(reverseName);

        List<String> fileReaderTwo = Files.readAllLines(path);
        StringBuffer sB = new StringBuffer();
        for (String fRT : fileReaderTwo) {
            sB.append(fRT);
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(String.valueOf(reverseName), true))) {
            writer.println(sB.reverse());
        }
    }
}


