public class ConditionalOperator3 {

	public static void main(String[] args){

		int number1 = 199;
		int number2 = 1099;
		int number3 = 100;

//maximum of three numbers

	 System.out.println( ( number1 > number2 && number1 > number3 ) 
		? (number1)
		: (number2 > number1 && number2 > number3 ? number2 : number3) );

		
	}
}