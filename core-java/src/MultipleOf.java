public class MultipleOf {

	public static void main(String[] args){

		int number = 990;

		int multiple = 7;

		System.out.println( 

				( number % multiple ==0 ) 
				? ( number+" is multiple of "+multiple)
				: ( number+" is not a multiple of "+multiple )
		);

		
	}
}