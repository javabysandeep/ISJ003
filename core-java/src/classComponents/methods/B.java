public class B {

	int a;
	int b;
	int c;

	public B(){
		
		System.out.println("Its a zero parameterized constructor");
		this(100,200,300);
		
	}

	public B(int a1, int b1, int c1){

		System.out.println("Its a three parameterized constructor");
		a = a1;
		b = b1;
		c = c1;	
		
	}


	public static void main(String[] args){

		System.out.println("main method");

		B ref = new B();
	
		System.out.println(ref.a + "\t"+ ref.b +"\t"+ ref.c);
		


	}

	

}