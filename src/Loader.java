
public class Loader
{
	public static Bumper giz;
	public static StandardFile sf;
	public static int squareCount, circleCount, lfCount, rfCount, triCount;
	
	public static void main(String[] args)
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
		switch(giz)
		{
		
		case SQUARE:
			sf.setGizmo("Square");
			sf.setTag("S" + squareCount);
			squareCount++;
			
		case CIRCLE:
			sf.setGizmo("Circle");
			sf.setTag("C" + circleCount);
			circleCount++;
			
		case LEFT_FLIPPER:
			sf.setGizmo("LeftFlipper");
			sf.setTag("LF" + lfCount);
			lfCount++;
			
		case RIGHT_FLIPPER:
			sf.setGizmo("RightFlipper");
			sf.setTag("RL" + rfCount);
			
		case TRIANGLE:
			sf.setGizmo("Triangle");
			sf.setTag("T" + triCount);
			
		default:
			break;
			
		}
			

	}

}
