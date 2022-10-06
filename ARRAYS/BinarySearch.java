import java.util.Arrays;
import java.util.*;
class trial
{
    public static void main(String[] args) {
        
        int arr[]={1,2,4,5,7,8,9};
        int li=0;
        int hi=arr.length-1;
        int mi=(li+hi)/2;
        int srch = 2;
        int ans = -1;

        while (li<=hi)
        {
            if(arr[mi]==srch)
            {
                ans = mi;
                System.out.println("Element found at Index "+mi);
                break;
            }
            else if (arr[mi] < srch)
            {
                li=mi+1;
            }
            else 
            {
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
        if(li>hi)
        {
            System.out.println("Element not found");
        }

            // return ans

    }
}