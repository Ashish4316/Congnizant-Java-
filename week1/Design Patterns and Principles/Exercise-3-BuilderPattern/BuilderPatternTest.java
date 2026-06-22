public class BuilderPatternTest {
    public static void main(String[] args) {
        System.out.println("--- Builder Pattern Test ---");

        House basicHouse = new House.HouseBuilder()
                .setFoundation("Concrete")
                .setStructure("Wood")
                .setRoof("Shingles")
                .build();
        System.out.println("Basic House: " + basicHouse);

        House luxuryHouse = new House.HouseBuilder()
                .setFoundation("Concrete")
                .setStructure("Brick")
                .setRoof("Tile")
                .setHasGarage(true)
                .setHasSwimmingPool(true)
                .build();
        System.out.println("Luxury House: " + luxuryHouse);
    }
}
