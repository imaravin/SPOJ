
/*
 * time limit
 */
public class PR003004
{

	
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		long ans[]=new long[n];
		for(int i=0;i<n;i++)
		{
			long a=s.nextLong();
			long b=s.nextLong();
			for(long j=a;j<=b;j++)
				ans[i]=ans[i]+sum(j);
		}
		s.close();
		for(long x:ans)
			System.out.println(x);
	}

	/**
	 * @param j
	 * @return
	 */
	private static long sum(long j)
	{
		long sum=0;
		while(j!=0)
		{
			sum+=(j%10);
			j/=10;
		}
		return sum;
	}
	

}
