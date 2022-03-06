package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
					  .sorted((c1, c2) -> c2.getDistance() - c1.getDistance())
					  .collect(Collectors.toList())
					  .get(0);
	}
}
