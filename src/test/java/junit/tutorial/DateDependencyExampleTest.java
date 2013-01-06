package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateDependencyExampleTest {

    @Test
    public void doSomethingでdateに現在時刻が設定される() {
        DateDependencyExample sut = new DateDependencyExample();
        sut.doSomething();
        assertThat(sut.date, is(new Date()));
    }

}
