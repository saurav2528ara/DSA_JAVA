import java.util.Arrays;
import java.util.*;
class trial
{
    public static void main(String[] args) {
        
    int a[]={6,8,2,4,3,1,5,7};

    // for(int i=0; i<a.length; i++)    
    // {
    //   for(int j=i+1; j<a.length; j++) // 1st approach 
    //   {
    //     if(a[i] < a[j])
    //     {
    //       int temp=a[i];
    //       a[i]=a[j];
    //       a[j]=temp;
    //     }
    //   }
    //   if(i==1)
    //   {
    //     break;
    //   }
    // }
    // System.out.print("Second largest number is "+a[1]);


     int largest = Integer.MIN_VALUE;
     int sec_Largest= Integer.MIN_VALUE;

     for(int i=0; i<a.length; i++)      //  2nd approach
     {
        if(a[i] > largest)
        {
           sec_Largest = largest; // 2nd execute 
           largest=a[i]; // 1st execute
        }
        else if(a[i] > sec_Largest && a[i] != largest)
        {
          sec_Largest=a[i];
        }
     }
        System.out.print("sec_Largest value is "+ sec_Largest);
   }
}