package junit.tutorial.chapter16;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addは3と4で7を返す() throws Exception {
        Calculator sut = new Calculator();
        assertThat(sut.add(3, 4), is(7));
    }
}
