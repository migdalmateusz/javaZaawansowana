package Exc8;

public class Parcel {

    private int xLenght;
    private int yLenght;
    private int zLenght;

    public Parcel(int xLenght, int yLenght, int zLenght) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
        this.zLenght = zLenght;
    }

    public int getxLenght() {
        return xLenght;
    }

    public void setxLenght(int xLenght) {
        this.xLenght = xLenght;
    }

    public int getyLenght() {
        return yLenght;
    }

    public void setyLenght(int yLenght) {
        this.yLenght = yLenght;
    }

    public int getzLenght() {
        return zLenght;
    }

    public void setzLenght(int zLenght) {
        this.zLenght = zLenght;
    }
}
