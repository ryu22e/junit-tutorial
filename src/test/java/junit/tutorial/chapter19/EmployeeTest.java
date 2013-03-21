package junit.tutorial.chapter19;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class EmployeeTest {
    public static class テキストファイルを指定してメソッドを実行するとき {
        @Test
        public void 名前_名字_メールアドレスが反映されたEmployeeオブジェクトのリストを取得できる()
                throws Exception {
            List<Employee> actual =
                    Employee.load(getClass()
                        .getResourceAsStream("Employee.txt"));
            assertThat(actual, is(notNullValue()));
            assertThat(actual.size(), is(1));
        }
    }
}
