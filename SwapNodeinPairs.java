import java.util.*;
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        List<Integer> v = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            v.add(p.val);
            p = p.next;
        }
        for (int i = 0; i < v.size() - 1; i += 2) {
            int t = v.get(i);
            v.set(i, v.get(i + 1));
            v.set(i + 1, t);
        }
        p = head;
        for (int i = 0; i < v.size(); i++) {
            p.val = v.get(i);
            p = p.next;
        }
        return head;
    }
}
