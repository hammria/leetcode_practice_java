package queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecentNumberOfCalls {
    class RecentCounter {

        List<Integer> calls;

        public RecentCounter() {
            this.calls = new ArrayList<>();
        }

        public int ping(int t) {
            Iterator<Integer> iterator = calls.iterator();
            while (iterator.hasNext()) {
                int i = iterator.next();
                if (i < t - 3000) {
                    iterator.remove();
                } else {
                    break;
                }
            }
            this.calls.add(t);
            return calls.size();
        }
    }

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
}
