package junit.tutorial;

import java.util.Date;

public class MethodExtractExample {
    Date date = newDate();

    public void doSomething() {
        this.date = newDate();
        // 何らかの処理（省略）
    }

    Date newDate() {
        return new Date();
    }
}
