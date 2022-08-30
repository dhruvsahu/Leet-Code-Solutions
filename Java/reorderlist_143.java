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
    public void reorderList(ListNode head) {
        if(head.next==null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next =null;
        ListNode curr=slow;
        ListNode next=null;
        ListNode pre=null;
        while(slow!=null){
            next=slow.next;
            slow.next=pre;
            pre=slow;
            slow=next;
        }
        ListNode cur=head;
        ListNode temp = null;
        ListNode temp2=pre;
        ListNode hold=null;
        while(cur!=null){
            System.out.println("run");
            temp=cur.next;
            cur.next=pre;
            temp2=pre.next;
            pre.next=temp;
            hold=pre;
            pre=temp2;
            cur=temp;
        }
        hold.next=pre;
        // System.out.println(.val);
        // System.out.println(pre.val);
    }
}