package __java.lang;

public class __ArithmeticException {
	
	public static void main(String[] args) {
		//print -> 5
		method(2);
		
		//Error -> ArithmeticException
		// / by zero
		method(0);
	}
	
	static void method(Integer n) {
		System.out.println(10 / n);
	}
}
