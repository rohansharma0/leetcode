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
    public ListNode detectCycle(ListNode head) {
        
        if(head == null || head.next == null) return null;
        
        ListNode s = head , f = head;
        ListNode e = head;
        
        
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
            
            if(f == s){
                while( s != e){
                    s = s.next;
                    e = e.next;
                }
                
                return e;
            }
        }
        
        return null;
        
    }
}