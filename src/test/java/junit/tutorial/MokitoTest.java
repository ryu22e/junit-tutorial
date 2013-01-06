package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
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

    @Test(expected = RuntimeException.class)
    public void void型を返すスタブメソッド() throws Exception {
        @SuppressWarnings("unchecked")
        List<String> stub = mock(List.class);
        doThrow(new RuntimeException()).when(stub).clear();
        stub.clear();
    }

    @Test
    public void 任意の整数に対するスタブメソッド() throws Exception {
        @SuppressWarnings("unchecked")
        List<String> stub = mock(List.class);
        when(stub.get(anyInt())).thenReturn("Hello");
        assertThat(stub.get(0), is("Hello"));
        assertThat(stub.get(1), is("Hello"));
        assertThat(stub.get(999), is("Hello"));
    }

    @Test
    public void スタブメソッドの検証() throws Exception {
        @SuppressWarnings("unchecked")
        List<String> mock = mock(List.class);
        mock.clear();
        mock.add("Hello");
        mock.add("Hello");
        verify(mock).clear();
        verify(mock, times(2)).add("Hello");
        verify(mock, never()).add("World");
    }

    @Test
    public void 部分的なモックオブジェクト() throws Exception {
        // 初版の196ページ リスト11.29 のサンプルコードが間違っている？
        List<String> mock = new ArrayList<String>();
        List<String> spy = spy(mock);
        when(spy.size()).thenReturn(100);
        spy.add("Hello");

        assertThat(spy.get(0), is("Hello"));
        assertThat(spy.size(), is(100));
    }
}
