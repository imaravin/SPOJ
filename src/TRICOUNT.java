/**
 * 
 */

/**
 * solved
 * @author aravinth
 *
 */
public class TRICOUNT
{

	public static void main(String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n=s.nextInt();
		long ans[]=new long[n];
		for(int i=0;i<n;i++)
		{
			long a=s.nextLong();
			long sum=(a*(a+1)*(a+2))/6;
			long sum2;
			if(a%2==0)
				sum2=(a*(a+2)*(2*a-1))/24;
			else
				sum2=((a*a-1)*(2*a+3))/24;
			ans[i]=sum+sum2;
		}
		s.close();
		for(long a:ans)
			System.out.println(a);

	}

}
