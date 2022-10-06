public class trial
{
	static Node head;

	private class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static void main(String[] args) {
		
		trial sll = new trial();

		head = sll.new Node(2);
		Node second = sll.new Node(4);

		sll.head.next=second;

		sll.insertFirst(7);
		sll.insertEnd(0);

		sll.display();
	}

	public void display()
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.print("null");
	}

	public void insertFirst(int value)
	{
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	public void	insertEnd(int value)
	{
		Node newNode = new Node(value);
		if(head == null)
		{
			head=newNode;
			return;
		}
		Node current = head;
		while(null != current.next)
		{
			current=current.next;
		}
		current.next=newNode;
	}
}