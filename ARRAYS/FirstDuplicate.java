import java.util.Arrays;
import java.util.*;
import java.util.Set;
import java.util.HashSet;
class trial
{
    public static void main(String[] args) {
        
    int a[]={6,5,3,2,5,1,2,4};
                                          // BRUTE FORCE METHOD
      for(int i=0; i<a.length; i++)
      {
         int temp=0;
         for(int j=i+1; j<a.length; j++)
         {
            if(a[i]==a[j])
            {
               System.out.print("First element is: "+a[i]);
               temp+=1;
               break;  
            }
         }
         if(temp>0)
         {
            break;
         }
      }

                           // By using Collection

    int temp=-1;
    HashSet<Integer> hs=new HashSet<>();
    for(int i=a.length-1; i>=0; i--)
    {
      if(hs.contains(a[i]))
      {
         temp=i;
      }
      else 
      {
         hs.add(a[i]);
      }
    }
      if(temp != -1)
      {
         System.out.print(a[temp]+" ");
      }
      else 
      {
         System.out.print("no duplicate element");
      }

   }
}