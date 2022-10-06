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

		sll.insNode();
		sll.remLoop();
		sll.display();


	}

	public void display()
	{
		Node current = head;

		while(current != null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.print("null");
	}

	public void remLoop()
	{
		Node fPtr = head;
		Node slowPtr = head;

		while(fPtr != null && fPtr.next != null)
		{
			fPtr = fPtr.next.next;
			slowPtr = slowPtr.next;

			if(slowPtr == fPtr)
			{
			 	remLoop(slowPtr);
				return;
			}
		}	
	}

	public void remLoop(Node slowPtr)
	{
		Node temp = head;

		while(temp.next != slowPtr.next)
		{
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
	}
	public void insNode()
	{
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);

		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;


	}
}