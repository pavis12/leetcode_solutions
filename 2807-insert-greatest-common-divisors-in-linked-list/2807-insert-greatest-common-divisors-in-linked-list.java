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
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode t=head;
        while(t!=null&&t.next!=null){
            int p=t.val;
            int k=t.next.val;
            int g=gcd(p,k);
            ListNode f=new ListNode(g);
            f.next=t.next;
            t.next=f;
            t=t.next.next;
        }
        return head;
    }
}