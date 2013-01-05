package junit.tutorial;

import static junit.tutorial.Janken.Hand.*;
import static junit.tutorial.Janken.Result.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JankenTest {

    private Janken sut;

    @Before
    public void setUp() throws Exception {
        sut = new Janken();
    }

    @Test
    public void グーとチョキなら勝利() throws Exception {
        assertThat(sut.judge(GU, TYOKI), is(WIN));
    }

    @Test
    public void グーとパーなら敗北() throws Exception {
        assertThat(sut.judge(GU, PA), is(LOSE));
    }
}
