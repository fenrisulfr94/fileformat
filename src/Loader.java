import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Loader
{
	public static BufferedReader br;
	public static String giz;
	public static ArrayList<StandardFile> loads;
	public static StandardFile sf;
	
	public static void main(String[] args) throws Exception
	{

		/**
		 * Depending on the type of gizmo, it will be saved as: [shape] [letter
		 * & no.]
		 */
		
		br = new BufferedReader(new FileReader("load.txt"));
		String ln = null;
		
		
		while((ln = br.readLine()) != null)
		{
			String[] splits = ln.split("\\s");
			giz = splits[0];
			switch (giz)
			{

			case "Square":
				sf.setGizmo(giz);
				sf.setTag(splits[1]);
				sf.setCoX(Integer.parseInt(splits[2]));
				sf.setCoY(Integer.parseInt(splits[3]));
				loads.add(sf);
				break;

			case "Circle":
				sf.setGizmo(giz);
				sf.setTag(splits[1]);
				sf.setCoX(Integer.parseInt(splits[2]));
				sf.setCoY(Integer.parseInt(splits[3]));
				loads.add(sf);
				break;

			case "LeftFlipper":
				sf.setGizmo(giz);
				sf.setTag(splits[1]);
				sf.setCoX(Integer.parseInt(splits[2]));
				sf.setCoY(Integer.parseInt(splits[3]));
				loads.add(sf);
				break;

			case "RightFlipper":
				sf.setGizmo(giz);
				sf.setTag(splits[1]);
				sf.setCoX(Integer.parseInt(splits[2]));
				sf.setCoY(Integer.parseInt(splits[3]));
				loads.add(sf);
				break;

			case "Triangle":
				sf.setGizmo(giz);
				sf.setTag(splits[1]);
				sf.setCoX(Integer.parseInt(splits[2]));
				sf.setCoY(Integer.parseInt(splits[3]));
				loads.add(sf);
				break;

			default:
				sf.addOp(ln);
				break;
		}
		
		

		}
		

	}
}
