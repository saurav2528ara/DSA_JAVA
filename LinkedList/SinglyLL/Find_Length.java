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

		head = sll.new Node(2);
		Node second = sll.new Node(4);
		Node third = sll.new Node(6);
		Node fourth = sll.new Node(8);
		Node fifth = sll.new Node(1);

		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.print("length is "+ sll.length());

	}
	public int length()
	{
		int count = 0;
		Node current = head;
		while(current != null)
		{
			count++;
			current = current.next;
		}
		return count;
	}


}