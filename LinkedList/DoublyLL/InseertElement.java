public class trial
{
	static Node head;
	static Node tail;
	int length;

	private class Node
	{
		int data;
		Node next;
		Node prev;

		Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
			
		}
	}
	public trial()
	{	
		this.head = null;
		this.tail = null;
		this.length = 0;
	} 

	public boolean isEmpty()
	{
		return length==0;
	}

	public int length()
	{
		return length;
	}

	public void insertLast(int value)
	{
		Node newNode = new Node(value);
		if(isEmpty()) 
		{
			head=newNode;
		}
		else 
		{
			tail.next = newNode;
		}
		newNode.prev = tail;
		tail=newNode;
		length++;
	}

	public static void main(String[] args) {
		
		trial Dll = new trial();

		// Dll.tail = Dll.new Node(1);
		// Node second = Dll.new Node(2);
		// Node third = Dll.new Node(3);
		// Node fourth = Dll.new Node(4);

		// Dll.tail.prev = second;
		// second.prev = third;
		// third.prev = fourth;

		Dll.insertLast(1);
		Dll.insertLast(2);
		Dll.insertLast(3);
		Dll.insertLast(4);



		Dll.displayNext();
		Dll.displayPrev();

	}

	public void displayNext()
	{
		Node current = head;
		while(current != null )
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println("null");
	}

	public void displayPrev()
	{
		Node temp = tail;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		System.out.print("null");
	}
}