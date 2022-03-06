package model;

public class RacingCar implements Car {
	private final String name;
	private int distance;
	
	private RacingCar(String carName) {
		this.name = carName;
	}
	
	public static RacingCar from(String carName) {
		return new RacingCar(carName);
	}
	
	@Override
	public boolean isName(String carName) {
		return name.equals(carName);
	}
	
	@Override
	public void move() {
		distance++;
	}
	
	@Override
	public int getDistance() {
		return distance;
	}
}
