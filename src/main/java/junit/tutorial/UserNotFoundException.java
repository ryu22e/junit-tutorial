package junit.tutorial;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String string) {
        super(string);
    }

    private static final long serialVersionUID = 1L;
}
