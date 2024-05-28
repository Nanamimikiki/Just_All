package random;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return null;
        }
        List<String> result = new ArrayList<>();
        StringBuilder pair = new StringBuilder();
        for (int i = 0; i < n; i++) {
            pair.append("()");
        }
        String pairString = pair.toString();
    }
}
