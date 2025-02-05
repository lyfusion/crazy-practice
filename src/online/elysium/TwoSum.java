package online.elysium;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (indices.containsKey(complement)) {
                return new int[] { indices.get(complement), i };
            }

            indices.put(nums[i], i);
        }

        return null;
    }
}