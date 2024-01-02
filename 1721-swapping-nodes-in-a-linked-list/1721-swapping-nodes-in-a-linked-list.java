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
    public int len(ListNode head){
        ListNode r=head;
        int c=0;
        while(r!=null){
            c++;
            r=r.next;
        }
        return c;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int l=len(head);
        ListNode s=head;
        ListNode f=head;
        for(int i=0;i<k-1;i++){
            s=s.next;
        }
        //s.next=null;
        //return s;
        int p=l-k;
        for(int i=0;i<=p-1;i++){
            f=f.next;
        }
        //f.next=null;
        int t=s.val;
        s.val=f.val;
        f.val=t;
        return head;
    }
}