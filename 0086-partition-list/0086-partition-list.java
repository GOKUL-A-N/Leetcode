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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        ListNode temp = head;
        ListNode lCurr = left;
        ListNode rCurr = right;
        while(temp != null){
            if(temp.val < x){
                ListNode newNode = new ListNode(temp.val);
                lCurr.next = newNode;
                lCurr = newNode;
            }else{
                ListNode newNode = new ListNode(temp.val);
                rCurr.next = newNode;
                rCurr = newNode;
            }
            temp = temp.next;
        }
        lCurr.next = right.next;
        return left.next;
    }
}