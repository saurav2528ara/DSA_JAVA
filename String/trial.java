import java.util.*;
public class trial
{
	public boolean isPalindrome(String word)
	{
		char[] charArray = word.toCharArray();

		int start = 0;
		int end = word.length()-1;

		while(start < end)
		{
			if(charArray[start] != charArray[end])
			{
				return false;
			}

			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		
		trial in = new trial();

		if(in.isPalindrome("dog"))
		{
			System.out.print("Palindrome");
		}
		else

		System.out.print("Not Palindrome");
	}
}