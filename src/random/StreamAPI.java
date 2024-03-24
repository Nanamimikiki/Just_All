package random;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        HashMap<String, Integer> result = new HashMap<>();
        (new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8)))
                .lines()
                .flatMap(line -> Stream.of(line.split("[\\p{P}\\s]+")))
                .map(String::toLowerCase)
                .forEach(word -> {
                    if (result.containsKey(word)) {
                        result.put(word, result.get(word) + 1);
                    } else {
                        result.put(word, 1);
                    }
                });
        result.entrySet()
                .stream()
                .sorted((word1, word2) -> {
                    if (word1.getValue() == word2.getValue()) {
                        return word1.getKey().compareTo(word2.getKey());
                    } else {
                        return word2.getValue().compareTo(word1.getValue());
                    }
                })
                .limit(10)
                .forEach(elem -> System.out.println(elem.getKey()));
    }
}
