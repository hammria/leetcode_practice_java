package array;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                curSum += nums[i - 1];
            }
            sum -= nums[i];
            if (curSum == sum) {
                return i;
            }
        }
        return -1;
    }
}
