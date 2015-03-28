import java.util.Scanner;

/**
 * 
 */

/**
 * solved
 * @author aravinth
 *
 */
public class addrev
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int a=s.nextInt();
			int b=s.nextInt();
			a=reverse(a);
			b=reverse(b);
			int c=a+b;
			ans[i]=reverse(c);
		}
		s.close();
		for(int x:ans)
			System.out.println(x);

	}
	public static int  reverse(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=(sum*10)+(n%10);
			n=n/10;
		}
		return sum;
	}
}
