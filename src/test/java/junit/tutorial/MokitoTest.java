package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class MokitoTest {
    @Test
    public void モックオブジェクトの作成() throws Exception {
        @SuppressWarnings("unchecked")
        List<String> mock = Mockito.mock(List.class);
        assertThat(mock.get(0), is(nullValue()));
        assertThat(mock.contains("Hello"), is(false));
    }
}
