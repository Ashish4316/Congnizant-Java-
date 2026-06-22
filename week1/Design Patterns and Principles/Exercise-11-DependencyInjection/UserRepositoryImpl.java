public class UserRepositoryImpl implements UserRepository {
    @Override
    public String getUserDetails(int id) {
        if (id == 1) {
            return "Alice";
        } else if (id == 2) {
            return "Bob";
        }
        return "Unknown User";
    }
}
