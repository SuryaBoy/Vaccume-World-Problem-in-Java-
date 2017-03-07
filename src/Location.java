import java.util.Random;

public class Location {

	private String name;
	private boolean isDirty;
	
	
	public Location(String n, boolean tof)
	{
		name = n;
		isDirty = tof;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getIsDirty()
	{
		return isDirty;
	}
	
	public void setIsDirty(boolean tof)
	{
		isDirty = tof;
	}
	
	public void randomDirtProduction()
	{
		
		if(isDirty == false)
		{
			Random random = new Random();
			isDirty = random.nextBoolean();
		}
	}
}
