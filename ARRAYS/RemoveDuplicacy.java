import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
class trial
{
    public static void main(String[] args) {
    int a[] = {1,2,2,3,4,5,5};
    // int temp[] = new int[a.length];

    // int j=0;
    // for(int i=0; i<a.length-1; i++)
    // {
    //   if(a[i] != a[i+1])
    //   {
    //     temp[j]=a[i];
    //     j++;
    //   }
    // }
    // temp[j]=a[a.length-1];  // 1st array k last vala element tk
    // for(int i=0; i<a.length; i++)
    // {
    //   System.out.print(temp[i]+" ");
    // }

    // 2 Method (Without Taking new Array)
    int j=0;
    for(int i=0; i<a.length-1; i++)
    {
       if(a[i]!=a[i+1])
       {
          a[j]=a[i];
          j++;
       }
    }
    a[j]=a[a.length-1];
    for(int i=0; i<j+1; i++)
    {
      System.out.print(a[i]+" ");
     }

  }
}