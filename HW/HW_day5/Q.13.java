// 13) Merge two sorted linked lists

public static LinkedList mergeSortedLists(LinkedList list1, LinkedList list2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        Node l1 = list1.head, l2 = list2.head;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;

        LinkedList mergedList = new LinkedList();
        mergedList.head = dummy.next;
        return mergedList;
}