import model.RacingCars;
import ui.RacingUi;
import utils.RacingRandomProvider;

public class Application {
	public static void main(String[] args) {
		RacingUi racingUi = new RacingUi(new RacingCars(), new RacingRandomProvider());
		
		racingUi.run();
	}
}
