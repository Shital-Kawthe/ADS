// 10) Reverse the list

public void reverse() {
    Node previous = null, current = head, next = null;
       while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
       }
          head = previous;
}
