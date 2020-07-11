package Exc15;

public enum Car {
    FERRARI (true),
    PORSCHE (true),
    MERCEDES (true),
    BMW (true),
    OPEL (false),
    FIAT (false),
    TOYOTA (false);

    private boolean premium;
    private boolean regular;

    Car(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public boolean isRegular() {
        return !premium;
    }
}
