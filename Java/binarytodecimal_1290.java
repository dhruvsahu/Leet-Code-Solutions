class Solution {
    public int getDecimalValue(ListNode head) {
        String s ="";
        ListNode current = head;
        while (current!=null){
            s = s + String.valueOf(current.val);
            current = current.next;
        }
        int num = Integer.parseInt(s,2);
        return num;
    }
}