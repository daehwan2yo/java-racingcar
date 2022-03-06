package model;

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
	
	}
	
	public List<Car> getWinner() {
		return null;
	}
}
