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
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode n=null;
        ListNode t=n;
        int c=0;
        while(true){
            
            int s=c;
            if(t1!=null){
                s+=t1.val;
                t1=t1.next;
            }
            if(t2!=null){
                s+=t2.val;
                t2=t2.next;
            }
            ListNode m=new ListNode(s%10);
            m.next=null;
            if(t==null){
                n=m;
                t=m;
            }
            else{
                t.next=m;
                t=t.next;

            }

            c=(s/10)%10;
            if(t1==null&&t2==null)break;
            
            
        }
        if(c!=0){
            ListNode m=new ListNode(c);
            m.next=null;
            t.next=m;
            t=t.next;

        }

        return n;
    }
}