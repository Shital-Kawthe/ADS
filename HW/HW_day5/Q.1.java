//1.Insert at the beginning


class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

public void insertAtBeginning(int data){
     Node newNode = newNode(data);
	 newNode.next = head;
	 head = newNode;

}



 




 
  


  

