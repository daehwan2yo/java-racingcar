package ui;

import java.util.Scanner;

import model.Cars;
import model.Racing;
import model.RacingCar;
import utils.IOHandler;
import utils.RandomProvider;

public class RacingUi {
	private final Cars cars;
	private final RandomProvider randomProvider;
	
	public RacingUi(Cars cars, RandomProvider randomProvider) {
		this.cars = cars;
		this.randomProvider = randomProvider;
	}
	
	public void run() {
		IOHandler ioHandler = new IOHandler(new Scanner(System.in));
		Racing racing = new Racing(cars, randomProvider);
		
		ioHandler.printCommand("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String enterCars = ioHandler.enter();
		
		for (String carName : enterCars.split(",")) {
			cars.save(RacingCar.from(carName));
		}
		
		ioHandler.printCommand("시도할 회수는 몇회인가요?");
		int count = Integer.parseInt(ioHandler.enter());
		
		ioHandler.printBlank();
		
		ioHandler.printCommand("실행 결과");
		for (int i = 0; i < count; i++) {
			racing.playOnce();
			StringBuilder sb = new StringBuilder();
			cars.getAll()
				.forEach(car -> {
					for (int j = 0; j < car.getDistance(); j++) {
						sb.append('-');
					}
					ioHandler.printCommand(car + " : " + sb.toString());
				});
			ioHandler.printBlank();
		}
		
		racing.getWinner()
			  .forEach(car -> System.out.print(car + ", "));
	}
}
