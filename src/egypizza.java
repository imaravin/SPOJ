/**
 * 
 */

/**
 * Wrong answer
 * @author aravinth
 *
 */
public class egypizza
{

	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		float sum=1;
		for(int i=0;i<n;i++)
		{
			String tmp=s.next();
			if(tmp.compareTo("1/2")==0)
				sum=sum+0.5f;
			else if(tmp.compareTo("1/4")==0)
				sum=sum+0.25f;
			else if(tmp.compareTo("3/4")==0)
				sum=sum+0.75f;
		}
		s.close();
		System.out.printf("%d",Math.round(Math.ceil(sum)));
	}

}
