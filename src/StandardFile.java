import java.util.ArrayList;


public class StandardFile
{
	// Gizmo type
	private String gizmo;
	
	// Tag for later identification
	private String tag;
	
	// x-axis co-ordinate
	private int coX;
	
	// y-axis co-ordinate
	private int coY;
	
	// (optional) operation performed
	// on gizmo
	private ArrayList<String> op;
	
	/**
	 * Standard format for Gizmoball:
	 * 	-->	[gizmo] [tag] [x] [y] [& ops]
	 *
	 * @param gizmo Gizmo type (Square, Triangle, etc.)
	 * @param tag Tag for later identification (e.g. Triangle T1)
	 * @param coX x-axis co-ordinate
	 * @param coY y-axis co-ordinate
	 * @param ops (optional) Operation performed on gizmo (e.g. Rotate S2 (rotate 90 deg square 2))
	 */

	public StandardFile()
	{
		this.gizmo = null;
		this.tag = null;
		this.coX = 0;
		this.coY = 0;
		this.op = null;
	}

	public String getGizmo()
	{
		return gizmo;
	}

	public void setGizmo(String gizmo)
	{
		this.gizmo = gizmo;
	}

	public String getTag()
	{
		return tag;
	}

	public void setTag(String tag)
	{
		this.tag = tag;
	}

	public int getCoX()
	{
		return coX;
	}

	public void setCoX(int coX)
	{
		this.coX = coX;
	}

	public int getCoY()
	{
		return coY;
	}

	public void setCoY(int coY)
	{
		this.coY = coY;
	}

	public ArrayList<String> getOps()
	{
		return op;
	}

	public void addOp(String op)
	{
		this.op.add(op);
	}

}
