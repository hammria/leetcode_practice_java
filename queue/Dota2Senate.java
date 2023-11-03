package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {

    public String predictPartyVictory(String senate) {
        Queue<Character> queue = new LinkedList<>();
        int r = 0;
        int d = 0;
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                queue.add('R');
                r++;
            } else {
                queue.add('D');
                d++;
            }
        }
        int needToDropR = 0;
        int needToDropD = 0;
        while (r > 0 && d > 0) {
            char c = queue.poll();
            if (c == 'R') {
                if (needToDropR > 0) {
                    needToDropR--;
                    r--;
                } else {
                    needToDropD++;
                    queue.add('R');
                }
            } else {
                if (needToDropD > 0) {
                    needToDropD--;
                    d--;
                } else {
                    needToDropR++;
                    queue.add('D');
                }
            }
        }
        if (r == 0) {
            return "Dire";
        }
        return "Radiant";
    }
}
