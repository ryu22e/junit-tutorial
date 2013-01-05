package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

public class VerifierExampleTest {
    @Rule
    public Verifier verifier = new Verifier() {
        protected void verify() throws Throwable {
            assertThat("value should be 0.", sut.value, is(0));
        }
    };

    VerifierExample sut;

    @Before
    public void setUp() throws Exception {
        sut = new VerifierExample();
    }

    @After
    public void tearDown() throws Exception {
        sut.set(0);
    }

    @Test
    public void getValueで計算結果を取得する() throws Exception {
        sut.set(200);
        sut.add(100);
        sut.minus(50);
        int actual = sut.getValue();
        assertThat(actual, is(250));
    }
}
