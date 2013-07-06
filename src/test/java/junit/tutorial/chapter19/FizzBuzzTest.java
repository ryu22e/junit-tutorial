package junit.tutorial.chapter19;

import static junit.tutorial.chapter19.Lists.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class FizzBuzzTest {

    public static class _16を指定してcreateFizzBuzzListメソッドを実行するとき {
        @Test
        public void _1_2_Fizz_4_Buzz_Fizz_7_8_Fizz_Buzz_11_Fizz_13_14_FizzBuzz_16が取得できる()
                throws Exception {
            List<String> actual = FizzBuzz.craeteFizzBuzzList(16);
            assertThat(
                actual,
                is(list(
                    "1",
                    "2",
                    "Fizz",
                    "4",
                    "Buzz",
                    "Fizz",
                    "7",
                    "8",
                    "Fizz",
                    "Buzz",
                    "11",
                    "Fizz",
                    "13",
                    "14",
                    "FizzBuzz",
                    "16")));
        }
    }
}
