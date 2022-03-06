package utils;

public interface RandomProvider {
	int extract();
	
	class TestRandomProvider implements RandomProvider {
		public static int count;
		private static int[] numbers = {3, 5, 2};
		
		@Override
		public int extract() {
			return numbers[count++];
		}
	}
}
