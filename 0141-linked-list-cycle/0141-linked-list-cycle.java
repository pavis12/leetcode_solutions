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
    public boolean hasCycle(ListNode h) {
        ListNode f=h;
        ListNode s=h;
        while(f!=null&&f.next!=null){
            f=f.next.next;
            if(f==s)return true;
            s=s.next;

        }
        return false;
    }
}