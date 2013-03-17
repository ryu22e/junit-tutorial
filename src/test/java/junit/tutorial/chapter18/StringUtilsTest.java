package junit.tutorial.chapter18;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void aaaを入力するとaaaが取得できる() throws Exception {
        String actual = StringUtils.toSnakeCase("aaa");
        assertThat(actual, is("aaa"));
    }

    @Test
    public void HelloWorldと入力するとhello_worldが取得できる() throws Exception {
        String actual = StringUtils.toSnakeCase("HelloWorld");
        assertThat(actual, is("hello_world"));
    }

    @Test
    public void practiceJunitを入力するとpractice_junitが取得できる() throws Exception {
        String actual = StringUtils.toSnakeCase("practiceJunit");
        assertThat(actual, is("practice_junit"));
    }
}
