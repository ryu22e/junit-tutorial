package cucumber.poker;

import cucumber.annotation.ja.ならば;
import cucumber.annotation.ja.もし;
import cucumber.annotation.ja.前提;
import cucumber.runtime.PendingException;

public class PokerGameStepDefs {

    @前提("^手札に([SHDC])(\\d+),([SHDC])(\\d+),([SHDC])(\\d+),([SHDC])(\\d+),([SHDC])(\\d+)が配られた$")
    public void 手札にカードが配られた(char suit1, int no1, char suit2, int no2,
            char suit3, int no3, char suit4, int no4, char suit5, int no5)
            throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @もし("^チェンジしない$")
    public void チェンジしない() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @ならば("^ノーペアであるべき$")
    public void ノーペアであるべき() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

}
