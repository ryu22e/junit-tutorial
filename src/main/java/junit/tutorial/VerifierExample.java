package junit.tutorial;

public class VerifierExample {

    protected int value = 0;

    public void set(int i) {
        this.value = i;
    }

    public void add(int i) {
        this.value += i;
    }

    public void minus(int i) {
        this.value -= i;
    }

    public int getValue() {
        return this.value;
    }

}
