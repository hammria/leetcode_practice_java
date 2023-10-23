package array;

public class MaxAvgSubarray {

    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int cur = 0;
        while (i < k) {
            cur += nums[i];
            i++;
        }
        int maxSum = cur;
        while (i < nums.length) {
            cur = cur + nums[i] - nums[i - k];
            if (cur > maxSum) {
                maxSum = cur;
            }
            i++;
        }
        return maxSum / (k + 0.0);
    }

}
