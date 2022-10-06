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

		head = sll.new Node(10);
		Node second = sll.new Node(8);
		Node third = sll.new Node(1);
		Node fourth = sll.new Node(11);
		Node fifth = sll.new Node(7);


		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;

		Node midList = sll.Nnode(2);
		System.out.print("middle element is "+midList.data);

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
	public Node Nnode(int n)
	{
		Node refptr = head;
		Node mptr = head;
		int count = 0;
		
		while(count<n)
		{
			refptr=refptr.next;
			count++;
		}
		while(refptr != null)
		{
			refptr = refptr.next;
			mptr = mptr.next;
		}
		return mptr;


		// Another approach

		int count = 0;
        Node refPtr = head;
        while(refPtr != null) {
            count++;
            refPtr = refPtr.next;
        }
        refPtr = head;
        for(int i=0; i<count; i++) {
            if(count-i == n) {
                return refPtr.data;
            }
            refPtr = refPtr.next;
        }
        return -1;

	}
}