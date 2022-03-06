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
	
	@BeforeEach
	void init() {
		cars = new RacingCars();
		cars.save(RacingCar.from("pobi"));
		cars.save(RacingCar.from("gye"));
		cars.save(RacingCar.from("hello"));
		
		racing = new Racing(cars, new RandomProvider() {
		
		});
	}
	
	@Test
	void 한_라운드를_진행한다() {
		// when
		racing.playOnce();
		
		// then
		assertThat(cars.getAll()
					   .get(0)
					   .getDistance()).isEqualTo(1);
	}
	
	@Test
	void 승자를_출력한다() {
		// when
		racing.playOnce();
		
		// then
		assertThat(racing.getWinner()).isEqualTo("gye");
	}
}
