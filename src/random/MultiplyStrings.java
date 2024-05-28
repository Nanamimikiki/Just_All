package random;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int num1Len = num1.length();
        int num2Len = num2.length();
        int[] prod = new int[num1Len + num2Len];
        int currIndex = prod.length - 1;

        for (int i = num1Len - 1; i >= 0; i--) {
            int idx = currIndex--;
            for (int j = num2Len - 1; j >= 0; j--) {
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                int res = a * b + prod[idx];
                prod[idx] = res % 10;
                prod[--idx] += res / 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int num : prod) {
            if (num == 0 && sb.length() == 0) {
                continue;
            }
            sb.append(num);
        }
        if (sb.length() == 0) {
            return "0";
        }
        return sb.toString();
    }
}
