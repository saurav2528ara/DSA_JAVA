public class trial
{
	static Node head1;
	static Node head2;


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
		
		trial sll1 = new trial();


		Node first = sll1.new Node(1);
		Node second = sll1.new Node(4);
		Node third = sll1.new Node(8);

		head1 = first;
		first.next = second;
		second.next = third;


		Node fourth = sll1.new Node(3);
		Node fifth = sll1.new Node(5);
		Node sixth = sll1.new Node(7);
		
		head2 = fourth;
		fourth.next = fifth;
		fifth.next = sixth;


		

		// sll1.display(head1);
		// sll1.display(head2);

		Node merged = sll1.merge(head1,head2);
		sll1.display(merged);

	}

	public void display(Node head)
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.print("null");
	}

	public Node merge(Node a, Node b)
	{
		Node dummy = new Node(0);
		Node tail = dummy;

		while(a != null && b != null)
		{
			if(a.data <= b.data)
			{
				tail.next = a;
				a = a.next;
			}
			else 
			{
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}

			if(a==null)
			{
				tail.next=b;
			}
			else 
			{
				tail.next=a;
			}
			return dummy.next;
		
	}

	// public void addEle()
	// {
		

	// 	head = first;
	// 	first.next = second;
	// 	second.next = third;

	// 	fourth.next=fifth;

	// }
}