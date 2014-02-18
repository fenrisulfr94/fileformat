
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
	
	public static void main(String[] args) throws Exception
	{
		squareCount = 1;
		circleCount = 1;
		lfCount = 1;
		rfCount = 1;
		triCount = 1;
		
		/** Depending on the type of gizmo,
		 * 	it will be saved as:
		 * 		[shape] [letter & no.] 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a gizmo (i.e. Square, Triangle, Circle): ");
		String input = sc.nextLine();
		sc.close();
		
		switch(input)
		{
		
		case "Square":
			sf.setGizmo("Square");
			sf.setTag("S" + squareCount);
			squareCount++;
			
		case "Circle":
			sf.setGizmo("Circle");
			sf.setTag("C" + circleCount);
			circleCount++;
			
		case "Left Flipper":
			sf.setGizmo("LeftFlipper");
			sf.setTag("LF" + lfCount);
			lfCount++;
			
		case "Right Flipper":
			sf.setGizmo("RightFlipper");
			sf.setTag("RL" + rfCount);
			
		case "Triangle":
			sf.setGizmo("Triangle");
			sf.setTag("T" + triCount);
			
		default:
			try
			{
				fout = new FileOutputStream("~/Saves/save.ser");
				oos = new ObjectOutputStream(fout);
				oos.writeObject(sf);
				oos.close();
				System.out.println("Saved!");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			};
			
		}
			

	}

}
