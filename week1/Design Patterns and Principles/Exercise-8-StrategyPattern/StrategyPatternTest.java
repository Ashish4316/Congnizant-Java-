public class StrategyPatternTest {
    public static void main(String[] args) {
        System.out.println("--- Strategy Pattern Test ---");

        ShoppingCart cart = new ShoppingCart();

        System.out.println("Using Regular Pricing:");
        cart.setPricingStrategy(new RegularPricing());
        cart.checkout(100.0);

        System.out.println("\nUsing Sale Pricing (20% off):");
        cart.setPricingStrategy(new SalePricing());
        cart.checkout(100.0);
    }
}
