package online.elysium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // i != j, j != k
        // nums[i] + nums[j] + nums[k] == 0

        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> threeSum = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(threeSum);
                        uniqueTriplets.add(threeSum);
                    }
                }
            }
        }

        result.addAll(uniqueTriplets);
        return result;
    }
}
