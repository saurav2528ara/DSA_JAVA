import java.util.*;
public class trial
{
	static final int MAX = 1000;
	int top;
	int[] arr = new int[MAX];

	public boolean isEmpty()
	{
		return (top < 0);
	}

	trial()
	{
		top = -1;
	}

	public boolean push(int x)
	{
		if(top >= (MAX-1))
		{
			System.out.println("Stack OverFlow");
			return false;
		}
		else 
		{
			arr[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}

	int pop()
	{
		if(top < 0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else 
		{
			int x = arr[top--];
			return	x;
		}
	}

	int peek()
	{
		if(top < 0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else 
		{
			int x = arr[top];
			return x;
		}
	}

	public void printArray()
	{
		for(int i=top; i>-1; i--)
		{
			System.out.print(" "+arr[i]);
		}
	}

	public static void main(String[] args) {
		
		trial s = new trial();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() +" popped from stack");
		System.out.println("Top element is: "+s.peek());
		System.out.print("element present in stack: ");
		s.printArray();
	}

}