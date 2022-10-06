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
		third.next = fourth;

		sll.delFirst();
		sll.delLast();

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

	public Node delFirst()
	{
		if(head == null)
		{
			return null;
		}
			Node temp = head; // pointer
			head = head.next;
			temp.next=null;
			return temp;
	}
	public Node delLast()
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		// 2 pointer
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

}