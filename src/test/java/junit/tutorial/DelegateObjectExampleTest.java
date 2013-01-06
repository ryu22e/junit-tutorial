package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DelegateObjectExampleTest {

    @Test
    public void doSomethingを実行するとdateに現在時刻が設定される() {
        final Date current = new Date();
        DelegateObjectExample sut = new DelegateObjectExample();
        sut.dateFactory = new DateFactory() {
            @Override
            public Date newDate() {
                return current;
            }

        };
        sut.doSomething();
        assertThat(sut.date, is(sameInstance(current)));
    }

}
