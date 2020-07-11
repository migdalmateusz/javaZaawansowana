package Exc27;

public class Main {
    public static void main(String[] args) {
        Joiner <Integer> joiner = new Joiner<>("-");
        System.out.println(joiner.join(123, 42532, 1231, 1312));
        Joiner <Double> joiner1 = new Joiner<>(",,");
        System.out.println(joiner1.join(9.43, 9.00, 8.999, 1.01));
    }
}
