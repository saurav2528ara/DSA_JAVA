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

		head = sll.new Node(10);
		Node second = sll.new Node(20);
		Node third = sll.new Node(4);
		Node fourth = sll.new Node(30);


		sll.head.next=second;
		second.next=third;
		third.next = fourth;

		sll.delNode(2);
		// sll.delLast();
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

	public Node delLast()
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		Node current = head;
		Node prev = null;

		while(current.next != null)
		{
			prev = current;
			current=current.next;
		}
		prev.next=null;
		return current;

	}
	public void delNode(int position)
	{
		if(position==1)
		{
			head=head.next;
		}
		else 
		{
			Node prev = head;
			int count = 1;

			while(count < position-1)
			{
				prev = prev.next;
				count++;
			}
			Node current=prev.next;
			prev.next=current.next;
		}
	}
	
}