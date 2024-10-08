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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null) return head;
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode fast = head;
        ListNode slow = prev;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return prev.next;
    }
}