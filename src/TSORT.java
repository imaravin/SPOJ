/**
 * 
 */

/**
 * time limit
 * @author aravinth
 *
 */
public class TSORT
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		int[] xx=new int[n];
		for(int i=0;i<n;i++)
		xx[i]=s.nextInt();
		java.util.Arrays.sort(xx);s.close();
		for(int x:xx)
		System.out.println(x);
	}
	

}
