/**
 * Definition for singly-linked list.
 */


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int val = 0;
            val += carry;
            if(l1 != null) {
                val += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }

            carry = val / 10;
            val %= 10;
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}