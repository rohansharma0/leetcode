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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        
        ListNode res = dummy;
        
        
        int c = 0;
        
        while(l1 != null || l2 != null || c == 1){
            
            int s = 0;
            
            if(l1 != null){
                s += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                s += l2.val;
                l2 = l2.next;
            }
            
            s += c;
            
            int r = s % 10;
            int q = s / 10;
            
            c = q;
            
            ListNode t = new ListNode(r);
            
            res.next = t;
            res = res.next;
            
        }
        
        return dummy.next;
    }
}