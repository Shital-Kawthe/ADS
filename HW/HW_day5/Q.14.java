// 14) Remove duplicates from sorted list

public void removeDuplicates() {

        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
}

public static void main(String[] args) {
	
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.printList();
        
        System.out.println("Length: " + list.length());
        System.out.println("Middle Node: " + (list.findMiddle() != null ? list.findMiddle().data : "Null"));

        list.removeDuplicates();
        System.out.println("After removing duplicates:");
        list.printList();
    }
}