public class ConditionalOperator {

	public static void main(String[] args){

		System.out.println( (true) ? ("operand2") : ("operand3")  );
		System.out.println( (false) ? ("operand2") : ("operand3")  );
		System.out.println( ( 4 > 3) ? ("4 is greater than 3") : ("operand3")  );
		System.out.println( ( 4%2 != 0) ? ("4 is multiple of 2") : ("its false statement")  );
	}
}