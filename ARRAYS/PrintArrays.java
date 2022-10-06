import java.util.Scanner;
class trial
{
	public static void main(String[] args) {

		int i;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = in.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter array: ");
		for(i=0; i<size; i++)
		{
			arr[i]= in.nextInt();
			System.out.println(arr[i]+" ");

		}

	}
}
	
