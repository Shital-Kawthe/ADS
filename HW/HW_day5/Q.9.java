//9) Print all elements
    
public void printList() {
    Node current = head;
    while (current != null) {
       System.out.print(current.data + " ");
       current = current.next;
        }
        System.out.println();
}