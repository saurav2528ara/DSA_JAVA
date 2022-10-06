public class implementation
{
	static Node last;
	int length;

	private class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data=data;
		}
	}
	public implementation()
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
		if(last == null)
		{
			return ;
		}
		Node current = last.next;
		while(current != last)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.print(current.data+" ");


		//check if circular 

		if(head == null)
		{
			return false;
		}
		Node current = head;
		while(current.next != null)
		{
			//System.out.print(current.data+" ");
			current=current.next;
			if(current.next == head)
			{
			    return true;
			}
		}
		//System.out.print(current.data+" ");
		return false;
	}

	public static void main(String[] args) {
		
		implementation cll = new implementation();

		cll.createCircularLL();
		cll.displayCircular();
	}
}