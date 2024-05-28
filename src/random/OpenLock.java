package random;

import java.util.*;

public class OpenLock {
    public int openLock(String[] deadends, String target) {
        Set<String> deadendsSet = new HashSet<>(Arrays.asList(deadends));
        if ((deadendsSet.contains(target) || deadendsSet.contains("0000")) && target == null) {
            return -1;
        }
        if (target.equals("0000")) {
            return 0;
        }
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("0000");
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                if (current.equals(target)) {
                    return depth;
                }
                for (int j = 0; j < 4; j++) {
                    for (int k = -1; k <= 1; k += 2) {
                        char[] currentArray = current.toCharArray();
                        int digit = (currentArray[j] - '0' + k + 10) % 10;
                        currentArray[j] = (char) (digit + '0');
                        String neighbor = new String(currentArray);
                        if (!visited.contains(neighbor) && !deadendsSet.contains(neighbor)) {
                            queue.offer(neighbor);
                            visited.add(neighbor);
                        }
                    }
                }
            }
            depth++;
        }
        return -1;
    }
}
