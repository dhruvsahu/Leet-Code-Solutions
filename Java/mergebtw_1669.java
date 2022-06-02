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
        ListNode temp = list1;
        ListNode temp2 = list1;
        while( a!= 1 ){
            temp = temp.next;
            a-=1;
        }
        while( b!= 0 ){
            temp2= temp2.next;
            b-=1;
        }
        temp.next = list2;
        ListNode curr = list2;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp2.next;
        return list1;
    }
}