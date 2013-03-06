package junit.tutorial.chapter18;

import org.junit.Test;

public class CalculatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void 第2引数に0を指定してdivideを呼び出すとIllegalArgumentExceptionが発生する()
            throws Exception {
        Calculator sut = new Calculator();
        int x = 10;
        int y = 0;
        sut.divide(x, y);
    }

}
