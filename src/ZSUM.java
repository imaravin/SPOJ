import java.math.BigInteger;
import java.util.ArrayList;

/**
 * 
 */

/**
 * time limit
 * @author aravinth
 *
 */
public class ZSUM
{

	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		ArrayList<BigInteger> ans=new ArrayList<BigInteger>();
		for(;;)
		{
			int n=s.nextInt();
			int k=s.nextInt();
			if(n==0 && k==0)
				break;
			else
			{
			ans.add(sum_Z(n,k));	
			}
		}
		s.close();
		for(BigInteger x:ans)
			System.out.println(x.mod(BigInteger.valueOf(10000007)));

	}
	public static BigInteger sum_nk(int n,int k)
	{
		BigInteger x=BigInteger.valueOf((long)n);
		x=x.pow(k);
		return x;
		
	}
	public static BigInteger sum_Z(int n,int k)
	{
		BigInteger x=sum_nk(n,n);
		BigInteger y=sum_nk(n,k);
		BigInteger a=sum_nk(n-1,k);
		BigInteger b=sum_nk(n-1,n-1);
		a=a.add(a);
		b=b.add(b);
		return a.add(b).add(x).add(y);
		
	}
	

}
