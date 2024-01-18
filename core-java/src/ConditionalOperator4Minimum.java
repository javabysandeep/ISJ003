public class ConditionalOperator4Minimum {

	public static void main(String[] args){

		int number1 = 99;
		int number2 = 9;
		int number3 = 100;

//maximum of three numbers

	 System.out.println( ( number1 < number2 && number1 < number3 ) 
		? (number1)
		: (number2 < number1 && number2 < number3 ? number2 : number3) );

		
	}
}