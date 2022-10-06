import java.util.Arrays;
import java.util.*;
import java.util.Set;
import java.util.HashSet;
class trial
{
    public static void main(String[] args) {
        
    int a[]={5,3,4,5,1,3,4};
     
     int r=a[0];  // r is already start at a[0] 

     for(int i=1; i<a.length; i++)  // so i start at a[1]
     {
       r=r^a[i];
     }
       System.out.print("Element appears once: "+r);
       


   }
}