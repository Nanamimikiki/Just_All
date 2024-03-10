package random;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        Iterator<T> iterator = result.iterator();
        while (iterator.hasNext()) {
            T elem = iterator.next();
            if (set1.contains(elem) && set2.contains(elem)) {
                iterator.remove();
            }
        }
        return result;
    }
}
 