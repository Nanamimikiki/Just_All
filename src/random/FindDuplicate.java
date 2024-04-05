package random;

import java.util.Arrays;

class FindDuplicate {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int result = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result = nums[i];
                break;
            }
        }
        return result;
    }
}