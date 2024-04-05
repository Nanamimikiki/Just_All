package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AnotherFindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result.add(nums[i]); ;
            }
        }
        return result;
    }
}