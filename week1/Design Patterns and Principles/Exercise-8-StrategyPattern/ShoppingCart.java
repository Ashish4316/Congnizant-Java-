public class ShoppingCart {
    private PricingStrategy pricingStrategy;

    public void setPricingStrategy(PricingStrategy strategy) {
        this.pricingStrategy = strategy;
    }

    public void checkout(double amount) {
        double finalPrice = pricingStrategy.calculatePrice(amount);
        System.out.println("Base Amount: $" + amount + " -> Final Price: $" + finalPrice);
    }
}
