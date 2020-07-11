package Exc15;

public class Main {
    public static void main(String[] args) {
        Enum bmw = Car.BMW;
        Enum toyota = Car.TOYOTA;

        System.out.println(((Car) bmw).isPremium());
        System.out.println(((Car) toyota).isPremium());
    }
}
