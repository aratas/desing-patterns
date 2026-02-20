
package strategy.functional;

public class FunctionalStrategyDemo {

    public static void main(String[] args) {
        // Using lambda expressions for different discount strategies
        PriceCalculator calculator = new PriceCalculator(price -> price * 0.9); // 10% discount
        System.out.println("Price after 10% discount: " + calculator.calculate(100));

        calculator = new PriceCalculator(price -> price - 15); // $15 off
        System.out.println("Price after $15 off: " + calculator.calculate(100));

        calculator = new PriceCalculator(price -> price * (price > 100 ? 0.8 : 1)); // 20% off if price > $100
        System.out.println("Price after conditional discount: " + calculator.calculate(150));
    }

}
