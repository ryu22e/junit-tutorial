package cucumber.poker;

public class Pat {
    public static final Pat NO_PAIR = new NoPair();

    public static Pat make(Hands hands) {
        // TODO 他の役の実装
        return NO_PAIR;
    }

    public static class NoPair extends Pat {
        // hashCode, equalsメソッドは省略
    }
}
