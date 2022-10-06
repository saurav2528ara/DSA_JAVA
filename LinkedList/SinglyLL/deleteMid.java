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
		// Node third = sll.new Node(3);
	    // Node fourth = sll.new Node(4);
	    // Node fifth = sll.new Node(5);


		sll.head.next = second;
		// second.next = third;
		// third.next = fourth;
		// fourth.next = fifth;


		// if(sll.search(3))
		// {
		// 	System.out.println("found");
		// }
		// else
		// {
		// 	System.out.print("not found");
		// }
		// sll.insertl3);
		sll.deleteMide();
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
			current = current.next;
		}
		return false;
	}
	public void insertMid(int value)
	{
		 Node current = head;
		Node prev = head;
		Node newNode = new Node(value);
        
        while(current.next.next != null && current.next != null)
        {
        	prev = prev.next;
            current = current.next.next;
        }
		Node temp = prev.next;
		newNode.next = current;
		prev.next = newNode;
		
		// return head;
	}

	public void deleteMide()
	{
		Node current = head;
		Node prev = head;
		// Node temp = head;

		// int len = 0;
		// while(temp != null){
		// 	len++;
		// 	temp = temp.next;
		// }

		while(current != null && current.next != null)
		{
			prev = prev.next;
			current = current.next.next;
		}

		if(head.next.next == null)
			head.next = null;
		else{
			prev.data = prev.next.data;
			prev.next = prev.next.next;
		}
		// if(len%2 == 0){
		// 	prev.next.data = prev.next.next.data;
		// 	prev.next.next = prev.next.next.next;
		// }else{
		// 	prev.data = prev.next.data;
		// 	prev.next = prev.next.next;
		// }
		
		System.out.println(prev.data);
		// prev.next = null;
		// Node temp = head.next;
		// temp.next = current;
	}
}