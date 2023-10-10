package slidingWindow;

public class MinimumSizeSubarraySum {

    private int solution(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int curSum = 0;
        int ans = Integer.MAX_VALUE;
        while (right < nums.length) {
            curSum += nums[right];
            while (curSum >= target) {
                ans = Math.min(ans, right - left + 1);
                curSum -= nums[left];
                left++;
            }
            right++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
