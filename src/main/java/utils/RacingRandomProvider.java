package utils;

import java.util.Random;

public class RacingRandomProvider implements RandomProvider {
	
	@Override
	public int extract() {
		Random random = new Random();
		return random.nextInt(9);
	}
}
