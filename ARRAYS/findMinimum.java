import java.util.Arrays;
public class trial
{
   public static void printArray(int[] arr)
   {
      int n = arr.length;
      for(int i=0; i<n; i++)
      {
         System.out.print(arr[i]+" ");
      }
      System.out.println();
   }

   public static int minimumValue(int[] arr)
   {
      int temp = arr[0];
      for(int i=1; i<arr.length; i++)
      {
        if(arr[i] < temp)
        {
            temp = arr[i];
        }
      }
      return temp;
   }

   public static void main(String[] args) {
      
      int[] arr = {8,4,6,3,2};

      printArray(arr);
      trial min = new trial();
      System.out.print(min.minimumValue(arr));
   }
}