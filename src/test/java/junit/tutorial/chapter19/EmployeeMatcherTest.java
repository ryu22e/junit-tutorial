package junit.tutorial.chapter19;

import static junit.tutorial.chapter19.EmployeeMatcher.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.junit.Test;

public class EmployeeMatcherTest {
    @Test
    public void loadでEmployeeの一覧を取得できる() throws Exception {
        // SetUp
        InputStream input = getClass().getResourceAsStream("Employee.txt");
        Employee expected = new Employee();
        expected.setFirstName("Ichiro");
        expected.setLastName("Tanaka");
        expected.setEmail("ichiro@example.com");
        // Exercise
        List<Employee> actual = Employee.load(input);
        // Verify
        assertThat(actual, is(notNullValue()));
        assertThat(actual.size(), is(1));
        assertThat(actual.get(0), is(employee(expected)));
    }
}
