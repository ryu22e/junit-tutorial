package junit.tutorial;

import java.util.Date;

public class DateFactoryImpl implements DateFactory {
    @Override
    public Date newDate() {
        return new Date();
    }
}
