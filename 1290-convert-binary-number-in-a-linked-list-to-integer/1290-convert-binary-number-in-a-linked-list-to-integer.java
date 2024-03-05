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
    public int getDecimalValue(ListNode h) {
        if(h==null){
            return 0;
        }
        int a[]=new int[31];
        int k=0;
            while(h!=null){
                a[k++]=h.val;
                h=h.next;
            }
        int p=k-1;
        int s=0;
        for(int i=0;i<k;i++){
            int pow=(int)Math.pow(2,p);
            /*if(i==1){
                return pow;
            }*/
            int j=a[i]*pow;
            s+=j;
            p--;
            //return s;
        }
        return s;
    }
}