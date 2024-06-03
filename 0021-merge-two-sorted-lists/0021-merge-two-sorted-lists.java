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
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1.val>l2.val){
            ListNode te=l1;
            l1=l2;
            l2=te;
        }
        ListNode res=l1;
        while(l1!=null&&l2!=null){
            ListNode t=null;
            while(l1!=null&&l1.val<=l2.val){
                t=l1;
                l1=l1.next;
            }
            t.next=l2;
            ListNode te=l1;
            l1=l2;
            l2=te;
        }
        return res;
    }
}