public class trial
{
	static Node head;

	public class Node
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

		head = sll.new Node(4);
		Node second = sll.new Node(5);

		sll.head.next=second;

			sll.givenPos(2,7);
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

	public void givenPos(int position, int value)
	{
	  Node newNode = new Node(value);

	  if(position == 1)
	  {
	  	newNode.next=head;
	  	head=newNode;
	  }
	  else 
	  {
	  	Node prev = head;
	  	int count = 1;
	  	while(count < position-1)
	  	{
	  		prev=prev.next;
	  		count++;
	  	}
	  	Node current = prev.next;
	  	newNode.next=current;
	  	prev.next=newNode;
	  }
	}
}