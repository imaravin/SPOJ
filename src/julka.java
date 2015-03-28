import java.math.BigInteger;

/**
 * 
 */

/**
 * @author aravinth
 *
 */
public class julka
{

	/**
	 * solved 
	 * @param args
	 */
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		BigInteger a[]=new BigInteger[10];
		BigInteger b[]=new BigInteger[10];
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextBigInteger();
			b[i]=s.nextBigInteger();
			BigInteger x=a[i].add(b[i]);
			x=x.divide(BigInteger.valueOf(2));
			b[i]=a[i].subtract(x);
			a[i]=x;
		}
		s.close();
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
			System.out.println(b[i]);
		}

	}

}
