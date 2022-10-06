import java.util.Arrays;
import java.util.*;
class trial
{
    public static void main(String[] args) {
        
    int arr[]={15,9,7,13,12,16,4,18,11};
    int len = arr.length;

    trial in = new trial();
    in.quickSortRecursion(arr,0,len-1);
    in.printArray(arr);

}
int partion(int arr[], int low, int high)
{
   int pivot = arr[(low+high)/2];

   while(low <= high)
   {
      while(arr[low]<pivot)
      {
         low++;
      }
      while(arr[high] > pivot)
      {
         high--;
      }
      if(low<=high)
      {
         int temp=arr[low];
         arr[low]=arr[high];
         arr[high]=temp;

         low++;
         high--;
      }
   }
   return low;
}
// Now Recursion
void quickSortRecursion(int arr[],int low,int high)
{
   int pi=partion(arr,low,high);
   if(low<pi-1)
   {
      quickSortRecursion(arr,low,pi-1);
   }
   if(pi<high)
   {
      quickSortRecursion(arr,pi,high);
   }
}
void printArray(int arr[])
{
   for(int i=0; i<arr.length; i++)
   {
      System.out.print(arr[i]+" ");
   }
}
}