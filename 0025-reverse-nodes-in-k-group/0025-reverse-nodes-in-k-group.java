/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode h, int k) {
        if (h == null || k <= 1) {
            return h; // If list is empty or k <= 1, no reversal is needed
        }

        int c = 0;
        ListNode t = h;
        ListNode d = new ListNode(0); // Dummy node
        ListNode g = d; // Pointer to track the end of the reversed list
        ListNode n = h;

        while (t != null) {
            c++;
            if (c % k == 0) { // When we've reached a group of size k
                ListNode q = t.next; // Store the next group's starting node
                t.next = null; // Break the current group
                ListNode r = rev(n); // Reverse the current group
                g.next = r; // Connect the reversed group to the previous part
                g = n; // Update the tail of the reversed list
                n = q; // Move to the next group
                t = q; // Reset `t` to the next group's starting node
            } else {
                t = t.next; // Move to the next node
            }
        }
        g.next = n; // Attach the remaining nodes (if any)
        return d.next; // Return the head of the new list
    }

    // Helper function to reverse a linked list
    public ListNode rev(ListNode h) {
        ListNode p = null;
        while (h != null) {
            ListNode n = h.next;
            h.next = p;
            p = h;
            h = n;
        }
        return p;
    }
}
