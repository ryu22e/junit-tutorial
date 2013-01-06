package junit.tutorial;

import java.util.Date;

public class DateDependencyExample {
    Date date = new Date();

    public void doSomething() {
        this.date = new Date();
        // 何らかの処理（省略）
    }
}
