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
    public ListNode rotateRight(ListNode h, int k) {
        if(h==null||h.next==null||k==0)return h;
        int l=1;
        ListNode f=h;
        while(f.next!=null){
            f=f.next;
            l++;
        }
        f.next=h;
       k=k%l;
       k=l-k;
       while(k-->0){
            f=f.next;
            
       }
       h=f.next;
       f.next=null;
       return h;
        
    }
}