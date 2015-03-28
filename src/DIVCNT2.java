class DIVCNT2
{

	/**
	 * time limit
	 * @param args
	 */
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		long ans[]=new long[n];
		for(int i=0;i<n;i++)
		{
			long q=s.nextLong();
			for(long j=1;j<=q;j++)
			ans[i]=ans[i]+divide(j*j);
		}
		s.close();
		for(long k:ans)
			System.out.println(k);

	}
	private static long divide(long l)
	{
		int k=0;
		int a;
		if(l%2==0)
			a=2;//even
		else
			a=1;
		for(long i=a;i<=l/2;i=i+2)
			if(l%i==0)
				k++;
		return k+1;
	}

}