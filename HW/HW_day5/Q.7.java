// 7) Find the length of the list

public int length() {
    int count = 0;
    Node current = head;
    while (current != null) {
        count++;
        current = current.next;
    }
        return count;
}
