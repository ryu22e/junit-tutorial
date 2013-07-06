package junit.tutorial.chapter19;

public class Range {
    public final double min;
    public final double max;

    public Range(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public boolean containts(double value) {
        return (value >= min && value <= max);
    }

}
