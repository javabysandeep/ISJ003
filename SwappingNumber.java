public class SwappingNumber {

	public static void main(String[] args){
	
		int number1 = 100;
		int number2 = 200;
		
		System.out.println("Before swapping "+number1 +"\t"+number2); // 100 200


		int temp = number1;

		number1 = number2 ;

		number2 = temp;


		System.out.println("After swapping "+number1 +"\t"+number2); // 200 100
		
	
	}
		
}