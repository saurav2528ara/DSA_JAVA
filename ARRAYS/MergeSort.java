import java.util.Arrays;
import java.util.*;
class MergeSort
{
   int arr[];
   int tempMergeArray[];
   int length;

    public static void main(String[] args) {
        
      int inputArr[]={48,36,13,52,19,17,21}; 
      MergeSort in = new MergeSort();
      in.sort(inputArr);

      for(int i:inputArr)
      {
         System.out.print(i+" ");
      }
   }
   public void sort(int inputArr[])
   {
      this.arr=inputArr;
      this.length=inputArr.length;
      this.tempMergeArray=new int[length];
      divideArray(0,length-1);
   }
   public void divideArray(int lowerIndex, int higherIndex)
   {
      if(lowerIndex<higherIndex)
      {
         int middle=lowerIndex + (higherIndex-lowerIndex)/2;

         // It will sort left side of array
         divideArray(lowerIndex,middle);

         // It will sort right side of array
         divideArray(middle+1,higherIndex);
         mergeArray(lowerIndex,middle,higherIndex);
      }
   }
   public void mergeArray(int lowerIndex,int middle,int higherIndex)
   {
      for(int i=lowerIndex; i<=higherIndex; i++)
      {
         tempMergeArray[i]=arr[i];
      }
      int i=lowerIndex;
      int j=middle+1;
      int k=lowerIndex;

      while(i<=middle && j<=higherIndex)
      {
         if(tempMergeArray[i] <= tempMergeArray[j])
         {
            arr[k]=tempMergeArray[i];
            i++;
         }
         else 
         {
            arr[k]=tempMergeArray[j];
            j++;
         }
         k++;
      }
      while(i<=middle)
      {
         arr[k]=tempMergeArray[i];
         k++;
         i++;
      }
   }

}