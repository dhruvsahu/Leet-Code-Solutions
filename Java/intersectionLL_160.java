public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr = headA;
        while ( curr!=null )
        {
            ListNode curr1 = headB;
            while ( curr1!=null ){
              if ( curr == curr1 ){
                return curr;
              }else{
                curr1 = curr1.next;
              }
            }
            curr = curr.next;
        }
        return null;
    }    
}