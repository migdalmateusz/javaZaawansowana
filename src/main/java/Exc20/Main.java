package Exc20;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(3.0,4.0);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());

        shape = new Triangle(3,5,6,2);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());

        Shape3D shape3D = new Qube(3);
        System.out.println(shape3D.calculateVolume());
        System.out.println(shape3D.calculatePerimeter());
    }
}
