import java.util.ArrayList;

/**
 * 
 */

/**
 * Solved 
 * @author aravinth
 * 
 * 
 *  Peter wants to generate some prime numbers for his cryptosystem. 
 *  Help him! Your task is 
 *  to generate all prime numbers between two given numbers!
	Input

The input begins with the number t of test cases
 in a single line (t<=10). In each of the next t lines there are two numbers 
 m and n (1 <= m <= n <= 1000000000, n-m<=100000) separated by a space.
Output

For every test case print 
all prime numbers p such that m <= p <= n, one number per line, test 
cases separated by an empty line.
 *
 */
public class primegenerate
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> x=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int m=s.nextInt();
			int l=s.nextInt();
			for(int j=m;j<=l;j++)
				if(isprime(j))
					x.add(new Integer(j));
			x.add(new Integer(0));
		}
		s.close();
		for(int k=0;k<x.size();k++)
			if(x.get(k)!=0)
				System.out.println(x.get(k));
			else
				System.out.println();
		
	}
	public static boolean isprime(int j)
	{
		int x=0;
		if(j<2)
			return false;
		if(j%2==0 && j!=2)
			return false;
		for(int i=3;i<=Math.sqrt(j);i=i+2)
			if(j%i==0)
			{
				x++;
				break;
			}
		if(x==0)
			return true;
		else
			return false;
	}

}
