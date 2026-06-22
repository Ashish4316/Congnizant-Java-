public class UserService {
    private UserRepository userRepository;

    // Constructor Injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void displayUserInfo(int id) {
        String details = userRepository.getUserDetails(id);
        System.out.println("User Info for ID " + id + ": " + details);
    }
}
