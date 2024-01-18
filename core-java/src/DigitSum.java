public class DigitSum {

	public static void main(String[] args){

		int number = 123; // 1 + 2 + 3 = 6

		int digit1 = number % 10; // 3
		number = number /10; //12

		int digit2 = number % 10 ; //2
		number = number / 10; //1


		int digit3 = number % 10 ; // 1
		number  = number / 10; //0


		System.out.println("Sum of digits = "+ (digit1 + digit2 + digit3));
		

		
		
	}
}