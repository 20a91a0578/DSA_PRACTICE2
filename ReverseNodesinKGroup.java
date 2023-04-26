import java.util.*;
class Solution {
    ListNode rev = new ListNode(-1);
    ListNode f = rev;

    public ListNode reverse(ListNode head) {
        ListNode ne = null;
        ListNode c = head;
        ListNode pr = null;
        while (c != null) {
            ne = c.next;
            c.next = pr;
            pr = c;
            c = ne;
        }
        return pr;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p = head;
        while (p != null) {
            ListNode dummy = new ListNode(-1);
            ListNode fg = dummy;
            for (int i = 0; i < k; i++) {
                if (p == null) {
                    f.next = dummy.next;
                    return rev.next;
                }
                fg.next = new ListNode(p.val);
                fg = fg.next;
                p = p.next;
            }
            ListNode j = reverse(dummy.next);
            f.next = j;
            while (f.next != null) {
                f = f.next;
            }
        }
        return rev.next;
    }
}