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

   public static int[] removeEven(int[] arr)
   {
      int oddCount = 0;
      for(int i=0; i<arr.length; i++)
      {
         if(arr[i] % 2 != 0)
         {
            oddCount++;
         }
      }

      int[] result = new int[oddCount];
      {
         int temp=0;
         for(int i=0; i<arr.length; i++)
         {
            if(arr[i] % 2 != 0)
            {
               result[temp] = arr[i];
               temp++;
            }
         }
         return result;
      }
   }

   public static void main(String[] args) {
      
      int[] arr = {2,4,3,6,5,8,7};

      printArray(arr);
      int[] result = removeEven(arr);
      printArray(result);
   }
}