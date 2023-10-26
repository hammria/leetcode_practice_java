package array;

import java.util.HashMap;
import java.util.Map;

public class EqualRowsAndColumnsPair {

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int ans = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < n; j++) {
                int k = 0;
                while (k < n) {
                    if (ints[k] != grid[k][j]) {
                        break;
                    }
                    k++;
                }
                if (k == n) {
                    ans++;
                }
            }
        }
        return ans;
    }

}
