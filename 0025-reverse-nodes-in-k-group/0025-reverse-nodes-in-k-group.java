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
        if(h==null||k==1)return h;
        int l=0;
        
      
        ListNode d=new ListNode(0);
        d.next=h;
        ListNode p=d;
        ListNode c=d;
        ListNode n=d;
          while(c!=null&&c.next!=null){
            c=c.next;
            l++;
        }
        while(l>=k){
            c=p.next;
            n=c.next;
            for(int i=1;i<k;i++){
                c.next=n.next;
                n.next=p.next;
                p.next=n;
                n=c.next;

                
            }
            l-=k;
            p=c;
        }
        return d.next;
    }
}