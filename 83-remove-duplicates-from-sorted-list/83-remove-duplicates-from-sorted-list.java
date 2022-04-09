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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(-1000);
        
        ListNode itr = dummy , cur = head;
        
        while(cur != null){
            
            while(cur != null && itr.val == cur.val){
                cur = cur.next;
            }
            
            itr.next = cur;
            itr = cur;
            
        }
        
        
        
        return dummy.next;
    }
}