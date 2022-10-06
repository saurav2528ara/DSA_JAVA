import java.util.*;
public class trial
{
   // public static void printArray (int[] arr)
   // {
   //    int n = arr.length;
   //    for(int i=0; i<n; i++)
   //    {
   //       System.out.print(arr[i]+" ");
   //    }
   //    System.out.println();
   // }

   public static int missElement(int[] arr)
   {
      int n = arr.length+1;

      int sum = (n*(n+1))/2;
      for(int num : arr)
      {
         sum = sum-num;
      }
      return sum;
   }
   
   public static void arrDemo()
   {
      int[] arr = {1,2,3,5};
      System.out.println(missElement(arr));
   }
  
  public static void main(String[] args) {
     
   trial in = new trial();
   in.arrDemo();


}
}