import java.util.*;
public class trial
{
   public static void printArray (int[] arr)
   {
      int n = arr.length;
      for(int i=0; i<n; i++)
      {
         System.out.print(arr[i]+" ");
      }
      System.out.println();
   }

  public static int[] resizeArray(int[] arr, int capacity)
  {
      int[] temp = new int[capacity];
      for(int i = 0; i<arr.length; i++)
      {
         temp[i] = arr[i];
      }
      arr=temp;
      return arr;
  }

   public static void main(String[] args) {
      
      trial in = new trial();

      int[] orignal = {1,2,3,4};

      System.out.println("Before Resize-->"+orignal.length);
     orignal =  in.resizeArray(orignal,8);
      System.out.print("After Resize-->"+orignal.length);

   }
}