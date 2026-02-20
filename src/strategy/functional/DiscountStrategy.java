package strategy.functional;


@FunctionalInterface
public interface DiscountStrategy {
    double apply(double price);
}