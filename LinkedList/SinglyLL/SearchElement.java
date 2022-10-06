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

		
		// sll.search(4);
		if(sll.search(12))
		{
			System.out.println("element found");
		}
		else 
		{
			System.out.println("searchKey not found");
		}
		sll.display();


	}

	public void display()
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.print("null");
	}
	public boolean search(int searchKey)
	{
		Node current = head;
		while(current != null)
		{
			if(current.data == searchKey)
			{
				return true;
			}
			current=current.next;
		}
		return false;
	}
}