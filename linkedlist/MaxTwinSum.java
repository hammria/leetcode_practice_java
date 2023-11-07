package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class MaxTwinSum {
    public int pairSum(ListNode head) {
        ListNode cur = head;
        List<Integer> list = new ArrayList<>();
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        int ans = 0;
        for (int i = 0; i < list.size() / 2; i++) {
            ans = Math.max(ans, list.get(i) + list.get(list.size() - i - 1));
        }
        return ans;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
