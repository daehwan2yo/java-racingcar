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
	
	@Override
	public Car getFirst() {
		return carList.stream()
					  .max((c1, c2) -> c1.getDistance() - c2.getDistance())
					  .get();
	}
}
