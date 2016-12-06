import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Lift passengerLift;
		Lift serviceLift;
		boolean inProcess=false;
		Services services = new Services();
		long lastCalledtime=System.currentTimeMillis();
		
		Initializer intialize = new Initializer();
		passengerLift=intialize.getPassengerLift();
		serviceLift=intialize.getServiceLift();		
		System.out.println("hi Sytem is started");
		Idlerestter reset = new Idlerestter(passengerLift,serviceLift,inProcess,lastCalledtime);				

		System.out.println(Floors.EIGHTH.getValue() - Floors.FIFTH.getValue());
		Scanner scan = new Scanner(System.in);
		while (true) {
			 System.out.println("Press 1 for location of lifts");
			 System.out.println("Press 2 for Calling lift");
			
			int input1 = scan.nextInt();
			// System.out.println(i);
			if (input1 == 1) {
		
				System.out.println("get CurrentLocation of Lifts");
				services.getCurrentLoc(passengerLift,serviceLift);		
				
			}
			if (input1 == 2) {
				
				while(true)
				{    System.out.println("Enter your current floor from 0 to 10 ");
					int calledFloor = scan.nextInt();
					if(calledFloor>=0 && calledFloor<11)
					{		
						System.out.println("Calling the nearest lift");
						inProcess=true;
						services.getLift(passengerLift,serviceLift,calledFloor,inProcess);
						inProcess=false;
						lastCalledtime=System.currentTimeMillis();
						break;
					
					}
					else
					{
						System.out.println("Wrong Input.Enter your current floor from 0 to 10 ");
					}
				}
						
				
			}
			if (input1 > 2) {
				System.out.println("Input incorrect.Provide Valid input");
			}

		}
	}

}
