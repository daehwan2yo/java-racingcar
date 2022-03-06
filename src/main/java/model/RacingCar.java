package model;

public class RacingCar implements Car {
	private final String name;
	
	private RacingCar(String carName) {
		this.name = carName;
	}
	
	public static RacingCar from(String carName) {
		return new RacingCar(carName);
	}
	
	@Override
	public boolean isName(String carName) {
		return false;
	}
	
	@Override
	public void move() {
	
	}
	
	@Override
	public boolean getDistance() {
		return false;
	}
}
