
public class Loader
{
	static Bumper giz;
	public static StandardFile sf;
	
	public static void main(String[] args)
	{
		/** Depending on the type of gizmo,
		 * 	it will be saved as:
		 * 		[shape] [letter & no.] 
		 */
		switch(giz)
		{
		
		case SQUARE:
			sf.setGizmo("Square");
			sf.setTag("S");
			
		case CIRCLE:
			sf.setGizmo("Circle");
			sf.setTag("C");
			
		case LEFT_FLIPPER:
			sf.setGizmo("LeftFlipper");
			sf.setTag("LF");
			
		case RIGHT_FLIPPER:
			sf.setGizmo("RightFlipper");
			sf.setTag("RL");
			
		case TRIANGLE:
			sf.setGizmo("Triangle");
			sf.setTag("T");
			
		default:
			break;
			
		}
			

	}

}
