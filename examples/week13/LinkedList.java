public class LinkedList{

	private Node head;

	public LinkedList(){
		head = null;
	}

	public void addAtHead(Integer data){
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
	}

	public String toString(){

		String result = "";
		
	}

}
