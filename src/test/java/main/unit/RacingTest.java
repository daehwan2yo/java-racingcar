package main.unit;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Cars;
import model.Racing;
import model.RacingCar;
import model.RacingCars;
import utils.RandomProvider;

public class RacingTest {
	Racing racing;
	Cars cars;
	RacingCar pobi;
	RacingCar gye;
	RacingCar hello;
	
	@BeforeEach
	void init() {
		cars = new RacingCars();
		pobi = RacingCar.from("pobi");
		gye = RacingCar.from("gye");
		hello = RacingCar.from("hello");
		cars.save(pobi);
		cars.save(gye);
		cars.save(hello);
		RandomProvider.TestRandomProvider.count = 0;
		
		racing = new Racing(cars, new RandomProvider.TestRandomProvider());
	}
	
	@Test
	void 한_라운드를_진행한다() {
		// when
		racing.playOnce();
		
		// then
		assertThat(cars.getAll()
					   .get(1)
					   .getDistance()).isEqualTo(1);
	}
	
	@Test
	void 승자를_출력한다() {
		// when
		racing.playOnce();
		
		// then
		assertThat(racing.getWinner()).containsExactly(gye);
	}
}
