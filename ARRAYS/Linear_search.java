import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

class trial
{
    public static void main(String[] args) {
        int i,n;
        int count=0;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=r.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array: ");
        for(i=0; i<arr.length; i++)
        {
            arr[i] = r.nextInt();
        }
        System.out.println("Enter input to search: ");
        n = r.nextInt();
        for(i=0; i<arr.length; i++)
        {
            if(arr[i]==n)
            {
                System.out.println("x found at index: " +i);
                count=count+1;
            }
        }
        if(count==0)        
        {
            System.out.println("Element not found");
        }
    }
    // return -1; // -1 when we iterate the whole array
}