package Exc16;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Runner.getFitnessLevel(155));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(Runner.getFitnessLevel(90));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(Runner.getFitnessLevel(700));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
