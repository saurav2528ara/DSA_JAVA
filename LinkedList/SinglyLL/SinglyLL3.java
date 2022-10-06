public class trial
{
	static Node head;

	static class Node
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
		
		head =  new Node(3);
		Node second =  new Node(6);
		Node third =  new Node(9);
		Node fourth =  new Node(12);

		// Now connect them in form of a chain

		head.next = second;
		second.next = third;
		third.next = fourth;

		display(head);



	}
		static void display(Node head)
		{
			while(head!= null)
			{
				System.out.print(head.data+" ");
				head=head.next;
			}
		}

}