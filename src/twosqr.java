/**
 * 
 */

/**
 * time limit exceeded 
 * @author aravinth
 *
 */
public class twosqr
{

	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		boolean ans[]=new boolean[n];
		for(int i=0;i<n;i++)
		{
			 long b=s.nextLong();
			 for(long j=1;j<b/2;j++)
				 if(((j*j)+((b-j)*(b-j)))==b)
				 {
					 ans[i]=true;
					 break;
				 }
		}
		s.close();
		for(boolean x:ans)
			if(x)
				System.out.println("Yes");
			else
				System.out.println("No");
		
	}


}
