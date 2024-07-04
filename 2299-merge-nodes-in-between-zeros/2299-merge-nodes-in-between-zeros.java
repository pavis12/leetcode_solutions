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
    public ListNode mergeNodes(ListNode head) {
        ListNode t=head;
        int s=0;
        ListNode n=new ListNode(0);
        n.next=null;
        ListNode r=n;
        boolean f=false;
        while(t!=null&&t.next!=null){
            if(!f&&t.val==0){
                f=true;
            }
            else if(f&&t.val==0){
                ListNode k=new ListNode(s);
                k.next=null;
                r.next=k;
                r=r.next;
                s=0;
            }
            else{
                s+=t.val;
            }
            t=t.next;
        }
        ListNode k=new ListNode(s);
                k.next=null;
                r.next=k;
                r=r.next;
        return n.next;
    }
}