import java.util.Scanner;

/**
 * 
 */

/**
 * @author aravinth
 *
 */
public class pattern
{

	
	public static void main(String[] args)
	{
		long startTime = System.nanoTime();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String ans[]=new String[n];
		for(int i = 0;i<n;i++)
		{
			ans[i]="";
			String src=s.next();
			String sub=s.next();
			int j=0;
			while((j=src.indexOf(sub,j))!=-1)
			{
				ans[i]=ans[i]+j;
				j++;
			}
			
		}
		s.close();
		for(int i=0;i<n;i++)
			if(ans[i].length()!=0)
			{
				System.out.println(ans[i].length());
				for(int j=0;j<ans[i].length();j++)
					System.out.printf("%c ",ans[i].charAt(j)+1);
				System.out.println();
			}
			else
				System.out.println("NOT FOUND");
		
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");

	}

}
