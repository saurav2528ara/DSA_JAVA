import java.util.Arrays;
import java.util.*;
import java.util.Set;
import java.util.HashSet;
class trial
{
    public static void main(String[] args) {
        
    int a1[]={4,3,7,9,2};
    int a2[]={5,1,4,8,3};

    HashSet<Integer> hs=new HashSet<>();
     
   // for(int i=0; i<a1.length; i++)
   // {
   //    for(int j=0; j<a2.length; j++)
   //    {
   //      if (a1[i] == a2[j])
   //      {
   //        System.out.println("Common: "+a1[i]);
   //      }
   //    }
   // }

    // Second Method

    // for(int i=0; i<a1.length; i++)
    // {
    //   for(int j=0; j<a2.length; j++)
    //   {
    //     if(a1[i]==a2[j])
    //     {
    //       hs.add(a1[i]);
    //     }
    //   }
    // }
    // for(int no:hs)
    // {
    //   System.out.print(no+" ");
    // }


      // 3rd method

for(int no:a1)
    {
      hs.add(no);
    }
    for(int no:a2)
    {
      boolean b=hs.add(no);
      if(b==false)
      {
        System.out.print(no+" ");
      }
    }
   
  }
}