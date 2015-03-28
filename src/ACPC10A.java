import java.util.ArrayList;

/**
 * 
 */

/**
 * Wrong answer
 * @author aravinth
 *
 */
public class ACPC10A
{


	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		float a,b,c;
		ArrayList<Float> ans=new ArrayList<Float>();
		ArrayList<Boolean> sol=new ArrayList<Boolean>();
		do
		{
			  a=s.nextInt();
			  b=s.nextInt();
			  c=s.nextInt();
			  if(a!=0&&b!=0 &&c!=0)
			  {
			if((b-a)==(c-b))
			{
				sol.add(true);//Arithmetic pogress;
				ans.add(c+(c-b));
			}
			else
			{
				sol.add(false);
				ans.add(c*(c/b));
			}
			  }
		}while(a!=0 && b!=0 && c!=0);
		s.close();
		for(int i=0;i<sol.size();i++)
		{
			if(sol.get(i))
			{
				System.out.printf("AP ");
				System.out.println((int)Math.round(ans.get(i)));
								
			}
			else
			{
				System.out.printf("GP ");
				System.out.println((int)Math.round(ans.get(i)));
				
			}
		}

	}

}
