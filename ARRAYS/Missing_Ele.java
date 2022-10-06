import java.util.Arrays;
import java.util.*;
import java.util.Set;
import java.util.HashSet;
class trial
{
    public static void main(String[] args) {
        
    int arr[]={1,2,3,4,5,7};
     
    // int exp_ele=a.length+1;
    // int total_sum= exp_ele*(exp_ele+1)/2;

    // int sum=0;
    // for (int i=0;i<a.length;i++ ) {
      
    //   sum=sum+a[i];
    // }
    // System.out.print(total_sum-sum);

                  // Second Method Using XOR

   //  int xor1=a[0];
   //  for(int i=1; i<a.length; i++)
   //  {
   //    xor1 = xor1^a[i];
   //  }

   //  int xor2=a[1];
   //  for(int i=2; i<=a.length+1; i++)
   //  {
   //    xor2 = xor2^i;
   //  }
   //  System.out.print("Missing term is "+(xor1^xor2));

   // }

    int n = arr.length+1;

    int sum = (n*(n+1))/2;

    for(int num : arr)
    {
      sum = sum - num;
    }
    return sum;
  }
}