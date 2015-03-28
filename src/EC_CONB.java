/*
 * Completed
 */
public class EC_CONB
{

	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		int ans[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int a=s.nextInt();
			if(a%2==0)
			{
				ans[i]=Integer.parseInt(binary(a),2);
				
			}
			else
				ans[i]=a;
		}
		s.close();
		for(int x:ans)
			System.out.println(x);

	}

	/**
	 * @param a
	 * @return
	 */
	private static String binary(int number)
	{
		StringBuilder sb=new StringBuilder();
        while(number > 0){
           sb.append(number%2);
            number = number/2;
        }
		 
		return new String(sb);
	}

}
