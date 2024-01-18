public class LeapYear {

	public static void main(String[] args){

		int year = 2100;

		//1. it must be divisible by 4
		//2. if year is a century then it must be divisible by 400.

	System.out.println (

		(year % 400 == 0) ||  (year%100 !=0  && year%4==0 )
			? "Its a leap year"
			: "Its not a leap year"
		);

		
	}
}