package junit.tutorial;

import java.util.Date;

public class DelegateObjectExample {
    DateFactory dateFactory = new DateFactoryImpl();
    Date date = new Date();

    public void doSomething() {
        this.date = dateFactory.newDate();
        // 何らかの処理（省略）
    }
}
