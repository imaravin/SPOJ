/**
 * 
 */

/**
 * time limit 
 * @author aravinth
 *
 */
public class distance
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		int d=s.nextInt();
		int arr[][]=new int[n][d];
		for(int i=0;i<n;i++)
			for(int j=0;j<d;j++)
				arr[i][j]=s.nextInt();
		int distance=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{
				double sum=0;
				for(int k=0;k<d;k++)
					sum=sum+Math.abs(arr[i][k]-arr[j][k]);
				
				if(sum>distance)
					distance=(int) sum;
			}
		s.close();
		System.out.println(distance);
	}

}
