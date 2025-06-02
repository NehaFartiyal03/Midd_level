class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        ListNode current = head;
        int length = 1;
        while(current.next != null) {
            current = current.next;
            length++;
        }
        current.next = head;

        int stepsToNewTail = length - (k % length);
        ListNode newTail = head;
        for(int i =1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;

    }
}
