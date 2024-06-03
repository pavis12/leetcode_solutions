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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode n=new ListNode(0);
        n.next=null;
        ListNode t=n;
        while(true){
            if(l1==null&&l2==null){
                break;
            }
            if(l1==null&&l2!=null){
                t.next=l2;
                break;
            }
            if(l2==null&&l1!=null){
                t.next=l1;
                break;
            }
            if(l1.val<l2.val){
                ListNode m=new ListNode(l1.val);
                m.next=null;
                t.next=m;
                l1=l1.next;
            }
            else {
                ListNode m=new ListNode(l2.val);
                m.next=null;
                t.next=m;
                l2=l2.next;
            }
            t=t.next;
        }
        return n.next;
    }
}