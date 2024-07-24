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

 // Brute Force Approach
class Solution {
    public ListNode middleNode(ListNode head) {

        if(head== null || head.next==null) return head;
        int count=0;
        ListNode returnHead=head;
        do{
            count++;
            head=head.next;
        }while(head.next!=null);

        if(count%2!=0){
           count=(count/2)+1; 
        }
        else{
            count=(count/2);
        }
        for(int i=0;i<count;i++){
            returnHead=returnHead.next;
        }

        return returnHead;

    }
}

//Two Pointer approach 
/*
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}

Explaination-
In the context of a linked list, the idea is to use two pointers:

Fast Pointer: Moves two steps at a time.
Slow Pointer: Moves one step at a time.
By the time the fast pointer reaches the end of the list, 
the slow pointer will be at the middle. This happens because 
the fast pointer covers twice the distance of the slow pointer 
in the same amount of time.

fast - 1 , 3 ,5 , 7
slow - 1 , 2 ,3 , 4
*/

