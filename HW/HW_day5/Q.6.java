// 6) Search for an element

public boolean search(int data) {
    Node current = head;
      while (current != null) {
         if (current.data == data) return true;
          current = current.next;
       }
        return false;
}