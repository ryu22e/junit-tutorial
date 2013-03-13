package junit.tutorial.chapter18;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class NumberUtilsTest {
    public static class 入力値に10を与えるとき {
        @Test
        public void trueを返す() throws Exception {
            boolean actual = NumberUtils.isEven(10);
            assertThat(actual, is(true));
        }
    }

    public static class 入力値に7を与えるとき {
        @Test
        public void falseを返す() throws Exception {
            boolean actual = NumberUtils.isEven(7);
            assertThat(actual, is(false));
        }
    }
}
