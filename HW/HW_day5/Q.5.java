// 5) Delete at a given position

    public void deleteAtPosition(int position) {
        if (head == null || position < 0) return;
        if (position == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; current.next != null && i < position - 1; i++) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }