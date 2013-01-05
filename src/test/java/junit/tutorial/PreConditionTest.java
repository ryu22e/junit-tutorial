package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

public class PreConditionTest {
    @Rule
    public PreCondition preCondition = new PreCondition() {

        @Override
        protected void verify() throws Throwable {
            assertThat(sut, is(notNullValue()));
        }
    };

    public Integer sut = 1;

    @Test
    public void testname() throws Exception {
    }
}
