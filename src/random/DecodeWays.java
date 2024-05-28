package random;

import java.util.ArrayList;
import java.util.Arrays;

public class DecodeWays {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] ways = new int[s.length() + n];
        ways[0] = 1;
        ways[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= n; i++) {
            int first = Integer.parseInt(s.substring(i - 1, i));
            int second = Integer.parseInt(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
                ways[i] += ways[i - 1];
            }
            if (second >= 10 && second <= 26) {
                ways[i] += ways[i - 2];
            }
        }
        return ways[n];
    }
}
