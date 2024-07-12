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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        while(temp.next != null){
            int val = gcd(temp.val , temp.next.val);
            ListNode curr = new ListNode(val);
            curr.next = temp.next;
            temp.next = curr;
            temp = curr.next;
        }
        return head;
    }

    private int gcd(int num1,int num2){
        while(num2!=0){
            int res = num1 % num2;
            num1 = num2;
            num2 = res;
        }
        return num1;
    }
}