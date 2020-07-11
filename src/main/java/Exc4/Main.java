package Exc4;

public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();

        storage.addStorage("Java", "one");
        storage.addStorage("Java", "two");
        storage.addStorage("Python", "two");

        storage.printKeysByValue("two");
        System.out.println();
        storage.printValues("Java");

    }
}
