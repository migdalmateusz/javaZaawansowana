package Exc8;

public class ParcelValidator implements Validator {
    @Override
    public boolean validate(Parcel input) {
        int sum = input.getxLenght() + input.getyLenght() + input.getzLenght();
        return sum >= 300;
    }
}
