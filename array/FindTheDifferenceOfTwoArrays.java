package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int num : nums1) {
            s1.add(num);
        }
        Set<Integer> s2 = new HashSet<>();
        for (int num : nums2) {
            s2.add(num);
        }
        List<List<Integer>> ans = new ArrayList<>();
        Iterator<Integer> iterator = s1.iterator();
        int cur = 0;
        while (iterator.hasNext()) {
            cur = iterator.next();
            if (s2.contains(cur)) {
                iterator.remove();
                s2.remove(cur);
            }
        }
        ans.add(new ArrayList<>(s1));
        ans.add(new ArrayList<>(s2));
        return ans;
    }
}
