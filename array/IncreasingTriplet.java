package array;

public class IncreasingTriplet {
    private boolean increasingTriplet(int[] nums) {
        int mid = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE -1;
        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else if (num <= mid) {
                mid = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
