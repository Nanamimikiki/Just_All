package random;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class BigIntFactorial {
    public static BigInteger factorial(int value) {
        if (value < 2) {
            return BigInteger.valueOf(1);
        }
        return IntStream.rangeClosed(2, value).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
    }

    public static void main(String[] args) {
        int value = -5;
        BigInteger result = factorial(value);
        System.out.println("Factorial of " + value + ": " + result);
    }
}
