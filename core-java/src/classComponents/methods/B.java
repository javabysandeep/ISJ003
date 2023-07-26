public class B {

	void m1(){
		System.out.println("B class - m1 method");
		A.display();
		A.main(null);

		A a = new A();
		a.m1();
		a.m2();
		
		
	}

	public static void main(String[] args){		
		B b = new B();
		b.m1();
	}

	


}