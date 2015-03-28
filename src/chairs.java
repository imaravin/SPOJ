/**
 * 
 */

/**
 * @author aravinth
 *
 */
public class chairs
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int sol=fact((n/2)-k);
		System.out.println(sol);
		s.close();
	}

	/**
	 * @param i
	 * @return
	 */
	private static int fact(int i)
	{
		int sum=1;
		for(int j=1;j<=i;j++)
			sum=sum*j;
		return sum;
	}

}
