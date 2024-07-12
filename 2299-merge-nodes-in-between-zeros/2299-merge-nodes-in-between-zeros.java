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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(head != null){
            if(head.val == 0 && head.next != null){
                ListNode curr = new ListNode(0);
                temp.next = curr;
                temp = curr;
            }else{
                temp.val += head.val;
            }
            head = head.next;
        }
        return dummy.next;
    }
}