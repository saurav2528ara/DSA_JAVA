import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		int n;
		int count = 0;
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Array elements: ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = in.nextInt();
		}
		System.out.print("Enter search elements: ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]); // print how many times elements exist
		}
		n = in.nextInt();
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] == n)
			{
				count++;
			}

		}
		if (count > 0)
		{
			System.out.print("Found" + count);
		}
		else 
		{
			System.out.print("Not found");
		}



	}
}