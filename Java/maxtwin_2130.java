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
    public int pairSum(ListNode head) {
        int max = 0;
        ListNode curr = head;
        ListNode frwd = null;
        ListNode prev = null;
        ListNode fast = head;
        while( fast!=null ){
            fast = fast.next.next;
            frwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frwd;
        }
        while( prev!=null ){
            int sum = prev.val + frwd.val;
            max = (sum>max)?sum:max;
            prev = prev.next;
            frwd = frwd.next;
        }
        return max;
    }
}