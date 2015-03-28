import java.math.BigInteger;

/**
 * 
 */

/**
 * solved
 * to find the factorial
 * @author aravinth
 *
 */
public class small
{

	
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		BigInteger ans[]=new BigInteger[n];
		for(int i=0;i<n;i++)
			ans[i]=fact(s.nextBigInteger());
		s.close();
		for(BigInteger j:ans)
			System.out.println(j);
	}
	public static BigInteger fact(BigInteger x)
	{
		if(x.compareTo(BigInteger.ONE)>0)
			return x.multiply(fact(x.subtract(BigInteger.ONE)));
		else
			return BigInteger.ONE;
		
	}

}
