class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode frwd = null;
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            frwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frwd;
        }
        curr = prev;
        return curr;
    }
}