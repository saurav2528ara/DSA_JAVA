import java.util.Arrays;
import java.util.*;
import java.util.Set;
class trial
{
    public static void main(String[] args) {
        
    int a[]={3,5,4,3,2,2,1};
                                          // BRUTE FORCE METHOD
    // for(int i=0; i<a.length; i++)
    // {
    //    for(int j=i+1; j<a.length; j++)
    //    {
    //      if((a[i] == a[j]) && (i!=j))
    //      {
    //         System.out.print(a[j]+" ");
    //      }
    //    }
    // }
    

    // Set<Integer> s = new HashSet<>();        // Set Interface Method
    // for(int no : a)
    // {
    //      if(s.add(no)==false)
    //      {
    //         System.out.print(no+" ");
    //      }
    // }

   Map<Integer,Integer>hm=new HashMap<>();
   for(int no:a)
   {
      Integer count=hm.get(no);        // Hash Table
      if(count==null)
      {
         hm.put(no,1);
      }
      else 
      {
         count=count+1;
         hm.put(no,count);
      }
   }
   // Now for duplicate element
   System.out.print("Duplicate elements are: ");
   Set<Map.Entry<Integer,Integer>>es=hm.entrySet();
   for(Map.Entry<Integer,Integer>me:es) // similar to for each loop
   {
      if(me.getValue()>1)
      {
         System.out.print(me.getKey()+" ");
      }
   }

   }
}