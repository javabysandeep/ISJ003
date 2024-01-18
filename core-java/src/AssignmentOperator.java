public class AssignmentOperator {

	public static void main(String[] args){
		
		int a = 100; // direct value
		int b = a; // variable
		int c = a + b; // expression
		int d = add(100, 300); // method call

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		System.out.println(a=2000);
		//System.out.println(100=2000);




	}
	
	public static int add(int number1, int number2){

		return number1 + number2;
	}

}