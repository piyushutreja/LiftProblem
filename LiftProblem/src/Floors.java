public enum Floors {
	GROUND(0), FIRST(1), SECOND(2), THRID(3), FOURTH(4), FIFTH(5), SIXTH(6), SEVENTH(
			7), EIGHTH(8), NINTH(9), TENTH(10);

	int value;

	private Floors(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public static Floors getEnumname(int value){
		for (Floors floor : Floors.values()) {
			if(floor.value==value)
			return floor;			
		}
		
		return null;
		
		
	}

}
