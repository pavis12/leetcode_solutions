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
        //ListNode t=new ListNode(0);
        //t.next=h;
        /*ListNode p=h;
        ListNode c=p.next;
        ListNode n=null;
        while(c!=null&&c.next!=null){
            n=c.next;
            c.next=n.next;
            n.next=p.next;
            p.next=n;
        }
        return h;*/
        ListNode n=null;
        ListNode t=h;
        while(t!=null){
            ListNode p=new ListNode(t.val);
            p.next=n;
            n=p;
            t=t.next;
        }
        return n;

    }
}