public class LogicalOperators4 {

	public static void main(String[] args) {

		System.out.println( 10 > 9 && 10 < 11 );//true

		//System.out.println( 10 %2==0 && 10 %0==1 && 10%2 ==0 );//exception

		//System.out.println( 10 %2==1 & 10%0 ==0 );//expcetion
		
	
		System.out.println( 10 %2==0 || 10%0 ==0 );//true
		System.out.println( 10 %2==0 | 10%0 ==0 );//Exception
		

	}

}