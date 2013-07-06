package junit.tutorial.chapter19;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {

    public static List<String> craeteFizzBuzzList(int max) {
        List<String> result = new LinkedList<String>();
        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

}
