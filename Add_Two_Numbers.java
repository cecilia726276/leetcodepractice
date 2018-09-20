/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode start = l3;
        int counter = 0;
        while (l1 != null || l2 !=null || counter == 1){
            l3.next = new ListNode(0);
            l3 = l3.next;
            if (l1 == null && l2 == null){
                l3.val = counter;
                counter = 0;
            }
            else if (l1 == null) {
                l3.val = (l2.val + counter)%10;
                counter = (l2.val + counter)/10;
                l2 = l2.next;
            }else if (l2 == null){
                l3.val = (l1.val + counter)%10;
                counter = (l1.val + counter)/10;
                l1 = l1.next;
            }else {
                l3.val = (l1.val + l2.val + counter) % 10;
                counter = (l1.val + l2.val + counter) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        
        return start.next;
    }
}
