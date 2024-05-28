package random;

public class doubleIt {
    public ListNode doubleIt(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.val > 4) {
            head = new ListNode(0, head);
        }
        ListNode tempNode = head;
        while (tempNode != null) {
            tempNode.val = tempNode.val * 2 % 10;
            if (tempNode.next != null && tempNode.next.val > 4) {
                tempNode.val++;
            }
            tempNode = tempNode.next;
        }
        return head;
    }
}
