import java.util.Scanner;

/**
 * 
 */

/**
 * @author aravinth
 *
 */
public class NSTEPS
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int tmp,val;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int x=s.nextInt();
			int y=s.nextInt();
			if(x==0 || y==1)
			{
				if(x==y)
					arr[i]=x;
				else 
					arr[i]=-1;
			}
			else 
			{
				if(y==x || x==(y-2))
				{
					if(x%2==0)
						  tmp = x-1;
					else
						tmp=x;
					val=((tmp-2)/2)*4+1;
					
					if(x%2==0)
					{
						if(y==x)
							arr[i]=val+4;
						else
							arr[i]=val+2;
					}
					else
					{
						if(y==x)
						arr[i]=val+3;
					else
						arr[i]=val+1;
						
					}
				}
				else
					arr[i]=-1;
			}
			
		}
		for(int x:arr)
			if(x==-1)
				System.out.println("No Number");
			else
				System.out.println(x);

	}

}
