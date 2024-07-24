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