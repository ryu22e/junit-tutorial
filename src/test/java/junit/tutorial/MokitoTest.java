package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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

    @Test
    public void スタブメソッドの定義() throws Exception {
        @SuppressWarnings("unchecked")
        List<String> stub = mock(List.class);
        when(stub.get(0)).thenReturn("Hello");
        assertThat(stub.get(0), is("Hello"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void 例外を送出するスタブメソッド() throws Exception {
        @SuppressWarnings("unchecked")
        List<String> stub = mock(List.class);
        when(stub.get(0)).thenReturn("Hello");
        when(stub.get(1)).thenReturn("World");
        when(stub.get(2)).thenThrow(new IndexOutOfBoundsException());
        stub.get(2);
    }
}
