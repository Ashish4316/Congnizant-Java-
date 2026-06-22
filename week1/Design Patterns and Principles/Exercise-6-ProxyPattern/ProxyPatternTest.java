public class ProxyPatternTest {
    public static void main(String[] args) {
        System.out.println("--- Proxy Pattern Test ---");

        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("google.com");
            internet.connectTo("wikipedia.org");
            internet.connectTo("banned.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
