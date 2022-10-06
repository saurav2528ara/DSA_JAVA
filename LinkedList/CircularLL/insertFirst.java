public class trial
{
	static Node last;
	int length;

	private class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data = data;
		}
	}
	public trial()
	{
		this.last = null;
		this.length = 0;
	}

	public boolean isEmpty()
	{
		return length == 0;
	}

	public int length()
	{
		return length;
	}

	public void insertStart(int value)
	{
		Node current = new Node(value);
		if(last == null)
		{
			last = current;
		}
		else
		{
			current.next = last.next;
			last.next = current;
			length++;
		}
	}

	public void createCircularLL()
	{
		
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;

		last = fourth;

	}
	public void displayCircular()
	{
		Node current = last.next;
		while(current != last)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.print(current.data+" ");
	}


	public static void main(String[] args) {
			
		trial cll = new trial();

		cll.createCircularLL();
		cll.insertStart(0);
		cll.displayCircular();
	}
}