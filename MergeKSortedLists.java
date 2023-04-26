import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> v = new ArrayList<>();
        for (ListNode p : lists) {
            while (p != null) {
                v.add(p.val);
                p = p.next;
            }
        }
        ListNode pt = new ListNode(-1);
        ListNode q = pt;
        Collections.sort(v);
        for (int i : v) {
            ListNode l = new ListNode(i);
            pt.next = l;
            pt = l;
        }
        return q.next;
    }
}