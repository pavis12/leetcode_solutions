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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d=new ListNode(0);
        d.next=null;
        ListNode t=d;
        int c=0;
        while(l1!=null||l2!=null||c!=0){
            int s=0;
            if(l1!=null){
                s+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                s+=l2.val;
                l2=l2.next;
            }
            s+=c;
            c=s/10;
            ListNode n=new ListNode(s%10);
            n.next=null;
            t.next=n;
            t=t.next;

        }
        return d.next;
    }
}