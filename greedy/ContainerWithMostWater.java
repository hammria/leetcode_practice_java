package greedy;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int preMin = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > preMin) {
                    area = Math.max(area, height[left] * (right - left));
                    preMin = left;
                }
                left++;
            } else {
                if (height[right] > preMin) {
                    area = Math.max(area, height[right] * (right - left));
                    preMin = right;
                }
                right--;
            }
        }
        return area;
    }
}
