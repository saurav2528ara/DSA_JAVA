import java.util.*;
class trial
{
    public static void main(String[] args) {
        
        int arr[] = {2,5,8,3,1,10,55,9};

        int pos = 5;
        int element = 7;

        for(int i=arr.length-1; i>pos-1; i--)  // A/q to index number
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=element;

        for(int i=0; i<arr.length+1; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


                        // Another approach

import java.util.Scanner;
import java.util.*;
class trial
{
    public static void main(String[] args) {
        
        int pos; int element;
        Scanner in =new Scanner(System.in);
        int arr[]= new int[5];
        int arr2[]= new int [5+1];
        System.out.println("Enter array: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter position: ");
        pos=in.nextInt();
        System.out.println("Enter element: ");
        element=in.nextInt();
        
        for (int i=0; i<arr.length+1; i++)
        {
            if (i<pos)
            {
                arr2[i]=arr[i];
            }
            else if (i==pos)
            {
                arr2[i]=element;
            }
            else 
            {
                arr2[i]=arr[i-1];
            }
        }
        for (int i=0; i<arr2.length; i++)
        {
            System.out.print(arr2[i] +" ");
        }

    }
}