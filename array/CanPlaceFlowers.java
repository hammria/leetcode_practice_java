package array;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        boolean left = flowerbed[0] == 0;
        boolean right;
        while (i < flowerbed.length) {
            while (i < flowerbed.length && flowerbed[i] != 0) {
                i++;
            }
            int block = 0;
            while (i < flowerbed.length && flowerbed[i] == 0) {
                block++;
                i++;
            }
            right = i < flowerbed.length;
            if (left && right) {
                n -= (block - 1) / 2;
            } else if (!left && !right) {
                n -= (block + 1) / 2;
            } else {
                n -= block / 2;
            }
            if (n <= 0) {
                return true;
            }

        }
        return false;
    }
}
