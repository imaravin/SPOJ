import java.math.BigInteger;

/**
 * 
 */

/**
 * time limit
 * @author aravinth
 *
 */
public class DIVSUM2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		BigInteger ans[]=new BigInteger[n];
		for(int i=0;i<n;i++)
		{
			ans[i]=sum(s.nextBigInteger());
		}
		s.close();
		for(BigInteger x:ans)
			System.out.println(x);
	}

	/**
	 * @param bigInteger
	 * @return
	 */
	private static BigInteger sum(BigInteger bigInteger)
	{
		BigInteger sum=BigInteger.ZERO;
		BigInteger x=BigInteger.ONE;
		for(;x.compareTo(bigInteger)<0;x=x.add(BigInteger.ONE))
			if(bigInteger.mod(x).compareTo(BigInteger.ZERO)==0)
				sum=sum.add(x);
		return sum;
		
	}


}
