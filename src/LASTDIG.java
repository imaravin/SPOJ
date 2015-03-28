/**
 * 
 */

/**
 * @author aravinth
 *
 */
public class LASTDIG
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int arr[][]={{0,0,0,0},
					{1,1,1,1},
					{2,4,6,8},
					{1,3,9,7},
					{6,4,6,4},
					{5,5,5,5},
					{6,6,6,6},
					{1,7,9,3},
					{6,8,4,2},
					{1,9,1,9}};
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		int[] sol=new int[n];
		for(int i=0;i<n;i++)
		{
			int a=s.nextInt();
			int b=s.nextInt();
					sol[i]=arr[a%10][b%4];
		}
		s.close();
		for(int x:sol)
			System.out.println(x);
	}

}
