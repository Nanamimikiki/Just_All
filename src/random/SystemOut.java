package random;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class SystemOut {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    arrayDeque.add(String.valueOf(scanner.nextInt()));
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            Iterator<String> descendingIterator = arrayDeque.descendingIterator();
            StringBuffer sb = new StringBuffer();
            while (descendingIterator.hasNext()) {
                sb.append(descendingIterator.next()).append(" ");
                descendingIterator.next();
            }
            System.out.println(sb);
        }
    }
}
