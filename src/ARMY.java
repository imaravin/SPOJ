import java.util.Arrays;

/**
 * 
 */

/**
 * time limit
 * @author aravinth
 *
 */
public class ARMY
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		boolean ans[]=new boolean[n];
		for(int i=0;i<n;i++)
		{
			int ng=s.nextInt();
			int[] god=new int[ng];
			int nm=s.nextInt();
			int[] mech=new int[nm];
			for(int j=0;j<ng;j++)
				god[j]=s.nextInt();
	
			for(int j=0;j<nm;j++)
				mech[j]=s.nextInt();
			Arrays.sort(god);
			Arrays.sort(mech);
			if(god[god.length-1]>=mech[mech.length-1])
				ans[i]=true;
		}
		s.close();
		for(boolean b:ans)
			if(b)
				System.out.println("Godzilla");
			else
				System.out.println("MechaGodzilla");

	}

}
