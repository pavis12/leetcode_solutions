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
    public ListNode rev(ListNode h){
        ListNode p=null;
        while(h!=null){
            ListNode n=new ListNode(h.val);
            n.next=p;
            p=n;
            h=h.next;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        //Finding the middle element
        ListNode s=head;
        ListNode f=head;
        while(f!=null&&f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        //reverse the second half
        ListNode sh=rev(s);
        s.next=null;
        ListNode c1=head,c2=sh;
        while(c2!=null){
            if(c1.val!=c2.val){
                return false;
            }
            c1=c1.next;
            c2=c2.next;
        }
        return true;
    }
}