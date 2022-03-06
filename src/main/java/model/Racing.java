package model;

import java.util.ArrayList;
import java.util.List;

import utils.RandomProvider;

public class Racing {
	private final Cars cars;
	private final RandomProvider randomProvider;
	
	public Racing(Cars cars, RandomProvider randomProvider) {
		this.cars = cars;
		this.randomProvider = randomProvider;
	}
	
	public void playOnce() {
		cars.getAll()
			.stream()
			.forEach(car -> {
				if (randomProvider.extract() >= 4) {
					car.move();
				}
			});
	}
	
	public List<Car> getWinner() {
		List<Car> winners = new ArrayList<>();
		
		cars.getAll()
			.stream()
			.sorted((c1, c2) -> c2.getDistance() - c1.getDistance())
			.forEach(car -> {
				if (car.getDistance() == cars.getFirst()
											 .getDistance()) {
					winners.add(car);
				}
			});
		
		return winners;
	}
}
