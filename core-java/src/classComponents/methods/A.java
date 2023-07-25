public class A {

	int a;
	int b;
	int c;

	public A(){
		System.out.println("Its a zero parameterized constructor");
		
	}

	public A(int a1, int b1, int c1){
		this();// call to the zero parameterized constructor
		a = a1;
		b = b1;
		c = c1;	
		
	}


	public static void main(String[] args){

		System.out.println("main method");

		A ref = new A(10,20,30);
	
		System.out.println(ref.a + "\t"+ ref.b +"\t"+ ref.c);
		


	}

	

}