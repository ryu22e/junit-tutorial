package junit.tutorial;

public class RandomNumberGeneratorFixedResultStub implements
        RandomNumberGenerator {
    @Override
    public int nextInt() {
        return 1;
    }

}
