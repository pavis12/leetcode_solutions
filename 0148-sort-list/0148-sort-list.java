class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        // Step 1: Split the list into two halves
        ListNode middle = getMiddle(head);
        ListNode nextToMiddle = middle.next;
        middle.next = null; // Split the list into two parts
        
        // Step 2: Sort the two halves
        ListNode left = sortList(head);
        ListNode right = sortList(nextToMiddle);
        
        // Step 3: Merge the sorted halves
        return merge(left, right);
    }
    
    // Helper method to find the middle node
    private ListNode getMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        // Move 'fast' by two steps and 'slow' by one step to find the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    // Helper method to merge two sorted linked lists
    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Merge the two sorted lists
        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        
        // Attach the remaining nodes
        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }
        
        return dummy.next;
    }
}
