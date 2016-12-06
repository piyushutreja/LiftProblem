public class Initializer {

	private Lift passengerLift;
	private Lift serviceLift;



	public Initializer() {
		passengerLift = new Lift();
		passengerLift.setCurrentfloor(Floors.GROUND);
		serviceLift = new Lift();
		serviceLift.setCurrentfloor(Floors.GROUND);
	}

	public Lift getPassengerLift() {
		return passengerLift;
	}

	public Lift getServiceLift() {
		return serviceLift;
	}
	
}
