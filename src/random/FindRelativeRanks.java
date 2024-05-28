package random;

import java.util.Arrays;
import java.util.HashMap;

public class FindRelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        Integer[] pos = new Integer[len];
        for (int i = 0; i < len; ++i) {
            pos[i] = i;
        }
        Arrays.sort(pos, (a, b) -> Integer.compare(score[b], score[a]));
        String[] ranks = new String[len];
        String[] medals = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        for (int i = 0; i < len; ++i) {
            if (i < 3) {
                ranks[pos[i]] = medals[i];
            } else {
                ranks[pos[i]] = String.valueOf(i + 1);
            }
        }
        return ranks;
    }
}
