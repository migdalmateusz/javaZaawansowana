package Exc24;

public class Basket {

    private int numberOfProducts;

    public Basket(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public void addToBasket() {
        try {
            if (numberOfProducts >= 10) {
                throw new BasketFullException();
            }
            numberOfProducts++;
        } catch (BasketFullException e) {
            System.err.println("koszyk jest już pełny");
        }

    }

    public void removeFromBasket()  {
        if (numberOfProducts <= 0) {
            try {
                throw new BasketEmptyException();
            } catch (BasketEmptyException e) {
                System.err.println("koszyk jest pusty");;
            }
        }
        numberOfProducts--;
    }
}
