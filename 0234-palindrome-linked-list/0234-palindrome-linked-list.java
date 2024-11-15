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
    public boolean isPalindrome(ListNode h) {
        ListNode f=h;
        ListNode s=h;
        while(f!=null&&f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        ListNode k=rev(s);
        while(k!=null){
            if(k.val==h.val){
                k=k.next;
                h=h.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public ListNode rev(ListNode h){
        ListNode p=null;
        ListNode c=null;
        while(h!=null){
            ListNode f=new ListNode(h.val);
            f.next=p;
            p=f;
            c=p;
            h=h.next;
        }
        return p;
    }
}