package slidingWindow;

public class LongestSubarrayAfterDeletingOneElement {

    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int zeros = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                zeros++;
            }
            right++;
            if (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
        }
        return right - left - 1;
    }
}
