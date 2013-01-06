package junit.tutorial;

import java.util.List;

public class Randoms {
    RandomNumberGenerator generator = new RandomeNumberGeneratorImpl();

    public <T> T choice(List<T> options) {
        if (options.size() == 0)
            return null;
        int idx = generator.nextInt() % options.size();
        return options.get(idx);
    }
}
