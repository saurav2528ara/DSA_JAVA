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
		Node second = sll.new Node(1);
		Node third = sll.new Node(2);
		Node fourth = sll.new Node(3);
		Node fifth = sll.new Node(3);


		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;

		// Node midList = sll.duplicate();
		// System.out.print("middle element is "+midList.data);
		sll.duplicate();
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
	public void duplicate()
	{
		if(head == null)
		{
			return;
		}
		Node current = head;
		while(current != null && current.next != null )
		{
			if(current.data == current.next.data)
			
				current.next=current.next.next;	
			
			else 
			
				current=current.next;
			
		}
}	}
