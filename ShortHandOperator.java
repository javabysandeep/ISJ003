public class ShortHandOperator {

	public static void main(String[] args){
	
		int a = 100;
		System.out.println(a);//100

		//a = a + 300;
		a +=300;
		System.out.println(a);//400

	
		int b = 10;
		//b = b - 10;//0
		b -=10; // 0
		System.out.println(b);//0

		int c = 10;

		//c = c * 20;
		c *=20;

		System.out.println(c);//200
	
		int d = 20;
		d = d / 10; // 2
		d /=10; // 0 

		System.out.println(d);//0
	
		int e = 30;
		e = e % 7 ; //2
		e %=7; //2		
		
	System.out.println(e);//2
	}
		
}