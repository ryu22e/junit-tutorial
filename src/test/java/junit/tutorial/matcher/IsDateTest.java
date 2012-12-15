package junit.tutorial.matcher;

import static junit.tutorial.matcher.IsDate.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class IsDateTest {
    @Test(expected = AssertionError.class)
    public void 日付が一致しない() {
        Calendar cal = Calendar.getInstance();
        // 月を11にしているけど、Dateクラスの月は0から始まるので、12月のつもり。
        cal.set(2012, 11, 15);
        Date date = cal.getTime();
        assertThat(date, is(dateOf(2011, 2, 10)));
    }

    @Test
    public void 日付が一致する() throws Exception {
        Calendar cal = Calendar.getInstance();
        // 月を11にしているけど、Dateクラスの月は0から始まるので、12月のつもり。JavaのDateクラスは分かりにくい:cry:
        cal.set(2012, 11, 15);
        Date date = cal.getTime();
        assertThat(date, is(dateOf(2012, 11, 15)));
    }
}
