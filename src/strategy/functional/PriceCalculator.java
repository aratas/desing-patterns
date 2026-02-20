package strategy.functional;

public class PriceCalculator {
    private DiscountStrategy discount;

    public PriceCalculator(DiscountStrategy discount) {
        this.discount = discount;
    }

    public double calculate(double price) {
        return discount.apply(price);
    }
}