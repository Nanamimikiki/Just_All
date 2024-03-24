package random;

import java.util.stream.IntStream;

public class PseudoRandomStream {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, x -> (x * x) / 10 % 1000);
    }
}
