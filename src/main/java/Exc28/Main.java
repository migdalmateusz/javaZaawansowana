package Exc28;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        myList.add("e");
        myList.add("f");
        myList.add("g");

        System.out.println(myList);
        System.out.println(myList.getEveryNthElement(2,2));
    }
}
