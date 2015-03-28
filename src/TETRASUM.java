import java.math.BigInteger;


public class TETRASUM
{
	/*
	 * 
	 * time limit exceeded
	 */

	public static void main(String[] args)
	{

		
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		BigInteger ans[]=new BigInteger[n];
		for(int i=0;i<n;i++)
		{
			int start=s.nextInt();
			int end=s.nextInt();
			BigInteger sum_a=find(start);
			BigInteger sum_b=find(end);
			ans[i]=sum_b.subtract(sum_a);
			
		}
		s.close();
		for(int i=0;i<n;i++)
			System.out.println(ans[i].mod(BigInteger.valueOf(1000000007)));
														
	}
	public static BigInteger find(int x)
	{
		
		BigInteger sum=BigInteger.valueOf(0);
		BigInteger a=BigInteger.valueOf(0);
		BigInteger b=BigInteger.valueOf(0);
		BigInteger c=BigInteger.valueOf(0);
		BigInteger d=BigInteger.valueOf(1);
		int y=3;
		while(y<=x)
		{
			sum=sum.add(a).add(b).add(c).add(d);
			a=b;
			b=c;
			c=d;
			d=sum;
			y++;
		}
		return sum;
	}

}
