import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Loader
{
	public static Bumper giz;
	public static StandardFile sf;
	public static int squareCount, circleCount, lfCount, rfCount, triCount;
	public static FileOutputStream fout;
	public static ObjectOutputStream oos;

	public static void writeGiz()
	{
		try
		{
			File file = new File("save.txt");
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(sf);
			oos.flush();
			oos.close();
			System.out.println("Saved!");
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws Exception
	{
		squareCount = 1;
		circleCount = 1;
		lfCount = 1;
		rfCount = 1;
		triCount = 1;

		/**
		 * Depending on the type of gizmo, it will be saved as: [shape] [letter
		 * & no.]
		 */

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please enter a gizmo (i.e. Square, Triangle, Circle): ");
		String s = sc.next();
		giz = Bumper.valueOf(s);
		
		System.out.println("Please enter an x co-ordinate: ");
		int x = sc.nextInt();
		
		System.out.println("Please enter a y co-ordinate: ");
		int y = sc.nextInt();
		sc.close();

		switch (giz)
		{

		case SQUARE:
			sf.setGizmo("Square");
			sf.setTag("S" + squareCount);
			sf.setCoX(x);
			sf.setCoY(y);
			squareCount++;
			writeGiz();
			break;

		case CIRCLE:
			sf.setGizmo("Circle");
			sf.setTag("C" + circleCount);
			sf.setCoX(x);
			sf.setCoY(y);
			circleCount++;
			break;

		case LEFT_FLIPPER:
			sf.setGizmo("LeftFlipper");
			sf.setTag("LF" + lfCount);
			sf.setCoX(x);
			sf.setCoY(y);
			lfCount++;
			break;

		case RIGHT_FLIPPER:
			sf.setGizmo("RightFlipper");
			sf.setTag("RL" + rfCount);
			sf.setCoX(x);
			sf.setCoY(y);
			rfCount++;
			break;

		case TRIANGLE:
			sf.setGizmo("Triangle");
			sf.setTag("T" + triCount);
			sf.setCoX(x);
			sf.setCoY(y);
			triCount++;
			break;

		default:
			writeGiz();
			break;

		}
		

	}
}
