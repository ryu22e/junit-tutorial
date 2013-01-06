package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RandomsTest {

    @Test
    public void choiceでAを返す() throws Exception {
        List<String> options = new ArrayList<String>();
        options.add("A");
        options.add("B");
        Randoms sut = new Randoms();
        sut.generator = new RandomNumberGenerator() {
            @Override
            public int nextInt() {
                return 0;
            }
        };
        assertThat(sut.choice(options), is("A"));
    }

    @Test
    public void choiceでBを返す() throws Exception {
        List<String> options = new ArrayList<String>();
        options.add("A");
        options.add("B");
        Randoms sut = new Randoms();
        sut.generator = new RandomNumberGenerator() {
            @Override
            public int nextInt() {
                return 1;
            }
        };
        assertThat(sut.choice(options), is("B"));
    }
}
