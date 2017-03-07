

public class VaccumeMain {

	private static Location l1;
	private static Location l2;
	private static Agent a1;
	private static State s;
	private static boolean close = false;
	
	
	public VaccumeMain()
	{
		l1 = new Location("Left",true);
		l2 = new Location("Right",true);
		a1 = new Agent(l1.getName());
		
		s = new State(l1,l2,a1);	
	}

	public void run()
	{
		while(close == false)
		{	
			printState();
			try{
				Thread.sleep(1000);
				if(a1.scan(l1, l2))
				{
					a1.suck(l1, l2);
				}
				else
				{
					a1.changeLocation(l1, l2);
					if(a1.scan(l1, l2))
					{
						a1.suck(l1, l2);
					}
				}
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}

			l1.randomDirtProduction();
			l2.randomDirtProduction();
		}
	}
	
	public void printState()
	{
		System.out.println("Left is Dirty\tRight is Dirty\tAgent_Location");
		System.out.printf("%b\t\t%b\t\t%s\n",l1.getIsDirty(),l2.getIsDirty(),a1.getAgentLocation());
	}

}
