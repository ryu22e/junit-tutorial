package junit.tutorial.chapter18;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class CounterTest {

    public static class 初期状態 {
        private Counter sut;

        @Before
        public void setUp() throws Exception {
            sut = new Counter();
        }

        @Test
        public void 初期状態でincrementメソッドを実行すると1が取得できる() throws Exception {
            int actual = sut.increment();
            assertThat(actual, is(1));
        }
    }

    public static class incrementメソッドを1回実行した場合 {
        private Counter sut;

        @Before
        public void setUp() throws Exception {
            sut = new Counter();
        }

        @Test
        public void incrementメソッドを実行すると2が取得できる() throws Exception {
            sut.increment();
            int actual = sut.increment();
            assertThat(actual, is(2));
        }
    }

    public static class incrementメソッドを50回実行した場合 {
        private Counter sut;

        @Before
        public void setUp() throws Exception {
            sut = new Counter();
        }

        @Test
        public void incrementメソッドを実行すると51が取得できる() throws Exception {
            for (int i = 0; i < 50; i++) {
                sut.increment();
            }
            int actual = sut.increment();
            assertThat(actual, is(51));
        }
    }

}
