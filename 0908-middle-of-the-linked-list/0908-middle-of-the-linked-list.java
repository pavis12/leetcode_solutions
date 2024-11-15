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
    public ListNode middleNode(ListNode h) {
        ListNode f=h;
        ListNode s=h;
        if(h.next==null)return h;
        while(f!=null&&f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
}