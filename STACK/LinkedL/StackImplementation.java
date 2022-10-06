import java.util.*;
public class trial
{
	StackNode head;

	static class StackNode
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
		if(head == null)
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

		if(head == null)
		{
			head = newNode;
		}
		else 
		{
			StackNode temp = head;
			head = newNode;
			newNode.next = temp;
		}
			System.out.println(data+" pushed to stack");
	}

	//     newNode.next = head;
	//     head=newNode;

	public int pop()
	{
		int popped = Integer.MIN_VALUE;
		if(head == null)
		{
			System.out.print("Stack is empty");
		}
		else 
		{
			popped = head.data;
			head = head.next;
		}
		return popped;

		//   if(head == null)
  //       {
  //           return -1;
  //       }
		// 	int popped = head.data;
		// 	head = head.next;
		
		// return popped;
	}

	public int peek()
	{
		if(head == null)
		{
			System.out.print("Stack is empty");
			return Integer.MIN_VALUE;
		}
		else {

			return head.data;
		}
	}

	public void print()
	{
		StackNode current = head;
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