import java.util.Arrays;
import java.util.*;
import java.util.Set;
import java.util.HashSet;
class trial
{
    public static void main(String[] args) {
        
    int a[]={8,5,10,12,3,1,4};
     
    ArrayList<Integer> s1=new ArrayList<>();
    ArrayList<Integer> s2=new ArrayList<>();

    for(int i=0; i<a.length; i++)
    {
      if(a[i]%2==0)
      {
        s1.add(a[i]);
      }
      else 
      {
        s2.add(a[i]);
      }
    }
    System.out.println("Even numbers ares");
    for(int no:s1)
    {
      System.out.print(no+" ");
    }
    System.out.print("\n");
    System.out.println("size: "+s1.size());
    System.out.println("Odd no are");
    for(int no:s2)
    {
      System.out.print(no+" ");
    }
    System.out.print("\n");
    System.out.println("Size: "+s2.size());



   }
}