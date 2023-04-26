class Solution {
    public ListNode rotate(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ptr = head;
        ListNode pre = head;
        while (ptr.next != null) {
            pre = ptr;
            ptr = ptr.next;
        }
        pre.next = null;
        ptr.next = head;
        head = ptr;
        return head;
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        ListNode p = head;
        if (head == null) return head;
        int c = 0;
        while (p != null) {
            c += 1;
            p = p.next;
        }
        k = k % c;
        for (int i = 0; i < k; i++) head = rotate(head);
        return head;
    }
}