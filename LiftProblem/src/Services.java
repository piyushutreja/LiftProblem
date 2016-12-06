import java.util.concurrent.TimeUnit;

public class Services {

	public void getCurrentLoc(Lift passengerLift, Lift serviceLift) {
		// TODO Auto-generated method stub
		System.out.println("Passenger Lift is on floor"
				+ passengerLift.getCurrentfloor().value);
		System.out.println("Service Lift is on floor"
				+ serviceLift.getCurrentfloor().value);
	}
	


	public void getLift(Lift passengerLift, Lift serviceLift, int calledFloor, boolean inProcess) {
		// TODO Auto-generated method stub
		 inProcess=true;
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int distFromPass = 0, distFromService = 0;

		distFromPass = passengerLift.getCurrentfloor().value - calledFloor;
		distFromService = serviceLift.getCurrentfloor().value - calledFloor;

		if (passengerLift.getCurrentfloor().value == calledFloor) {

			System.out.println("Passenger Lift is on same floor");
			passengerLift.setCurrentfloor(Floors.getEnumname(calledFloor));
		}

		else if (serviceLift.getCurrentfloor().value == calledFloor) {
			System.out.println("Service Lift is on same floor");
			serviceLift.setCurrentfloor(Floors.getEnumname(calledFloor));

		}

		else {

			if (distFromPass == distFromService) {
				passengerLift.setCurrentfloor(Floors.getEnumname(calledFloor));
			}

			else {

				if (Math.abs(distFromPass) == Math.abs(distFromService))

				{
					if (distFromPass > 0) {
						System.out.println("Sending passenger Lift as it is on top");
						passengerLift.setCurrentfloor(Floors
								.getEnumname(calledFloor));

					}

					if (distFromService > 0) {
						System.out
								.println("Sending service Lift as it is on top");
						serviceLift.setCurrentfloor(Floors
								.getEnumname(calledFloor));
					}
				}

				if (Math.abs(distFromPass) < Math.abs(distFromService)) {
					System.out.println("Sending passenger Lift as it is near");
					passengerLift.setCurrentfloor(Floors
							.getEnumname(calledFloor));
				}

				if (Math.abs(distFromService) < Math.abs(distFromPass)) {
					System.out.println("Sending service Lift as it is near");
					serviceLift
							.setCurrentfloor(Floors.getEnumname(calledFloor));
				}

			}
		}
		System.out.println("getLift called");
		System.out.println(distFromPass);
		 inProcess=false;
	}

}
