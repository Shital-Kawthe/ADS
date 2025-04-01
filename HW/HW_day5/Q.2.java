//2.Insert at the end

public void insertAtEnd(int data){
    Node newNode = newNode(data);
	    if (head==null){
		head = newNode;
		return;
		}
		Node current = head;
		while(current.next!=null){
		   current.next = newNode;
		}
		