package junit.tutorial;

import java.util.Random;

public class RandomeNumberGeneratorImpl implements RandomNumberGenerator {

    private final Random rand = new Random();

    @Override
    public int nextInt() {
        return rand.nextInt();
    }
}
