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
        ListNode dum = new ListNode(0);
        ListNode tail = dum;
        ListNode curr = head;
        curr = curr.next;
        int count = 0;
        while ( curr!=null ){
            if (curr.val!=0){
                count = count + curr.val;
            }else{
                ListNode temp = new ListNode(count);
                tail.next = temp;
                tail = tail.next;
                count = 0; 
            }
            curr = curr.next;
        }
        return dum.next;
    }
}