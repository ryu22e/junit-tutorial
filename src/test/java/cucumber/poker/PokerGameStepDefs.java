package cucumber.poker;

import cucumber.annotation.ja.ならば;
import cucumber.annotation.ja.もし;
import cucumber.annotation.ja.前提;
import cucumber.runtime.PendingException;

public class PokerGameStepDefs {

    @前提("^手札にS(\\d+),H(\\d+),D(\\d+),D(\\d+),C(\\d+)が配られた$")
    public void 手札にS_H_D_D_C_が配られた(int arg1, int arg2, int arg3, int arg4,
            int arg5) throws Throwable {
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
