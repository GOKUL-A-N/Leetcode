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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp != null){
                 q.offer(temp.val);
                 temp = temp.next;
            }
        }
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(!q.isEmpty()){
            ListNode curr = new ListNode(q.poll());
            temp.next = curr;
            temp = curr;
        }
        return dummy.next;
    }
}