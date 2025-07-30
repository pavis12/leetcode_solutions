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
    public ListNode reverseBetween(ListNode h, int l, int r) {
        ListNode t  = new ListNode(0);
        t.next=h;
        ListNode p= t;
        for(int i=1;i<l;i++){
            if(p.next!=null){
                p=p.next;
            }
        }
        ListNode c=p.next;
        ListNode n=null;
        for(int i=0;i<r-l;i++){
            if(c!=null&&c.next!=null){
                n=c.next;
                c.next=n.next;
                n.next=p.next;
                p.next=n;
                
            }
        }
        return t.next;
    }
}