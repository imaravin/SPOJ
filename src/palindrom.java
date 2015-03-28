import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 */

/**
 * time limit
 * @author aravinth
 *
 */
public class palindrom
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		BigInteger[] ans=new BigInteger[n];
		for(int i=0;i<n;i++)
		{
			BigInteger q=s.nextBigInteger();
			q=q.add(BigInteger.ONE);
			while(q.compareTo(palindrome(q))!=0)
			{
				q=q.add(BigInteger.ONE);
			}
			ans[i]=q;
		}
		
		for(BigInteger op:ans)
			System.out.println(op);
		s.close();
		
	}

	/**
	 * @param q
	 * @return
	 */
	private static BigInteger palindrome(BigInteger q)
	{
		String x=q.toString();
		String reverse="";
		for(int  i=x.length()-1;i>=0;i--)
			reverse=reverse+x.charAt(i);
		return new BigInteger(reverse);
	}
	
	

}
