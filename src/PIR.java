/**
 * 
 */

/**
 * @author aravinth
 *
 */
public class PIR
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		double[] ans=new double[n];
		for(int i=0;i<n;i++)
		{
			double ab=s.nextDouble();
			double ac=s.nextDouble();
			double ad=s.nextDouble();
			double bc=s.nextDouble();
			double bd=s.nextDouble();
			double cd=s.nextDouble();
			double p=(ab+ac+bc)/2;
			double area=Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
			double h=Math.sqrt((bd*bd)-(ab*ab/3));
			ans[i]=area*h/3;
		}
		for(double x:ans)
			System.out.println(x);

	}

}
