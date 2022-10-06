//arrays.toString()
import java.util.Arrays;
class sorted
{
    public static void main(String args[])
    {
        int[] arr1 = {8,5,4,2,1,3,7};

        System.out.println("Before sorted: "+Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("After sorted: "+Arrays.toString(arr1));

        
        
    }
}