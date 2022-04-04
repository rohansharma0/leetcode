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
    public ListNode swapNodes(ListNode head, int k) {
        
        int n = len(head);
        int st = k;
        int et = n - k + 1;
        
        ListNode sp = head , ep = head;
        
        while(st-- >1){
            sp = sp.next;
        }
        
        while(et-- >1){
            ep = ep.next;
        }
        
        int t = sp.val;
        sp.val = ep.val;
        ep.val = t;
        
        return head;
        
    }
    
    
    public int len(ListNode head){
        int c = 0;
        
        while(head != null){
            c++;
            head = head.next;
        }
        
        return c;
    }
}