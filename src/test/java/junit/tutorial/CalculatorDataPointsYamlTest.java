package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.yaml.snakeyaml.Yaml;

@RunWith(Theories.class)
public class CalculatorDataPointsYamlTest {
    @DataPoints
    public static Fixture[] getParams() {
        InputStream in =
                CalculatorDataPointsYamlTest.class
                    .getResourceAsStream("params.yaml");
        @SuppressWarnings("unchecked")
        Fixture[] list =
                ((List<Fixture>) new Yaml().load(in)).toArray(new Fixture[0]);
        return list;
    }

    @Theory
    public void add(Fixture p) throws Exception {
        Calculator sut = new Calculator();
        assertThat(sut.add(p.x, p.y), is(p.expected));
    }

    public static class Fixture {
        public int x;
        public int y;
        public int expected;
    }
}
