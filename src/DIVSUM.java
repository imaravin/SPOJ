/**
 * 
 */

/**
 * time limit
 * @author aravinth
 *
 */
public class DIVSUM
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		long ans[]=new long[n];
		for(int i=0;i<n;i++)
		{
			ans[i]=sum(s.nextLong());
		}
		s.close();
		for(long x:ans)
			System.out.println(x);
	}

	/**
	 * @param nextLong
	 * @return
	 */
	private static long sum(long nextLong)
	{
		long sum=0;
		if(isprime(nextLong))
			return 1;
		for(long i=1;i<nextLong;i++)
			if(nextLong%i==0)
				sum+=i;
		return sum;
		
	}

	public static boolean isprime(long j)
	{
		long x=0;
		if(j<2)
			return false;
		if(j%2==0 && j!=2)
			return false;
		for(long i=3;i<=Math.sqrt(j);i=i+2)
			if(j%i==0)
			{
				x++;
				break;
			}
		if(x==0)
			return true;
		else
			return false;
	}


}
