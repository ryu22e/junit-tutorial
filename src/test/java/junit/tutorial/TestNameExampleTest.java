package junit.tutorial;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestNameExampleTest {
    @Rule
    public TestName testName = new TestName();

    @Ignore
    @Test
    public void テスト名() throws Exception {
        fail(testName.getMethodName() + " is unimplements yet.");
    }
}
