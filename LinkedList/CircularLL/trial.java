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
			this.data=data;
		}
	}
	public trial()
	{
		this.last=null;
		this.length=0;
	}

	public boolean isEmpty()
	{
		return length == 0;
	}

	public int length()
	{
		return length;
	}

	public void display()
	{
		Node current = last.next;
		while(current != last)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.print(current.data+" ");
	}

	public void insertFirst(int value)
	{
		Node current = new Node(value);

		if(last == null)
		{
			last = current;
		}
		else 
		{
			current.next=last.next;
		}
		last.next = current;
		length++;
	}

	public void insertLast(int value)
	{
		Node temp = new Node(value);

		if(last == null)
		{
			last=temp;
			last.next=last;
		}
		else 
		{
			temp.next = last.next;
			last.next = temp;
			last=temp;
		}
		
		length++;
	}

	public void removeFirst()
	{
		// if(isEmpty())
		// {
		// 	throw new NoSuchElementException();
		// }
		Node current = last.next;
		if(last.next == last)
		{
			last = null;
		}
		else 
		{
			last.next = current.next;
		}
		current.next = null;
		length--;
		
	}


	public void insertCir()
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

	public static void main(String[] args) {
		
		trial cll = new trial();

		cll.insertCir();
		cll.insertFirst(0);
		cll.insertLast(7);
		cll.removeFirst();
		cll.display();
	}

}