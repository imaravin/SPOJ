import java.util.Arrays;

/**
 * 
 */

/**
 * solved;
 * @author aravinth
 *
 */
public class FASHION
{

	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		int ans[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int a=s.nextInt();
			int[] men=new int[a];
			for(int j=0;j<a;j++)
				men[j]=s.nextInt();
			int[] women=new int[a];
			for(int j=0;j<a;j++)
				women[j]=s.nextInt();
			Arrays.sort(women);
			Arrays.sort(men);
			for(int j=0;j<a;j++)
			{
				
				ans[i]=ans[i]+(men[j]*women[j]);
			}
		}
		s.close();
		for(int i:ans)
			System.out.println(i);
		
		
			
		

	}

}
