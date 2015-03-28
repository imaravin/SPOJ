import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 
 */

/**
 * get n lines without knowing n
 * @author aravinth
 *
 */
public class BISHOPS
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> ans=new ArrayList<Integer>();
		while(true)
		{
			String x=s.readLine();
			if(x.compareTo("")==0)
				break;
			int n=Integer.parseInt(x);
			ans.add((2*n)-2);
		}
		s.close();
	
	for(int i=0;i<ans.size();i++)
		System.out.println(ans.get(i));
	}
}
