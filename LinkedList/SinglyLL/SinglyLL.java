public class SinglyLL
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
		
		SinglyLL sll= new SinglyLL();


		head = sll.new Node(10);
		Node second = sll.new Node(1);
		Node third = sll.new Node(8);
		Node fourth = sll.new Node(11);

		// Now connect them in form of a chain

		sll.head.next = second;
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