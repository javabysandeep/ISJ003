public class MethodDemo1 {

	void m1(){
		System.out.println("MethodDemo1 - m1");
		m2();
		display();
		
	}

	void m2(){
		System.out.println("MethodDemo1 - m2");
	}
	

	public static void display(){
		System.out.println("display");
		

	}

	public static void main(String[] args){		
		MethodDemo1  ref = new MethodDemo1();
		ref.m1();
		
	}

	


}