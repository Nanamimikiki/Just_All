package random;

import java.util.*;
import java.util.function.Consumer;

public class MailServiceSomething {
    public static interface Sendable<T> {
        String getFrom();

        String getTo();

        T getContent();
    }

    public static class MailMessage implements Sendable<String> {
        private String from;
        private String to;
        private String content;

        public MailMessage(String from, String to, String content) {
            this.from = from;
            this.to = to;
            this.content = content;
        }

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }

        public String getContent() {
            return content;
        }
    }

    public static class Salary implements Sendable<Integer> {
        private String from;
        private String to;
        private Integer content;

        public Salary(String from, String to, Integer content) {
            this.from = from;
            this.to = to;
            this.content = content;
        }

        public final String getFrom() {
            return from;
        }

        public final String getTo() {
            return to;
        }

        public final Integer getContent() {
            return content;
        }
    }

    public static class MailService<T> implements Consumer<Sendable<T>> {

        private final Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                return super.getOrDefault(key, Collections.emptyList());
            }
        };

        @Override
        public void accept(Sendable<T> tSendable) {
            mailBox.computeIfAbsent(tSendable.getTo(), el -> new ArrayList<>()).add(tSendable.getContent());
        }

        public Map<String, List<T>> getMailBox() {
            return mailBox;
        }
    }
}
