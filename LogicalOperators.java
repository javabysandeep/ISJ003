public class LogicalOperators {

	public static void main(String[] args) {

		// &&, &
		// ||, |
		// ^
		// !

	
		System.out.println( "AND Operation "); 
		System.out.println( true && true); // true
		System.out.println( false && false); // false
		System.out.println( true && false); // false
		System.out.println( false && true); // false

		System.out.println( true & true); // true
		System.out.println( false & false); // false
		System.out.println( true & false); // false
		System.out.println( false & true); // false

		System.out.println( "XOR Operation "); 
		System.out.println( true ^ true); // false
		System.out.println( false ^ false); // false
		System.out.println( true ^ false); // true
		System.out.println( false ^ true); // true

		System.out.println( "OR Operation "); 
		System.out.println( true | true); // true
		System.out.println( false | false); // false
		System.out.println( true | false); // true
		System.out.println( false | true); // true
		
		System.out.println( true || true); // true
		System.out.println( false || false); // false
		System.out.println( true || false); // true
		System.out.println( false || true); // true

		System.out.println( "NOT Operation "); 
		System.out.println( !true); // false
		System.out.println( !false); // true



		

	}

}