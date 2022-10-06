import java.util.Arrays;
import java.util.*;
class trial
{
    public static void main(String[] args) {
        
    int a[]={5,8,12,7,6,2,4};
    int k=4;

    // first ye sort krega 
    // fir sorted list me see position btayega

    for(int i=0; i<a.length; i++)                  //1st method
      {
       for(int j=i+1; j<a.length; j++)
       {
          if(a[i] < a[j])
          {
             int temp = a[i];
             a[i]=a[j];
             a[j]=temp;
          }
       }
       if (i == k-1)
       {
          System.out.println(k+"th largest element is "+a[i]);
          break;
       }
      }
      System.out.println("From this array");
       for (int i=0; i<a.length; i++)
      {
        System.out.print(a[i]+" ");
      }
   
   }

}