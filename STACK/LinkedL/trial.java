import java.util.*;
public class trial
{
	static StackNode top;

	public class StackNode
	{
		int data;
		StackNode next;

		StackNode(int data)
		{
			this.data = data;
		}
	}

	public boolean isEmpty()
	{
		if(top == null)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public void push(int data)
	{
		StackNode newNode = new StackNode(data);

		newNode.next = top;
		top = newNode;
	}

	public int pop()
	{
		if(top == null)
		{
			return -1;
		}

		int popped = top.data;
		top = top.next;
		return popped;
	}

	public int peek()
	{
		if(top == null)
		{
			return -1;
		}
		else 
		{
			return top.data;
		}
	}

	public void print()
	{
		StackNode current = top;
		while(current != null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
	}

	 public static void main(String[] args)
    	{
  
        trial sll = new trial();
  
        sll.push(10);
        sll.push(20);
        sll.push(30);
  
        System.out.println(sll.pop()+ " popped from stack");
  
        System.out.println("Top element is " + sll.peek());
        System.out.print("element present in stack: ");
        sll.print();
    }
}