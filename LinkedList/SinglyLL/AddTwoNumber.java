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


		Node first = sll1.new Node(7);
		Node second = sll1.new Node(4);
		Node third = sll1.new Node(9);

		head1 = first;
		first.next = second;
		second.next = third;


		Node fourth = sll1.new Node(5);
		Node fifth = sll1.new Node(6);
		
		
		head2 = fourth;
		fourth.next = fifth;
		

		// sll1.display(head1);
		// sll1.display(head2);

		Node merged = sll1.AddTwo(head1,head2);
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

	public Node AddTwo(Node a, Node b)
	{
		Node dummy = new Node(0);
		Node tail = dummy;
		int carry = 0;

		while(a != null || b != null)
		{
			int x = (a!=null) ? a.data : 0;
			int y = (b!=null) ? b.data : 0;

			int sum = carry + x + y;
			carry = sum/10;

			tail.next = new Node(sum % 10);
			tail=tail.next;

			if(a != null) 
			{
				a=a.next;
			}
			if(b != null)
			{
				b=b.next;
			}
		}

		if(carry > 0)
		{
			tail.next=new Node(carry);
		}
		return dummy.next;
		
	}

	
}