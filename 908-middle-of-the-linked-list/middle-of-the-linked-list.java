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
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        //if count = 6
        int idx = count / 2; //idx will be 3 
        temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        //traverse 3 times 
        return temp;  
    }
}
