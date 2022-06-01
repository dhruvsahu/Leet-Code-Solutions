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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        ListNode dum = new ListNode(0);
        ListNode tail =dum;
        int carry =0 ;
        while (a!=null || b!=null){
            int x = (a!=null)?a.val:0;
            int y = (b!=null)?b.val:0;
            int sum = carry +x +y;
            carry = sum/10;
            ListNode temp = new ListNode(sum%10);
            tail.next = temp;
            tail =tail.next;
            if(a!=null) a = a.next;
            if(b!=null) b =b.next;
        }
        if (carry>0) tail.next = new ListNode(carry);
        return dum.next;
    }
}