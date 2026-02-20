package strategy.sealed;

public class FunctionalSealedStragegyDemo {

    // Sealed hierarchy
    sealed interface ShippingStrategy permits StandardShipping, ExpressShipping, OvernightShipping, PickupInStore {}

    record StandardShipping(String carrier) implements ShippingStrategy {}
    record ExpressShipping(String carrier, boolean signatureRequired) implements ShippingStrategy {}
    record OvernightShipping(String carrier) implements ShippingStrategy {}
    record PickupInStore(String storeId) implements ShippingStrategy {}

    // The logic using pattern matching switch
    static double calculateCost(ShippingStrategy strategy, double orderValue) {
        return switch (strategy) {
            case StandardShipping s when s.carrier().equals("DHL") -> 3.99;
            case StandardShipping s -> orderValue > 50 ? 0.0 : 4.99;
            case ExpressShipping e -> e.signatureRequired() ? 14.99 : 9.99;
            case OvernightShipping o -> 24.99;
            case PickupInStore p -> 0.0;
        };
    }

    static String describe(ShippingStrategy strategy) {
        return switch (strategy) {
            case StandardShipping s  ->
                "Standard delivery via " + s.carrier() + " (3-5 days)";
            case ExpressShipping e   ->
                "Express via " + e.carrier() +
                (e.signatureRequired() ? " — signature required" : "");
            case OvernightShipping o ->
                "Overnight via " + o.carrier() + " — arrives tomorrow";
            case PickupInStore p     ->
                "Pick up at store #" + p.storeId();
        };
    }

     // --- Try it out ---
    public static void main(String[] args) {

        var strategies = new ShippingStrategy[] {
            new StandardShipping("DHL"),
            new ExpressShipping("FedEx", true),
            new ExpressShipping("FedEx", false),
            new OvernightShipping("UPS"),
            new PickupInStore("HH-042")
        };

        double orderValue = 35.00;
        System.out.println("Order value: €" + orderValue);
        System.out.println("---");

        for (var strategy : strategies) {
            System.out.printf("%-55s  Cost: €%.2f%n",
                describe(strategy),
                calculateCost(strategy, orderValue));
        }

    }   


}
