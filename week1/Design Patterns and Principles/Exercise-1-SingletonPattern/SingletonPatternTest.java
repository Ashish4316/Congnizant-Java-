public class SingletonPatternTest {

    public static void main(String[] args) {
        System.out.println("--- Singleton Pattern Test ---");

        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.executeQuery("SELECT * FROM users");

        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.executeQuery("UPDATE users SET status = 'active'");

        if (connection1 == connection2) {
            System.out.println("Both connections are the same instance.");
        } else {
            System.out.println("Different instances found!");
        }
    }
}
