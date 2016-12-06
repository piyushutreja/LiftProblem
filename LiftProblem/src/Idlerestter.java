
public class Idlerestter {
	private Lift passengerLift; private Lift serviceLift;  private boolean inProcess;


	private long lastCalledtime;
	
	
	
	public Idlerestter(Lift passengerLift, Lift serviceLift, boolean inProcess, long lastCalledtime) {

		this.passengerLift = passengerLift;
		this.serviceLift = serviceLift;
		this.inProcess = inProcess;
		this.lastCalledtime=lastCalledtime;
		this.restter.start();
	}




	
	Thread restter = new Thread (new Runnable() {
		
		@Override
		public void run() {
			while(true)
			{
				if(!inProcess)
				{
					if((lastCalledtime-System.currentTimeMillis())>30000)
					{   System.out.println("Called resetter");
						passengerLift.setCurrentfloor(Floors.getEnumname(0));
						serviceLift.setCurrentfloor(Floors.getEnumname(0));
					}
				}
			}
			// TODO Auto-generated method stub
			
		}
	});

}