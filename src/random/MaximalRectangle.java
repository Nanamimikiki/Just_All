package random;

import java.util.Stack;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        if (matrix == null || matrix.length == 0) {
            return maxArea;
        }
        int widthLen = matrix.length;
        int colLen = matrix[0].length;
        int[][] height = new int[widthLen][colLen + 1];

        for (int i = 0; i < widthLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (matrix[i][j] == '0') {
                    height[i][j] = 0;
                } else {
                    height[i][j] = i == 0 ? 1 : height[i - 1][j] + 1;
                }
            }
        }
        for (int i = 0; i < widthLen; i++) {
            int area = maxAreaFound(height[i]);
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

    private int maxAreaFound(int[] height) {
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int currentMaxArea = 0;
        while (i < height.length) {
            if (stack.isEmpty() || height[stack.peek()] <= height[i]) {
                stack.push(i++);
            } else {
                int t = stack.pop();
                currentMaxArea = Math.max(currentMaxArea, height[t] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }
        return currentMaxArea;
    }
}
