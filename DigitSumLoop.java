public class DigitSumLoop {

	public static void main(String[] args){

		int number = 1234567890; // 45

		int sum = 0;
	
		while ( number > 0){
			int digit = number % 10;
			sum = sum + digit;
			number = number /10;

		}

	System.out.println(" Sum of digits = "+sum);

		

		
		
	}
}