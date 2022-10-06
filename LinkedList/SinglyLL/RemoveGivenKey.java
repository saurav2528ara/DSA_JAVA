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
		Node second = sll.new Node(8);
		Node third = sll.new Node(11);
		Node fourth = sll.new Node(16);

		sll.head.next=second;
		second.next=third;
		third.next=fourth;

		sll.insKey(11);
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

	public void insKey(int key)
	{
		

		Node current = head;
		Node temp = null;

		while(current != null && current.data != key)
		{
			temp = current;
			current = current.next;
		}
		if(current==null)
		{
			return;
		}
		temp.next = current.next;
	}
}