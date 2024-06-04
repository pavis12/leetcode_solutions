/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode h) {
        if(h==null||h.next==null)return null;
        ListNode f=h;
        ListNode s=h;
        ListNode e=h;
        while(f.next!=null&&f.next.next!=null){
            f=f.next.next;
            s=s.next;
            if(f==s){
                while(s!=e){
                    s=s.next;
                    e=e.next;
                    
                }
                return s;
            
            }
        }
        
        return null;
    }
}