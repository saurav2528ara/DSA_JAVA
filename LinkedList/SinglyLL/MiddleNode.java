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

		head=sll.new Node(10);
		Node second = sll.new Node(8);
		Node third = sll.new Node(7);
		Node fourth = sll.new Node(11);
		Node fifth = sll.new Node(15);

		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;


		Node midList = sll.middle();
		System.out.print("middle element is: "+midList.data);
		
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

	public Node middle()
	{
		Node FastPtr = head;
		Node slowPtr = head;

		while(FastPtr != null && FastPtr.next != null)
		{
			slowPtr = slowPtr.next;
			FastPtr = FastPtr.next.next;
		}
		return slowPtr;
	}
}