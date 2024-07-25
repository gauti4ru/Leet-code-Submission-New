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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n <= 0) {
            return head;
        }
        int count = 0;
        ListNode newHead = head;
        ListNode tempHead = head;
        while(newHead != null) {
            count++;
            newHead = newHead.next;
        }

        if(n > count) {
            return head; // If n is larger than the number of nodes, return the original list
        }

        // Special case: remove the first node
        if(n == count) {
            return head.next;
        }

        for(int i = 0; i < count - n - 1; i++) {
            tempHead = tempHead.next;
        }
        if(tempHead.next != null) {
            tempHead.next = tempHead.next.next;
        }

        return head;
    }
}