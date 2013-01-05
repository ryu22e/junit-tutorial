package junit.tutorial;

public class Member {

    public static boolean canEntry(int age, Gender gender) {
        if (age <= 25 && gender == Gender.FEMALE) {
            return true;
        } else {
            return false;
        }
    }

    public static enum Gender {
        MALE, FEMALE;
    }
}
