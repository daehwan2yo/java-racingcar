package model;

import java.util.ArrayList;
import java.util.List;

public class RacingCars implements Cars {
	private final List<Car> carList;
	
	public RacingCars() {
		carList = new ArrayList<>();
	}
	
	@Override
	public void save(Car car) {
		carList.add(car);
	}
	
	@Override
	public int size() {
		return carList.size();
	}
	
	@Override
	public List<Car> getAll() {
		return carList;
	}
}
