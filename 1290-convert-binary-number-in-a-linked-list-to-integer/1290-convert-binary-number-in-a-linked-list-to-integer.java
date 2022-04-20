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
    public int getDecimalValue(ListNode head) {
        
         
        int c = 0;
        ListNode temp = head;
        
        while(temp != null){
            c++;
            temp = temp.next;
        }
        
        temp = head;
        c--;
        int sum = 0;
        
        while(temp != null){
            
            sum = sum + (temp.val * (int)Math.pow(2 , c--));
            
            temp = temp.next;
        }
        
        return sum;
        
        
    }
    
}