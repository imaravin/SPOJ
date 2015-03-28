
/*
 * solved
 */
public class FCTRL
{

	
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		long[] q=new long[n];
		for(int i=0;i<n;i++)
		{
			q[i]=trail(s.nextLong());
		}
		s.close();
		for(long x:q)
			System.out.println(x);
		
	}

	/**
	 * @param nextLong
	 * @return
	 */
	private static long trail(long n)
	{
		 long count = 0;
		 
		    // Keep dividing n by powers of 5 and update count
		    for (long i=5; n/i>=1; i *= 5)
		          count += n/i;
		 
		    return count;
	}
	

}
