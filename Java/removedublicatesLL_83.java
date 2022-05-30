class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        if ( curr == null){
            return head;
        }
        while ( curr.next!=null && curr!=null ){
            if (curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
            curr = curr.next;
            }
        }
        return head;
    }
}