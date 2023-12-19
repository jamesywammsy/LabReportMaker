package testing;sdjgjahgerhhgurhgu

public class PerfectIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int integer = 0;
		int sum = 0;

		for (int a = 1; a <= 10000; a++) {
			
			sum = 0;
			integer = a;
			
			for (int i = 1; i < a-1; i++) {
				
				if (a%i == 0) {
					
					sum += i;
					
				}
				
				
				
			}
			
			if (sum == integer) {
				
				System.out.println( "perfect integer is "+integer);
				
			}

		}

	}

}
