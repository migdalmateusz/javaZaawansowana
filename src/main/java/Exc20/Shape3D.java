package Exc20;

public abstract class Shape3D extends Shape {

    public abstract double calculateVolume();

    @Override
    public double calculatePerimeter() {
        throw new UnsupportedOperationException("It's not possible");
    }
}
