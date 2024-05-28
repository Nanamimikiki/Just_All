package random;

public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int charIndex = 0;
        while (charIndex < word.length() && word.charAt(charIndex)!= ch) {
            charIndex++;
        }
        if (charIndex == word.length()) {
            return word;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = charIndex; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        sb.append(word.substring(++charIndex, word.length()));
        return sb.toString();
    }
}
