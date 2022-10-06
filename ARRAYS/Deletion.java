import java.util.Scanner;
import java.util.*;
class trial
{
    public static void main(String[] args) {
        
       int arr[]= {10,40,30,80,60,20};

       int del_ele = 100;
       int count=0;
       for(int i=0; i<arr.length; i++)
       {
        if (del_ele==arr[i])
        {
            for(int j=i; j<arr.length-1; j++)
            {
                arr[j]=arr[j+1];
            }
            count=count+1;
            break;
        }
       }
       if (count==0)
       {
        System.out.println("Element not found");
       }
       else 
       {
            System.out.println("Element deleted");
            for(int i=0; i<arr.length-1; i++)
            {
                System.out.print(arr[i]+" ");
            }    
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
        int arr2[]= new int [5-1];
        System.out.println("Enter array: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter position: ");
        pos=in.nextInt();

        for (int i=0; i<arr.length; i++)
        {
            if (i<pos)
            {
                arr2[i]=arr[i];
            }
            else if (i==pos)
            {
                continue;
            }
            else 
            {
                arr2[i-1]=arr[i];  // arr[]=10 20 30 40 50
                                    // arr2[]= 10 20 40 50  
            }
        }
        for (int i=0; i<5-1; i++)
        {
            System.out.print(arr2[i] +" ");
        }

    }
}