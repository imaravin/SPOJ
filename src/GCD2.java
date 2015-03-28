import java.math.BigInteger;

/**
 * 
 */

/**
 * solved
 * @author aravinth
 *
 */
public class GCD2
{

	/**
	 * Not Implement using java
	 * @param args
	 */
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		BigInteger ans[]=new BigInteger[n];
		for(int i=0;i<n;i++)
		{
			BigInteger x=s.nextBigInteger();
			BigInteger y=s.nextBigInteger();
			ans[i]=gcd(x,y);
		}
		s.close();
		for(BigInteger xx:ans)
			System.out.println(xx);

	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	private static BigInteger gcd(BigInteger a, BigInteger b)
	{
		 
		
			if (b.compareTo(BigInteger.ZERO)==0)
				return a;
			else
				return gcd(b,a.mod(b));
	}

}
