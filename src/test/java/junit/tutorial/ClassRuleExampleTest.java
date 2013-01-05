package junit.tutorial;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class ClassRuleExampleTest {

    @ClassRule
    public static ExternalServer externalServer = new ExternalServer();

    @Test
    public void test01() throws Exception {
        System.out.println("test01");
    }

    @Test
    public void test02() throws Exception {
        System.out.println("test02");
    }

    static class ExternalServer extends ExternalResource {

        @Override
        protected void before() throws Throwable {
            System.out.println("connect");
        }

        @Override
        protected void after() {
            System.out.println("disconnect");
        }

    }
}
