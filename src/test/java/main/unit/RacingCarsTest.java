package main.unit;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import model.Car;
import model.Cars;
import model.RacingCar;
import model.RacingCars;

public class RacingCarsTest {
	private Car car1 = RacingCar.from("pobi");
	private Car car2 = RacingCar.from("gye");
	private Car car3 = RacingCar.from("hello");
	private Cars cars = new RacingCars();
	
	@Test
	void 자동차를_추가한다() {
		// when
		cars.save(car1);
		cars.save(car2);
		
		// then
		assertThat(cars.size()).isEqualTo(2);
	}
	
	@Test
	void 자동차들을_제공한다() {
		// given
		cars.save(car1);
		cars.save(car2);
		
		// when
		List<Car> carList = cars.getAll();
		
		// then
		assertThat(carList.size()).isEqualTo(2);
	}
}
