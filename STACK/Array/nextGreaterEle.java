import java.util.*;
public class trial
{
	public static int[] nextGreater(int[] arr, int s)
	{
		int i;
		int[] result = new int[arr.length];
		Stack<Integer> stack = new Stack<>();

		for(i=arr.length-1; i>=0; i--)
		{
			if(!stack.isEmpty())
			{
			while(!stack.isEmpty() && stack.peek()<= arr[i])
			{
				stack.pop();
			}
			}
			if(stack.isEmpty())
			{
				result[i] = -1;
			}
			else 
			{
				result[i] = stack.peek();
			}
			stack.push(arr[i]);
		}

		for(int j=0; j<arr.length; j++)
		{
			if(result[j] != -1)
			{
				System.out.println(arr[j] + " is: "+result[j]);
			}
			else 
			{
				System.out.println(arr[j]+" Does not exist");
			}
		}
		return result;

	}

	
	public static void main(String args[]) {
		
		trial s = new trial();
		int[] arr = {4,7,3,4,8,1};

		int size = arr.length;
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");

		s.nextGreater(arr,size);

	}
}