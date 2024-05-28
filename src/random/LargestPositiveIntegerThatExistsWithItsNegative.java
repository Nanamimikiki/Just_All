package random;

import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for (int num : nums) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[j] == -num) {
                    return nums[j];
                }
            }
        }
        return -1;
    }
}
