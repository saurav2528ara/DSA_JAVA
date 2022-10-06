import java.util.*;
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
		Node second = sll.new Node(3);
		Node third = sll.new Node(1);
		Node fourth = sll.new Node(4);
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
		
	
		HashSet<Integer>hs = new HashSet<>();

	    Node current = head;

        Node prev = null;

        while (current != null) {

            int temp = current.data;

            if (hs.contains(temp)) 
            {

                prev.next = current.next;

            }

            else {

                hs.add(temp);

                prev = current;

            }

            current = current.next;

        }
        	
       }
}	

