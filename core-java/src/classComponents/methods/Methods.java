public class Methods {

	public static void main(String[] args){

		int addition = add(100,200); //method call or invocation
		System.out.println(add(100,200));


		Methods ref = new Methods();
		int multiplication = ref.multiply(100,200); //method for instance method 
		System.out.println(ref.multiply(100,200));



	}

	//method definition
	public static int add(int number1, int number2){

		return number1 + number2;
	}

	public  int multiply(int number1, int number2){

		return number1 * number2;
	}

}