package random;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class SystemOut {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        StringBuffer sb = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int nextInt;
        while (scanner.hasNextInt()) {
            nextInt = scanner.nextInt();
            if (count % 2 != 0) {
                arrayDeque.add(nextInt);
            }
            count++;
        }
        while (!arrayDeque.isEmpty()) {
            sb.append(arrayDeque.pollLast()).append(" ");
        }
        System.out.println(sb);
    }
}

