package random;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class StreamAPI {
    public static void main(String[] args) throws UnsupportedEncodingException {
        (new BufferedReader(new InputStreamReader(System.in, "UTF-8")))
                .lines()
                .flatMap(line -> Stream.of(line.split("[\\p{P}\\s]+")))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(
                        (e0, e1) -> {
                            final int res = e1.getValue().compareTo(e0.getValue());
                            return res == 0 ? e0.getKey().compareTo(e1.getKey()) : res;
                        }
                )
                .limit(10)
                .forEach(e -> System.out.println(e.getKey()));
    }
}
