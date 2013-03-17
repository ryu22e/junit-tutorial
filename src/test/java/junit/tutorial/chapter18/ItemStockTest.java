package junit.tutorial.chapter18;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ItemStockTest {
    public static class 初期状態のとき {
        private ItemStock sut;

        @Before
        public void setUp() throws Exception {
            sut = new ItemStock();
        }

        @Test
        public void getNumで0が取得できる() throws Exception {
            Item item = new Item("test1");
            int actual = sut.getNum(item);
            assertThat(actual, is(0));
        }

        @Test
        public void addでItemを追加するとgetNumで1が取得できる() throws Exception {
            Item item = new Item("test1");
            sut.add(item);
            int actual = sut.getNum(item);
            assertThat(actual, is(1));
        }
    }

    public static class Itemが1つ追加されている場合 {
        private ItemStock sut;

        @Before
        public void setUp() throws Exception {
            sut = new ItemStock();
            sut.add(new Item("test1"));
        }

        @Test
        public void getNumで1が取得できる() throws Exception {
            Item item = new Item("test1");
            int actual = sut.getNum(item);
            assertThat(actual, is(1));
        }

        @Test
        public void addで同じオブジェクトを追加するとgetNumで2が取得できる() throws Exception {
            Item item = new Item("test1");
            sut.add(item);
            int actual = sut.getNum(item);
            assertThat(actual, is(2));
        }
    }
}
