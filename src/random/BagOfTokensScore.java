package random;

import java.util.Arrays;

public class BagOfTokensScore {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int maxPossibleScore = 0;
        int score = 0;
        int minPointer = 0;
        int maxTokenPointer = tokens.length - 1;
        while (minPointer <= maxTokenPointer && (power >= tokens[minPointer] || score > 0)) {
            while (minPointer <= maxTokenPointer && power >= tokens[minPointer]) {
                power -= tokens[minPointer++];
                ++score;
            }
            maxPossibleScore = Math.max(maxPossibleScore, score);
            if (minPointer <= maxTokenPointer && score > 0) {
                power += tokens[maxTokenPointer--];
                --score;
            }
        }
        return maxPossibleScore;
    }
}

