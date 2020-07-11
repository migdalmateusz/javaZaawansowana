package Exc20;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;
    private double ha;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ha = ha;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        return (a * ha) / 2.0;
    }
}
