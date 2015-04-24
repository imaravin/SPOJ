import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author aravinth
 *
 */
public class NSTEPS implements Runnable {

	@SuppressWarnings("unused")
	@Override
	public void run() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i=0;i<n;i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			if (x == y) {
				if (x % 2 == 0)
					System.out.println(x * 2);
				else
					System.out.println(x * 2 - 1);
			} else if (x == y + 2) {
				if (x % 2 == 0)
					System.out.println(x * 2 - 2);
				else
					System.out.println(x * 2 - 3);
			} else {
				System.out.println("No Number");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		if (args.length >= 1)
			System.setIn(new FileInputStream(args[0]));
		new NSTEPS().run();
	}

}
