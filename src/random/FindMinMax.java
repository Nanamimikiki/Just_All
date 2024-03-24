package random;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMinMax {
    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> elements = (List<T>) stream.sorted(order).toList();
        if (!elements.isEmpty()) {
            minMaxConsumer.accept(elements.get(0), elements.get(elements.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }
}

