public class RelationalOperator {

	public static void main(String[] args){
	
		System.out.println( 4 > 5);//false
		System.out.println( 4 < 5); //true
		System.out.println( 4 >= 5); // false 
		System.out.println( 4 <= 5); //true
		System.out.println( 4 == 5); //false
		System.out.println( 4 != 5); //true		

		System.out.println( 10 != 10); //false
		System.out.println( 10 == 10); //true
		System.out.println( 10 > 10); //false
		System.out.println( 10 < 10); //false

		System.out.println( 10 >= 10); //true
		System.out.println( 10 <= 10); //true

		System.out.println( true == true); //true
		System.out.println( true != true); //false

		System.out.println( false != false); //false	
		System.out.println( false == false); //true

		System.out.println( true == false); //false
		System.out.println( true != false); //true

		System.out.println( true > false); //CTE
		System.out.println( true != 10); //CTE

	
	}
		
}












