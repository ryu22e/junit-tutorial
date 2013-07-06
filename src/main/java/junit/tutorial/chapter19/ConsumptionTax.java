package junit.tutorial.chapter19;

public class ConsumptionTax {

    private final int rate;

    public ConsumptionTax(int rate) {
        this.rate = rate;
    }

    public int apply(int price) {
        return price + (price * this.rate / 100);
    }

}
