package junit.tutorial;

public interface UserDao {
    User find(String userId) throws UserNotFoundException;
}
