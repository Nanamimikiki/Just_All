package random;

import java.util.Scanner;

public class SysInOut {
    public static void main(String[] args) {
        double sum = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    sum += Double.parseDouble(scanner.next());
                } else {
                    scanner.next();
                }
            }
            System.out.println(String.format("%.6f", sum));
        } catch (Exception e) {
            System.out.println(String.format("%.6f", 0));
        }
    }
}

