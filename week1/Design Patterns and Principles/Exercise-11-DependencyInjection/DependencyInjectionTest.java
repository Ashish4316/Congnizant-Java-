public class DependencyInjectionTest {
    public static void main(String[] args) {
        System.out.println("--- Dependency Injection Test ---");

        UserRepository repository = new UserRepositoryImpl();
        UserService service = new UserService(repository);

        service.displayUserInfo(1);
        service.displayUserInfo(2);
        service.displayUserInfo(99);
    }
}
