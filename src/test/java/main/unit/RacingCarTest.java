package main.unit;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Car;
import model.RacingCar;

public class RacingCarTest {
	private Car car;
	
	@Test
	void 자동차가_생성된다() {
		// given
		String carName = "name";
		
		// when
		car = RacingCar.from(carName);
		
		// then
		assertThat(car.isName(carName)).isTrue();
	}
	
	@Test
	void 자동차를_전진하고_위치를_확인한다() {
		// given
		car = RacingCar.from("carName");
		
		// when
		car.move();
		
		// then
		assertThat(car.getDistance()).isEqualTo(1);
	}
}
