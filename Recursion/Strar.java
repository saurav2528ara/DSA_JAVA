public class trial
{
	public static void f()
	{	
		int cut=0;

		System.out.println(cut);
		cut++;
		 f();
	}



	public static void main(String[] args) {
			

		f();
	}
}