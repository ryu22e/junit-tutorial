package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * Eclipseでこのテストを動かすためには、Eclipseの設定画面 Java &gt; Installed JREs から<br />
 * 使用しているJREを選んで、Editで「Default VM arguments」に「-Dsun.jnu.encoding=UTF-8」を指定する必要がある。<br />
 * （でも、Quick JUnitからは動かせないっぽい＞＜）
 * @author ryu22e
 *
 */
@RunWith(Enclosed.class)
public class ItemStockTest {

    public static class 空の場合 {
        ItemStock sut;

        @Before
        public void setUp() throws Exception {
            sut = new ItemStockImpl();
        }

        @Test
        public void size_Aが0を返す() throws Exception {
            assertThat(sut.size("A"), is(0));
        }

        @Test
        public void containts_Aはfalseを返す() throws Exception {
            assertThat(sut.contains("A"), is(false));
        }
    }

    public static class 商品Aを1件含む場合 {
        ItemStock sut;

        @Before
        public void setUp() throws Exception {
            sut = new ItemStockImpl();
            sut.add("A", 1);
        }

        @Test
        public void sizeが1を返す() throws Exception {
            assertThat(sut.size("A"), is(1));
        }

        @Test
        public void containts_Aはtrueを返す() throws Exception {
            assertThat(sut.contains("A"), is(true));
        }
    }

}
