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
        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;
        int size = 0;

        // count size
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // remove head case
        if (size == n) {
            return head.next;
        }

        int nth = size - n + 1;
        ListNode t = head;

        // go to (nth-1)th node
        for (int i = 1; i <= nth - 2 && t.next != null; i++) {
            t = t.next;
        }

        // delete node
        t.next = t.next.next;

        return head;
    }
}