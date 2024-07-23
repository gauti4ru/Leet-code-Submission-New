/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head){
        
        if (head != null && head.next!=null)  {
             ListNode revereNode1 = new ListNode(head.val); 
            do {
                if (head.next != null) {
                    revereNode1 = new ListNode(head.next.val, revereNode1); 
                    head = head.next; 
                    continue;
                } else {
                    revereNode1 = new ListNode(head.val, revereNode1); 
                   }
            } while (head.next != null); 
            return revereNode1;
        }
        return head;
        
    }
}