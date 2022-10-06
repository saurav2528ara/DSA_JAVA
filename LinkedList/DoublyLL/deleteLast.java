import java.util.*;
public class trial
{
	Node head;
	Node tail;
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
		return length == 0;
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
			tail.next = newNode;
		}
		newNode.prev = tail;
		tail = newNode;
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
			temp = temp.prev;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		
		trial dll = new trial();

		dll.insertLast(1);
		dll.insertLast(2);
		dll.insertLast(3);
		dll.insertLast(4);

		dll.delFirst();
		dll.delLast();
		dll.insertBegin(0);
		dll.insertEnd(7);
		dll.displayNext();
		dll.displayPrev();
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

	public void insertEnd(int value)
	{
		Node newNode = new Node(value);

		if(isEmpty())
		{
			head = newNode;
		}
		else 
		{
			tail.next = newNode;
			newNode.prev = tail;
		}
		tail = newNode;
	}

	public void delFirst()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		Node temp = head;
		if(head == tail)
		{
			tail = null;
		}
		else 
		{
			temp.next.prev = null;
		}
		head = head.next;
		temp.next = null;

	}

	public void delLast()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		Node current = tail;
		if(head == tail)
		{
			head = null;
		}
		else {

			tail.prev.next = null;
		}
		tail = tail.prev;
		current.prev = null;
	}

	
}