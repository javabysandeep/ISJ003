public class StringCatenationOperator {

	public static void main(String[] args){
		
		System.out.println('A'+10); //75
		System.out.println("A"+10); //A10
		System.out.println("A"+"A"); //AA
		System.out.println('A'+ 'A'); //130
		System.out.println(10 + 20 + "A"+ 65 + 'A'); //30A65A
		System.out.println(10 + 20 + "A"+ (65 + 'A')); //30A130
		System.out.println(10 + (20 + "A")+ (65 + 'A')); //1020A130
		System.out.println('A' + "A"+ 'A'+ 20); //AAA20
		System.out.println('A' + 'A' + "A"+ 'A'+ 20); //130AA20
	}

}









