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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums) set.add(n);
        int count = 0;
        boolean flag = false;
        while(head != null){
            if(flag && !set.contains(head.val)){
                count++;
                flag = false;
            }
            else if(set.contains(head.val)){
                flag = true;
            }
            head = head.next;
        }
        if(flag) count++;
        return count;
    }
}