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

		}
	}
	public trial()
	{
		this.head=null;
		this.tail=null;
		this.length=0;
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
			head = newNode;
		}
		else 
		{
			tail.next=newNode;
		}
		newNode.prev = tail;
		tail=newNode;
		length++;
	}

	public void displayNext()
	{
		Node current = head;
		while(current != null)
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
		System.out.println("null");
	}

	public void insertBegin(int value)
	{
		Node newNode = new Node(value);

		if(isEmpty())
		{
			tail = newNode;
		}
		else 
		{
			head.prev = newNode;
		}
		newNode.next = head;
		head = newNode;
	}

	public static void main(String[] args) {
		
		trial Dll = new trial();

		Dll.insertLast(1);
		// Dll.insertLast(10);
		// Dll.insertLast(3);
		// Dll.insertLast(4);
		// Dll.insertLast(5);


		// Dll.displayNext();
		// Dll.displayPrev();
		Dll.insertBegin(10);
		Dll.displayNext();
		Dll.displayPrev();

	}
}