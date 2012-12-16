package junit.tutorial;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SlowAndFastTest {
    @Test
    public void fastTest_01() throws Exception {

    }

    @Test
    @Category(SlowTests.class)
    public void slowTest_01() throws Exception {
    }

    @Test
    @Category(SlowTests.class)
    public void slowTest_02() throws Exception {
    }
}
