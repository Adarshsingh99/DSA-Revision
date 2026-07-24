
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode curr = head;
        ListNode  prev = null;
        while(curr.next!=null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next = prev;
        return curr;

    }
}
