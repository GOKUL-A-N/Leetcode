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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode temp = head;
        while(temp != null){
            if(!set.contains(temp.val)){
                prev.next = new ListNode(temp.val);
                prev = prev.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}