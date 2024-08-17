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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tail = list2;
        while(tail.next != null) tail = tail.next;
        ListNode temp = list1;
        while(b != -1){
            temp = temp.next;
            b--;
        }
        tail.next = temp; 
        temp = list1;
        while(a != 1){
            temp = temp.next;
            a--;
        }
        temp.next = list2;
        return list1;
    }
}