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

		head = sll.new Node(1);
		Node second = sll.new Node(2);
		Node third = sll.new Node(3);
		Node fourth = sll.new Node(4);

		sll.head.next=second;
		second.next=third;
		third.next=fourth;

		// Node reverseList = sll
		// ;
		sll.display(sll.reverse(head));
	}

	public void	 display(Node head)
	{
		Node current=head;
		while(current != null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.print("null");
	}

	public Node reverse(Node head)
	{
		if(head == null)
		{
			return head;
		}

		Node current=head;
		Node prev = null;
		Node next = null;

		while(current != null)
		{
			next = current.next;
			current.next=prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}