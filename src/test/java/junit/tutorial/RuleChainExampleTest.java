package junit.tutorial;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;

public class RuleChainExampleTest {
    @Rule
    public RuleChain ruleChain = RuleChain.outerRule(new DBServer()).around(
        new AppServer());

    @Test
    public void テスト() throws Exception {

    }
}
