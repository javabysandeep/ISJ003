public class LogicalOperators2 {

	public static void main(String[] args) {

		System.out.println( true && true && false); // false
		System.out.println( false && false || true); // true
		System.out.println( true && false || true); // true
		System.out.println( false && true && false || true); // true
		

	}

}