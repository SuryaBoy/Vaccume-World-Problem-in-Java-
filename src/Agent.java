
public class Agent {
	
	private String agentLocation;
	
	public Agent(String loc)
	{
		agentLocation = loc;
	}
	
	public String getAgentLocation()
	{
		return agentLocation;
	}

	public  boolean scan(Location l1, Location l2)
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		if(agentLocation.equals(l1.getName())  )
		{
			System.out.println("Scanning location "+ agentLocation);
			return l1.getIsDirty();
		}
		
		else
		{
			System.out.println("Scanning location "+ agentLocation);
			return l2.getIsDirty();
		}
	}
	public void suck(Location l1, Location l2)
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		if(agentLocation.equals(l1.getName()))
		{
			System.out.println("Sucking dirt from location "+ agentLocation);
			l1.setIsDirty(false);
		}
		
		else
		{
			System.out.println("Sucking dirt from location "+ agentLocation);
			l2.setIsDirty(false);
		}
	}
	
	public  void changeLocation(Location l1, Location l2)
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		if(agentLocation.equals(l1.getName()))
		{
			System.out.println("Changing location of agent from "+ agentLocation+ " to " +l2.getName());
			agentLocation = l2.getName();
		}
		
		else
		{
			System.out.println("Changing location of agent from "+ agentLocation+ " to " +l1.getName());
			agentLocation = l1.getName();
		}
		
	}
	
}
