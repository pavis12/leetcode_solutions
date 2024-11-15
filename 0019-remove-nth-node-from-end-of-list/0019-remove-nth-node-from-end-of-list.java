class Solution {
    public ListNode removeNthFromEnd(ListNode h, int n) {
        ListNode f = h;
        ListNode s = h;
        
        // Move the fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (f == null) return null;  // If n is greater than the length of the list
            f = f.next;
        }
        
        // If fast pointer reached the end, we need to remove the head node
        if (f == null) {
            return h.next;
        }

        // Move both pointers until the fast pointer reaches the end
        while (f != null && f.next != null) {
            f = f.next;
            s = s.next;
        }
        
        // Remove the nth node from the end
        s.next = s.next.next;

        return h;
    }
}
