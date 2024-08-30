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
        if(head == null || head.next == null) return head;
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        size = size - k;
        ListNode fast = head;
        temp = head;
        while(k != 1){
            temp = temp.next;
            k--;
        }
        while(size != 0){
            fast = fast.next;
            size--;
        }
        int tmp = temp.val;
        temp.val = fast.val;
        fast.val = tmp;
        return head;
    }
}