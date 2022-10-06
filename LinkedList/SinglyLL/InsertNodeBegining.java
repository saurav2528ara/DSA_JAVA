public class trial
{
	static Node head;

	private class Node
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
		
		trial sll = new trial();

		// head = sll.new Node(2);
		// Node second = sll.new Node(4);
		// Node third = sll.new Node(6);
		// Node fourth = sll.new Node(8);
		// Node fifth = sll.new Node(1);

		// sll.head.next = second;
		// second.next = third;
		// third.next = fourth;
		// fourth.next = fifth;

		// System.out.print("length is "+ sll.length());

		sll.insertFirst(7);
		sll.insertFirst(77);
		sll.insertFirst(777);

		sll.display();

	}
	// public int length()
	// {
	// 	int count = 0;
	// 	Node current = head;
	// 	while(current != null)
	// 	{
	// 		count++;
	// 		current = current.next;
	// 	}
	// 	return count;
	// }

	public void display()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current= current.next;
		}
		System.out.println("null");
	}
	public void insertFirst(int value)
	{
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}


}