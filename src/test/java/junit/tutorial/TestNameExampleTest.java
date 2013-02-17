package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestNameExampleTest {
    @Rule
    public TestName testName = new TestName();

    @Test
    public void テスト名() throws Exception {
        assertThat(testName.getMethodName(), is("テスト名"));
    }
}
