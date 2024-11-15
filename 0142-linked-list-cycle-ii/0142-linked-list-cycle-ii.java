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
        ListNode f=h;
        ListNode s=h;
        ListNode t=h;
        if(h==null||h.next==null){
            return null;
        }
        while(f!=null&&f.next!=null){
            f=f.next.next;
            s=s.next;
            if(f==s){
                while(t!=s){
                    t=t.next;
                    s=s.next;
                }
                return t;
            }
            

        }
        return null;
    }
}