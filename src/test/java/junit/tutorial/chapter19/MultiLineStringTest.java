package junit.tutorial.chapter19;

import static junit.tutorial.chapter19.MultiLineStringMatcher.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class MultiLineStringTest {
    public static class HelloとWorldの2つの文字列をjoinメソッドに与える {
        @Test
        public void 改行で連結された文字列を取得できる() throws Exception {
            String ls = System.getProperty("line.separator");
            String expected = "Hello" + ls + "World";
            String actual = MultiLineString.join("Hello", "World");
            assertThat(actual, is(text(expected)));
        }
    }
}
