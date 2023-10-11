package twoPtr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxNumKSumsPairs {

    private int solutionUsingMap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            if (map.containsKey(k - num)) {
                if (map.get(k - num) > 1) {
                    map.put(k - num, map.get(k - num) - 1);
                } else {
                    map.remove(k - num);
                }
                res++;
                continue;
            }
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return res;
    }

    private int solutionUsingTwoPtr(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;
        while (left < right) {
            if (nums[left] + nums[right] == k) {
                left++;
                right--;
                ans++;
            } else if (nums[left] + nums[right] > k) {
                right--;
            } else {
                left++;
            }
        }
        return ans;
    }

}
