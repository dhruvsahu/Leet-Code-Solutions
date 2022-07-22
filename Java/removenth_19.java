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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l = len(head);
        n = l-n;
        if(n==0){
            return head.next;
        }
        int i=1;
        ListNode curr = head;
        while(i!=n){
            curr=curr.next;
            i++;
        }
        if(curr.next.next!=null){
            curr.next = curr.next.next;
        }else{
            curr.next=null;
        }
        return head;
    }
    public int len(ListNode head){
        ListNode curr= head;
        int count=0;
        while(curr!=null){
            count+=1;
            curr=curr.next;
        }
        return count;
    }
}