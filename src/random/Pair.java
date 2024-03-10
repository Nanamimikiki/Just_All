package random;

import java.util.Objects;
import java.util.Optional;

public class Pair<T, U> {
    private final T first;
    private final U second;

    private Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static <T, U> Pair<T, U> of(T value1, U value2) {
        return new Pair<>(value1, value2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (first == null ? 0 : first.hashCode());
        result = prime * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
//
//    public static void main(String[] args) {
//        Pair<Integer, String> pair = Pair.of(1, "hello");
//
//        Integer i = pair.getFirst(); // 1
//        System.out.println(i);
//
//        String s = pair.getSecond(); // "hello"
//        System.out.println(s);
//
//        Pair<Integer, String> pair2 = Pair.of(1, "hello");
//
//        boolean mustBeTrue = pair.equals(pair2); // true!
//        System.out.println(mustBeTrue);
//
//        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
//        System.out.println(mustAlsoBeTrue);
//    }


