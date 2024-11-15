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
    public ListNode reverseList(ListNode h) {
        ListNode p=null;
        ListNode c=p;
        while(h!=null){
            ListNode n=new ListNode(h.val);
            n.next=p;
            p=n;
            c=p;
            h=h.next;

        }
        return p;
    }
}