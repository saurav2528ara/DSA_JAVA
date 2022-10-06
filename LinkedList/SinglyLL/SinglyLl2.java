public class SinglyLL2
{
	static Node head;

	static class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		
		SinglyLL2 sll = new SinglyLL2();

		sll.head = new Node(5);
		Node second = new Node(10);
		Node third = new Node(15);
		Node fourth = new Node(20);

		// Now connect
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