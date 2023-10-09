package binarySearch;

import java.util.Arrays;

// binary search twice to find left bound and right bound, O(logn)
// or you can try binary search first find the target and linear search in both side
public class FindFirstAndLastPosInArray {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int[] nums2 = new int[]{1, 4};
        System.out.println(Arrays.toString(solution(nums, 8)));
        System.out.println(Arrays.toString(solution(nums, 6)));
        System.out.println(Arrays.toString(solution(nums2, 4)));
    }

    private static int[] solution(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        int lower = 0;
        int upper = nums.length - 1;
        int mid = 0;
        int index = -1;

        while (lower <= upper) {
            mid = (lower + upper) / 2;
            if (nums[mid] == target) {
                index = mid;
                upper = mid - 1;
            } else if (nums[mid] < target) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        res[0] = index;

        lower = 0;
        upper = nums.length - 1;
        index = -1;
        while (lower <= upper) {
            mid = (lower + upper) / 2;
            if (nums[mid] == target) {
                index = mid;
                lower = mid + 1;
            } else if (nums[mid] > target) {
                upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        res[1] = index;

        return res;

    }

}
