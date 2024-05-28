package random;

import java.math.BigInteger;
import java.util.Stack;

class RemoveKdigits {
    public String removeKdigits(String num, int k) {
        if (k <= 0 && num != null) {
            return num;
        }
        if (num.length() == 0 || num.length() == k) {
                return "0";
        }

        Stack<Character> numStack = new Stack<>();

        for(int i = 0; i < num.length(); i++) {
            while (!numStack.isEmpty() && numStack.peek() > num.charAt(i) && k > 0) {
                numStack.pop();
                k--;
            }
            numStack.push(num.charAt(i));
        }
        while(k !=0) {
            numStack.pop();
            k--;
        }
        StringBuilder resultBuilder = new StringBuilder();
        while(!numStack.isEmpty()) {
            resultBuilder.append(numStack.pop());
        }
        resultBuilder.reverse();
        while(resultBuilder.length() > 1 && resultBuilder.charAt(0)=='0') {
            resultBuilder.deleteCharAt(0);
        }
        return resultBuilder.toString();
    }
}
