package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Test;

public class RandomMockTest {
    @Test
    public void choiceでAを返す() throws Exception {
        List<String> options = new ArrayList<String>();
        options.add("A");
        options.add("B");
        Randoms sut = new Randoms();
        final AtomicBoolean isCallNextIntMethod = new AtomicBoolean(false);
        sut.generator = new RandomNumberGenerator() {
            @Override
            public int nextInt() {
                isCallNextIntMethod.set(true);
                return 0;
            }
        };
        assertThat(sut.choice(options), is("A"));
        assertThat(isCallNextIntMethod.get(), is(true));
    }
}
